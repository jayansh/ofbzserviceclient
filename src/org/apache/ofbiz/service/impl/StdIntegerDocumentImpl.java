/*
 * An XML document type.
 * Localname: std-Integer
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdIntegerDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-Integer(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdIntegerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdIntegerDocument
{
    
    public StdIntegerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDINTEGER$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Integer");
    
    
    /**
     * Gets the "std-Integer" element
     */
    public org.apache.ofbiz.service.StdIntegerDocument.StdInteger getStdInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().find_element_user(STDINTEGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-Integer" element
     */
    public void setStdInteger(org.apache.ofbiz.service.StdIntegerDocument.StdInteger stdInteger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().find_element_user(STDINTEGER$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().add_element_user(STDINTEGER$0);
            }
            target.set(stdInteger);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Integer" element
     */
    public org.apache.ofbiz.service.StdIntegerDocument.StdInteger addNewStdInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().add_element_user(STDINTEGER$0);
            return target;
        }
    }
    /**
     * An XML std-Integer(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdIntegerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdIntegerDocument.StdInteger
    {
        
        public StdIntegerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.math.BigInteger getValue()
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
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.math.BigInteger value)
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
                target.setBigIntegerValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlInteger value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
