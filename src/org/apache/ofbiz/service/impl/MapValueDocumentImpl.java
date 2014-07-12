/*
 * An XML document type.
 * Localname: map-Value
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-Value(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapValueDocument
{
    
    public MapValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPVALUE$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Value");
    
    
    /**
     * Gets the "map-Value" element
     */
    public org.apache.ofbiz.service.MapValue getMapValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapValue target = null;
            target = (org.apache.ofbiz.service.MapValue)get_store().find_element_user(MAPVALUE$0, 0);
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
            target = (org.apache.ofbiz.service.MapValue)get_store().find_element_user(MAPVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapValue)get_store().add_element_user(MAPVALUE$0);
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
            target = (org.apache.ofbiz.service.MapValue)get_store().add_element_user(MAPVALUE$0);
            return target;
        }
    }
}
