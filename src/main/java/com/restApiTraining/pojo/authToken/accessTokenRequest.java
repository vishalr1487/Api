package com.restApiTraining.pojo.authToken;

import com.fasterxml.jackson.annotation.JsonProperty;

public class accessTokenRequest {
	
	@JsonProperty("grant_type")
	private String grant_type;
	
	@Override
	public String toString() {
		return "accessTokenRequest [grant_type=" + grant_type + ", username=" + username + ", password=" + password
				+ "]";
	}


	public String getGrant_type() {
		return grant_type;
	}


	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@JsonProperty("username")
	private String username;
	

	@JsonProperty("password")
	private String password;
	
	
	
}
