/*
 * An XML document type.
 * Localname: map-Entry
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-Entry(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapEntryDocument
{
    
    public MapEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPENTRY$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Entry");
    
    
    /**
     * Gets the "map-Entry" element
     */
    public org.apache.ofbiz.service.MapEntry getMapEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapEntry target = null;
            target = (org.apache.ofbiz.service.MapEntry)get_store().find_element_user(MAPENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-Entry" element
     */
    public void setMapEntry(org.apache.ofbiz.service.MapEntry mapEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapEntry target = null;
            target = (org.apache.ofbiz.service.MapEntry)get_store().find_element_user(MAPENTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapEntry)get_store().add_element_user(MAPENTRY$0);
            }
            target.set(mapEntry);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Entry" element
     */
    public org.apache.ofbiz.service.MapEntry addNewMapEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapEntry target = null;
            target = (org.apache.ofbiz.service.MapEntry)get_store().add_element_user(MAPENTRY$0);
            return target;
        }
    }
}
