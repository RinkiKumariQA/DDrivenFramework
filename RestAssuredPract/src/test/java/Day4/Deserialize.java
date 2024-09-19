package Day4;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class Deserialize
{
	
	// https://reqres.in/api/users
  @Test
   
  void Test() 
  {
	  RequestSpecification reqspec=RestAssured.given();
	  reqspec.baseUri("https://reqres.in");
	  reqspec.basePath("/api/users");
	  
	  //create request body
	  
	  JSONObject jsondata=new JSONObject();
	  jsondata.put("name", "Rinki");
	  jsondata.put("job", "QA");
	  
	  
	//  perform post request
	  
	  Response response=reqspec.contentType(ContentType.JSON)
			  .body(jsondata.toJSONString())
			  .post();
	  
	  ResponseBody responsebody=response.getBody();
	  
	  JSONPostRequestResponse responseClass=responsebody.as(JSONPostRequestResponse.class);
	  
	  Assert.assertEquals(responseClass.name, "Rinki","check for name.");
	  Assert.assertEquals(responseClass.job, "QA","check for job.");
	  
  }
}
