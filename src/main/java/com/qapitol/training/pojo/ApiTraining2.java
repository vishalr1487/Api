package com.qapitol.training.pojo;

import com.qapitol.training.pojo.AccessTokenRequest;
import com.qapitol.training.pojo.AccessTokenResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTraining2 {

	private static String reqBody = "{\r\n"
			+ "    \"grant_type\": \"password\",\r\n"
			+ "    \"username\": \"anish.kumar@qapitol.com\",\r\n"
			+ "    \"password\": \"anishj\"\r\n"
			+ "}";
	
	public static void main(String[] args) {
		
		AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
		accessTokenRequest.setGrantType("password");
		accessTokenRequest.setUserName("anish.kumar@qapitol.com");
		accessTokenRequest.setPassword("anishj");
		
		System.out.println("First API" + accessTokenRequest);
		
		RestAssured.baseURI = "http://democart.qapitol.com";
		
		Response response = RestAssured
			.given()
				.header("Content-Type","application/json")
				.body(accessTokenRequest)
				.log().all()
			.when()
				.post("/spree_oauth/token")
			.then()
				.assertThat().statusCode(200)
				.extract().response();
		
		System.out.println("Response : " + response.asPrettyString());
		
		AccessTokenResponse accessTokenResponse = response.body().as(AccessTokenResponse.class);
		
		System.out.println("access_token res: " + accessTokenResponse.getAccessToken());
		System.out.println("token_type res: " + accessTokenResponse.getTokenType());
		




	}

}