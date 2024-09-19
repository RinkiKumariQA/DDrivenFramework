package HttpRequest;

import java.net.http.HttpResponse;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;
public class Pract
{
            @Test
		 void testcase()
		 { 
            Response rs=get("https://reqres.in/api/users?page=2");
         System.out.println("Response code :" + rs.getStatusCode());
         System.out.println("Response bpdy :" + rs.getBody().toString());
         System.out.println("Response time :" + rs.getTime());
         System.out.println("Response header :" + rs.getHeader("Content-Type"));

         //validate status code
         // expected status code=200
         
         int expectedstatuscode=200;
         int Actstatuscode=rs.getStatusCode();
         
         Assert.assertEquals(expectedstatuscode, Actstatuscode);

 }
            @Test
		public void test()
		{
			// given,when, then
            	baseURI="https://reqres.in/api/users";
                 given()
            	.queryParam("page", "2")
            	.when().get()
            	.then().statusCode(202);
		}
            
		 
		
}
