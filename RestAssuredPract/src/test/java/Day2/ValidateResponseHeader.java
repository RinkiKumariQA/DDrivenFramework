package Day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ValidateResponseHeader 
{ // https://reqres.in/api/users/2

	@Test
	public void testcase()
	{
		RequestSpecification reqSpe=RestAssured.given();
		
		// specify the uri
	       reqSpe.basePath("https://reqres.in");
	       reqSpe.basePath("api/users/2");
	       
	       //  ccreate get request 
	           Response response= reqSpe.get();
	           
	           // validate responser header
	           
	 String vary= response.getHeader("Vary");
	       
	//  \     System.out.println("Response Value:" + vary);
		
	           
	          // raed all the response of header attributs/keys and print thier values
	            Headers headerlist =response.getHeaders();
	            for(Header headers:headerlist)
	            {
	            	System.out.println("Key="+ headers.getName()+ "value=" + headers.getValue());
	            }
	            
	            // validate expected and actual
	            
	            Assert.assertEquals(vary, "Accept-Encoding");
	            
		
	}
}
