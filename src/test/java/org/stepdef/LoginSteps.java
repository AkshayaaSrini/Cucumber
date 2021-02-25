package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public static WebDriver d;

		@Given("User is on Facebook application Login Page")
		public void user_is_on_Facebook_application_Login_Page() {
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
			d.get("https://www.facebook.com/");
		}

		@When("User enter {string} and {string}")
		public void user_enter_and(String emailId, String password) {
			WebElement email = d.findElement(By.id("email"));
			email.sendKeys(emailId);
			WebElement pass = d.findElement(By.id("pass"));
			pass.sendKeys(password);
		}

		@When("User Click Login button")
		public void user_Click_Login_button() {
			WebElement login = d.findElement(By.id("u_0_b"));
			login.click();
		}

		@Then("User should be in invalid Credentials Page")
		public void user_should_be_in_invalid_Credentials_Page() {
			System.out.println("User unable to Login ");
			d.close();                                                                                                                                                          
		}
}