Feature: verify success message

Scenario: user should be able to verify item and success message
Given user is already on landing page of saucedemo
When enter username "standard_user"
And enter password "secret_sauce"
And click on login button
And sort items based on price low to high
And ad first item on cart
And verify the same item which you selected is in the cart
And click checkout button
And enter first name
And enter last name
And enter postal code
And click on continue button
And click on finish button
And verify the message "Thank you for your order!"
Then close the browser