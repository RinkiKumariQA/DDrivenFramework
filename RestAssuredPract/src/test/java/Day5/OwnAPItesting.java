package Day5;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class OwnAPItesting 
{
    @Test
    
    void readuserData()
    {
    	RequestSpecification reqspec=RestAssured.given();
    	reqspec.baseUri("http://localhost:300");
    	reqspec.basePath("/users");
    	 
    	Response res= reqspec.get();
    	res.prettyPrint();
    	
    Assert.assertEquals(res.statusCode(), 200)
    	
    	
    	
   )
    	
    }
}
