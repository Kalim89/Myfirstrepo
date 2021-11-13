Feature: Login

Scenario: Successfully login with valid credential
Given User launch the chrome browser
When User navigate to the url "https://admin-demo.nopcommerce.com/login"
And User enter Email as "admin@yourstore.com" and password as "admin" 
And User click on login button
Then User navigate to new page with page title "Dashboard / nopCommerce administration"
When  User click on logout link
Then User navigate to login page with page tilte "Your store. login"
And Close the browser


Scenario Outline: Successfully login with valid credential
Given User launch the chrome browser
When User navigate to the url "https://admin-demo.nopcommerce.com/login"
And User enter Email as "<email>" and password as "<password>" 
And User click on login button
Then User navigate to new page with page title "Dashboard / nopCommerce administration"
When  User click on logout link
Then User navigate to login page with page tilte "Your store. login"
And Close the browser


Examples:
| email | password |
| admin@yourstore.com | admin |
| admin@yours.com | admin |