package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.AddContactsPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddContactsTestExcel {
	WebDriver driver;
	
	//Instantiate ExcelReader and provide path to the excel file.
	ExcelReader readExcel = new ExcelReader("./Data/testData.xlsx");
	String userName= readExcel.getCellData("loginPage", "UserName", 2);
	String password= readExcel.getCellData("loginPage", "Password", 2);
	String fullName = readExcel.getCellData("addAccountPage", "FullName", 2);
	String companyName = readExcel.getCellData("addAccountPage", "CompanyName", 2);
	String email = readExcel.getCellData("addAccountPage", "Email", 2);
	String phone = readExcel.getCellData("addAccountPage", "Phone", 2);
	String address = readExcel.getCellData("addAccountPage", "Address", 2);
	String city = readExcel.getCellData("addAccountPage", "City", 2);
	String state = readExcel.getCellData("addAccountPage", "State", 2);
	String zip = readExcel.getCellData("addAccountPage", "Zip", 2);
	String country = readExcel.getCellData("addAccountPage", "Country", 2);
	
	@BeforeTest
	public void startUp() {
		// Call launchBrowser Method of LaunchBrowser Class
		driver = BrowserFactory.launchBrowser();
	}

	@Test(priority = 1)
	public void loginTest() {
		// Initialized LoginPage Class and use its methods.
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUser(userName);
		login.enterPassword(password);
		login.clikSignin();		
	}

	@Test(priority = 2)
	public void addContact() throws InterruptedException {
		// Create new Object of AddAccountPage class to call methods from this page class
		AddContactsPage addAccount = PageFactory.initElements(driver, AddContactsPage.class);
		// Click CRM and AddContact
		addAccount.clickCRM();
		addAccount.clickAddContact();

		// Call Methods and provide Data to add Contact. These methods will set the data
		// to the form
		addAccount.enterFullName(fullName);
		addAccount.enterCompanyNaem(companyName);
		addAccount.enterEmail(email);
		addAccount.enterPhone(phone);
		addAccount.enterAddress(address);
		addAccount.enterCity(city);
		addAccount.enterState(state);
		addAccount.enterZip(zip);

		// This will select country. Country name in the excel sheet should match with
		// the country listed in the website
		addAccount.selectCountry(country);

		// Click Submit button. You can also changes it to Keyboard enter button.
		addAccount.clickSubmit();
		
		Thread.sleep(5000);
		BrowserFactory.tearDown();
	}

}
