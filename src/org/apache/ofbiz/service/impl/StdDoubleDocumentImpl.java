/*
 * An XML document type.
 * Localname: std-Double
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdDoubleDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-Double(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdDoubleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdDoubleDocument
{
    
    public StdDoubleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDDOUBLE$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Double");
    
    
    /**
     * Gets the "std-Double" element
     */
    public org.apache.ofbiz.service.StdDoubleDocument.StdDouble getStdDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().find_element_user(STDDOUBLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-Double" element
     */
    public void setStdDouble(org.apache.ofbiz.service.StdDoubleDocument.StdDouble stdDouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().find_element_user(STDDOUBLE$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().add_element_user(STDDOUBLE$0);
            }
            target.set(stdDouble);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Double" element
     */
    public org.apache.ofbiz.service.StdDoubleDocument.StdDouble addNewStdDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().add_element_user(STDDOUBLE$0);
            return target;
        }
    }
    /**
     * An XML std-Double(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdDoubleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdDoubleDocument.StdDouble
    {
        
        public StdDoubleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public double getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(double value)
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
                target.setDoubleValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlDouble value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
