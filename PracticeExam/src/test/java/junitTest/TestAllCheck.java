package junitTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.TestPage;
import util.BrowserFactory;

public class TestAllCheck {
	WebDriver driver;
	@Before
	public void startUp() {
		driver = BrowserFactory.startBrowser();
	}

	@Test
	public void testAllCheck() {
		//Instantiate TestPage Class
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);
		
		//Call clickToggleAll method
		testPage.clickToggleAll();
		
		//Get List of items to validate
		List<WebElement> items=testPage.validateSelection();
		
		//If Item is available check if selected or enable else print a message
		if(items.size()>0) {
		for(int i=0; i<items.size();i++) {
			Assert.assertTrue(items.get(i).isSelected()||items.get(i).isEnabled());
		}
		}else {
			System.out.println("No element available to select");
		}
	}
}
