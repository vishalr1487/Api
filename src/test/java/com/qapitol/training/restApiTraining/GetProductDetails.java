package com.qapitol.training.restApiTraining;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProductDetails {

	public static void main(String[] args) {

		
		System.out.println("Get Product Details Api");
		
		String Product="US POLO SHIRT A2";
		
		if(Product.equals("US POLO SHIRT A2")){
			System.out.println("PRODUCT DETAILS FOUND");
		}else {
			System.out.println("PRODUCT DETAILS NOT FOUND");
		}
		
		RestAssured.baseURI="http://democart.qapitol.com";
		Response R2=RestAssured.given().header("Content-Type", "application/json")
				.log().all()
				.when()
				.get("/api/v2/storefront/products/135")
				.then().assertThat()
				.statusCode(200)
				.extract()
				.response();
		
		
		System.out.println("Response: " + R2.asPrettyString());
		Assert.assertEquals(R2.statusCode(), 200);
		Assert.assertEquals(R2.jsonPath().getString("data.id"), "135");
		Assert.assertEquals(R2.jsonPath().getString("data.type"), "product");
		Assert.assertEquals(R2.jsonPath().getString("data.attributes.name"), "US POLO SHIRT A2");
		
		
		
	}

}
