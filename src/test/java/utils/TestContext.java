package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;

public class TestContext {
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public PageObjectManager pageobject;
	public AbstractComponents abstractComponents;
	
	
	public TestContext() throws IOException
	{
		abstractComponents = new AbstractComponents();
		pageobject = new PageObjectManager(abstractComponents.initializeDriver());
	}
}
