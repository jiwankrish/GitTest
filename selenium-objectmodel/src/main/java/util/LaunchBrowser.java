package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	static WebDriver driver;
	public static WebDriver launchBrowser() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		return driver;		
	}
}
