package pageObjects;


import org.openqa.selenium.WebDriver;

import utils.AbstractComponents;

public class HomePage extends AbstractComponents{
	

	public WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public String validate_login() 
	{
		return driver.getTitle();
	}
}
