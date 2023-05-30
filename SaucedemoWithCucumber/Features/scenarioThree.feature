Feature: LastName error verification

Scenario: user should be able to verify last name required message
Given user is already in landing page of saucedemo
When enter the username "problem_user"
And enter the password "secret_sauce"
And Click on login button
And add first product on cart
And click on cart icon
And click on checkout button
And enter first name
And enter last name
And enter postal code
And click continue button
And verify error message "Error: Last Name is required"
Then close the browser