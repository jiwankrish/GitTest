package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.LoginPage;
import util.ExcelReader;
import util.LaunchBrowser;

public class LoginTest {
	//Create WebDriver Object
	WebDriver driver;
	
	//Create Default Constructor
	public LoginTest() {}
	
	//Create parameterized Constructor
	public LoginTest(WebDriver driver) {
		this.driver= driver;
	}
	
	//Instantiate ExcelReader and provide path to the excel file.
	ExcelReader readExcel = new ExcelReader("./Data/testData.xlsx");
	String userName= readExcel.getCellData("loginPage", "UserName", 2);
	String password= readExcel.getCellData("loginPage", "Password", 2);
	
	@BeforeTest
	public void startUp() {
		//Call launchBrowser Method of LaunchBrowser Class
		driver= LaunchBrowser.launchBrowser();		
	}
	
	@Test(priority=1)
	public void loginTest(){
		//Initialized LoginPage Class and use its methods.
		LoginPage login =  PageFactory.initElements(driver, LoginPage.class);		
		login.enterUser(userName);
		login.enterPassword(password);
		login.clikSignin();
	}
}
