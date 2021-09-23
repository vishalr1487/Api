package com.qapitol.training.restApiTraining;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateAccount {

	public static void main(String[] args) {
		
		
		System.out.println("Update Account Api");
		
		RestAssured.baseURI= "http://democart.qapitol.com";
		
		
		Response response=RestAssured.given().
		header("Content-Type", "application/vnd.api+json").
		header("Authorization", "Bearer OzD1kEioMKMHYMqnQ6oELiO3JFRYL9bQcnT3DbeO2u4")
			.body("{\n"
				+ "  \"user\": {\n"
				+ "   \"email\": \"amith@34.org\",\n"
				+ "   \"bill_address_id\": 1,\n"
				+ "   \"ship_address_id\": 1,\n"
				+ "   \"password\": \"spree1245\",\n"
				+ "   \"password_confirmation\": \"spree1245\"\n"
				+ " }\n"
				+ "}")
			.log().all()
			.when()
			.patch("/api/v2/storefront/account")
			.then().assertThat()
			.statusCode(200)
			.extract()
			.response(); 
		
		System.out.println("Response: " + response.asPrettyString());
		
		String access=response.jsonPath().getString("access_token");
		System.out.println("access_token: " + access);
		

		Assert.assertEquals(response.statusCode(), 200 );
		Assert.assertEquals(response.jsonPath().getString("data.type"), "user");
		//Assert.assertEquals(response.jsonPath().getString("data.attribute.email"), "amith@34.org");
		Assert.assertEquals(response.jsonPath().getString("data.id"), "700");
		
		
		
		
		
		
		
		
	}

}
