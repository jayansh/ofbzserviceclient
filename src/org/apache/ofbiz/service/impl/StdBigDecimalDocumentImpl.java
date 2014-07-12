/*
 * An XML document type.
 * Localname: std-BigDecimal
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.StdBigDecimalDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one std-BigDecimal(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class StdBigDecimalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdBigDecimalDocument
{
    
    public StdBigDecimalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDBIGDECIMAL$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-BigDecimal");
    
    
    /**
     * Gets the "std-BigDecimal" element
     */
    public org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal getStdBigDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().find_element_user(STDBIGDECIMAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-BigDecimal" element
     */
    public void setStdBigDecimal(org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal stdBigDecimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().find_element_user(STDBIGDECIMAL$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().add_element_user(STDBIGDECIMAL$0);
            }
            target.set(stdBigDecimal);
        }
    }
    
    /**
     * Appends and returns a new empty "std-BigDecimal" element
     */
    public org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal addNewStdBigDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().add_element_user(STDBIGDECIMAL$0);
            return target;
        }
    }
    /**
     * An XML std-BigDecimal(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class StdBigDecimalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal
    {
        
        public StdBigDecimalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.math.BigDecimal getValue()
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
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlDecimal xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.math.BigDecimal value)
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
                target.setBigDecimalValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlDecimal value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
