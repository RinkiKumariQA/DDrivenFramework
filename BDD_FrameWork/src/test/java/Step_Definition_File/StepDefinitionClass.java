package Step_Definition_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object_File.Login_Class;
import Page_Object_File.LogoutClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitionClass extends BaseClass
{

	
	@Given("User open Browser")
	public void user_open_browser() 
	{
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
       lg=new  Login_Class (driver);
       lc=new LogoutClass(driver);
       
	}

	@When("User entr the url {string}")
	public void user_entr_the_url(String url)
	{
	   driver.get(url);
	   }

	@When("Enter username {string} and  password {string}")
	public void enter_username_and_password(String username, String password)
	{ 
		
	   lg.username(username);
	   lg.password(password);
	}

	@When("Click submit button")
	public void click_submit_button()
	{
	     lg.submit();
	}

	@Then("Validate Title {string}")
	public void validate_title(String ExpecTitle) 
	{
		String ActTitle=driver.getTitle();
		Assert.assertEquals(ExpecTitle, ActTitle);
	}
	
	@When("Click logout button")
	public void click_logout_button()
	{
		lc.user_logOut();
	}
	
   @Then("Close Browser")
	public void close_browser() 
   {
	    driver.close();
	}

	
	
}
