package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import util.BrowserFactory;

public class SalesTest {
	WebDriver driver;

	@BeforeTest
	public void startUp() {
		// Call launchBrowser Method of LaunchBrowser Class
		driver = BrowserFactory.launchBrowser();
	}

//	@Test(priority = 1)
//	public void loginTest() {
//		// Initialized LoginPage Class and use its methods.
//		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
//		login.enterUser(userName);
//		login.enterPassword(password);
//		login.clikSignin();		
//	}

//	@Test(priority = 2)
//	public void Sales(){
//		// Create new Object of AddAccountPage class to call methods from this page class
//		SalesPage addAccount = PageFactory.initElements(driver, SalesPage.class);
//		// Click CRM and AddContact
//		Invoices.
//		addAccount.clickAddContact();
}
