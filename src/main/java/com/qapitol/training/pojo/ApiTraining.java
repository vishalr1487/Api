package com.qapitol.training.pojo;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTraining {

	
	public static void main(String[] args) {
		
		System.out.println("First API");
//		http://democart.qapitol.com/spree_oauth/token
		
		RestAssured.baseURI = "http://democart.qapitol.com";
		
		Response response = RestAssured
			.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"grant_type\": \"password\",\r\n"
						+ "    \"username\": \"anish.kumar@qapitol.com\",\r\n"
						+ "    \"password\": \"anishj\"\r\n"
						+ "}")
				.log().all()
			.when()
				.post("/spree_oauth/token")
			.then()
				.assertThat().statusCode(200)
				.extract().response();
		
		System.out.println("Response : " + response.asString());
		System.out.println("Response : " + response.asPrettyString());
		
		String access =  response.jsonPath().getString("access_token");
		System.out.println("access_token : " + access);
		
		Assert.assertEquals(200, response.statusCode());
		Assert.assertEquals(response.jsonPath().getString("token_type"), "Bearer");
		Assert.assertNotNull(response.jsonPath().getString("access_token"));
		
		System.out.println("Second API");
//		https://democart.qapitol.com/api/v2/storefront/account
		Response getResponse = RestAssured
				.given()
					.header("Content-Type","application/json")
					.header("Authorization","Bearer " + access)
					.log().all()
				.when()
					.get("/api/v2/storefront/account")
				.then()
					.assertThat().statusCode(200)
					.extract().response();
		
		System.out.println("Second API Response : " + getResponse.asString());
		System.out.println("Second API Response : " + getResponse.asPrettyString());
		
		Assert.assertEquals(200, getResponse.statusCode());
		Assert.assertEquals(getResponse.jsonPath().getString("data.type"), "user");
		Assert.assertEquals(getResponse.jsonPath().getString("data.attributes.email"), "anish.kumar@qapitol.com");


	}

}