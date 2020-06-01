package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class NewRecurringInvoice {
	WebDriver driver;

	public NewRecurringInvoice(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(id = "select2-cid-container")
	WebElement CUSTOMER;
	@FindBy(id = "address")
	WebElement ADDRESS;
	@FindBy(id = "invoicenum")
	WebElement INVOICE_PREFIX;
	@FindBy(id = "cn")
	WebElement INVOICE;
	@FindBy(id = "repeat")
	WebElement REPEAT_EVERY;
	@FindBy(id = "idate")
	WebElement INVOICE_DATE;
	@FindBy(id = "duedate")
	WebElement PAYMENT_TERMS;
	@FindBy(id = "select2-tid-container")
	WebElement SALES_TAX;
	@FindBy(id = "add_discount")
	WebElement DISCOUNT;
	@FindBy(id = "item-add")
	WebElement ADD_PRODUCT_SERVICE;
	@FindBy(id = "blank-add")
	WebElement ADD_BLANK_LINE;
	@FindBy(id = "sub_total")
	WebElement SUB_TOTAL;
	@FindBy(id = "discount_amount_total")
	WebElement DISCOUNT_TOTAL;
	@FindBy(id = "taxtotal")
	WebElement TAX ;
	@FindBy(id = "total")
	WebElement TOTAL;
	@FindBy(xpath="//*[@id=\"invform\"]/div/div[3]/div")
	WebElement INVOICE_TERMS;
	@FindBy(id="submit")
	WebElement SAVE_INVOICE;
	
}
