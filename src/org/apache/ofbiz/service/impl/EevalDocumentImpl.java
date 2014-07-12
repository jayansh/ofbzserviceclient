/*
 * An XML document type.
 * Localname: eeval-
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.EevalDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one eeval-(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class EevalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.EevalDocument
{
    
    public EevalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EEVAL$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "eeval-");
    
    
    /**
     * Gets the "eeval-" element
     */
    public org.apache.ofbiz.service.MapMap getEeval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eeval-" element
     */
    public void setEeval(org.apache.ofbiz.service.MapMap eeval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEVAL$0);
            }
            target.set(eeval);
        }
    }
    
    /**
     * Appends and returns a new empty "eeval-" element
     */
    public org.apache.ofbiz.service.MapMap addNewEeval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEVAL$0);
            return target;
        }
    }
}
