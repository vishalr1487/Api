package com.restApiTraining.pojo.authToken;

import com.fasterxml.jackson.annotation.JsonProperty;

public class accessTokenAttributes {
	
	
	@Override
	public String toString() {
		return "accessTokenAttributes [access_token=" + access_token + ", token_type=" + token_type + ", expires_in="
				+ expires_in + ", refresh_token=" + refresh_token + ", created_at=" + created_at
				+ ", getAccess_token()=" + getAccess_token() + ", getToken_type()=" + getToken_type()
				+ ", getExpires_in()=" + getExpires_in() + ", getRefresh_token()=" + getRefresh_token()
				+ ", getCreated_at()=" + getCreated_at() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	@JsonProperty("access_token")
	private String access_token;
	
	public String getAccess_token() {
		return access_token;
	}


	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}


	public String getToken_type() {
		return token_type;
	}


	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}


	public int getExpires_in() {
		return expires_in;
	}


	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}


	public String getRefresh_token() {
		return refresh_token;
	}


	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}


	public int getCreated_at() {
		return created_at;
	}


	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}


	@JsonProperty("token_type")
	private String token_type;
	
	
	@JsonProperty("expires_in")
	private int expires_in;
	
	
	@JsonProperty("refresh_token")
	private String refresh_token;
	
	
	@JsonProperty("created_at")
	private int  created_at;
	
	
	
	
	

}
