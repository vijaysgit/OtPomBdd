@AmazonLogin
Feature: Amazon Login
	As a registered user
	User want to login to the website
	In order to purchase items
	
Background: User in the main page
 Given selected browser
 When enter the url
 Then main page is displayed 
	
	
	@MainPage
	Scenario: User visit the main page 
    	Given the main page without login
    	Then generic username available 
    	
    @Login
    Scenario: User login to the account
    	Given the main page
    	When click on sign in 
    	Then email login page displayed
   		When fill the email with "vikosh.ramana@gmail.com" 
    	And click on continue button
    	Then password login page displayed
    	When fill the password with "vijay11amazon"
    	And clik on submit button
    	Then user home page displayed
    	And username is available
    	
    	
     
    	
    	
