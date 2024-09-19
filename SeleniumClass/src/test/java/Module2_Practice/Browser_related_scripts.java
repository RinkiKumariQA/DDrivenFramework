package Module2_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_related_scripts {

	public static void main(String[] args)
	{
             WebDriver driver=new ChromeDriver();
             driver.get("https://practicetestautomation.com/practice-test-login/");
             
          JavascriptExecutor je=(JavascriptExecutor) driver;
          String s1=je.executeScript("return document.URL").toString();
         System.out.println(s1);
         
         /*       JavascriptExecutor js=(JavascriptExecutor) driver;
                 String s2=js.executeScript("return document.domain").toString();
                   System.out.println(s2);
                    */
           
             /*    
             JavascriptExecutor jc=(JavascriptExecutor) driver;
           String s3=  jc.executeScript("return document.title").toString();
             System.out.println(s3);
             
             */
	}

}
