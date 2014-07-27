/*
 * An XML document type.
 * Localname: getFinAccountTransBalbyUser
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service;


/**
 * A document containing one getFinAccountTransBalbyUser(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public interface GetFinAccountTransBalbyUserDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFinAccountTransBalbyUserDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC71C17756582B131E6BCE9FBCF1C7DBC").resolveHandle("getfinaccounttransbalbyuser92bbdoctype");
    
    /**
     * Gets the "getFinAccountTransBalbyUser" element
     */
    org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser getGetFinAccountTransBalbyUser();
    
    /**
     * Sets the "getFinAccountTransBalbyUser" element
     */
    void setGetFinAccountTransBalbyUser(org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser getFinAccountTransBalbyUser);
    
    /**
     * Appends and returns a new empty "getFinAccountTransBalbyUser" element
     */
    org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser addNewGetFinAccountTransBalbyUser();
    
    /**
     * An XML getFinAccountTransBalbyUser(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public interface GetFinAccountTransBalbyUser extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFinAccountTransBalbyUser.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC71C17756582B131E6BCE9FBCF1C7DBC").resolveHandle("getfinaccounttransbalbyuser09f0elemtype");
        
        /**
         * Gets the "map-Map" element
         */
        org.apache.ofbiz.service.MapMap getMapMap();
        
        /**
         * Tests for nil "map-Map" element
         */
        boolean isNilMapMap();
        
        /**
         * Sets the "map-Map" element
         */
        void setMapMap(org.apache.ofbiz.service.MapMap mapMap);
        
        /**
         * Appends and returns a new empty "map-Map" element
         */
        org.apache.ofbiz.service.MapMap addNewMapMap();
        
        /**
         * Nils the "map-Map" element
         */
        void setNilMapMap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser newInstance() {
              return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument newInstance() {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
