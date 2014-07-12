/*
 * An XML document type.
 * Localname: col-ArrayList
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColArrayListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one col-ArrayList(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class ColArrayListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColArrayListDocument
{
    
    public ColArrayListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLARRAYLIST$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-ArrayList");
    
    
    /**
     * Gets the "col-ArrayList" element
     */
    public org.apache.ofbiz.service.ColCollection getColArrayList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLARRAYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "col-ArrayList" element
     */
    public void setColArrayList(org.apache.ofbiz.service.ColCollection colArrayList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLARRAYLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLARRAYLIST$0);
            }
            target.set(colArrayList);
        }
    }
    
    /**
     * Appends and returns a new empty "col-ArrayList" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColArrayList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLARRAYLIST$0);
            return target;
        }
    }
}
