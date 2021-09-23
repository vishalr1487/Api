package com.qapitol.training.createAccount;

import org.testng.annotations.Test;

import com.restApiTraining.pojo.CreateAccount.CreateAccountRequest;
import com.restApiTraining.pojo.CreateAccount.CreateAccountResponse;
import com.restApiTraining.pojo.CreateAccount.CreateAccountUser;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateAccountTest {

	
		@Test
		public void createAccount() {
		
		CreateAccountRequest request= new CreateAccountRequest();
		CreateAccountUser user= new CreateAccountUser();
		
		
		request.setUser(user);
		user.setEmail("abcdefgh@gmail.com");
		user.setPassword("123456");
		user.setPassword_confirmation("123456");
		
		
		RestAssured.baseURI="http://democart.qapitol.com";
		
		Response  response = RestAssured.given()
				.header("Content-Type","application/json")
				.body(request)
				.log().all()
				.when()
				.post("/api/v2/storefront/account")
				.then()
				.assertThat().statusCode(200)
				.extract().response();
		
		
		System.out.println("Response: " + response.asPrettyString());
		
		CreateAccountResponse createAccountResponse= response.body().as(CreateAccountResponse.class);
		
		System.out.println("Create Account Response: "+ createAccountResponse);
		System.out.println("id: " + createAccountResponse.getData().getId());
		

		
	}

}
