Feature: Buy items on saucedemo

Scenario: A user should be able to buy items on saucedemo successfully

Given A user is already on landing page of saucedemo.com
When enter username "standard_user" in textbox
And enter password "secret_sauce"
And click on login button
And add the first two products to the cart
And click on cart icon
And click on checkout button
And enter first name
And enter last name
And enter postal code
And click on continue button
And click on finish button
And verify the success message "Your order has been dispatched, and will arrive just as fast as the pony can get there!"
Then close the browser
