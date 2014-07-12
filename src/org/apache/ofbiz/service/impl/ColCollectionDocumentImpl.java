/*
 * An XML document type.
 * Localname: col-Collection
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one col-Collection(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class ColCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColCollectionDocument
{
    
    public ColCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-Collection");
    
    
    /**
     * Gets the "col-Collection" element
     */
    public org.apache.ofbiz.service.ColCollection getColCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "col-Collection" element
     */
    public void setColCollection(org.apache.ofbiz.service.ColCollection colCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLCOLLECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLCOLLECTION$0);
            }
            target.set(colCollection);
        }
    }
    
    /**
     * Appends and returns a new empty "col-Collection" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLCOLLECTION$0);
            return target;
        }
    }
}
