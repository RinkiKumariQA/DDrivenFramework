package Day5;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class JsonObjectUsingJavaMap
{
	// uri https://restful-booker.herokuapp.com/auth
		@Test
		void createAutToken()
		{
			Map<String, String> authToken=new HashMap<String, String>();
			authToken.put("username", "admin");
			authToken.put("password", "password123");
			
			Response r=RestAssured.given()
			.baseUri("https://restful-booker.herokuapp.com/auth")
			.contentType(ContentType.JSON)
			.body(authToken)
			.post();
			r.prettyPrint();
			
			Assert.assertEquals(r.statusCode(), 200);
	                
		}	

}
