package createAccount;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	
	
	private int id;
	private String type;
	private Attributes attributes;
	private Relationships relationships;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	
	@Override
	public String toString() {
		return "Data [id=" + id + ", type=" + type + ", attributes=" + attributes + ", relationships=" + relationships
				+ ", getId()=" + getId() + ", getType()=" + getType() + ", getAttributes()=" + getAttributes()
				+ ", getRelationships()=" + getRelationships() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
	
	
	

}
