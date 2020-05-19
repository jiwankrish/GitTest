package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.ExplicitWait;

public class AddContactsPage {
	WebDriver driver;
	public AddContactsPage(WebDriver driver) {
		this.driver= driver;
	}
	
	@FindBy(xpath= "//ul[@id='side-menu']/li[2]/a/span[1]") WebElement CRM;
	@FindBy(xpath= "//ul[@id='side-menu']/li[2]/ul/li[1]/a") WebElement ADD_CONTACT;
	@FindBy(id= "account") WebElement FULL_NAME;
	@FindBy(id= "company") WebElement COMPANY;
	@FindBy(id= "email") WebElement EMAIL;
	@FindBy(id= "phone") WebElement PHONE;
	@FindBy(id= "address") WebElement ADDRESS;
	@FindBy(id= "city") WebElement CITY;
	@FindBy(id= "state") WebElement STATE;
	@FindBy(id= "zip") WebElement ZIP_CODE;
	@FindBy(id= "country") WebElement COUNTRY;
	
	//@FindBy(how=How.XPATH, using= "//form[@id='rform']/div[10]/div/span/span[1]/span/ul") WebElement TAG;
	@FindBy(id= "submit") WebElement SUBMIT;
	
	
	
	public void clickCRM() {
		//This will wait for given time (We have this for 60 second) until it finds CRM
		ExplicitWait wait= PageFactory.initElements(driver, ExplicitWait.class);
		wait.explictWait(CRM);
		CRM.click();
	}
	
	public void clickAddContact() {
		//This will wait for given time (We have this for 60 second) until it finds ADD_CONTACT
		ExplicitWait wait= PageFactory.initElements(driver, ExplicitWait.class);
		wait.explictWait(CRM);
		ADD_CONTACT.click();
	}
	
	public void enterFullName(String fullName) {
		//This will wait for given time (We have this for 60 second) until it finds FULL_NAME. We can also change to different element if there is any that takes longer to load.
		//Explicit wait will only wait until given time if it does not find the element. If it finds the element earlier, it will not wait for the whole time.
		ExplicitWait wait= PageFactory.initElements(driver, ExplicitWait.class);
		wait.explictWait(FULL_NAME);
		FULL_NAME.sendKeys(fullName);
	}
	
	public void enterCompanyNaem(String companyName) {
		COMPANY.sendKeys(companyName);
	}
	
	public void enterEmail(String email) {
		EMAIL.sendKeys(email);
	}
	
	public void enterPhone(String phone) {
		PHONE.sendKeys(phone);
	}
	
	public void enterAddress(String address) {
		ADDRESS.sendKeys(address);
	}
	
	public void enterCity(String city) {
		CITY.sendKeys(city);
	}
	
	public void enterState(String state) {
		STATE.sendKeys(state);
	}
	
	public void selectCountry(String country) {
		Select SELECT_COUNTRY = new Select(COUNTRY);
		SELECT_COUNTRY.selectByVisibleText(country);
	}
	
	public void enterZip(String zip) {
		ZIP_CODE.sendKeys(zip);
	}
	
	public void clickSubmit() {
		SUBMIT.click();
	}
	
}
