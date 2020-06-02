package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {
	WebDriver driver;

	public LogOutPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//ul[@id='side-menu']/li[9]/ul/li[3]/a")
	WebElement LOGOUT;

}