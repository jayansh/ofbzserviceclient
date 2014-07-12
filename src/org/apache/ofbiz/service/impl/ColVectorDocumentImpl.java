/*
 * An XML document type.
 * Localname: col-Vector
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColVectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one col-Vector(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class ColVectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColVectorDocument
{
    
    public ColVectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLVECTOR$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-Vector");
    
    
    /**
     * Gets the "col-Vector" element
     */
    public org.apache.ofbiz.service.ColCollection getColVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLVECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "col-Vector" element
     */
    public void setColVector(org.apache.ofbiz.service.ColCollection colVector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLVECTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLVECTOR$0);
            }
            target.set(colVector);
        }
    }
    
    /**
     * Appends and returns a new empty "col-Vector" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLVECTOR$0);
            return target;
        }
    }
}
