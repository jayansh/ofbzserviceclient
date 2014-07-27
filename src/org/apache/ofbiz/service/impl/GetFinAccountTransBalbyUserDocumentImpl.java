/*
 * An XML document type.
 * Localname: getFinAccountTransBalbyUser
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one getFinAccountTransBalbyUser(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class GetFinAccountTransBalbyUserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument
{
    
    public GetFinAccountTransBalbyUserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFINACCOUNTTRANSBALBYUSER$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "getFinAccountTransBalbyUser");
    
    
    /**
     * Gets the "getFinAccountTransBalbyUser" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser getGetFinAccountTransBalbyUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser)get_store().find_element_user(GETFINACCOUNTTRANSBALBYUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFinAccountTransBalbyUser" element
     */
    public void setGetFinAccountTransBalbyUser(org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser getFinAccountTransBalbyUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser)get_store().find_element_user(GETFINACCOUNTTRANSBALBYUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser)get_store().add_element_user(GETFINACCOUNTTRANSBALBYUSER$0);
            }
            target.set(getFinAccountTransBalbyUser);
        }
    }
    
    /**
     * Appends and returns a new empty "getFinAccountTransBalbyUser" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser addNewGetFinAccountTransBalbyUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser)get_store().add_element_user(GETFINACCOUNTTRANSBALBYUSER$0);
            return target;
        }
    }
    /**
     * An XML getFinAccountTransBalbyUser(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class GetFinAccountTransBalbyUserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser
    {
        
        public GetFinAccountTransBalbyUserImpl(org.apache.xmlbeans.SchemaType sType)
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
