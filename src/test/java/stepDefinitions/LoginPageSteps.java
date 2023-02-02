package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;
import utils.AbstractComponents;
import utils.TestContext;

public class LoginPageSteps extends AbstractComponents{

	TestContext testContext;
	//PageObjectManager pageobject;
	
	public LoginPageSteps(TestContext testContext)
	{
		this.testContext = testContext;
	}
	
	@Given("User is on Login page")
	public void user_is_on_login_page() throws IOException {
		//System.out.println(testContext.pageobject.LoginPageObject().getTitle());
		assertTrue(testContext.pageobject.LoginPageObject().getTitle()
				.equalsIgnoreCase(testContext.abstractComponents.readPropertiesFile("PageTitle_LoginPage")));
		
	}

	@When("User sign in using {string} and {string}")
	public void user_sign_in_using_and(String email, String password) {
		//pageobject = new PageObjectManager(testContext.driver);
		
		LoginPage loginpage =testContext.pageobject.LoginPageObject();
		loginpage.login(email, password);
		
	}
}
