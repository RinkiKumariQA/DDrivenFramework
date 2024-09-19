package Day5;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NestedPojoclass
{

	@Test
	void test() throws Exception
	{
		createNestedPOJO_Class nesPoj=new createNestedPOJO_Class();
		nesPoj.setFirstname("Rinki");
		nesPoj.setLastname("Kumari");
		nesPoj.setGender("female");
		nesPoj.setAge(22);
		nesPoj.setSalary(400000);
		
		NestedPojo_Empl_Add ep=new NestedPojo_Empl_Add();
		ep.setStrret("Gautam budh");
	ep.setCity("Delhi");
	ep.setState("uttar pradesh");
	ep.setPincode(201201);
	
	nesPoj.setAddress(ep);
	
	//covert class object to json object as String
	
	ObjectMapper ob=new ObjectMapper();
	
	String jsonpayload= ob.writerWithDefaultPrettyPrinter().writeValueAsString(nesPoj);
	   
     RequestSpecification reqsp=RestAssured.given();
     reqsp.baseUri("https://httpbin.org/post");
     reqsp.contentType(ContentType.JSON);
     reqsp.body(jsonpayload);
     Response res=reqsp.post();
     res.prettyPrint();
	
	//System.out.println(jsonpayload);
	
	
	
	}
}
	


