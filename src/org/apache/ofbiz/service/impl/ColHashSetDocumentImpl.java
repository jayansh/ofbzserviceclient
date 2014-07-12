/*
 * An XML document type.
 * Localname: col-HashSet
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColHashSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one col-HashSet(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class ColHashSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColHashSetDocument
{
    
    public ColHashSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLHASHSET$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-HashSet");
    
    
    /**
     * Gets the "col-HashSet" element
     */
    public org.apache.ofbiz.service.ColCollection getColHashSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLHASHSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "col-HashSet" element
     */
    public void setColHashSet(org.apache.ofbiz.service.ColCollection colHashSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLHASHSET$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLHASHSET$0);
            }
            target.set(colHashSet);
        }
    }
    
    /**
     * Appends and returns a new empty "col-HashSet" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColHashSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLHASHSET$0);
            return target;
        }
    }
}
