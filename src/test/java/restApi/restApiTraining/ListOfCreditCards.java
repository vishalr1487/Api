package restApi.restApiTraining;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListOfCreditCards {

	public static void main(String[] args) {

		
		
		System.out.println("List Of Credit Cards Api");
		
		String STATUSCODE = "200";
		
		RestAssured.baseURI="http://democart.qapitol.com";
		Response R3=RestAssured.given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer OzD1kEioMKMHYMqnQ6oELiO3JFRYL9bQcnT3DbeO2u4")
				.log().all()
				.when()
				.get("/api/v2/storefront/account/credit_cards")
				.then().assertThat()
				.statusCode(200)
				.extract()
				.response();
		
		
		System.out.println("Response: " + R3.asPrettyString());
		Assert.assertEquals(R3.statusCode(), 200);
		
		if(STATUSCODE.equals("200")) {
			System.out.println("200 OK SUCCESSFULL");
		}else {
			System.out.println("STATUS CODE NOT FOUND");
		}
		
		
		
	}

}
