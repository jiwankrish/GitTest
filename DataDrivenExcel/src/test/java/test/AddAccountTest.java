package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddAccountPage;
import util.ExcelReader;
import util.LaunchBrowser;

public class AddAccountTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void addContact(){
		//Create new object of ExcelReader
		ExcelReader readExcel = new ExcelReader("./Data/testData.xlsx");
		
		//Getting Data from Excel Sheet
		String fullName = readExcel.getCellData("addAccountPage", "FullName", 2);
		String companyName = readExcel.getCellData("addAccountPage", "CompanyName", 2);
		String email = readExcel.getCellData("addAccountPage", "Email", 2);
		String phone = readExcel.getCellData("addAccountPage", "Phone", 2);
		String address = readExcel.getCellData("addAccountPage", "Address", 2);
		String city = readExcel.getCellData("addAccountPage", "City", 2);
		String state = readExcel.getCellData("addAccountPage", "State", 2);
		String zip = readExcel.getCellData("addAccountPage", "Zip", 2);
		String country = readExcel.getCellData("addAccountPage", "Country", 2);
		
		//Call launchBrowser Method from LaunchBrowser Class and set Driver that it returns
		driver=LaunchBrowser.launchBrowser();
		
		//Create new Object of LoginTest Class to call LoginTest Method from this class
		LoginTest login = PageFactory.initElements(driver, LoginTest.class);		
		login.loginTest();
		
		//Create new Object of AddAccountPage class to call methods from this page class
		
		AddAccountPage addAccount = PageFactory.initElements(driver, AddAccountPage.class);
		//Click CRM  and AddContact
		addAccount.clickCRM();
		addAccount.clickAddContact();
		
		//Call Methods and provide Data to add Contact. These methods will set the data to the form
		addAccount.enterFullName(fullName);		
		addAccount.enterCompanyNaem(companyName);		
		addAccount.enterEmail(email);	
		addAccount.enterPhone(phone);		
		addAccount.enterAddress(address);		
		addAccount.enterCity(city);		
		addAccount.enterState(state);		
		addAccount.enterZip(zip);
		
		//This will select country. Country name in the excel sheet should match with the country listed in the website
		addAccount.selectCountry(country);
		
		//Click Submit button. You can also changes it to Keyboard enter button.
		addAccount.clickSubmit();
	}

}
