package com.restApiTraining.pojo.CreateAccount;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAccountUser {
	
	
	private String email;
	@Override
	public String toString() {
		return "CreateAccountUser [email=" + email + ", password=" + password + ", password_confirmation="
				+ password_confirmation + "]";
	}

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
		this.password = password;
	}

	public String getPassword_confirmation() {
		return password_confirmation;
	}

	public void setPassword_confirmation(String password_confirmation) {
		this.password_confirmation = password_confirmation;
	}

	private String password;
	
	@JsonProperty("password_confirmation")
	private String password_confirmation;
	
	
	

}
