/*
 * An XML document type.
 * Localname: map-WeakHashMap
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapWeakHashMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-WeakHashMap(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapWeakHashMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapWeakHashMapDocument
{
    
    public MapWeakHashMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPWEAKHASHMAP$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-WeakHashMap");
    
    
    /**
     * Gets the "map-WeakHashMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapWeakHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPWEAKHASHMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-WeakHashMap" element
     */
    public void setMapWeakHashMap(org.apache.ofbiz.service.MapMap mapWeakHashMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPWEAKHASHMAP$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPWEAKHASHMAP$0);
            }
            target.set(mapWeakHashMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-WeakHashMap" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapWeakHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPWEAKHASHMAP$0);
            return target;
        }
    }
}
