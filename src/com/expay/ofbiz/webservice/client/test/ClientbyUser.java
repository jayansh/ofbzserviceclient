package com.expay.ofbiz.webservice.client.test;

import java.net.URL;
import java.rmi.RemoteException;

import org.apache.ofbiz.service.GetFinAccountTransBalDocument;
import org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument;
import org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument;
import org.apache.ofbiz.service.GetFinAccountTransBalbyUserResponseDocument.GetFinAccountTransBalbyUserResponse;
import org.apache.ofbiz.service.GetFinAccountTransBalbyUserStub;
import org.apache.ofbiz.service.MapEntry;
import org.apache.ofbiz.service.MapMap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ClientbyUser {
    public static String username = "123456789";
    public static String password = "ofbiz";
    public static String userLoginId = "ExpayAgent";
    public static String url = "http://localhost:8080/webtools/control/SOAPService";
    public static String httpsURL = "https://localhost:8443/webtools/control/SOAPService";

    public static void main(java.lang.String args[]) {
        try {
            URL url = ClientbyUser.class.getResource("ofbizkeystore.ts");
//            System.out.println(url);
            System.setProperty("javax.net.ssl.trustStore", url.getFile());
            System.setProperty("javax.net.ssl.trustStorePassword", "3xpayGlobal");
            GetFinAccountTransBalbyUserStub stub2 = new GetFinAccountTransBalbyUserStub(httpsURL);
            getGetFinAccountTransBalbyUser(stub2);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\n\n");
        }
    }

    public static Node findDesiredNodeInNestedMapEntry(Node mapEntryNode, String desiredNodeName) {
        NodeList nodeList = mapEntryNode.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && "col-LinkedList".equals(node.getLocalName())) {
                Node node2 = XmlUtil.firstChildNode(node, "map-Key");

                System.out.println(node2.getNodeName());
                Element desiredNode = XmlUtil.firstChildNode(node2, "std-String", "value", desiredNodeName);
                if (desiredNode != null) {
                    System.out.println(desiredNode.getLocalName());
                    return desiredNode;
                } else {
                    return findDesiredNodeInNestedMapEntry(node2, desiredNodeName);
                }
            }
            //

        }
        return null;

    }

    public static void getGetFinAccountTransBalbyUser(GetFinAccountTransBalbyUserStub stub) {

        GetFinAccountTransBalbyUserDocument getFinAccountTransBalbyUserDocument = GetFinAccountTransBalbyUserDocument.Factory
                .newInstance();
        org.apache.ofbiz.service.GetFinAccountTransBalbyUserDocument.GetFinAccountTransBalbyUser info = getFinAccountTransBalbyUserDocument
                .addNewGetFinAccountTransBalbyUser();

        MapMap mapMap = info.addNewMapMap();

        MapEntry entry1 = mapMap.addNewMapEntry();
        entry1.addNewMapKey().addNewStdString().setValue("login.username");
        entry1.addNewMapValue().addNewStdString().setValue(username);

        MapEntry entry2 = mapMap.addNewMapEntry();
        entry2.addNewMapKey().addNewStdString().setValue("login.password");
        entry2.addNewMapValue().addNewStdString().setValue(password);

        MapEntry entry3 = mapMap.addNewMapEntry();
        entry3.addNewMapKey().addNewStdString().setValue("userLoginId");
        entry3.addNewMapValue().addNewStdString().setValue(userLoginId);

        try {
            GetFinAccountTransBalbyUserResponseDocument responseDoc = stub
                    .getFinAccountTransBalbyUser(getFinAccountTransBalbyUserDocument);
            System.out.println(getFinAccountTransBalbyUserDocument);
            //			System.out.println(responseDoc);
            GetFinAccountTransBalbyUserResponse response = responseDoc.getGetFinAccountTransBalbyUserResponse();
            //			System.out.println(response);
            MapMap mapMapResponse = response.getMapMap();
            System.out.println(mapMapResponse);
            Node mapNode = response.getDomNode().getFirstChild();
            Object obj = XmlUtil.deserializeSingle((Element) mapNode);
            System.out.println(obj);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
