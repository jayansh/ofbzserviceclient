/*
 * An XML document type.
 * Localname: std-Locale
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdLocaleDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-Locale(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdLocaleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdLocaleDocument
{
    
    public StdLocaleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDLOCALE$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Locale");
    
    
    /**
     * Gets the "std-Locale" element
     */
    public org.apache.ofbiz.service.StdLocaleDocument.StdLocale getStdLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().find_element_user(STDLOCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-Locale" element
     */
    public void setStdLocale(org.apache.ofbiz.service.StdLocaleDocument.StdLocale stdLocale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().find_element_user(STDLOCALE$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().add_element_user(STDLOCALE$0);
            }
            target.set(stdLocale);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Locale" element
     */
    public org.apache.ofbiz.service.StdLocaleDocument.StdLocale addNewStdLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().add_element_user(STDLOCALE$0);
            return target;
        }
    }
    /**
     * An XML std-Locale(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdLocaleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdLocaleDocument.StdLocale
    {
        
        public StdLocaleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
