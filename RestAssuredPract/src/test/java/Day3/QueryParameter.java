package Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class QueryParameter
{
   @Test
	public void filterdat()
	{ 
	   RequestSpecification reqspec=RestAssured.given();
	   reqspec.baseUri("https://reqres.in");
	   reqspec.basePath("api/users");
	   reqspec.queryParam("page", 2).queryParam("id",10);
	   
	   // perform get request
	 Response response=  reqspec.get();

	 // read body
	String responsebody=  response.getBody().asString();
	
	  // print response body
	System.out.println(responsebody);
	
	
    JsonPath jsonpathview=response.jsonPath();
    String firstname=jsonpathview.get("data.first-name");
    
    Assert.assertEquals(firstname, "Byron");
		
	}
	
	
}
