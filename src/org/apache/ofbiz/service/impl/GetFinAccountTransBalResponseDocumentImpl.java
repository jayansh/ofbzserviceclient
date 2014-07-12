/*
 * An XML document type.
 * Localname: getFinAccountTransBalResponse
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one getFinAccountTransBalResponse(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class GetFinAccountTransBalResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument
{
    
    public GetFinAccountTransBalResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFINACCOUNTTRANSBALRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "getFinAccountTransBalResponse");
    
    
    /**
     * Gets the "getFinAccountTransBalResponse" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse getGetFinAccountTransBalResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse)get_store().find_element_user(GETFINACCOUNTTRANSBALRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFinAccountTransBalResponse" element
     */
    public void setGetFinAccountTransBalResponse(org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse getFinAccountTransBalResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse)get_store().find_element_user(GETFINACCOUNTTRANSBALRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse)get_store().add_element_user(GETFINACCOUNTTRANSBALRESPONSE$0);
            }
            target.set(getFinAccountTransBalResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getFinAccountTransBalResponse" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse addNewGetFinAccountTransBalResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse)get_store().add_element_user(GETFINACCOUNTTRANSBALRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getFinAccountTransBalResponse(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class GetFinAccountTransBalResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalResponseDocument.GetFinAccountTransBalResponse
    {
        
        public GetFinAccountTransBalResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAPMAP$0 = 
            new javax.xml.namespace.QName("", "map-Map");
        
        
        /**
         * Gets the "map-Map" element
         */
        public org.apache.ofbiz.service.MapMap getMapMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ofbiz.service.MapMap target = null;
                target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "map-Map" element
         */
        public boolean isNilMapMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ofbiz.service.MapMap target = null;
                target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "map-Map" element
         */
        public void setMapMap(org.apache.ofbiz.service.MapMap mapMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ofbiz.service.MapMap target = null;
                target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$0, 0);
                if (target == null)
                {
                    target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPMAP$0);
                }
                target.set(mapMap);
            }
        }
        
        /**
         * Appends and returns a new empty "map-Map" element
         */
        public org.apache.ofbiz.service.MapMap addNewMapMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ofbiz.service.MapMap target = null;
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPMAP$0);
                return target;
            }
        }
        
        /**
         * Nils the "map-Map" element
         */
        public void setNilMapMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ofbiz.service.MapMap target = null;
                target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$0, 0);
                if (target == null)
                {
                    target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPMAP$0);
                }
                target.setNil();
            }
        }
    }
}
