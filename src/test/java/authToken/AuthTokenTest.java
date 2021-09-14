package authToken;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthTokenTest {

	

		@Test
		public void authTest() {
		accessTokenRequest atr=new accessTokenRequest();
		
		atr.setGrant_type("password");
		atr.setUsername("anish.kumar@qapitol.com");
		atr.setPassword("anishj");
		
		
		RestAssured.baseURI="http://democart.qapitol.com";
		
		Response response =RestAssured.given().header("Content-Type", "application/json")
				.body(atr).log().all().when().post("/spree_oauth/token").then()
				.assertThat().statusCode(200)
				.extract().response();
		
		System.out.println("Response: " + response.asPrettyString());
		//System.out.println("token_type: " + )
		accessTokenAttributes a1=  response.body().as(accessTokenAttributes.class);
		
		System.out.println("token_type: " + a1.getToken_type());
		Assert.assertEquals(a1.getToken_type(), "Bearer");
		}
		
	}


