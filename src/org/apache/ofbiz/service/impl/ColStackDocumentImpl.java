/*
 * An XML document type.
 * Localname: col-Stack
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColStackDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one col-Stack(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class ColStackDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColStackDocument
{
    
    public ColStackDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLSTACK$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-Stack");
    
    
    /**
     * Gets the "col-Stack" element
     */
    public org.apache.ofbiz.service.ColCollection getColStack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLSTACK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "col-Stack" element
     */
    public void setColStack(org.apache.ofbiz.service.ColCollection colStack)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLSTACK$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLSTACK$0);
            }
            target.set(colStack);
        }
    }
    
    /**
     * Appends and returns a new empty "col-Stack" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColStack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLSTACK$0);
            return target;
        }
    }
}
