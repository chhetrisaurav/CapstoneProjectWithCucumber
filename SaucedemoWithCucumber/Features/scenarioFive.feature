Feature: remove the product from cart and verify success message

Scenario: user should be able to remove product from cart and buy items
Given user is already on landing page saucedemo
When enter username "standard_user"
And enter password "secret_sauce"
And click on login button
And add first item on cart
And add third item on cart
And remove first item from cart
And click on cart icon
And verify "Your Cart" is displayed at the top
And click on 'continue shopping' button
And sort the prices from high to low
And add most expensive item on cart
And click on cart icon
And verify there are "2" items on cart
And click on checkout
And enter first name
And enter last name
And enter postal code
And click on continue button
And click on finish button
And verify the message "Thank you for your order!"
Then close the browser