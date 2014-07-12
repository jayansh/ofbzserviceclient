/*
 * An XML document type.
 * Localname: std-Boolean
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdBooleanDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-Boolean(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdBooleanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdBooleanDocument
{
    
    public StdBooleanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDBOOLEAN$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Boolean");
    
    
    /**
     * Gets the "std-Boolean" element
     */
    public org.apache.ofbiz.service.StdBooleanDocument.StdBoolean getStdBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().find_element_user(STDBOOLEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-Boolean" element
     */
    public void setStdBoolean(org.apache.ofbiz.service.StdBooleanDocument.StdBoolean stdBoolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().find_element_user(STDBOOLEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().add_element_user(STDBOOLEAN$0);
            }
            target.set(stdBoolean);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Boolean" element
     */
    public org.apache.ofbiz.service.StdBooleanDocument.StdBoolean addNewStdBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().add_element_user(STDBOOLEAN$0);
            return target;
        }
    }
    /**
     * An XML std-Boolean(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdBooleanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdBooleanDocument.StdBoolean
    {
        
        public StdBooleanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public boolean getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(boolean value)
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
                target.setBooleanValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlBoolean value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
