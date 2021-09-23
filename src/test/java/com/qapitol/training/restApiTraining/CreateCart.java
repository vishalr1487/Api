package com.qapitol.training.restApiTraining;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateCart {

	public static void main(String[] args) {

		
		
		System.out.println("Create Cart Api");
		
		
		RestAssured.baseURI="http://democart.qapitol.com";
		Response response= RestAssured.given().header("Content-Type", "application/json")
				.log().all().when()
				.post("/api/v2/storefront/cart")
				.then().assertThat()
				.statusCode(201)
				.extract()
				.response();
		
		
		
		System.out.println("Response: " + response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 201);
		Assert.assertEquals(response.jsonPath().getString("data.id"), "3726");
		Assert.assertEquals(response.jsonPath().getString("data.attributes.number"), "R344023381");
		
		
		
		
	}

}
