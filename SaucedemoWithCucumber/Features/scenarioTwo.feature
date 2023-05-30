Feature: verify locked out message

Scenario: User should be able to verify locked out message

Given: user is on the landingpage of saucedemo
When enter the username "locked_out_user"
And enter the password "secret_sauce"
And click on login button
And verify the error message - "Epic sadface: Sorry, this user has been locked out."
Then close the browser