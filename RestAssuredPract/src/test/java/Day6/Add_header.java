package Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class Add_header {   
	// ex=Key:"Header"  &  value:"Value"
	
	@Test
	void Test()
	{
		Map<String, String> requestHeader=new HashMap();
		 requestHeader.put("Header1", "Value1");
		 requestHeader.put("Header2", "Value2");
		 
		 Header header1=new Header("header1","value1");
		 Header header2=new Header("header2","value2");
		 Header header3=new Header("header3","value3");
		 
		 List<Header> headerlist=new ArrayList<Header>();
		 headerlist.add(header1);
		 headerlist.add(header2);
		 headerlist.add(header3);
		 
		 Headers headersobj=new Headers(headerlist);
;
		 /*	RequestSpecification rqsp=RestAssured.given();
		//add header
	//	rqsp.header("Header1","Value1");
		rqsp.headers(requestHeader);
		rqsp.log().headers();
		// specify url
		 rqsp.baseUri("https://reqres.in/api/users?page=1");
		 
		 //perform get request
		 rqsp.get();
		 
		 // 2nd ways to add map
		 
		 
		 
		rqsp.headers(requestHeader);
	
		*/
		 
		 //BDD Style
		 RestAssured
		 .given()
		 .headers(headersobj)
		 .log().headers()
		 
		 .when()
		 .get("https://reqres.in/api/users?page=1")
		 .then()
		 .log().body();
	}

}
