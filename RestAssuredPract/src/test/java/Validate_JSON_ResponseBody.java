import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class Validate_JSON_ResponseBody 
{
  
	@Test
	public void userListResponseBody()
	{
		
		RequestSpecification respec=RestAssured.given();
		respec.baseUri("https://reqres.in");
		respec.basePath("/api/users?page=2");
		
		Response response=respec.get();  // create get request
	    ResponseBody responeBody=response.getBody();    // read response body
	    
	    String responeString =responeBody.asString();
	    System.out.println("Response body+" + responeString);     // print resonse day
		  
	    
	    
	   // check for persent of Janet in response body
	    
	    Assert.assertEquals(responeString.contains("George"), true);
	    
	    // get json path view response body
	    
	      JsonPath jspath=responeBody.jsonPath();
	     String firstname= jspath.get("data[0].first_name");
	     
	     Assert.assertEquals(firstname, "George");
	    
	}
	

}
