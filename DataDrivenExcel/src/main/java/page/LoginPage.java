package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

//	WebDriver driver;
//	
//	public LoginPage(WebDriver driver) {
//		this.driver= driver;
//	}
	
	@FindBy(how=How.XPATH, using= "//input[@id='username']") WebElement USERNAME;
	@FindBy(how = How.XPATH, using= "//input[@id='password']") WebElement PASSWORD;
	@FindBy(how= How.NAME, using = "login") WebElement SIGNIN;
	
	public void enterUser(String userName) {
		USERNAME.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD.sendKeys(password);
	}
	
	public void clikSignin() {
		SIGNIN.click();
	}
}
