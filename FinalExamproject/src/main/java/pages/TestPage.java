package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {
	WebDriver driver;

	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "allbox")
	WebElement TOGGLEALL;
	@FindBy(xpath = "//*[@id='todos-content']/form/ul/li[1]")
	WebElement ITEM1;
	@FindBy(xpath = "//*[@id='todos-content']/form/ul/li[2]")
	WebElement ITEM2;
	@FindBy(xpath = "//*[@id='todos-content']/form/ul/li[3]")
	WebElement ITEM3;
	@FindBy(xpath = "//*[@id='todos-content']/form/ul/li[4]")
	WebElement ITEM4;
	@FindBy(xpath = "//*[@id='todos-content']/form/ul/li[5]")
	WebElement ITEM5;
	@FindBy(xpath = "//*[@id='todos-content']/form/ul/li[6]")
	WebElement ITEM6;
	@FindBy(xpath = "//*[@id='todos-content']/form/ul/li[7]")
	WebElement ITEM7;

	// For Second question
	@FindBy(xpath = "//html/body/div[3]/input[1]")
	WebElement REMOVE;

	public void clickToggleAll() {
		TOGGLEALL.click();
	}

	public boolean item1Selected() {
		return ITEM1.isEnabled() || ITEM1.isSelected();
	}

	public boolean item2Selected() {
		return ITEM2.isEnabled() || ITEM2.isSelected();
	}

	public boolean item3Selected() {
		return ITEM3.isEnabled() || ITEM3.isSelected();
	}

	public boolean item4Selected() {
		return ITEM4.isEnabled() || ITEM4.isSelected();
	}

	public boolean item5Selected() {
		return ITEM5.isEnabled() || ITEM5.isSelected();
	}

	public boolean item6Selected() {
		return ITEM6.isEnabled() || ITEM6.isSelected();
	}

	public boolean item7Selected() {
		return ITEM7.isEnabled() || ITEM7.isSelected();
	}

	// For JUnit Second Question
	public String getTextItem1() {
		return ITEM1.getText();
	}

	public void clickItem1() {
		ITEM1.click();
	}

	public void clickRemove() {
		REMOVE.click();
	}

}
