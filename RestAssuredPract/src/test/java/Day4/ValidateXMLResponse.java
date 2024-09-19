package Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ValidateXMLResponse
{ // https://petstore.swagger.io/v2/pet
	@Test
	void addPet()
	{
		
		String jsondata="{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
				
				
		RequestSpecification reqspec=RestAssured.given();
		reqspec.baseUri("https://petstore.swagger.io");
		reqspec.basePath("/v2/pet");
		
		//specify header
//		reqspec.header("accept","application/json");   // json format
		reqspec.header("accept","application/xml");
		
		reqspec.header("Content-Type","application/json");
		reqspec.body(jsondata);
		
		//perform post request
		Response response=reqspec.post();
		response.prettyPrint();
		
	  Assert.assertEquals(response.statusCode(),200,"check for status code");
		
	}

}
