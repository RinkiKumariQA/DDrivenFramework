package Day6;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MockApi {

	@Test
	
	void test()
	{ //  https://run.mocky.io/v3/074ab624-3a3e-4d26-a156-03bb2aa03920
		
		RequestSpecification rs=RestAssured.given();
		rs.baseUri("https://run.mocky.io/v3/074ab624-3a3e-4d26-a156-03bb2aa03920");
	Response res=	rs.get();
	res.prettyPrint();
	
	//validate status code
	Assert.assertEquals(res.statusCode(), 200,"Check status code to be 200");
		
	}
}
