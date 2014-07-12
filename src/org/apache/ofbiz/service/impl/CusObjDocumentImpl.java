/*
 * An XML document type.
 * Localname: cus-obj
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.CusObjDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one cus-obj(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class CusObjDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.CusObjDocument
{
    
    public CusObjDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSOBJ$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "cus-obj");
    
    
    /**
     * Gets the "cus-obj" element
     */
    public org.apache.xmlbeans.XmlObject getCusObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CUSOBJ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cus-obj" element
     */
    public void setCusObj(org.apache.xmlbeans.XmlObject cusObj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CUSOBJ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CUSOBJ$0);
            }
            target.set(cusObj);
        }
    }
    
    /**
     * Appends and returns a new empty "cus-obj" element
     */
    public org.apache.xmlbeans.XmlObject addNewCusObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CUSOBJ$0);
            return target;
        }
    }
}
