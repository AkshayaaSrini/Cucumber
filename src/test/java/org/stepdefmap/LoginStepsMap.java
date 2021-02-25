package org.stepdefmap;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsMap {
	
	public static WebDriver d;

	@Given("User has to launch chrome and hit the FB url")
	public void user_has_to_launch_chrome_and_hit_the_FB_url() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");
	}

	@When("User has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable d1) {
		List<Map<String, String>> mp = d1.asMaps();
		d.findElement(By.id("email")).sendKeys(mp.get(0).get("username"));
		d.findElement(By.id("pass")).sendKeys(mp.get(0).get("password"));
		
	    
	}

     	public void user_unable_to_enter_the_home_page() {
     		d.close();
	    
	}
}