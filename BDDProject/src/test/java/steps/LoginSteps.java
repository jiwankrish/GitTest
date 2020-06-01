package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	// DashBoardPage dashBoardPage;
	@Given("The user is on Login Page")
	public void the_user_is_on_Login_Page() {
		driver = BrowserFactory.launchBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String userName, String password) {
		loginPage.enterUser(userName);
		loginPage.enterPassword(password);
	}

	@When("The user click enter")
	public void the_user_click_enter() {
		loginPage.clikSignin();
	}

	@Then("Displays Dashboard Page")
	public void displays_Dashboard_Page() {
		dashboardPage.validateDashBoard();
		try {
			BaseTest.screenShot(driver, "screenshots/dashboard.jpg");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
