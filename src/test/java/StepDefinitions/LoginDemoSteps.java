package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	WebDriver driver = null;

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
		System.out.println("Inside Step - user enters a text in search box");

		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		Thread.sleep(2000);
	}
	
	@And("user clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("user is redirected to the home page")
	public void user_is_redirected_to_the_home_page() {
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
