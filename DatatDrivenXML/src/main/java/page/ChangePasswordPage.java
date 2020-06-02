package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage {
	WebDriver driver;

	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "password")
	WebElement CHANGE_PASSWORD;
	@FindBy(id = "npass")
	WebElement NEW_PASSWORD;
	@FindBy(id = "cnpass")
	WebElement CONFORM_NEW_PASSWORD;
	@FindBy(xpath = "//div[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT;

}
