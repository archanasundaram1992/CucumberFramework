package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import utils.AbstractComponents;
import utils.TestContext;

public class HomePageSteps extends AbstractComponents{
	
	TestContext testContext;
	//PageObjectManager pageobject;
	
	public HomePageSteps(TestContext testContext)
	{
		this.testContext = testContext;
	}
	
	@Then("validate if login is successfull")
	public void validate_if_login_is_successfull() throws IOException  {
		
		//pageobject = new PageObjectManager(testContext.driver);
		HomePage homepage = testContext.pageobject.HomePageObject();
		
		
		
		assertTrue(homepage.validate_login().equals(testContext.abstractComponents.readPropertiesFile("PageTitle_HomePage")));
	 
	}

	@Then("user logout from account")
	public void user_logout_from_account() {
		System.out.println("logout");
	    
	}

}
