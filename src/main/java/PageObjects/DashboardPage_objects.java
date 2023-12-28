package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage_objects {
	
	
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-2\"]/ul/li[1]/a/span")
	public static WebElement investment;

}
