package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	// Create WebDriver Object
	WebDriver driver;

	// Create Default Constructor
	public LoginTest() {
	}

	// Create parameterized Constructor
	public LoginTest(WebDriver driver) {
		this.driver = driver;
	}

	// Instantiate ExcelReader and provide path to the excel file.
	// ExcelReader readExcel = new ExcelReader("./Data/testData.xlsx");
//	String userName = "techfiosdemo@gmail.com";
//	String password = "abc123";

	@BeforeTest
	public void startUp() {
		// Call launchBrowser Method of LaunchBrowser Class
		driver = BrowserFactory.launchBrowser();
	}

	@Test(priority = 1)
	@Parameters({ "userName", "password" })
	public void loginTest(String userName, String password) throws InterruptedException {
		// Initialized LoginPage Class and use its methods.
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUser(userName);
		login.enterPassword(password);
		login.clikSignin();

		Thread.sleep(5000);
		BrowserFactory.tearDown();
	}

	@Test(priority = 2)
	public void SalesTest(String userName, String password) throws InterruptedException {
		// Initialized LoginPage Class and use its methods

	}
}
