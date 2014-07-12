/*
 * An XML document type.
 * Localname: map-Map
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-Map(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapMapDocument
{
    
    public MapMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPMAP$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Map");
    
    
    /**
     * Gets the "map-Map" element
     */
    public org.apache.ofbiz.service.MapMap getMapMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-Map" element
     */
    public void setMapMap(org.apache.ofbiz.service.MapMap mapMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPMAP$0);
            }
            target.set(mapMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Map" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPMAP$0);
            return target;
        }
    }
}
