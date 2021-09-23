package com.qapitol.training.restApiTraining;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllCountries {

	public static void main(String[] args) {

		
		
		System.out.println("Get ALl Countries Api");
		
		RestAssured.baseURI="http://democart.qapitol.com";
		Response R4=RestAssured.given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer OzD1kEioMKMHYMqnQ6oELiO3JFRYL9bQcnT3DbeO2u4")
				.log().all()
				.when()
				.get("/api/v2/storefront/countries")
				.then().assertThat()
				.statusCode(200)
				.extract()
				.response();
		
		
		System.out.println("Response: " + R4.asPrettyString());
		Assert.assertEquals(R4.statusCode(), 200);
		
		
		
		
	}

}
