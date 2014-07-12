/*
 * An XML document type.
 * Localname: null
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.NullDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one null(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class NullDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.NullDocument
{
    
    public NullDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NULL$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "null");
    
    
    /**
     * Gets the "null" element
     */
    public org.apache.ofbiz.service.NullDocument.Null getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "null" element
     */
    public boolean isNilNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "null" element
     */
    public void setNull(org.apache.ofbiz.service.NullDocument.Null xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.NullDocument.Null)get_store().add_element_user(NULL$0);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Appends and returns a new empty "null" element
     */
    public org.apache.ofbiz.service.NullDocument.Null addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().add_element_user(NULL$0);
            return target;
        }
    }
    
    /**
     * Nils the "null" element
     */
    public void setNilNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.NullDocument.Null)get_store().add_element_user(NULL$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML null(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class NullImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.NullDocument.Null
    {
        
        public NullImpl(org.apache.xmlbeans.SchemaType sType)
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
