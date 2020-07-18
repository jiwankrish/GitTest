package junitTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.TestPage;
import util.BrowserFactory;

public class TestRemoveAllItems {
	WebDriver driver;

	@Before
	public void startUp() {
		driver = BrowserFactory.startBrowser();
	}

	@Test
	public void testSingelItemRemoval() {
		// Instantiate TestPage Class
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);

		// Select all Items by clicking toggle all. Call clickToggleAll method
		testPage.clickToggleAll();

		// call clickRemove method. This method will click remove button
		testPage.clickRemove();

		// Validating if all items are deleted
		// Assert.assertFalse(testPage.validateToDoContent().isDisplayed());
	}

}
