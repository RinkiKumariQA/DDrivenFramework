package Day5;

import java.io.File;
import java.nio.file.Files;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class FileUpload 
{   
	@Test(enabled=false)
	void uploadfile()
	{
		 File testfield=new File("C:\\Users\\RINKI\\Desktop\\RestAs.txt");
		 File testfild=new File("C:\\Users\\RINKI\\Desktop\\SeleniumPractice.txt");
		 
		 RequestSpecification reqspec=RestAssured.given();
		 reqspec.baseUri("https://httpbin.org/post");
		 reqspec.multiPart("files",testfield);
		 reqspec.multiPart("files",testfild);
		Response response= reqspec.post();
		
		response.prettyPrint();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		 
	}
	
	@Test
	void upladimage()
	{
		//uri=https://petstore.swagger.io/v2/pet/1/uploadImage
		 File testfield=new File("C:\\Users\\RINKI\\Pictures\\Screenshots\\Addmethod.png");
		// File testfild=new File("C:\\Users\\RINKI\\Desktop\\SeleniumPractice.txt");
		 
		 RequestSpecification reqspec=RestAssured.given();
		 reqspec.baseUri("https://petstore.swagger.io/v2/pet/1/uploadImage");
		 reqspec.multiPart("file",testfield);
		// reqspec.multiPart("files",testfild);
		Response response= reqspec.post();
		
		response.prettyPrint();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		
	}

}
