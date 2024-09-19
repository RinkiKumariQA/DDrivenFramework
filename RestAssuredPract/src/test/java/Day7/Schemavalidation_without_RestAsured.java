package Day7;

import java.io.File;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class Schemavalidation_without_RestAsured 
{
	
	@Test
	void test()
	{
		String json="{\r\n"
				+ "	 \"id\": \"2\",\r\n"
				+ "     \"email\" :\"jsp@gmail.com\",\r\n"
				+ "       \"firstname\" :\"Rinki:,\r\n"
				+ "       \"lastname\" :\"kumari\",\r\n"
				+ "         \r\n"
				+ "}";
		MatcherAssert.assertThat(json,JsonSchemaValidator.matchesJsonSchema(new File("filepath")) );
	}

}
