package Module7TstNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Withoutpgfact
{
	
	WebDriver ldriver;
	
	public Withoutpgfact(WebDriver orginialdriver)
	{
		ldriver=orginialdriver;
	}
	
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.id("submit");
	
	public void username(String user)
	{
		ldriver.findElement(username).sendKeys(user);
	}
	
	public void password(String passw)
	{
		ldriver.findElement(password).sendKeys(passw);
	}

	public void submit()
	{
		ldriver.findElement(submit).click();
	}
}
