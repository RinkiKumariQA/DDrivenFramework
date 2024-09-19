package Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Create_JSON_Array_Using_ListorSet
{
	 // uri= https://reqres.in/api/users
    @Test()
    void createuserUsingJsonArrayUsinfList()
    {
  
             Map<String, Object> user1=new HashMap<String, Object>();
             user1.put("firstname", "Rinki");
             user1.put("lastname", "Kumari");
             user1.put("age", 23);
             user1.put("salary", 10000);
             
             Map<String, Object> user2=new HashMap<String, Object>();
             user2.put("firstname", "Srishti");
             user2.put("lastname", "Sakashi");
             user2.put("age", 13);
             user2.put("salary", 12000);
             
             Map<String, Object> user3=new HashMap<String, Object>();
             user3.put("firstname", "Anita");
             user3.put("lastname", "Roy");
             user3.put("age", 24);
             user3.put("salary", 14000);
             
             //	 Create json array using List
             List<Map <String, Object> > jsonArrayListpayload=new ArrayList();
             
             jsonArrayListpayload.add(user1);
             jsonArrayListpayload.add(user2);
             jsonArrayListpayload.add(user3);
             
         	 
         
             
        RequestSpecification reqspec=RestAssured.given();
        reqspec.baseUri("https://reqres.in/api/users");
        reqspec.contentType(ContentType.JSON);
        reqspec.body(jsonArrayListpayload);
      Response response=  reqspec.post();
         response.prettyPrint();
      Assert.assertEquals(response.statusCode(), 201);
        
             
    }
}
