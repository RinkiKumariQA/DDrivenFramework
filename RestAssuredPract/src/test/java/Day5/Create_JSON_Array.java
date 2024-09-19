package Day5;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Create_JSON_Array 
{
	 // uri= https://reqres.in/api/users
     @Test()
     void createuserUsingJsonArray()
     {
   
              JSONObject user1=new JSONObject();
              user1.put("firstname", "Rinki");
              user1.put("lastname", "Kumari");
              user1.put("age", 23);
              user1.put("salary", 10000);
              
              JSONObject user2=new JSONObject();
              user2.put("firstname", "Srishti");
              user2.put("lastname", "Sakashi");
              user2.put("age", 13);
              user2.put("salary", 12000);
              
              JSONObject user3=new JSONObject();
              user3.put("firstname", "Anita");
              user3.put("lastname", "Roy");
              user3.put("age", 24);
              user3.put("salary", 14000);
              
              //	 add json object to json array
              JSONArray UserPayload=new JSONArray();
              UserPayload.add(user1);
              UserPayload.add(user2);
              UserPayload.add(user3);
              
          	 
          
              
         RequestSpecification reqspec=RestAssured.given();
         reqspec.baseUri("https://reqres.in/api/users");
         reqspec.contentType(ContentType.JSON);
         reqspec.body(UserPayload);
       Response response=  reqspec.post();
          response.prettyPrint();
       Assert.assertEquals(response.statusCode(), 201);
         
              
     }
}
