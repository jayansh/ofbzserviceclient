/*
 * An XML document type.
 * Localname: map-Key
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-Key(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapKeyDocument
{
    
    public MapKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPKEY$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Key");
    
    
    /**
     * Gets the "map-Key" element
     */
    public org.apache.ofbiz.service.MapKey getMapKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapKey target = null;
            target = (org.apache.ofbiz.service.MapKey)get_store().find_element_user(MAPKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-Key" element
     */
    public void setMapKey(org.apache.ofbiz.service.MapKey mapKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapKey target = null;
            target = (org.apache.ofbiz.service.MapKey)get_store().find_element_user(MAPKEY$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapKey)get_store().add_element_user(MAPKEY$0);
            }
            target.set(mapKey);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Key" element
     */
    public org.apache.ofbiz.service.MapKey addNewMapKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapKey target = null;
            target = (org.apache.ofbiz.service.MapKey)get_store().add_element_user(MAPKEY$0);
            return target;
        }
    }
}
