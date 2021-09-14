package getAccount;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAccountApi {

	public static void main(String[] args) {

		
		
		
		
		RestAssured.baseURI="http://democart.qapitol.com";
		
		Response response=RestAssured.given().header("Content-Type", "application/json") 
				
				.log().all().get("/api/v2/storefront/account").then()
				.assertThat().statusCode(200)
				.extract().response();
		
		
		System.out.println("Response: " + response.asPrettyString());
		
		getAccountAttributes	g1 = response.body().as(getAccountAttributes.class);
		
		
		
		
	}

}
