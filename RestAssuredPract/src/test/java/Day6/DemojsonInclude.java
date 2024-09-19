package Day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DemojsonInclude {
	
	@Test
	void test() throws JsonProcessingException
	{
		createPojoclass ep1=new createPojoclass();
		ep1.setFirstname("Srishti");
		ep1.setLastname("Sakashi");
		ep1.setGender("Female");
	//	ep1.setAge(13);
		ep1.setSalary(100000);
	//	ep1.setIsmarried("Not Married");
		
		ObjectMapper ob=new ObjectMapper();
		
	String emp=	ob.writerWithDefaultPrettyPrinter().writeValueAsString(ep1);
		 
	
	System.out.println(emp);
	}

}
