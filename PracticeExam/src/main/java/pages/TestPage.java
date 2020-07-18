package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {
	WebDriver driver;

	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	// Find Toggle all box
	@FindBy(name = "allbox")
	WebElement TOGGLEALL;

	// Find the list of the Items
	@FindBy(xpath = "//*[contains(@id,'todos-content')]/form/ul")
	WebElement TODO_CONTENT;

	// Find Remove button
	@FindBy(xpath = "//html/body/div[3]/input[1]")
	WebElement REMOVE;

	// Click Toggle All Box
	public void clickToggleAll() {
		TOGGLEALL.click();
	}

	// Return the list of TODO items check-boxes
	public <WebElements> WebElements validateSelection() {
		List<WebElement> checkBoxesList = TODO_CONTENT.findElements(By.tagName("input"));
		return (WebElements) checkBoxesList;
	}

	// Return the list of actual items
	public <WebElements> WebElements listofItems() {
		List<WebElement> itemLists = TODO_CONTENT.findElements(By.tagName("li"));
		return (WebElements) itemLists;
	}

	public WebElement validateToDoContent() {
		return TODO_CONTENT;
	}

	// Click Remove button
	public void clickRemove() {
		REMOVE.click();
	}

}
