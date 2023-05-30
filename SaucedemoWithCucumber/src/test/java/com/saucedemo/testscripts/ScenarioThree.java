package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioThree extends Driver{
	
	@Given("user is already in landing page of saucedemo")
	public void user_is_already_in_landing_page_of_saucedemo() {
	   
	}

	@When("enter the username - {string}")
	public void enter_the_username(String string) {
	    landingPage.enterUsername(string);
	}

	@When("enter the password - {string}")
	public void enter_the_password(String string) {
	    landingPage.enterPassword(string);
	}

	@When("Click on login button")
	public void click_on_login_button() {
	   landingPage.clickLogin();
	}

	@When("add first product on cart")
	public void add_first_product_on_cart() {
	   productList.addFirstItem();
	}

	@When("click continue button")
	public void click_continue_button() {
	   checkoutDetails.clickContinue();
	}

	@When("verify error message {string}")
	public void verify_error_message(String string) {
	    String expectedMsg = string;
	    String actualMsg = checkoutDetails.getErrTxt();
	    Assert.assertEquals(actualMsg, expectedMsg);
	}

}
