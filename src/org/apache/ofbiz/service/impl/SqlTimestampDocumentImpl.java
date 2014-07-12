/*
 * An XML document type.
 * Localname: sql-Timestamp
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.SqlTimestampDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one sql-Timestamp(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class SqlTimestampDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.SqlTimestampDocument
{
    
    public SqlTimestampDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SQLTIMESTAMP$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "sql-Timestamp");
    
    
    /**
     * Gets the "sql-Timestamp" element
     */
    public org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp getSqlTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().find_element_user(SQLTIMESTAMP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sql-Timestamp" element
     */
    public void setSqlTimestamp(org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp sqlTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().find_element_user(SQLTIMESTAMP$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().add_element_user(SQLTIMESTAMP$0);
            }
            target.set(sqlTimestamp);
        }
    }
    
    /**
     * Appends and returns a new empty "sql-Timestamp" element
     */
    public org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp addNewSqlTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().add_element_user(SQLTIMESTAMP$0);
            return target;
        }
    }
    /**
     * An XML sql-Timestamp(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class SqlTimestampImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp
    {
        
        public SqlTimestampImpl(org.apache.xmlbeans.SchemaType sType)
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
        public org.apache.xmlbeans.XmlDateTime xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALUE$0);
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
        public void xsetValue(org.apache.xmlbeans.XmlDateTime value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
