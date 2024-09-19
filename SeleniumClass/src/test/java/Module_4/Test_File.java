package Module_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_File {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		ReadClass rc=new ReadClass();
	//	String a=rc.get();
	//	String b=rc.getUsername();
//		String c=rc.getPassword();
		
	driver.get(rc.geturl());
	driver.findElement(By.id("username")).sendKeys(rc.getusername());
	driver.findElement(By.id("password")).sendKeys(rc.getpassword());
	driver.findElement(By.id("submit")).click();
		
	}

}
