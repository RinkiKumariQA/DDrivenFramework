package Day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_Ignore
{
	@Test
	void Test() throws JsonProcessingException
	{
		Emp_Ig_PojoClass ep1=new Emp_Ig_PojoClass();
		ep1.setFirstname("Srishti");
		ep1.setLastname("Sakashi");
		ep1.setGender("Female");
		ep1.setAge(13);
		ep1.setSalary(100000);
		ep1.setIsmarried("Not Married");
		ep1.setFullname("Srishti Shree");
		
		// serilization=convert employee class object to json payload
		ObjectMapper ob=new ObjectMapper();
		
	String emp=	ob.writerWithDefaultPrettyPrinter().writeValueAsString(ep1);
	
	System.out.println(emp);
		 
	// derilization=convert employee   json payload to class object

	}

}
