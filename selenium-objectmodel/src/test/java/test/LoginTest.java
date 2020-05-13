package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.LaunchBrowser;

public class LoginTest {
	WebDriver driver;
	@BeforeTest
	public void startUp() {
		//Call launchBrowser Method of LaunchBrowser Class
		driver= LaunchBrowser.launchBrowser();		
	}
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		//Initialized LoginPage Class and use its methods.
		LoginPage login =  PageFactory.initElements(driver, LoginPage.class);		
		login.enterUser("techfiosdemo@gmail.com");
		login.enterPassword("abc123");
		login.clikSignin();
	}
	
	@Test(priority=2)
	public void addContact() {		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.clickCRM();
		dashboard.clickAddContact();
		dashboard.addContactData("Sharma", "Test1", "test00dd164745@gmail.com", "8356758976", "1425 Testing Dr", "Irving", "TX", "75060");
	}
}
