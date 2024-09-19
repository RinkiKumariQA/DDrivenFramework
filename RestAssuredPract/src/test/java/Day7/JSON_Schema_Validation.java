package Day7;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JSON_Schema_Validation {
	
	@Test
	 void test()
	 {
		 String  reqPayload="\"username\" :\"admin\",\r\n"
		 		+ " \"password\" :\"password123\"\r\n"
		 		+ "}";
		 
		 RestAssured.given()
		 .baseUri("https://restful-booker.herokuapp.com/auth")
		 .contentType(ContentType.JSON)
		 .body(reqPayload)
		 
		 .when()
		 .post()
		 
		 .then()
		 .assertThat().statusCode(200)
		 .body("token",Matchers.notNullValue())
		 .body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\RINKI\\Desktop\\schema.json")));
	 }

}
