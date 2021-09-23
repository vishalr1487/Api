package com.qapitol.training.restApiTraining;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestngScriptTest {
	
	
	@Test (priority=1)
	public void CreateAccount() {
		System.out.println("Create Account Api");
		
		
		RestAssured.baseURI= "http://democart.qapitol.com";
		
		RestAssured.given().
		header("Content-Type", "application/vnd.api+json").
		body("{\n"
				+ " \"user\": {\n"
				+ "   \"email\": \"vinay4567@gmail.com\",\n"
				+ "   \"password\": \"123456\",\n"
				+ "   \"password_confirmation\": \"123456\"\n"
				+ " }\n"
				+ "}").
		log().all().when().post("/spree_oauth/token").then().assertThat().statusCode(200).log().all(); 
		
	}
	
	@Test (priority=2)
	public void GetAccount() {
		
		
		String access="";
		
		System.out.println("Get Account Api");
		
		RestAssured.baseURI= "http://democart.qapitol.com";
		
		Response getResponse= RestAssured.given().header("Content-Type", "application/json").
		header("onAuthorization", "Bearer " + access).log().all().
		when().get("api/v2/storefront/account").then().
		assertThat().statusCode(200).extract().response();
		
		System.out.println("Get Account api: " + getResponse.asString());
		System.out.println("Get Account api: " + getResponse.asPrettyString());
		
		AssertJUnit.assertEquals(200, getResponse.statusCode());
		
	}
	
	
	
	
	

}
