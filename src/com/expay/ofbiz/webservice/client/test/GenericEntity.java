package com.expay.ofbiz.webservice.client.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class GenericEntity implements Map<String, Object> {
	private Map<String, Object> fields = new HashMap<String, Object>();
	@Override
	public void clear() {
		this.fields.clear();
	}

	@Override
	public boolean containsKey(Object arg0) {
		return this.fields.containsKey(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		return this.fields.containsKey(arg0);
	}

	@Override
	public Set<java.util.Map.Entry<String, Object>> entrySet() {
		return this.fields.entrySet();
	}

	@Override
	public Object get(Object arg0) {
		return this.fields.get(arg0);
	}

	@Override
	public boolean isEmpty() {
		return this.fields.isEmpty();
	}

	@Override
	public Set<String> keySet() {
		return this.fields.keySet();
	}

	@Override
	public Object put(String arg0, Object arg1) {
		return this.fields.put(arg0, arg1);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Object> arg0) {
		this.fields.putAll(arg0);
	}

	@Override
	public Object remove(Object arg0) {
		return this.fields.remove(arg0);
	}

	@Override
	public int size() {
		return this.fields.size();
	}

	@Override
	public Collection<Object> values() {
		return this.fields.values();
	}

}
