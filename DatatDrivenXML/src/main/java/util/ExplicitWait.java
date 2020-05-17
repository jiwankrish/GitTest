package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	WebDriver driver;
	public ExplicitWait() {}
	public ExplicitWait(WebDriver driver) {
		this.driver= driver;
	}
	public WebElement explictWait(WebElement element) {
		WebDriverWait explicitWait = new WebDriverWait(driver, 60);	
		return explicitWait.until(ExpectedConditions.visibilityOf(element));
	}
}
