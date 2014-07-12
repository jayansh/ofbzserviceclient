package com.expay.ofbiz.webservice.client.test;

import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

import javax.xml.bind.DatatypeConverter;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class XmlUtil {

	private static WeakReference<DateFormat> simpleDateFormatter;

	/**
	 * Return the first child Element with the given name; if name is null
	 * returns the first element.
	 */
	public static Element firstChildNode(Node element, String childElementName) {
		if (element == null)
			return null;
		if ((childElementName == null) || childElementName.length() == 0)
			return null;
		// get the first element with the given name
		Node node = element.getFirstChild();

		if (node != null) {
			do {
				if (node.getNodeType() == Node.ELEMENT_NODE
						&& (childElementName == null || childElementName
								.equals(node.getLocalName() != null ? node
										.getLocalName() : node.getNodeName()))) {
					Element childElement = (Element) node;
					return childElement;
				}
			} while ((node = node.getNextSibling()) != null);
		}
		return null;
	}

	/**
	 * Return the first child Element with the given name; if name is null
	 * returns the first element.
	 */
	public static Element firstChildNode(Node element, String childElementName,
			String attrName, String attrValue) {
		if (element == null)
			return null;
		// get the first element with the given name
		Node node = element.getFirstChild();

		if (node != null) {
			do {
				if (node.getNodeType() == Node.ELEMENT_NODE
						&& (childElementName == null || childElementName
								.equals(node.getLocalName() != null ? node
										.getLocalName() : node.getNodeName()))) {
					Element childElement = (Element) node;

					String value = childElement.getAttribute(attrName);

					if (value != null && value.equals(attrValue)) {
						return childElement;
					}
				}
			} while ((node = node.getNextSibling()) != null);
		}
		return null;
	}

	public static Object deserializeSingle(Element element) {
		String tagName = element.getLocalName();

		if (tagName.equals("null"))
			return null;

		if (tagName.startsWith("std-")) {
			// - Standard Objects -
			if ("std-String".equals(tagName)) {
				return element.getAttribute("value");
			} else if ("std-Integer".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return Integer.valueOf(valStr);
			} else if ("std-Long".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return Long.valueOf(valStr);
			} else if ("std-Float".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return Float.valueOf(valStr);
			} else if ("std-Double".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return Double.valueOf(valStr);
			} else if ("std-BigDecimal".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return new BigDecimal(valStr);
			} else if ("std-Boolean".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return Boolean.valueOf(valStr);
			} else if ("std-Locale".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return parseLocale(valStr);
			} else if ("std-Date".equals(tagName)) {
				String valStr = element.getAttribute("value");
				DateFormat formatter = getDateFormat();
				java.util.Date value = null;

				try {
					synchronized (formatter) {
						value = formatter.parse(valStr);
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return value;
			}
		} else if (tagName.startsWith("sql-")) {
			// - SQL Objects -
			if ("sql-Timestamp".equals(tagName)) {
				String valStr = element.getAttribute("value");
				/*
				 * sql-Timestamp is defined as xsd:dateTime in
				 * ModelService.getTypes(), so try to parse the value as
				 * xsd:dateTime first. Fallback is java.sql.Timestamp because it
				 * has been this way all the time.
				 */
				try {
					Calendar cal = DatatypeConverter.parseDate(valStr);
					return new java.sql.Timestamp(cal.getTimeInMillis());
				} catch (Exception e) {
					System.out
							.println("sql-Timestamp does not conform to XML Schema definition, try java.sql.Timestamp format");
					return java.sql.Timestamp.valueOf(valStr);
				}
			} else if ("sql-Date".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return java.sql.Date.valueOf(valStr);
			} else if ("sql-Time".equals(tagName)) {
				String valStr = element.getAttribute("value");
				return java.sql.Time.valueOf(valStr);
			}
		} else if (tagName.startsWith("col-")) {
			// - Collections -
			Collection<Object> value = null;

			if ("col-ArrayList".equals(tagName)) {
				value = new ArrayList<Object>();
			} else if ("col-LinkedList".equals(tagName)) {
				value = new LinkedList<Object>();
			} else if ("col-Stack".equals(tagName)) {
				value = new Stack<Object>();
			} else if ("col-Vector".equals(tagName)) {
				value = new Vector<Object>();
			} else if ("col-TreeSet".equals(tagName)) {
				value = new TreeSet<Object>();
			} else if ("col-HashSet".equals(tagName)) {
				value = new HashSet<Object>();
			} else if ("col-Collection".equals(tagName)) {
				value = new LinkedList<Object>();
			}

			if (value != null) {
				Node curChild = element.getFirstChild();

				while (curChild != null) {
					if (curChild.getNodeType() == Node.ELEMENT_NODE) {
						value.add(deserializeSingle((Element) curChild));
					}
					curChild = curChild.getNextSibling();
				}
				return value;
			}
		} else if (tagName.startsWith("map-")) {
			// - Maps -
			Map<Object, Object> value = null;

			if ("map-HashMap".equals(tagName)) {
				value = new HashMap<Object, Object>();
			} else if ("map-Properties".equals(tagName)) {
				value = new Properties();
			} else if ("map-Hashtable".equals(tagName)) {
				value = new Hashtable<Object, Object>();
			} else if ("map-WeakHashMap".equals(tagName)) {
				value = new WeakHashMap<Object, Object>();
			} else if ("map-TreeMap".equals(tagName)) {
				value = new TreeMap<Object, Object>();
			} else if ("map-Map".equals(tagName)) {
				value = new HashMap<Object, Object>();
			}

			if (value != null) {
				Node curChild = element.getFirstChild();

				while (curChild != null) {
					if (curChild.getNodeType() == Node.ELEMENT_NODE) {
						Element curElement = (Element) curChild;

						if ("map-Entry".equals(curElement.getLocalName())) {

							Element mapKeyElement = firstChildNode(curElement,
									"map-Key");
							Element keyElement = null;
							Node tempNode = mapKeyElement.getFirstChild();

							while (tempNode != null) {
								if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
									keyElement = (Element) tempNode;
									break;
								}
								tempNode = tempNode.getNextSibling();
							}
							if (keyElement == null)
								System.out
										.println("Could not find an element under the map-Key");

							Element mapValueElement = firstChildNode(
									curElement, "map-Value");
							Element valueElement = null;

							tempNode = mapValueElement.getFirstChild();
							while (tempNode != null) {
								if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
									valueElement = (Element) tempNode;
									break;
								}
								tempNode = tempNode.getNextSibling();
							}
							if (valueElement == null)
								System.out
										.println("Could not find an element under the map-Value");

							value.put(deserializeSingle(keyElement),
									deserializeSingle(valueElement));
						}
					}
					curChild = curChild.getNextSibling();
				}
				return value;
			}
		} else if (tagName.startsWith("eepk-")) {
			return makePK(element);
		} else if (tagName.startsWith("eeval-")) {
			return makeValue(element);
		}
		return null;
	}

	/**
	 * Parse a locale string Locale object
	 * 
	 * @param localeString
	 *            The locale string (en_US)
	 * @return Locale The new Locale object or null if no valid locale can be
	 *         interpreted
	 */
	public static Locale parseLocale(String localeString) {
		if (isEmpty(localeString)) {
			return null;
		}

		Locale locale = null;
		if (localeString.length() == 2) {
			// two letter language code
			locale = new Locale(localeString);
		} else if (localeString.length() == 5) {
			// positions 0-1 language, 3-4 are country
			String language = localeString.substring(0, 2);
			String country = localeString.substring(3, 5);
			locale = new Locale(language, country);
		} else if (localeString.length() > 6) {
			// positions 0-1 language, 3-4 are country, 6 and on are special
			// extensions
			String language = localeString.substring(0, 2);
			String country = localeString.substring(3, 5);
			String extension = localeString.substring(6);
			locale = new Locale(language, country, extension);
		} else {
			System.out
					.println("Do not know what to do with the localeString ["
							+ localeString
							+ "], should be length 2, 5, or greater than 6, returning null");
		}

		return locale;
	}

	/** Check whether string s is empty. */
	public static boolean isEmpty(String s) {
		return (s == null) || s.length() == 0;
	}

	private static DateFormat getDateFormat() {
		DateFormat formatter = null;

		if (simpleDateFormatter != null) {
			formatter = simpleDateFormatter.get();
		}
		if (formatter == null) {
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			simpleDateFormatter = new WeakReference<DateFormat>(formatter);
		}
		return formatter;
	}

	private static GenericPK makePK(Element element) {
		return null;

	}

	private static GenericValue makeValue(Element element) {
		  if (element == null) {
	            return null;
	        }
	        String entityName = element.getTagName();

	        // if a dash or colon is in the tag name, grab what is after it
	        if (entityName.indexOf('-') > 0) {
	            entityName = entityName.substring(entityName.indexOf('-') + 1);
	        }
	        if (entityName.indexOf(':') > 0) {
	            entityName = entityName.substring(entityName.indexOf(':') + 1);
	        }
	        GenericValue value = makeValue(entityName);

	        NamedNodeMap namedNodeMap = element.getAttributes();
	        for (int i = 0; i < namedNodeMap.getLength(); i++) {
				Node node = namedNodeMap.item(i);
				String attrName = node.getNodeName();
				String attrVal = node.getNodeValue();
				value.put(attrName, attrVal);
			}

//	        Iterator<ModelField> modelFields = modelEntity.getFieldsIterator();
//
//	        while (modelFields.hasNext()) {
//	            ModelField modelField = modelFields.next();
//	            String name = modelField.getName();
//	            String attr = element.getAttribute(name);
//
//	            if (UtilValidate.isNotEmpty(attr)) {
//	                // GenericEntity.makeXmlElement() sets null values to GenericEntity.NULL_FIELD.toString(), so look for
//	                //     that and treat it as null
//	                if (GenericEntity.NULL_FIELD.toString().equals(attr)) {
//	                    value.set(name, null);
//	                } else {
//	                    value.setString(name, attr);
//	                }
//	            } else {
//	                // if no attribute try a subelement
//	                Element subElement = XmlUtil.firstChildNode(element, name);
//
//	                if (subElement != null) {
//	                    value.setString(name, XmlUtil.firstChildNode(subElement));
//	                }
//	            }
//	        }

	        return value;

	}
	
	public static GenericValue makeValue(String entityName) {
        if (entityName == null) {
            throw new IllegalArgumentException("[GenericDelegator.makeValue] could not find entity for entityName: " + entityName);
        }
        GenericValue value = GenericValue.create(entityName);
        return value;
    }
}
