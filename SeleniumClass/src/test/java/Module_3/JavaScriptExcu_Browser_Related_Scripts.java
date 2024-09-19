package Module_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcu_Browser_Related_Scripts {

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
    //Get the Domian Name
		String s1=js.executeScript("return document.domain;").toString();
		System.out.println(s1);
	//System.out.println(js.executeScript("return document.domain;").toString());
 //Get the URL Name
		String s2=js.executeScript("return document.URL;").toString();
		System.out.println(s2);
	//Get the Title Name
		String s3=js.executeScript("return document.title;").toString();
		System.out.println(s3);
	}

}
