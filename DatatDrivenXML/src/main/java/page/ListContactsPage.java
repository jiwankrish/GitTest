package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ExplicitWait;

public class ListContactsPage {

	private static final WebElement CRM = null;
	private static final WebElement LIST_CONTACT = null;
	WebDriver driver;

	public ListContactsPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//div[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/form/div/div[2]/a")
	WebElement CRM_LIST_CONTACTS;
	@FindBy(xpath = "//div[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div/h3")
	WebElement FILTER_BY_TAG;
	@FindBy(xpath = "//div[@id=\"page-wrapper\"]/div[3]/div[3]/div/div/div/table/thead/tr/th[2]")
	WebElement NAME;
	@FindBy(xpath = "//div[@id=\"page-wrapper\"]/div[3]/div[3]/div/div/div/table/thead/tr/th[3]")
	WebElement COMPANY_NAME;
	@FindBy(id = "Email")
	WebElement EMAIL;
	@FindBy(id = "phone")
	WebElement PHONE;
	@FindBy(id = "Manage")
	WebElement MANAGE;

	public void clickCRM() {
		ExplicitWait wait = PageFactory.initElements(driver, ExplicitWait.class);
		wait.explictWait(CRM);
		CRM.click();

	}

	public void clickListContact() {
		ExplicitWait wait = PageFactory.initElements(driver, ExplicitWait.class);
		wait.explictWait(CRM);
		LIST_CONTACT.click();

	}

}
