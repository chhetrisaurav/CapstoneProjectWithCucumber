package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.When;

public class ScenarioTwo extends Driver{
	
	@When("enter the username {string}")
	public void enter_the_username(String string) {
	    landingPage.enterUsername(string);
	}

	@When("enter the password {string}")
	public void enter_the_password(String string) {
	  landingPage.enterPassword(string);
	}

	@When("verify the error message - {string}")
	public void verify_the_error_message(String string) {
	   String expectedMsg = string;
	   String actualMsg = landingPage.viewErrMsg();
	   
	   Assert.assertEquals(actualMsg, expectedMsg);
	}

}
