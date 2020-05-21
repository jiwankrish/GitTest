package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage {
	WebDriver driver;
	public NewAccountPage(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(id = "account") WebElement ACCOUNT;
	@FindBy(id = "description") WebElement DESCRIPTION;
	@FindBy(id = "balance") WebElement BALANCE;
	@FindBy(id = "//div[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button") WebElement SUBMIT;
	
	public void enterAccount(String account) {
		ACCOUNT.sendKeys(account);
	}
	public void enterDescription(String description) {
		DESCRIPTION.sendKeys(description);
	}
	public void enterBalance(String balance) {
		BALANCE.sendKeys(balance);
	}
	public void clickSubmit() {
		SUBMIT.click();
	}
}
