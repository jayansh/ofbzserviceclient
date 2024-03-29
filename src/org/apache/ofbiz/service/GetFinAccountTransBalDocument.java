/*
 * An XML document type.
 * Localname: getFinAccountTransBal
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.GetFinAccountTransBalDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service;


/**
 * A document containing one getFinAccountTransBal(@http://ofbiz.apache.org/service/) element.
 *
 * This is a complex type.
 */
public interface GetFinAccountTransBalDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFinAccountTransBalDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2D58E30B30747263FFF7BF74FCC60359").resolveHandle("getfinaccounttransbal503ddoctype");
    
    /**
     * Gets the "getFinAccountTransBal" element
     */
    org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal getGetFinAccountTransBal();
    
    /**
     * Sets the "getFinAccountTransBal" element
     */
    void setGetFinAccountTransBal(org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal getFinAccountTransBal);
    
    /**
     * Appends and returns a new empty "getFinAccountTransBal" element
     */
    org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal addNewGetFinAccountTransBal();
    
    /**
     * An XML getFinAccountTransBal(@http://ofbiz.apache.org/service/).
     *
     * This is a complex type.
     */
    public interface GetFinAccountTransBal extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetFinAccountTransBal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2D58E30B30747263FFF7BF74FCC60359").resolveHandle("getfinaccounttransbal8df4elemtype");
        
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
            public static org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal newInstance() {
              return (org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ofbiz.service.GetFinAccountTransBalDocument.GetFinAccountTransBal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument newInstance() {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ofbiz.service.GetFinAccountTransBalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ofbiz.service.GetFinAccountTransBalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
