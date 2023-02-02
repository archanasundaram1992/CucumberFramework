package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
	public LoginPage loginpage;
	public HomePage homepage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public LoginPage LoginPageObject()
	{
	
		loginpage =new LoginPage(driver);
		return loginpage;
	}
	
	public HomePage HomePageObject()
	{

		homepage = new HomePage(driver);
		return homepage;
	}

}
