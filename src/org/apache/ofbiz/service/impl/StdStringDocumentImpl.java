/*
 * An XML document type.
 * Localname: std-String
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-String(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdStringDocument
{
    
    public StdStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDSTRING$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-String");
    
    
    /**
     * Gets the "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString getStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-String" element
     */
    public void setStdString(org.apache.ofbiz.service.StdStringDocument.StdString stdString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().add_element_user(STDSTRING$0);
            }
            target.set(stdString);
        }
    }
    
    /**
     * Appends and returns a new empty "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString addNewStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().add_element_user(STDSTRING$0);
            return target;
        }
    }
    /**
     * An XML std-String(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdStringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdStringDocument.StdString
    {
        
        public StdStringImpl(org.apache.xmlbeans.SchemaType sType)
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
