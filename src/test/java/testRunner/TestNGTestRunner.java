package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features= ".//Features/Login.feature",
		glue= "stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin= {"pretty","html:test_output.html"}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	

}
