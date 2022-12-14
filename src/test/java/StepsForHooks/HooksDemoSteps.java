package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	WebDriver driver= null;

	@Before(value="@smoke", order=1)
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User Login Page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_uname_and_password() {
		System.out.println("user enters valid username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the home page");
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("user is beforeSteps");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("user is afterSteps");
	}
}
