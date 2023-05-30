package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOne extends Driver{
	
	@Given("A user is already on landing page of saucedemo.com")
	public void a_user_is_already_on_landing_page_of_saucedemo_com() {
	    
	}

	@When("enter username {string} in textbox")
	public void enter_username_in_textbox(String string) {
	   landingPage.enterUsername(string);
	}

	@When("enter password {string}")
	public void enter_password(String string) {
	   landingPage.enterPassword(string);
	}

	@When("click on login button")
	public void click_on_login_button() {
	  landingPage.clickLogin();
	}
	@When("add the first two products to the cart")
	public void add_the_first_two_products_to_the_cart() {
	   productList.addFirstItem();
	   productList.addSecItem();
	}

	@When("click on cart icon")
	public void click_on_cart_icon() {
	   productList.clickShoppingCart();
	}

	@When("click on checkout button")
	public void click_on_checkout_button() {
	   shoppingCart.clickCheckout();
	}

	@When("enter first name")
	public void enter_first_name() {
	   checkoutDetails.enterFirstname("Sam");
	}

	@When("enter last name")
	public void enter_last_name() {
	    checkoutDetails.enterLastname("Jackson");
	}

	@When("enter postal code")
	public void enter_postal_code() {
	    checkoutDetails.enterPostalCode("34567");
	}

	@When("click on continue button")
	public void click_on_continue_button() {
	  checkoutDetails.clickContinue();
	}

	@When("click on finish button")
	public void click_on_finish_button() {
	    checkoutOverview.clickFinishBtn();
	}

	@When("verify the success message {string}")
	public void verify_the_success_message(String string) {
	    String expectedMsg = string;
	    String actualMsg = checkoutComplete.getSuccessMsg();
	    
	    Assert.assertEquals(actualMsg, expectedMsg);
	}

	@Then("close the browser")
	public void close_the_browser() {
	   
	}

}
