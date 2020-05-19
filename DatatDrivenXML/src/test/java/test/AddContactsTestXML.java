package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContactsPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddContactsTestXML {
	WebDriver driver;
	
	@Test(priority = 1)
	@Parameters({"userName","password","fullName","companyName","email","phone","address","city","state","zip","country"})
	public void addContact(String userName, String password,String fullName, String companyName, String email, String phone, String address, String city, String state, String zip, String country) throws InterruptedException {
		driver = BrowserFactory.launchBrowser();
		// Initialized LoginPage Class and use its methods.
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUser(userName);
		login.enterPassword(password);
		login.clikSignin();		
		
		// Create new Object of AddAccountPage class to call methods from this page class
		AddContactsPage addAccount = PageFactory.initElements(driver, AddContactsPage.class);
		// Click CRM and AddContact
		addAccount.clickCRM();
		addAccount.clickAddContact();

		// Call Methods and provide Data to add Contact. These methods will set the data to the form
		addAccount.enterFullName(fullName);
		addAccount.enterCompanyNaem(companyName);
		addAccount.enterEmail(email);
		addAccount.enterPhone(phone);
		addAccount.enterAddress(address);
		addAccount.enterCity(city);
		addAccount.enterState(state);
		addAccount.enterZip(zip);

		// This will select country. Country name in the excel sheet should match with the country listed in the website
		addAccount.selectCountry(country);

		// Click Submit button. You can also changes it to Keyboard enter button.
		addAccount.clickSubmit();
		
		Thread.sleep(5000);
		BrowserFactory.tearDown();
	}

}
