/*
 * An XML document type.
 * Localname: getFinAccountTransBalbyUserResponse
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one getFinAccountTransBalbyUserResponse(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class GetFinAccountTransBalbyUserResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument
{
    
    public GetFinAccountTransBalbyUserResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFINACCOUNTTRANSBALBYUSERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "getFinAccountTransBalbyUserResponse");
    
    
    /**
     * Gets the "getFinAccountTransBalbyUserResponse" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse getGetFinAccountTransBalbyUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse)get_store().find_element_user(GETFINACCOUNTTRANSBALBYUSERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFinAccountTransBalbyUserResponse" element
     */
    public void setGetFinAccountTransBalbyUserResponse(org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse getFinAccountTransBalbyUserResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse)get_store().find_element_user(GETFINACCOUNTTRANSBALBYUSERRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse)get_store().add_element_user(GETFINACCOUNTTRANSBALBYUSERRESPONSE$0);
            }
            target.set(getFinAccountTransBalbyUserResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getFinAccountTransBalbyUserResponse" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse addNewGetFinAccountTransBalbyUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse)get_store().add_element_user(GETFINACCOUNTTRANSBALBYUSERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getFinAccountTransBalbyUserResponse(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class GetFinAccountTransBalbyUserResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse
    {
        
        public GetFinAccountTransBalbyUserResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
