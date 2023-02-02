package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContext;

public class Hooks {
	TestContext testContext;
	
	public Hooks(TestContext testContext)
	{
		this.testContext=testContext;
	}

	
	@After
	public void TearDown() throws IOException
	{
		testContext.abstractComponents.initializeDriver().quit();
	}
}
