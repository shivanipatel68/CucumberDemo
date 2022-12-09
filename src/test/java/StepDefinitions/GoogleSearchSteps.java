package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver = null;

	@Given("browser window is open")
	public void browser_window_is_open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		// driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - user is on goolge search page");

		//driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside Step - user enters a text in search box");

		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

		//Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside Step - hits enter");

		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - user is navigated to search results");

		//driver.getPageSource().contains("Online Courses");

		/*
		 * driver.close(); driver.quit();
		 */
	}
}
