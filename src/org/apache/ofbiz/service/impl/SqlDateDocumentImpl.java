/*
 * An XML document type.
 * Localname: sql-Date
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.SqlDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one sql-Date(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class SqlDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.SqlDateDocument
{
    
    public SqlDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SQLDATE$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "sql-Date");
    
    
    /**
     * Gets the "sql-Date" element
     */
    public org.apache.ofbiz.service.SqlDateDocument.SqlDate getSqlDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().find_element_user(SQLDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sql-Date" element
     */
    public void setSqlDate(org.apache.ofbiz.service.SqlDateDocument.SqlDate sqlDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().find_element_user(SQLDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().add_element_user(SQLDATE$0);
            }
            target.set(sqlDate);
        }
    }
    
    /**
     * Appends and returns a new empty "sql-Date" element
     */
    public org.apache.ofbiz.service.SqlDateDocument.SqlDate addNewSqlDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().add_element_user(SQLDATE$0);
            return target;
        }
    }
    /**
     * An XML sql-Date(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class SqlDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.SqlDateDocument.SqlDate
    {
        
        public SqlDateImpl(org.apache.xmlbeans.SchemaType sType)
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
        public org.apache.xmlbeans.XmlDate xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(VALUE$0);
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
        public void xsetValue(org.apache.xmlbeans.XmlDate value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
