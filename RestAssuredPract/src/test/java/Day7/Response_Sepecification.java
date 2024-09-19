package Day7;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Response_Sepecification {
	
	//https://restful-booker.herokuapp.com/booking
	
	ResponseSpecification rqsp=null;
	
	@BeforeClass
	void createspecificationspec()
	{
	ResponseSpecBuilder resposebuilder=new ResponseSpecBuilder();
	resposebuilder.expectStatusCode(200);
	resposebuilder.expectStatusLine("HTTP/1.1 200 OK");
	resposebuilder.expectContentType(ContentType.JSON);
	resposebuilder.expectResponseTime(Matchers.lessThan(3000L));
	
	     rqsp = resposebuilder.build();
	
	}
	@Test
      void getallBookingId()
      {
    	    RestAssured
    	    .given().baseUri("https://restful-booker.herokuapp.com/booking")
    	    .when().get()
    	   .then()
    	   .spec(rqsp);
    	   /*  .statusCode(200)
    	    .statusLine("HTTP/1.1 200 OK")
    	    .contentType(ContentType.JSON)
    	    .time(Matchers.lessThan(3000L)); */
      }
	   
	   @Test
	   void getallBookinglsit()
	      {
	    	    RestAssured
	    	    .given().baseUri("https://restful-booker.herokuapp.com/booking?firstname=sally")
	    	    .when()
	    	          .get()
	    	  .then()
	    	  .spec(rqsp); 
	    	   /*    .statusCode(200)
	    	       .statusLine("HTTP/1.1 200 OK")
	    	      .contentType(ContentType.JSON)
	    	     .time(Matchers.lessThan(3000L));  */ 
	    	    
	      }
}
