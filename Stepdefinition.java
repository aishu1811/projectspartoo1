package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Utilityclass {
	@Given("user have to open the spartoo webpage")
	public void user_have_to_open_the_spartoo_webpage() throws InterruptedException {
		launchbrowser();
		launchurl("https://www.spartoo.eu/");
		Thread.sleep(3000);
		maximizewindow();

	}

	@When("user have to search shoes for women")
	public void user_have_to_search_shoes_for_women() throws AWTException, InterruptedException {
		WebElement search = driver.findElement(By.id("keywords_field"));
		search.sendKeys("shoes for women");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"homeContent\"]/div[1]/div[1]/a/picture/img")).click();
		Thread.sleep(2000);

	}

	@When("user can see maultiple pictures of shoes")
	public void user_can_see_maultiple_pictures_of_shoes() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Then("user can quit the window")
	public void user_can_quit_the_window() {
		driver.quit();
		System.out.println("scenario 1 got completed");

	}

	@Given("user have to open spartoo webpage")
	public void user_have_to_open_spartoo_webpage() throws InterruptedException {
		launchbrowser();
		launchurl("https://www.spartoo.eu/");
		maximizewindow();
		Thread.sleep(2000);
	}

	@When("user have to click my account")
	public void user_have_to_click_my_account() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div[1]/a")).click();
	}

	@When("user have to provide all the details for account creation and click continue")
	public void user_have_to_provide_all_the_details_for_account_creation_and_click_continue() {
		driver.findElement(By.xpath("//*[@id=\"button_continue2\"]")).click();
		WebElement email = driver.findElement(By.xpath("//*[@id=\"emailSecureLogin\"]"));
		email.sendKeys("aish.v1811@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password1SecureLogin\"]"));
		password.sendKeys("aishu@12345");
		WebElement confirmpass = driver.findElement(By.xpath("//*[@id=\"password2SecureLogin\"]"));
		confirmpass.sendKeys("aishu@12345");
		WebElement surname = driver.findElement(By.xpath("//*[@id=\"lastnameSecureLogin\"]"));
		surname.sendKeys("venkat");
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstnameSecureLogin\"]"));
		firstname.sendKeys("aishwarya");
		WebElement day = driver.findElement(By.xpath("//*[@id=\"daySecureLogin\"]"));
		day.click();

	}

	@Then("user will be in a new page")
	public void user_will_be_in_a_new_page() {
		driver.quit();
		System.out.println("scenario2 completed");
	}

}
