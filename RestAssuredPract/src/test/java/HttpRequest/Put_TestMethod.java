package HttpRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Put_TestMethod
{
	@Test
    public void Testcase()
    {
    	//url=https://reqres.in/api/users/284
		
		JSONObject jsdata=new JSONObject();
		   jsdata.put("name", "Shristi");
		   jsdata.put("Job", "Student");
		   
		   RestAssured.baseURI="https://reqres.in/api/users/284";
		   RestAssured.given().header("Content-type","application/json").
		   contentType(ContentType.JSON).
		   body(jsdata.toJSONString()).
		   when().put().
		   then().statusCode(200).log().all();
		   
    }
}
