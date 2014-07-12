/*
 * An XML document type.
 * Localname: getFinAccountTransBal
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.GetFinAccountTransBalDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * A document containing one getFinAccountTransBal(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public class GetFinAccountTransBalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalDocument
{
    
    public GetFinAccountTransBalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFINACCOUNTTRANSBAL$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "getFinAccountTransBal");
    
    
    /**
     * Gets the "getFinAccountTransBal" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal getGetFinAccountTransBal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal)get_store().find_element_user(GETFINACCOUNTTRANSBAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFinAccountTransBal" element
     */
    public void setGetFinAccountTransBal(org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal getFinAccountTransBal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal)get_store().find_element_user(GETFINACCOUNTTRANSBAL$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal)get_store().add_element_user(GETFINACCOUNTTRANSBAL$0);
            }
            target.set(getFinAccountTransBal);
        }
    }
    
    /**
     * Appends and returns a new empty "getFinAccountTransBal" element
     */
    public org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal addNewGetFinAccountTransBal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal target = null;
            target = (org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal)get_store().add_element_user(GETFINACCOUNTTRANSBAL$0);
            return target;
        }
    }
    /**
     * An XML getFinAccountTransBal(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public static class GetFinAccountTransBalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal
    {
        
        public GetFinAccountTransBalImpl(org.apache.xmlbeans.SchemaType sType)
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
