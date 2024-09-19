package Day5;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POJO_SerlizationandDeserlization
{
	
	// create json object from create pojo class object
	
	@Test
	
	   void seriliztion() throws Exception, Exception
	   {
		CreatePOJO po=new CreatePOJO();
		po.setFirstname("Rinki");
		po.setLastname("Kumari");
		po.setAge(22);
		po.setSalary(450000.42);
		
		ObjectMapper objMap= new ObjectMapper();
		 try {
			String employeeJSON1= objMap.writerWithDefaultPrettyPrinter().writeValueAsString(po);
			
			System.out.println(employeeJSON1);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 RequestSpecification  reqspec=RestAssured.given();
		 reqspec.baseUri("https://httpbin.org/post");
		 reqspec.contentType(ContentType.JSON);
		 reqspec.body(po);
		    Response resp=reqspec.post();
		    
		    resp.prettyPeek();
		    Assert.assertEquals(resp.statusCode(), 200);
		    
		    
			CreatePOJO po2  =objMap.readValue(employeeJSON1,CreatePOJO.class);
		    
		    System.out.println("=================== Print ");
		    
		    System.out.println(po2.getFirstname());
		   
		 
			 
	   }
}
