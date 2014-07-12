/*
 * An XML document type.
 * Localname: sql-Time
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.SqlTimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one sql-Time(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class SqlTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.SqlTimeDocument
{
    
    public SqlTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SQLTIME$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "sql-Time");
    
    
    /**
     * Gets the "sql-Time" element
     */
    public org.apache.ofbiz.service.SqlTimeDocument.SqlTime getSqlTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().find_element_user(SQLTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sql-Time" element
     */
    public void setSqlTime(org.apache.ofbiz.service.SqlTimeDocument.SqlTime sqlTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().find_element_user(SQLTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().add_element_user(SQLTIME$0);
            }
            target.set(sqlTime);
        }
    }
    
    /**
     * Appends and returns a new empty "sql-Time" element
     */
    public org.apache.ofbiz.service.SqlTimeDocument.SqlTime addNewSqlTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().add_element_user(SQLTIME$0);
            return target;
        }
    }
    /**
     * An XML sql-Time(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class SqlTimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.SqlTimeDocument.SqlTime
    {
        
        public SqlTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.util.Calendar getValue()
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
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlTime xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.util.Calendar value)
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
                target.setCalendarValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlTime value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
