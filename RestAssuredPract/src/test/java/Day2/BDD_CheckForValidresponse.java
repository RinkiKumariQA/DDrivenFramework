package Day2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class BDD_CheckForValidresponse
{

	
	
//  https://reqres.in/api/users/2
	@Test
	public void GetSingleUser__BDDSTyle()
	{
	 
		given()
	
		.when()
	      .get("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
		
	}
}
