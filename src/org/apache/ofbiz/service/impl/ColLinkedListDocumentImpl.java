/*
 * An XML document type.
 * Localname: col-LinkedList
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColLinkedListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one col-LinkedList(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class ColLinkedListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColLinkedListDocument
{
    
    public ColLinkedListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLINKEDLIST$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-LinkedList");
    
    
    /**
     * Gets the "col-LinkedList" element
     */
    public org.apache.ofbiz.service.ColCollection getColLinkedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLLINKEDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "col-LinkedList" element
     */
    public void setColLinkedList(org.apache.ofbiz.service.ColCollection colLinkedList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLLINKEDLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLLINKEDLIST$0);
            }
            target.set(colLinkedList);
        }
    }
    
    /**
     * Appends and returns a new empty "col-LinkedList" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColLinkedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLLINKEDLIST$0);
            return target;
        }
    }
}
