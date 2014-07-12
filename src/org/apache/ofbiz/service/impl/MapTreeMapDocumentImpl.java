/*
 * An XML document type.
 * Localname: map-TreeMap
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapTreeMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-TreeMap(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapTreeMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapTreeMapDocument
{
    
    public MapTreeMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPTREEMAP$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-TreeMap");
    
    
    /**
     * Gets the "map-TreeMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapTreeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPTREEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-TreeMap" element
     */
    public void setMapTreeMap(org.apache.ofbiz.service.MapMap mapTreeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPTREEMAP$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPTREEMAP$0);
            }
            target.set(mapTreeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-TreeMap" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapTreeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPTREEMAP$0);
            return target;
        }
    }
}
