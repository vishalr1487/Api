package com.qapitol.training.restApiTraining;

import io.restassured.RestAssured;

public class CreateAccount {

	public static void main(String[] args) {
		
		
		
		

		System.out.println("Create Account Api");
		
		RestAssured.baseURI= "http://democart.qapitol.com";
		
		RestAssured.given().
		header("Content-Type", "application/vnd.api+json").
		body("{\n"
				+ " \"user\": {\n"
				+ "   \"email\": \"vinay456@gmail.com\",\n"
				+ "   \"password\": \"spree123\",\n"
				+ "   \"password_confirmation\": \"spree123\"\n"
				+ " }\n"
				+ "}").
		log().all().when().post("/spree_oauth/token").then().assertThat().statusCode(200).log().all(); 
		
		
		
		
		

	}

}
