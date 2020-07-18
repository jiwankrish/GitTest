package junitTest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.TestPage;
import util.BrowserFactory;

public class TestRemoveSingleItem {
	WebDriver driver;

	@Before
	public void startUp() {
		driver = BrowserFactory.startBrowser();
	}

	@Test
	public void testSingelItemRemoval() {
		// Instantiate TestPage Class
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);

		// Call clickToggleAll method
		testPage.clickToggleAll();

		// Get List of check-boxes
		List<WebElement> checkBoxes = testPage.validateSelection();

		// Get List of items
		List<WebElement> items = testPage.listofItems();

		// Provide the index of item to delete. Index must not be out of bound
		int itemToDelete = 0;

		// Deleting item and validating if deleted
		if (checkBoxes.size() > 0) {
			String itemTest = items.get(itemToDelete).getText();
			checkBoxes.get(itemToDelete).click();
			testPage.clickRemove();
			Assert.assertNotEquals(items.get(itemToDelete).getText(), itemTest);
		} else {
			System.out.println("No element available to select");
		}
	}

}
