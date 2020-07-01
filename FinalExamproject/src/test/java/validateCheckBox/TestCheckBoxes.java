package validateCheckBox;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.TestPage;
import util.BrowserFactory;

public class TestCheckBoxes {
	// Test 1: Validate when the toggle all check box is CHECKED, all check boxes
	// for list items are also CHECKED ON.
	WebDriver driver;

	@Before
	public void startUp() {
		driver = BrowserFactory.openBrowser();
	}

	@Test
	public void toggleTest() {
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);
		testPage.clickToggleAll();
		Assert.assertTrue(testPage.item1Selected());
		Assert.assertTrue(testPage.item2Selected());
		Assert.assertTrue(testPage.item3Selected());
		Assert.assertTrue(testPage.item4Selected());
		Assert.assertTrue(testPage.item5Selected());
		Assert.assertTrue(testPage.item6Selected());
		Assert.assertTrue(testPage.item7Selected());
	}

}
