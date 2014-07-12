/*
 * XML Type:  map-Entry
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapEntry
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * An XML map-Entry(@http://ofbiz.apache.org/service/).
 *
 * This is a complex type.
 */
public class MapEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapEntry
{
    
    public MapEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPKEY$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Key");
    private static final javax.xml.namespace.QName MAPVALUE$2 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Value");
    
    
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
    
    /**
     * Gets the "map-Value" element
     */
    public org.apache.ofbiz.service.MapValue getMapValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapValue target = null;
            target = (org.apache.ofbiz.service.MapValue)get_store().find_element_user(MAPVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-Value" element
     */
    public void setMapValue(org.apache.ofbiz.service.MapValue mapValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapValue target = null;
            target = (org.apache.ofbiz.service.MapValue)get_store().find_element_user(MAPVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapValue)get_store().add_element_user(MAPVALUE$2);
            }
            target.set(mapValue);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Value" element
     */
    public org.apache.ofbiz.service.MapValue addNewMapValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapValue target = null;
            target = (org.apache.ofbiz.service.MapValue)get_store().add_element_user(MAPVALUE$2);
            return target;
        }
    }
}
