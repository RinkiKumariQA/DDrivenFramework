package Module_4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class Screenshot extends BaseClass
{
 
 @Test
 void test()
 {
	 driver.findElement(By.id("username")).sendKeys("student");
	 driver.findElement(By.id("passwod")).sendKeys("Password123");
	 driver.findElement(By.id("submit")).click();
 }
 
 
 
}
