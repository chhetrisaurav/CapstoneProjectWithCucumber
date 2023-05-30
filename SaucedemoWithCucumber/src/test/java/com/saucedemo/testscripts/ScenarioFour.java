package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioFour extends Driver{
	
	@Given("user is already on landing page of saucedemo")
	public void user_is_already_on_landing_page_of_saucedemo() {
	   
	}

	@When("enter username {string}")
	public void enter_username(String string) {
	    landingPage.enterUsername(string);
	}

	@When("sort items based on price low to high")
	public void sort_items_based_on_price_low_to_high() {
	   productList.clickFilter();
	   productList.selectPriceLotoHi();
	}

	@When("ad first item on cart")
	public void ad_first_item_on_cart() {
	   productList.itemWithLowPrice();
	}

	@When("verify the same item which you selected is in the cart")
	public void verify_the_same_item_which_you_selected_is_in_the_cart() {
	   String expectedItemDetail = productList.getItemDetail();
	   String actualItemDetail = shoppingCart.getCartItemDetail();
	  
	   Assert.assertEquals(expectedItemDetail, actualItemDetail);
	}
	
	@When("click checkout button")
	public void click_checkout_button() {
		productList.clickShoppingCart();
	   shoppingCart.clickCheckout();
	}

	@When("verify the message {string}")
	public void verify_the_message(String string) {
	   String expectedMsg = string;
		String actualMsg = checkoutComplete.getThankYouMsg();
		
		Assert.assertEquals(actualMsg, expectedMsg);
	}

}
