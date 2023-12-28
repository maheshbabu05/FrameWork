package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonClass {
	

	public static WebDriver driver =null;
	public static Properties prop =null;
	
	Logger log = Logger.getLogger(CommonClass.class);

	public Properties loadPropertyFile() throws IOException  {

		FileInputStream FIP = new FileInputStream("Config.properties");
	    prop = new Properties();
		prop.load(FIP);
		return prop;
	}


	@BeforeSuite
	public void launchbrowser() throws IOException {
		PropertyConfigurator.configure("Log4j.properties");
		log.info("MaaS begning");
		log.info("loading the prop file");
		loadPropertyFile();
	    
		String browser = prop.getProperty("browser");
		String Url = prop.getProperty("Url");
		String driverlocation = prop.getProperty("DriverLocation");
	    
		
		
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverlocation);
		log.info("launch Chrome");
	    driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
		    driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		log.info("Navigate to app");
        driver.get("https://ephtesting.demo-ncmaas.com/home/login");
       
		
		



	}


@AfterSuite
public void close() {
	log.info("Close the app");
	driver.quit();
}

}
