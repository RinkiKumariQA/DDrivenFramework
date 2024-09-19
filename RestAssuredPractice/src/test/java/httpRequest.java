import org.testng.annotations.Test;




public class httpRequest
{
	
	@Test()
	void ListUsers()
	{
		
	
		
		
  .when()
		.get("https://reqres.in/api/users?page=2")
		
		
  .then()
		.statusCode(200)
		.body("page",equals(2))
		.log().all();
	}

}
