package restApi.restApiTraining;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTraining {

	public static void main(String[] args) {
	
		
		
		
		System.out.println("First api");
		
		RestAssured.baseURI= "http://democart.qapitol.com";
		
		/*RestAssured.given().
		header("Content-Type", "application/json").
		body("{\n"
				+ "    \"grant_type\": \"password\",\n"
				+ "    \"username\": \"anish.kumar@qapitol.com\",\n"
				+ "    \"password\": \"anishj\"\n"
				+ "}").
		log().all().when().post("/spree_oauth/token").then().assertThat().statusCode(200).log().all(); */
		
	
		Response response=RestAssured.given().
		header("Content-Type", "application/json").
		body("{\n"
				+ "    \"grant_type\": \"password\",\n"
				+ "    \"username\": \"anish.kumar@qapitol.com\",\n"
				+ "    \"password\": \"anishj\"\n"
				+ "}").
		log().all().when().post("/spree_oauth/token").then().assertThat().statusCode(200).extract().response();
		
		
		
		System.out.println("Response: " + response.asString());
		System.out.println("Response: " + response.asPrettyString());
		
		String access=response.jsonPath().getString("access_token");
		System.out.println("access_token: " + access);
		
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("token_type"), "Bearer");
		
		
	
		
		
		

		
		
	}

}
