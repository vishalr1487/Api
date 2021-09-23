package com.restApiTraining.pojo.CreateAccount;

public class DataAttributes {
	
	
	private String id;
	@Override
	public String toString() {
		return "Data [id=" + id + ", type=" + type + ", attributes=" + attributes + ", relationships=" + relationships
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	public Relationships getRelationships() {
		return relationships;
	}
	public void setRelationships(Relationships relationships) {
		this.relationships = relationships;
	}
	private String type;
	private Attributes attributes;
	private Relationships relationships;
	
	

}
