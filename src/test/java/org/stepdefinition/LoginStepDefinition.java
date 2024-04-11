package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("user is on abc application")
	public void user_is_on_abc_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	@When("user enter  username and password")
	public void user_enter_username_and_password() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("prakash");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		
	}
	@When("user clicks login button")
	public void user_clicks_login_button() {
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
	}
	@Then("user gets response message")
	public void user_gets_response_message() {
		System.out.println("success");
		
		
	}
}
