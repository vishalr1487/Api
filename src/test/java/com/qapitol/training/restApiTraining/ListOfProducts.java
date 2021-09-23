package com.qapitol.training.restApiTraining;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListOfProducts {

	public static void main(String[] args) {

		
		System.out.println("List Of Products Api");
		
		
		
		String ProductName="Denim Shirt A1";
		if((ProductName).equals("Denim Shirt A1")) {
			System.out.println("PRODUCT FOUND :" +  ProductName);
		}else {
			System.out.println("PRODUCT NOT FOUND");
		}
		
		
		RestAssured.baseURI="http://democart.qapitol.com";
		Response R1=RestAssured.given().header("Content-Type", "application/json")
				.log().all()
				.when()
				.get("/api/v2/storefront/products/1")
				.then().assertThat()
				.statusCode(200)
				.extract()
				.response();
		
		
		System.out.println("Response: " + R1.asPrettyString());
		
		
		Assert.assertEquals(R1.statusCode(), 200);
		
		
		
		Assert.assertEquals(R1.statusCode(), 200 );
		Assert.assertEquals(R1.jsonPath().getString("data.type"), "product");
		
		
		Assert.assertEquals(R1.jsonPath().getString("data.attributes.name"), "Denim Shirt A1");
		
		
		
		
	}

}
