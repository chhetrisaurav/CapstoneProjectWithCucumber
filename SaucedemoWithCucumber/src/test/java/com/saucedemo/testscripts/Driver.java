package com.saucedemo.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.CheckOutDetails;
import com.saucedemo.pages.CheckoutComplete;
import com.saucedemo.pages.CheckoutOverview;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.ProductList;
import com.saucedemo.pages.ShoppingCart;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static ProductList productList;
	protected static ShoppingCart shoppingCart;
	protected static CheckOutDetails checkoutDetails;
	protected static CheckoutOverview checkoutOverview;
	protected static CheckoutComplete checkoutComplete;
	

	public static void init() {
		
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
		  landingPage = new LandingPage(driver);
		  productList = new ProductList(driver);
		  shoppingCart = new ShoppingCart(driver);
		  checkoutDetails = new CheckOutDetails(driver);
		  checkoutOverview = new CheckoutOverview(driver);
		  checkoutComplete = new CheckoutComplete(driver);
				    
	}

}
