package DB_Connection;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link
{
       public static void main(String[] args) {
		
    	   WebDriver driver =new ChromeDriver();
    	   driver.get("http://www.deadlinkcity.com");
    	 List<WebElement>l1= driver.findElements(By.tagName("a"));
    	 System.out.println(l1.size());
    	 int statuscode=200;
    	 int brokenlink=0;
    	 for(WebElement l2:l1)
    	 {
    		 String url=l2.getAttribute("href");
    		 
    		 try
    		 {
				URL u =new URL(url);
				HttpURLConnection hp=(HttpURLConnection)u.openConnection();
				hp.setRequestMethod("HEAD");
				hp.connect();

				 statuscode=hp.getResponseCode();
				 if(statuscode>=400)
				 {
					 System.out.println(url +"brokenlink");
					 brokenlink++;
				 }
			
				} 
    		 
    		 catch (Exception e)
    		 {
				
			}
    	 }
    	  System.out.println(brokenlink);
	} 
}
