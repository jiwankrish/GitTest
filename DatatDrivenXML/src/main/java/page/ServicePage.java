package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicePage {
WebDriver driver;
	
	public ServicePage (WebDriver driver) {
		this.driver= driver;
		
	}
		@FindBy(xpath = "//a[contains(text(),' Add Service')]")WebElement ADD_SERVICE_BUTTON_LOCATOR;
		@FindBy(xpath ="//input[@id = 'txtsearch']") WebElement SEARCH_BAR_LOCATOR;
		@FindBy(xpath ="//button[@id = 'search']") WebElement SEARCH_BUTTON_LOCATOR;
		@FindBy(xpath = "//*[@id=\"t1755\"]") WebElement SERVICE_FEILD_LOCATOR;
		@FindBy(xpath = "//*[@id=\"sysfrm_ajaxrender\"]/table/tbody/tr[1]/td[2]") WebElement SERVICE1_FEILD_LOCATOR;
		@FindBy(linkText ="Edit") WebElement EDIT_BUTTON_LOCATOR;
		@FindBy(linkText =" Delete") WebElement DELETE_BUTTON_LOCATOR;
	

}
