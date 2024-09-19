package Day6;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MockApi2
{
   @Test
   void testt()
   
		{ //  https://run.mocky.io/v3/074ab624-3a3e-4d26-a156-03bb2aa03920
			
			RequestSpecification rs=RestAssured.given();
			rs.baseUri("https://run.mocky.io/v3/074ab624-3a3e-4d26-a156-03bb2aa03920");
		
		// CONVERT JSON  OBJECT RESPONSE  TO POJO CLASS OBJECT 
		
		MockApi_PojoClass emp=rs.get().as(MockApi_PojoClass.class);
		System.out.println("==========Print after Json object to class===============");
		System.out.println( emp.getFirstname());
		System.out.println( emp.getLastname());
		System.out.println( emp.getAge());
		System.out.println( emp.getSalary());
		System.out.println( emp.getGender());
	  System.out.println("Hobbies:");
	  
	  String [] hobbiesStr=emp.getHobbies();
	  for(int i=0;i<hobbiesStr.length;i++)
	  {
		  System.out.println(hobbiesStr[i]);
	  }
		
	  
	 // using for each loop for iteration over Map.enterySet
	  for(Map.Entry<String,String>entry:emp.getFamilymembers().entrySet())
		  System.out.println("Key="+ entry.getKey() +",Value=" + entry.getValue());
		
			
		}
	   
   
}
