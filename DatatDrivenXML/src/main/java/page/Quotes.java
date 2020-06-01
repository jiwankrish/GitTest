package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Quotes {
	WebDriver driver;

	public Quotes(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[1]")
	WebElement PAGE_WRAPPER;

	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[2]")
	WebElement ACCOUNT;

	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[3]")
	WebElement SUBJECT;

	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[4]")
	WebElement AMOUNT;

	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[5]")
	WebElement DATE_CREATED;

	@FindBy(xpath = "//th[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/thead/tr/th[6]")
	WebElement EXPIRY_DATE;

	@FindBy(xpath = "//span[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr/td[7]/span")
	WebElement STAGE;

	@FindBy(xpath = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr/td[8]/a[1]")
	WebElement VIEW;

	@FindBy(xpath = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/table/tbody/tr/td[8]/a[2]")
	WebElement EDIT;

	@FindBy(xpath = "//a[@id=\"iid1\"]")
	WebElement DELETE;
	
	@FindBy(xpath = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/ul/li[1]/a")
	WebElement FONT;
	
	@FindBy(xpath = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/ul/li[2]/a")
	WebElement NEXT ;
	
	@FindBy(xpath = "//a[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/ul/li[3]/a")
	WebElement LAST;
}
