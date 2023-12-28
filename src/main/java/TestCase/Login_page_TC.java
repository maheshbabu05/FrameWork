package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.CommonClass;
import PageObjects.LoginPage_Objects;

public class Login_page_TC extends CommonClass {
	
	@Test(enabled = false)
	public static void login() {
	
	PageFactory.initElements(driver, LoginPage_Objects.class);
	
	LoginPage_Objects.name.sendKeys("maheshbabu+flow1@captechin.com");
	LoginPage_Objects.password.sendKeys("12345@Test");
	LoginPage_Objects.click.click();
	
}
}
