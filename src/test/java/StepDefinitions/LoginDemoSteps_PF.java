package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
	}

	@And("user is on Login Page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user inputs valid (.*) and (.*)$")
	public void user_inputs_valid_username_and_password(String username, String password) throws InterruptedException {
		
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);

		Thread.sleep(2000);
	}

	@And("user clicks on login button")
	public void clicks_on_login_button() {
		login.clickLogin();
	}

	@Then("user is redirected to the home page")
	public void user_is_redirected_to_the_home_page() {
		home = new HomePage_PF(driver);
		home.checkLogoutIsDisplayed();
		driver.close();
		driver.quit();
	}

}
