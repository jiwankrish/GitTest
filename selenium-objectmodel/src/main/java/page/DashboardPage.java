package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.XPATH, using= "//ul[@id='side-menu']/li[2]/a/span[1]") WebElement CRM;
	@FindBy(how=How.XPATH, using= "//ul[@id='side-menu']/li[2]/ul/li[1]/a") WebElement ADD_CONTACT;
	@FindBy(how=How.ID, using= "account") WebElement FULL_NAME;
	@FindBy(how=How.ID, using= "company") WebElement COMPANY;
	@FindBy(how=How.NAME, using= "email") WebElement EMAIL;
	@FindBy(how=How.ID, using= "phone") WebElement PHONE;
	@FindBy(how=How.ID, using= "address") WebElement ADDRESS;
	@FindBy(how=How.ID, using= "city") WebElement CITY;
	@FindBy(how=How.ID, using= "state") WebElement STATE;
	@FindBy(how=How.ID, using= "zip") WebElement ZIP_CODE;
	@FindBy(how=How.XPATH, using= "//select[@id='country']/option[233]") WebElement COUNTRY;
	//@FindBy(how=How.XPATH, using= "//form[@id='rform']/div[10]/div/span/span[1]/span/ul") WebElement TAG;
	@FindBy(how=How.ID, using= "submit") WebElement SUBMIT;
	
	public void clickCRM() {
		CRM.click();
	}
	
	public void clickAddContact() {
		ADD_CONTACT.click();
	}
	
	public void addContactData(String fullName, String companyName, String email, String phone, String address, String city, String state, String zip) {
		//Select SEL_COUNTRY = new Select(COUNTRY);
<<<<<<< Updated upstream
		WebDriverWait explicitWait = new WebDriverWait(driver, 30);	
		explicitWait.until(ExpectedConditions.visibilityOf(STATE));
=======
		WebDriverWait explicitWait = new WebDriverWait(driver, 120);	
		explicitWait.until(ExpectedConditions.visibilityOf(FULL_NAME));
>>>>>>> Stashed changes
		FULL_NAME.sendKeys(fullName);
		COMPANY.sendKeys(companyName);
		EMAIL.sendKeys(email);
		PHONE.sendKeys(phone);
		ADDRESS.sendKeys(address);
		CITY.sendKeys(city);
		STATE.sendKeys(state);
		ZIP_CODE.sendKeys(zip);
		COUNTRY.click();
		//TAG.sendKeys(tag);
		SUBMIT.click();
	}

}
