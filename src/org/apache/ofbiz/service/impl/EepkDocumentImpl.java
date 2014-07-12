/*
 * An XML document type.
 * Localname: eepk-
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.EepkDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one eepk-(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class EepkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.EepkDocument
{
    
    public EepkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EEPK$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "eepk-");
    
    
    /**
     * Gets the "eepk-" element
     */
    public org.apache.ofbiz.service.MapMap getEepk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEPK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eepk-" element
     */
    public void setEepk(org.apache.ofbiz.service.MapMap eepk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEPK$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEPK$0);
            }
            target.set(eepk);
        }
    }
    
    /**
     * Appends and returns a new empty "eepk-" element
     */
    public org.apache.ofbiz.service.MapMap addNewEepk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEPK$0);
            return target;
        }
    }
}
