package pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {
	WebDriver driver;
	public TestPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Find Toggle all box
	@FindBy(name="allbox") WebElement TOGGLEALL;
	
	//Find the list of the Items
	@FindBy(xpath="//*[contains(@id,'todos-content')]/form/ul") WebElement LISTS;
	
	//Find Remove button
	@FindBy(xpath= "//html/body/div[3]/input[1]") WebElement REMOVE;
	
	//Click Toggle All Box
	public void clickToggleAll() {
		TOGGLEALL.click();
	}
	
	//Return WebElements to validate
	public <WebElements> WebElements validateSelection() {
		List<WebElement> items= LISTS.findElements(By.tagName("li"));
		return (WebElements) items;
	}
	

}
