package Day4;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class QueryRequestSpecification
{
	// https://reqres.in/api/users
    @Test
    public void test()
    {
    	JSONObject jsondata=new JSONObject();
    	jsondata.put("name", "Srishti");
    	jsondata.put("RollNo", "01");
    	
    	RequestSpecification reqspec=RestAssured.given();
    	reqspec.baseUri("https://reqres.in");
    	reqspec.basePath("/api/users");
    	
    	//reqspec.contentType(ContentType.JSON).body(jsondata.toJSONString());
    	reqspec.contentType(ContentType.JSON).body(jsondata.toJSONString()).header("header1","headervalue"); //customize header
    	
    	
    	//query details from specifiaction
    	QueryableRequestSpecification queryRequest= SpecificationQuerier.query(reqspec);
    	
    	// get base URI
    	String reteriveBaseUri= queryRequest.getBaseUri();
    	System.out.println("Base uri" +reteriveBaseUri );
    	
    	// get base path
    	String reteriveBasepath= queryRequest.getBasePath();
    	System.out.println("Base uri" +reteriveBasepath );
    	
    	// get body
    	String reteriveBody= queryRequest.getBody();
    	System.out.println("Base uri" +reteriveBody );
    	
    	// get request headers
    	
    	Headers allheaders =queryRequest.getHeaders();
    	System.out.println("\n======================Request Header===============\n");
    	for(Header h:allheaders)
    	
    	{
    		System.out.println("Header Name:" + h.getName() + "\tHeader value:" + h.getValue());
    	}
    }
}
