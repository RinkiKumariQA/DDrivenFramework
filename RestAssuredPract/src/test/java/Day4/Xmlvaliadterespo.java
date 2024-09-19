package Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
public class Xmlvaliadterespo

	{ // https://petstore.swagger.io/v2/pet
		@Test
		void addPet()
		{
			String XMLrequestBody="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
					+ "<Pet>\r\n"
					+ "	<id>0</id>\r\n"
					+ "	<Category>\r\n"
					+ "		<id>0</id>\r\n"
					+ "		<name>string</name>\r\n"
					+ "	</Category>\r\n"
					+ "	<name>doggie</name>\r\n"
					+ "	<photoUrls>\r\n"
					+ "		<photoUrl>string</photoUrl>\r\n"
					+ "	</photoUrls>\r\n"
					+ "	<tags>\r\n"
					+ "		<Tag>\r\n"
					+ "			<id>0</id>\r\n"
					+ "			<name>string</name>\r\n"
					+ "		</Tag>\r\n"
					+ "	</tags>\r\n"
					+ "	<status>available</status>\r\n"
					+ "</Pet>";
					
			
					
			RequestSpecification reqspec=RestAssured.given();
			reqspec.baseUri("https://petstore.swagger.io");
			reqspec.basePath("/v2/pet");
			
			//specify header
//			reqspec.header("accept","application/json");   // json format
			reqspec.header("accept","application/xml");
		    reqspec.header("Content-Type","application/xml");
			reqspec.body(XMLrequestBody);
			
			//perform post request
			Response response=reqspec.post();
			response.prettyPrint();
			
		  Assert.assertEquals(response.statusCode(),200,"check for status code");
		  
		  response.then().body("Pet.name", Matchers.equalTo("doggie"));
			
		}

	}


