/*
 * An XML document type.
 * Localname: col-TreeSet
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColTreeSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one col-TreeSet(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class ColTreeSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColTreeSetDocument
{
    
    public ColTreeSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLTREESET$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-TreeSet");
    
    
    /**
     * Gets the "col-TreeSet" element
     */
    public org.apache.ofbiz.service.ColCollection getColTreeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLTREESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "col-TreeSet" element
     */
    public void setColTreeSet(org.apache.ofbiz.service.ColCollection colTreeSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLTREESET$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLTREESET$0);
            }
            target.set(colTreeSet);
        }
    }
    
    /**
     * Appends and returns a new empty "col-TreeSet" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColTreeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLTREESET$0);
            return target;
        }
    }
}
