package Day5;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class JsonArrayPojoClass
{
	
	@Test
	void CreateEmployeesJsonArray() throws JsonProcessingException
	{
		CreatePOJO cp=new CreatePOJO();
		cp.setFirstname("Riya");
		cp.setLastname("Rou");
		cp.setAge(23);
		cp.setSalary(21222.21);

		CreatePOJO cp1=new CreatePOJO();
		cp1.setFirstname("Divya");
		cp1.setLastname("Rai");
		cp1.setAge(23);
		cp1.setSalary(10000.21);

		CreatePOJO cp2=new CreatePOJO();
		cp2.setFirstname("Payal");
		cp2.setLastname("Rana");
		cp2.setAge(21);
		cp2.setSalary(12000.21);

	//	craete list of employees
		
		
		List<CreatePOJO> l=new ArrayList<CreatePOJO>();
		l.add(cp);
		l.add(cp1);
		l.add(cp2);
		
		// covert create pojo class to jason array payload as string
		
		ObjectMapper objMapper=new ObjectMapper();
		
			String jsonPayload=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(l);
		     System.out.println(jsonPayload);
		
		 RequestSpecification reqspec=RestAssured.given();
		// reqspec.baseUri("https://httpbin.org/post");
		 reqspec.baseUri("https://reqres.in");
		 reqspec.basePath("/api/users");
		 reqspec.contentType(ContentType.JSON);
		 reqspec.body("jsonPayload");
		Response resp= reqspec.post();
		System.out.println("------------Response Body-------------");
		resp.prettyPrint();
		
		Assert.assertEquals(resp.statusCode(), 201);
		 
		// ResponseBody respbody=resp.getBody();
	//.prettyPrint();
		
	}
}