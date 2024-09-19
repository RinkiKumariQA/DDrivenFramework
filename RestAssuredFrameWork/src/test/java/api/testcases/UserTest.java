package api.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.userEndPoints;
import api.payload.user;
import io.restassured.response.Response;
import junit.framework.Assert;

public class UserTest 
{
	
	  Faker faker;
	  user userPayload;
	  @BeforeClass
public void generateTestData()
{
	faker=new Faker();
	userPayload=new user();
	userPayload.setId(faker.idNumber().hashCode());
    userPayload.setUsername(faker.name().username());
	userPayload.setFirstname(faker.name().firstName());
	userPayload.setLastname(faker.name().lastName());
	userPayload.setEmail(faker.internet().safeEmailAddress());
	userPayload.setPassword(faker.internet().password(5,10));
	userPayload.setPhone(faker.phoneNumber().cellPhone());;
}
	  @Test(priority = 1)
	  public void testCreateUser() 
	  {
		  Response response=  userEndPoints.createUser(userPayload);
		  response.then().log().all();  //log response
		  
		  Assert.assertEquals(response.getStatusCode(), 200);  //validation
		  }
	  
	  @Test(priority = 2)
	  public void testGetUserData() 
	  {
		  Response response=  userEndPoints.GetUser(this.userPayload.getUsername());
		  response.then().log().all();  //log response
		  
		  Assert.assertEquals(response.getStatusCode(), 200);  //validation
		  }
	  
	  @Test(priority = 3)
	  public void testUpdateUser() 
	  
	  {
		  userPayload.setFirstname(faker.name().firstName());
		  Response response=  userEndPoints.UpdateUser(this.userPayload.getUsername(),userPayload);
		  response.then().log().all();  //log response
		  
		  Assert.assertEquals(response.getStatusCode(), 200);  //validation
		  } 
	  
	  @Test(priority = 4)
	  public void testDeleteUser() 
	  {
		  Response response=  userEndPoints.DeleteUser(this.userPayload.getUsername());
		  response.then().log().all();  //log response
		  
		  Assert.assertEquals(response.getStatusCode(),200);  //validation
		  }



}
