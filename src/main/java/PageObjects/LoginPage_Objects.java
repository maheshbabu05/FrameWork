package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Objects {
	@FindBy(name = "email")
	public static WebElement name;
	@FindBy(name = "password")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"userLogin\"]/div[4]/div/div/button")
	public static WebElement click;
	

}
