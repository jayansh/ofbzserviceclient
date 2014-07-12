/*
 * An XML document type.
 * Localname: std-Long
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdLongDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-Long(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdLongDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdLongDocument
{
    
    public StdLongDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDLONG$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Long");
    
    
    /**
     * Gets the "std-Long" element
     */
    public org.apache.ofbiz.service.StdLongDocument.StdLong getStdLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().find_element_user(STDLONG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-Long" element
     */
    public void setStdLong(org.apache.ofbiz.service.StdLongDocument.StdLong stdLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().find_element_user(STDLONG$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().add_element_user(STDLONG$0);
            }
            target.set(stdLong);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Long" element
     */
    public org.apache.ofbiz.service.StdLongDocument.StdLong addNewStdLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().add_element_user(STDLONG$0);
            return target;
        }
    }
    /**
     * An XML std-Long(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdLongImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdLongDocument.StdLong
    {
        
        public StdLongImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public long getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlLong xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(long value)
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
                target.setLongValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlLong value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
