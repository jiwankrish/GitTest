package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicesPage {
	WebDriver driver;

	public InvoicesPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/a[1]")
	WebElement MANAGE_RECURRING_INVOICES;
	@FindBy(linkText = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/a[2]")
	WebElement ADD_INVOICES;
//	@FindBy(linkText = "1094")
//	WebElement  1094 ;
//	@FindBy(linkText = "Micrisoft Excel")
	WebElement ACCOUNTS;
	@FindBy(xpath = "//class[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[3]")
	WebElement AMOUNT;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[4]")
	WebElement INVOICE_DATE;
	@FindBy(xpath = "//td[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[5]")
	WebElement DUE_DATE;
	@FindBy(xpath = "//td[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[5]")
	WebElement STATUS;
	@FindBy(xpath = "//span[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[7]/span")
	WebElement TYPE;
	@FindBy(xpath = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[8]/a[1]")
	WebElement VIEW ;
	@FindBy(xpath="//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[8]/a[2]")
	WebElement EDIT;
	@FindBy(xpath="//a[@id=\"iid1094\"]")
	WebElement DELETE;
	
	
}
