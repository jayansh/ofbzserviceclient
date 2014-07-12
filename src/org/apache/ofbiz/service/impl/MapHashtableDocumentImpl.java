/*
 * An XML document type.
 * Localname: map-Hashtable
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapHashtableDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-Hashtable(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapHashtableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapHashtableDocument
{
    
    public MapHashtableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPHASHTABLE$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Hashtable");
    
    
    /**
     * Gets the "map-Hashtable" element
     */
    public org.apache.ofbiz.service.MapMap getMapHashtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-Hashtable" element
     */
    public void setMapHashtable(org.apache.ofbiz.service.MapMap mapHashtable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHTABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHTABLE$0);
            }
            target.set(mapHashtable);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Hashtable" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapHashtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHTABLE$0);
            return target;
        }
    }
}
