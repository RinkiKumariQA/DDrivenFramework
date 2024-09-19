
package Day3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Authorization {
	
	
	@Test
	public void BasicAutho()
	{
	  RequestSpecification reqspec=RestAssured.given();
	  reqspec.baseUri("https://postman-echo.com");
	  reqspec.basePath("basic-auth");
	  
// 	 Response response =reqspec.get();   //  unauthorized
	//  Response response = reqspec.auth().basic("postman", "password").get();   // npn primitive
	  Response response = reqspec.auth().preemptive().basic("postman", "password").get();   //  primitive
	   
	 
	 System.out.println(response.statusLine());
	 // print respons body
	 System.out.println("response Body:" + response.body().asString());
	}

}
