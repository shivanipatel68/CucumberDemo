package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver driver;

	@FindBy(id = "name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;

	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		boolean title = driver.getTitle().equals("TestProject Demo");

		if (!title) {
			throw new IllegalStateException("This is not Login Page. The current page is : " + driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLogin() {
		btn_login.click();
	}

	public void loginValidUsers(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}
}
