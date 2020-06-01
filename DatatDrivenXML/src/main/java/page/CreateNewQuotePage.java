package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CreateNewQuotePage {
	WebDriver driver;

	public CreateNewQuotePage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(id = "subject") WebElement SUBJECT;
	@FindBy(id = "select2-cid-container") WebElement CUSTOMER;
	@FindBy(id = "address") WebElement ADDRESS;
	@FindBy(id = "invoicenum") WebElement QUOTE_PREFIX;
	@FindBy(id = "cn") WebElement QUOTE;
	@FindBy(id = "idate") WebElement DATE_CREATED;
	@FindBy(id = "edate") WebElement EXPIRY_DATE;
	@FindBy(id = "stage") WebElement STAGE;
	@FindBy(id = "tid") WebElement SALE_TAX;
	@FindBy(id = "add_discount") WebElement DISCOUNT;
	@FindBy(xpath = "//div[@id=\"invform\"]/div/div[3]/div/div") WebElement PROPOSAL_TEXT;
	@FindBy(xpath= "//th[@id=\"invoice_items\"]/thead/tr/th[1]") WebElement ITEM_CODE;
	@FindBy(xpath = "//textarea[@id=\"invoice_items\"]/tbody/tr/td[2]/textarea") WebElement ITEM_NAME;
	@FindBy(xpath = "//input[@id=\"invoice_items\"]/tbody/tr/td[3]/input") WebElement QTY;
	@FindBy(xpath = "//input[@id=\"invoice_items\"]/tbody/tr/td[4]/input") WebElement PRICE;
	@FindBy(xpath = "//input[@id=\"invoice_items\"]/tbody/tr/td[5]/input") WebElement TOTAL;
	@FindBy(xpath = "//select[@id=\"invoice_items\"]/tbody/tr/td[6]/select") WebElement TAX;
	@FindBy(id = "blank-add") WebElement ADD_BLANK_LINE;
	@FindBy(id = "item-add") WebElement ADD_PRODUCT_SERVICE;
	@FindBy(id = "sub_total") WebElement SUB_TOTAL;
	@FindBy(id = "discount_amount_total") WebElement DISCOUNT1;
	@FindBy(id = "taxtotal") WebElement TAX1;
	@FindBy(id = "total") WebElement TOTAL1;
	@FindBy(xpath = "//div[@id=\"invform\"]/div/div[5]/div/div") WebElement CUSTOMERS_NOTES;
	@FindBy(id = "submit") WebElement SAVE;
	
	
	
	
}
