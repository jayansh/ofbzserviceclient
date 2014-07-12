/*
 * XML Type:  map-Key
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapKey
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * An XML map-Key(@http://ofbiz.apache.org/service/).
 *
 * This is a complex type.
 */
public class MapKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapKey
{
    
    public MapKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDSTRING$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-String");
    
    
    /**
     * Gets the "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString getStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "std-String" element
     */
    public void setStdString(org.apache.ofbiz.service.StdStringDocument.StdString stdString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().add_element_user(STDSTRING$0);
            }
            target.set(stdString);
        }
    }
    
    /**
     * Appends and returns a new empty "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString addNewStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().add_element_user(STDSTRING$0);
            return target;
        }
    }
}
