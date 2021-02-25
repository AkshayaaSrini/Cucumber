package org.stepdefli;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsli {

	public static WebDriver d;

	@Given("User is on Facebook application Login Page")
	public void user_is_on_Facebook_application_Login_Page() {

	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String string, String string2) {

	}

	@When("User Click Login button")
	public void user_Click_Login_button() {

	}

	@Then("User should be in invalid Credentials Page")
	public void user_should_be_in_invalid_Credentials_Page() {

	}

	@Given("User has to launch chrome and hit the FB url")
	public void user_has_to_launch_chrome_and_hit_the_FB_url() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");

	}

	@When("User has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> li = dataTable.asLists();
		d.findElement(By.id("email")).sendKeys(li.get(0).get(1));
		d.findElement(By.id("pass")).sendKeys(li.get(1).get(2));
		
		// List<String> li = dataTable.asList();
		// d.findElement(By.id("email")).sendKeys(li.get(0));;
		// d.findElement(By.id("pass")).sendKeys(li.get(1));;

	}

	@When("Click the login button")
	public void click_the_login_button() {
		WebElement login = d.findElement(By.id("u_0_b"));
		login.click();
	}

	@Then("User unable to enter the home page")
	public void user_unable_to_enter_the_home_page() {

	}

}
