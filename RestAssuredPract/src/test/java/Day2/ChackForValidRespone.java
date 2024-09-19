package Day2;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

 import  static  org.hamcrest.Matchers.*;

public class ChackForValidRespone 

{

	//   https://reqres.in/api/users/2
	@Test(enabled=false)
	public void GetUsername()
	{
	 
		
		RestAssured.baseURI="https://reqres.in/api/users/23";
		RequestSpecification reqSpec= RestAssured.given();   //get request specification of the request
		Response response=reqSpec.get();       // call get method
		 int statuscode=response.getStatusCode();      // get response code
		// Assert.assertEquals(statuscode, 200);    /// validate the expected and actual code
		 
		 String statusline= response.getStatusLine();  // validate status line
		 
		 Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	}
	
	@Test
	public void GetSingleUsersUsingValidatableResponse()
	{
	 
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification reqSpec= RestAssured.given();   //get request specification of the request
		Response response=reqSpec.get();       // call get method
		
		ValidatableResponse validateresp=response.then();
		validateresp.statusLine("HTTP/1.1 200 OK");
		validateresp.statusCode(200);
	}

}
