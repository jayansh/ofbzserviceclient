/*
 * An XML document type.
 * Localname: std-Float
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdFloatDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-Float(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdFloatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdFloatDocument
{
    
    public StdFloatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDFLOAT$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Float");
    
    
    /**
     * Gets the "std-Float" element
     */
    public org.apache.ofbiz.service.StdFloatDocument.StdFloat getStdFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().find_element_user(STDFLOAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-Float" element
     */
    public void setStdFloat(org.apache.ofbiz.service.StdFloatDocument.StdFloat stdFloat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().find_element_user(STDFLOAT$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().add_element_user(STDFLOAT$0);
            }
            target.set(stdFloat);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Float" element
     */
    public org.apache.ofbiz.service.StdFloatDocument.StdFloat addNewStdFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().add_element_user(STDFLOAT$0);
            return target;
        }
    }
    /**
     * An XML std-Float(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdFloatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdFloatDocument.StdFloat
    {
        
        public StdFloatImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public float getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlFloat xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(float value)
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
                target.setFloatValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlFloat value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
