package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfilePage {
	WebDriver driver;

	public EditProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//div[@id=\"sysfrm_ajaxrender\"]/form/div[1]/label")
	WebElement MYACCOUNT;
	@FindBy(xpath = "//div[@id=\"sysfrm_ajaxrender\"]/form/div[2]/label")
	WebElement EDITPROFILE;
	@FindBy(id = "Upload Picture")
	WebElement UPLOAD_PICTURE;
	@FindBy(id = "Use Gravatar")
	WebElement USE_GRAVATAR;
	@FindBy(id = "No Image")
	WebElement NO_IMAGE;
	@FindBy(id = "picture")
	WebElement PICTURE;
	@FindBy(id = "password")
	WebElement PASSWORD;
	@FindBy(id = "cpassword")
	WebElement CPASSWORD;
	@FindBy(id = "submit")
	WebElement SUBMIT;
	@FindBy(xpath = "//div[@id=\"sysfrm_ajaxrender\"]/form/a")
	WebElement CANCLE;

}
