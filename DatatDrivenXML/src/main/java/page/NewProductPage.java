package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewProductPage {
	WebDriver driver;
	
	public NewProductPage (WebDriver driver) {
		this.driver= driver;
		
	}
	@FindBy(linkText = "List Products") WebElement LIST_PRODUCTS_BUTTON;
	@FindBy(id = "name") WebElement NAME_FIELD;
	@FindBy(id = "sales_price") WebElement SALES_PRICE_FIELD;
	@FindBy(id = "item_number") WebElement ITEM_NUMBER_FIELD;
	@FindBy(id = "description") WebElement DESCRIPTION_FIELD;
	@FindBy(id = "submit") WebElement SUBMIT_BUTTON;
	
	
	public void clickONListProducts() {
		LIST_PRODUCTS_BUTTON.click();
		
	}
	
	public void enterName(String name) {
		NAME_FIELD.sendKeys(name);
		
	}
	public void enterSalesPrice(String sales_price) {
		SALES_PRICE_FIELD.sendKeys(sales_price);
		
	}
	public void enterItemNumber(String item_number) {
		ITEM_NUMBER_FIELD.sendKeys(item_number);
	}
	public void enterDescription(String description) {
		DESCRIPTION_FIELD.sendKeys(description);
		
	}
	public void clicOnSubmitButton() {
		SUBMIT_BUTTON.click();
		
	}
}
