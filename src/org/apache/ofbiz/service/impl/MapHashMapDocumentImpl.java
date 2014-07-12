/*
 * An XML document type.
 * Localname: map-HashMap
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapHashMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-HashMap(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapHashMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapHashMapDocument
{
    
    public MapHashMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPHASHMAP$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-HashMap");
    
    
    /**
     * Gets the "map-HashMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-HashMap" element
     */
    public void setMapHashMap(org.apache.ofbiz.service.MapMap mapHashMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHMAP$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHMAP$0);
            }
            target.set(mapHashMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-HashMap" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHMAP$0);
            return target;
        }
    }
}
