package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import CommonFunctions.CommonClass;
import PageObjects.LoginPage_Objects;
import PageObjects.OfferingPage_objects;

public class OfferingPage_TC extends CommonClass {
	
	
	Logger log = Logger.getLogger(OfferingPage_TC.class);
	@Test
	public void clickdashboard() {
        log.info("Log into application");
        PageFactory.initElements(driver, LoginPage_Objects.class);
		
		LoginPage_Objects.name.sendKeys("maheshbabu+flow1@captechin.com");
		LoginPage_Objects.password.sendKeys("12345@Test");
		LoginPage_Objects.click.click();
	
		log.info("Into Offering page ");
		PageFactory.initElements(driver, OfferingPage_objects.class);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0,500)");
		OfferingPage_objects.offer.click();
	
		
		
		
	}

}
