package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RecurringInvoicesPage {
	WebDriver driver;

	public RecurringInvoicesPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//a[@id=\"invform\"]/div/div[3]/div")
	WebElement ADD_RECURRING_INVOICE;
	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[1]")
	WebElement PAGE_WRAPPER;
	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[1]")
	WebElement ACCOUNT;
	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[3]")
	WebElement AMOUNT ;
	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[4]")
	WebElement INVOICE_DATE ;
	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[5]")
	WebElement  DUE_DATE;
	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[6]")
	WebElement NEXT_INVOICE ;
	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[7]")
	WebElement STATUS ;
	@FindBy(xpath = "//class[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[8]")
	WebElement MANAGE ;
	
	
	
	
	
	
}
