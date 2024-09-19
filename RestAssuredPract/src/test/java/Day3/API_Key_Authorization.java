package Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Key_Authorization 
{
	
	//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
	
	@Test
    public void Apikey()
    {
    	RequestSpecification reqspec=RestAssured.given();
    	reqspec.baseUri("https://api.openweathermap.org");
    	reqspec.basePath("/data/2.5/weather");
    	reqspec.queryParam("q", "delhi").queryParam("appid", "apikey value");
    	Response response=reqspec.get();
    	
    	Assert.assertEquals(response. statusCode(),200);
    	System.out.println("Response Status Line" + response.statusLine());
    	System.out.println("Response Status Code" + response.statusCode());
    	
    }
}
