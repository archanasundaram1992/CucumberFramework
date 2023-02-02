package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(id = "email")
	WebElement email_ele;
	
	@FindBy(id ="pass")
	WebElement password_ele;
	
	@FindBy(name = "login")
	WebElement login_ele;*/
	
	By email_ele = By.id("email");
	By password_ele = By.id("pass");
	By login_ele = By.name("login");
	
	public void login(String email, String password)
	{
		driver.findElement(email_ele).sendKeys(email);
	
		driver.findElement(password_ele).sendKeys(password);
		driver.findElement(login_ele).click();
		
	}
	
	public String getTitle()
	{
		
		return driver.getTitle();
	}

}
