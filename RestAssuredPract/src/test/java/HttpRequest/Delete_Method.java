package HttpRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete_Method {

	
	@Test
	 public void testcase()
	 {
		RestAssured.baseURI="https://reqres.in/api/users/284";
		RestAssured.given()
		.when().delete()
		.then().log().all().statusCode(204);
	 }
}
