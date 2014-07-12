/*
 * XML Type:  map-Map
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapMap
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * An XML map-Map(@http://ofbiz.apache.org/service/).
 *
 * This is a complex type.
 */
public class MapMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapMap
{
    
    public MapMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPENTRY$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Entry");
    
    
    /**
     * Gets array of all "map-Entry" elements
     */
    public org.apache.ofbiz.service.MapEntry[] getMapEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPENTRY$0, targetList);
            org.apache.ofbiz.service.MapEntry[] result = new org.apache.ofbiz.service.MapEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map-Entry" element
     */
    public org.apache.ofbiz.service.MapEntry getMapEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapEntry target = null;
            target = (org.apache.ofbiz.service.MapEntry)get_store().find_element_user(MAPENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map-Entry" element
     */
    public int sizeOfMapEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPENTRY$0);
        }
    }
    
    /**
     * Sets array of all "map-Entry" element
     */
    public void setMapEntryArray(org.apache.ofbiz.service.MapEntry[] mapEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapEntryArray, MAPENTRY$0);
        }
    }
    
    /**
     * Sets ith "map-Entry" element
     */
    public void setMapEntryArray(int i, org.apache.ofbiz.service.MapEntry mapEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapEntry target = null;
            target = (org.apache.ofbiz.service.MapEntry)get_store().find_element_user(MAPENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-Entry" element
     */
    public org.apache.ofbiz.service.MapEntry insertNewMapEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapEntry target = null;
            target = (org.apache.ofbiz.service.MapEntry)get_store().insert_element_user(MAPENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-Entry" element
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
    
    /**
     * Removes the ith "map-Entry" element
     */
    public void removeMapEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPENTRY$0, i);
        }
    }
}
