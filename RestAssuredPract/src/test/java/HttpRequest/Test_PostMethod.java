package HttpRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PostMethod
{
	@Test
	
   public void testcase()
   {
	   JSONObject jsdata=new JSONObject();
	   jsdata.put("name", "Rinki");
	   jsdata.put("Job", "QA");
	   
	   RestAssured.baseURI="https://reqres.in/api/users";
	   RestAssured.given().header("Content-type","application/json").
	   contentType(ContentType.JSON).
	   body(jsdata.toJSONString()).
	   when().post().
	   then().statusCode(201).log().all();
	   
	   
	   
	   
	   
   }
}
