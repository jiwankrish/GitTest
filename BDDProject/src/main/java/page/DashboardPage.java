package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.ExplicitWait;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(linkText = "Dashboard")
	WebElement DASHBOARD;

	public void waitforDashboard() {
		// This will wait for given time (We have this for 60 second) until it finds
		ExplicitWait wait = PageFactory.initElements(driver, ExplicitWait.class);
		wait.explictWait(DASHBOARD);
	}

	public void validateDashBoard() {
		Assert.assertEquals(DASHBOARD.getText(), "Dashboard");
	}

}
