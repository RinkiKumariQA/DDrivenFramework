package Day3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Digest_Authorization
{
	
	@Test
	public void DigAut()
	{
		// uri=https://httpbin.org/digest-auth/undefined/prachi/prachi

		 RequestSpecification reqspec=RestAssured.given();
		  reqspec.baseUri("https://httpbin.org");
		  reqspec.basePath("digest-auth/undefined/prachi/prachi");
		  
		//  Response response = reqspec.get();

		 Response response = reqspec.auth().digest("prachi", "prachi").get();   //  primitive
		   
		 Assert.assertEquals(response.statusCode(), 200);
		 
		 System.out.println(response.statusLine());
		 // print respons body
		 System.out.println("response Body:" + response.body().asString());
		}
	}
		
	


