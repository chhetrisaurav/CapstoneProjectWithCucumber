package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioFive extends Driver{
	
	@Given("user is already on landing page saucedemo")
	public void user_is_already_on_landing_page_saucedemo() {
	  
	}

	@When("add first item on cart")
	public void add_first_item_on_cart() {
	   productList.addFirstItem();
	}

	@When("add third item on cart")
	public void add_third_item_on_cart() {
	   productList.addThirdItem();
	}

	@When("remove first item from cart")
	public void remove_first_item_from_cart() {
	   productList.removeFirstProduct();
	}

	@When("verify {string} is displayed at the top")
	public void verify_is_displayed_at_the_top(String string) {
	   String expectedText = string;
	   String actualText = shoppingCart.getYourCartText();
	   Assert.assertEquals(actualText, expectedText);
	}

	@When("click on {string} button")
	public void click_on_button(String string) {
	   shoppingCart.clickContinueShoppingBtn();
	}

	@When("sort the prices from high to low")
	public void sort_the_prices_from_high_to_low() {
	   productList.clickFilter();
	   productList.selectHitoLow();
	}

	@When("add most expensive item on cart")
	public void add_most_expensive_item_on_cart() {
	   productList.addHighPriceItem();
	}

	@When("verify there are {string} items on cart")
	public void verify_there_are_items_on_cart(String string) {
	    String expectedNumOfItems = string;
	    String actualNumOfItems = shoppingCart.numberOfItemsInCart();
	    
	    Assert.assertEquals(actualNumOfItems, expectedNumOfItems);
	}

	@When("click on checkout")
	public void click_on_checkout() {
	   shoppingCart.clickCheckout();
	}


}
