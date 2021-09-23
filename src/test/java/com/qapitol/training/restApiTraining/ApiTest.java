package com.qapitol.training.restApiTraining;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest {

	private static String accessTokenPayload = "{\r\n"
			+ "    \"grant_type\": \"password\",\r\n"
			+ "    \"username\": \"anish.kumar@qapitol.com\",\r\n"
			+ "    \"password\": \"anishj\"\r\n"
			+ "}";
	
	private static String accessToken = "";
	
	@BeforeClass
	public void createToken() {
		RestAssured.baseURI = "http://democart.qapitol.com";
		
		Response response = RestAssured
			.given()
				.header("Content-Type","application/json")
				.body(accessTokenPayload)
				.log().all()
			.when()
				.post("/spree_oauth/token")
			.then()
				.assertThat().statusCode(200)
				.extract().response();
		
		System.out.println("Response : " + response.asString());
		System.out.println("Response : " + response.asPrettyString());
		
		accessToken =  response.jsonPath().getString("access_token");
		System.out.println("access_token : " + accessToken);
		
		Assert.assertEquals(200, response.statusCode());
		Assert.assertEquals(response.jsonPath().getString("token_type"), "Bearer");
		Assert.assertNotNull(response.jsonPath().getString("access_token"));
	}
	
	@Test
	public void getAccountDetails() {
		Response getResponse = RestAssured
				.given()
					.header("Content-Type","application/json")
					.header("Authorization","Bearer " + accessToken)
					.log().all()
				.when()
					.get(UrlConstants.GETACCOUNT)
				.then()
					.assertThat().statusCode(200)
					.extract().response();
		
		System.out.println("Second API Response : " + getResponse.asString());
		System.out.println("Second API Response : " + getResponse.asPrettyString());
		
		Assert.assertEquals(200, getResponse.statusCode());
		Assert.assertEquals(getResponse.jsonPath().getString("data.type"), "user");
		Assert.assertEquals(getResponse.jsonPath().getString("data.attributes.email"), "anish.kumar@qapitol.com");
	}
	
	@Test
	public void getAccountDetails2() {
		Response getResponse = RestAssured
				.given()
					.header("Content-Type","application/json")
					.header("Authorization","Bearer " + accessToken)
					.log().all()
				.when()
					.get(UrlConstants.GETACCOUNT)
				.then()
					.assertThat().statusCode(200)
					.log().all()
					.extract().response();
		
		System.out.println("Second API Response : " + getResponse.asString());
		System.out.println("Second API Response : " + getResponse.asPrettyString());
		
		Assert.assertEquals(200, getResponse.statusCode());
		Assert.assertEquals(getResponse.jsonPath().getString("data.type"), "user");
		Assert.assertEquals(getResponse.jsonPath().getString("data.attributes.email"), "anish.kumar@qapitol.com");
	}
}