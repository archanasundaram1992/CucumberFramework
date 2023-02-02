package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbstractComponents {
	public WebDriver driver;

	
	public String readPropertiesFile(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Resources\\Properties.properties");
		prop.load(fis);
		String key_value = prop.getProperty(key);
		return key_value;
		
	}

	public WebDriver initializeDriver() throws IOException
	{
		if(driver==null)
		{
			String browser_name = readPropertiesFile("browser");
			if (browser_name.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(browser_name.equalsIgnoreCase("firefox"))
			{
				//code for gekco driver
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String url_value = readPropertiesFile("url");
			driver.get(url_value);
		}
		return driver;
	}


}
