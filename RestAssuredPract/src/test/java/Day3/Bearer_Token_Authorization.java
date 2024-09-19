package Day3;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.util.RequestPayload;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Bearer_Token_Authorization 
{
  
	@Test
	public void Bearertoken()
	{
		RequestSpecification reqspec=RestAssured.given();
		reqspec.baseUri("hhtps://.gorest.co.in");
		reqspec.basePath("");
		
		
		String Authtoken="token value";
		reqspec.headers("Authorization",Authtoken)
		.contentType(ContentType.JSON)
		.body(payload.toJSONString());
		
		  Response response=reqspec.post();
		  
		  
		  Assert.assertEquals(response.statusCode(), 201);
			 
			 System.out.println(response.statusLine());
			 // print respons body
			 System.out.println("response Body:" + response.body().asString());
	}
}
