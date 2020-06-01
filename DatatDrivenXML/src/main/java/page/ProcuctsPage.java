package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProcuctsPage {
	
WebDriver driver;
	
	public ProcuctsPage (WebDriver driver) {
		this.driver= driver;
	}
	//Creating Elements for Products page
	
	@FindBy(xpath = "//a[contains(text(),' Add Product')]")WebElement ADD_PRODUCTS_BUTTON_LOCATOR;
	//need to create another page for service
	
	//@FindBy(xpath = "//a[contains(text(),' Add Service')]")WebElement ADD_SERVICE_BUTTON_LOCATOR;
	@FindBy(xpath ="//input[@id = 'txtsearch']") WebElement SEARCH_BAR_LOCATOR;
	@FindBy(xpath ="//button[@id = 'search']") WebElement SEARCH_BUTTON_LOCATOR;
	@FindBy(xpath = "//A[@id = 't1575']") WebElement ALAPTOP01_FIELD_LOCATOR;
	@FindBy(xpath = "//*[@id=\"sysfrm_ajaxrender\"]/table/tbody/tr[1]/td[2]") WebElement PRICE_FIELD_LOCATOR;
	@FindBy(linkText ="Edit") WebElement EDIT_BUTTON_LOCATOR;
	@FindBy(linkText =" Delete") WebElement DELETE_BUTTON_LOCATOR;

}
