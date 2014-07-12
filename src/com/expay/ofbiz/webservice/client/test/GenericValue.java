package com.expay.ofbiz.webservice.client.test;

public class GenericValue extends GenericEntity {
	private String entityName; 
	
	private GenericValue(String entityName){
		this.entityName = entityName;
	}
	
	public static GenericValue create(String entityName) {
		
		GenericValue instance = new GenericValue(entityName);
		return instance;
	}

}
