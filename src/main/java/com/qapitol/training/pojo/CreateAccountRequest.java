package com.qapitol.training.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAccountRequest {
	
	
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("password")
	private String password;
	
	@JsonProperty("password_confirmation")
	private String password_confirmation;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		password = password;
	}

	public String getPassword_confirmation() {
		return password_confirmation;
	}

	public void setPassword_confirmation(String password_confirmation) {
		this.password_confirmation = password_confirmation;
	}
	
	
	public CreateAccountRequest() {
		
	}
	
	
	public CreateAccountRequest(String email, String Password, String Password_Confirmation) {
		
		super();
		this.email=email;
		this.password=Password;
		this.password_confirmation=password_confirmation;
		
		
	}

	@Override
	public String toString() {
		return "CreateAccountRequest [email=" + email + ", password=" + password + ", password_confirmation="
				+ password_confirmation + "]";
	}
	

}
