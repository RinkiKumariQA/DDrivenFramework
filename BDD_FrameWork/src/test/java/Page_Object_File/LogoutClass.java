package Page_Object_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutClass
{

	WebDriver Currentdriver;
	
	public LogoutClass(WebDriver Remotedriver)
	{
		Currentdriver=Remotedriver;
		PageFactory.initElements( Remotedriver,this);
	
	}
	
	@FindBy(xpath="//a[text()='Log out']") WebElement Logout;
	
	public void user_logOut()
	{
		Logout.click();
	}
}
