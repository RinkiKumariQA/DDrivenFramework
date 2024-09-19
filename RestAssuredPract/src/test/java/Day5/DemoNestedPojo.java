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
import io.restassured.specification.RequestSpecification;

public class DemoNestedPojo {
	
	@Test
	
	void test() throws JsonProcessingException
	{
		CompNestPCl requestpayload=new CompNestPCl();
		requestpayload.setCompany("Alpha Company");
		requestpayload.setCity("Noida");
		requestpayload.setStreet("Lander");
		requestpayload.setState("Uttar Pradesh");
		
		List<String> bank=new ArrayList<String>();
		bank.add("HDFC");
		bank.add("ICICI");
		bank.add("Axis");
		requestpayload.setBankAccount(bank);
		
		createNestedPOJO_Class cl=new createNestedPOJO_Class();
		createNestedPOJO_Class c2=new createNestedPOJO_Class();
		createNestedPOJO_Class c3=new createNestedPOJO_Class();
		
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
	
	createNestedPOJO_Class nesPoj1=new createNestedPOJO_Class();
	nesPoj1.setFirstname("Anika");
	nesPoj1.setLastname("Kumari");
	nesPoj1.setGender("female");
	nesPoj1.setAge(12);
	nesPoj1.setSalary(144400); 
	
	NestedPojo_Empl_Add ep1=new NestedPojo_Empl_Add();
	ep1.setStrret("Gautam budh");
ep1.setCity("Delhi");
ep1.setState("uttar pradesh");
ep1.setPincode(201201);

nesPoj1.setAddress(ep1);

createNestedPOJO_Class nesPoj2=new createNestedPOJO_Class();
nesPoj2.setFirstname("Kika");
nesPoj2.setLastname("Kuu");
nesPoj2.setGender("male");
nesPoj2.setAge(52);
nesPoj2.setSalary(12200);

NestedPojo_Empl_Add ep2=new NestedPojo_Empl_Add();
ep2.setStrret("Gautam");
ep2.setCity("Ranchi");
ep2.setState("Jharkhand");
ep2.setPincode(824001);

nesPoj2.setAddress(ep2);
	
	List<createNestedPOJO_Class>l1=new ArrayList<createNestedPOJO_Class>();
	l1.add(nesPoj);
	l1.add(nesPoj1);
	l1.add(nesPoj2);
		
		requestpayload.setEmplist(l1);
		 ObjectMapper op=new ObjectMapper();
		 
		 String payload=   op.writerWithDefaultPrettyPrinter().writeValueAsString(requestpayload);
		 
		 RequestSpecification rs=RestAssured.given();
		 rs.baseUri("https://httpbin.org/post");
		 rs.contentType(ContentType.JSON);
		 rs.body(payload);
		 Response res=rs.post();
		 
		 System.out.println("================== Response Body =====================");
		 res.prettyPrint();
		 
		 Assert.assertEquals(res.statusCode(),200);

	//System.out.println(payload);
	}

}
