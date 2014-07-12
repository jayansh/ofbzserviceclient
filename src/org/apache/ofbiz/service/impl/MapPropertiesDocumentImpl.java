/*
 * An XML document type.
 * Localname: map-Properties
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one map-Properties(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class MapPropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapPropertiesDocument
{
    
    public MapPropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Properties");
    
    
    /**
     * Gets the "map-Properties" element
     */
    public org.apache.ofbiz.service.MapMap getMapProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map-Properties" element
     */
    public void setMapProperties(org.apache.ofbiz.service.MapMap mapProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPPROPERTIES$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPPROPERTIES$0);
            }
            target.set(mapProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Properties" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPPROPERTIES$0);
            return target;
        }
    }
}
