package createAccount;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAccountApi {

	public static void main(String[] args) {

		
		CreateAccountRequest car=new CreateAccountRequest();
	
		CreateAccountUser user=new CreateAccountUser();
		
		
		car.setUser(user);
		user.setEmail("vishal567@qapitol.com");
		user.setPassword("123456");
		user.setPassword_confirmation("123456");
		
		RestAssured.baseURI="http://democart.qapitol.com";
		
		Response res=RestAssured.given().header("Content-Type", "application/vnd.api+json")
				.body(car).log().all().when().post("/api/v2/storefront/account").then()
				.assertThat().statusCode(200)
				.extract().response();
		
		
		
		System.out.println("Response: " + res.asPrettyString());
		
		//CreateAccountResponse createAccountResponse123= new CreateAccountResponse();
		CreateAccountResponse createAccountResponse = res.body().as(CreateAccountResponse.class);
		//System.out.println("Create Account Response: " + createAccountResponse);
		
		System.out.println("User Id: " + createAccountResponse.getData().getId());
		
		
		
		
	}

}
