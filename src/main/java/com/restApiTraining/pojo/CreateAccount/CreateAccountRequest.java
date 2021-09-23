package com.restApiTraining.pojo.CreateAccount;

public class CreateAccountRequest {
	
	
	
	private CreateAccountUser user;

	@Override
	public String toString() {
		return "CreateAccountRequest [user=" + user + "]";
	}

	public CreateAccountUser getUser() {
		return user;
	}

	public void setUser(CreateAccountUser user) {
		this.user = user;
		
		
	}

	
	public CreateAccountRequest( ) {
	}
	
}
