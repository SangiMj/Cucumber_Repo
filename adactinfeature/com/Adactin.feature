Feature: Hotel_Room Booking Adactin Application

#@smoketest
#Scenario: Login_Functionality
#Given user Launch The Adactin Application
#When user Enters The Username In The InputBox
#And user Enters The Password In The InputBox
#Then user Clicks The Login Button And It Navigates To The SearchHotelPage

@smoketest
Scenario Outline: Login_Functionality
Given user Launch The Adactin Application
When user Enters The Username "<Username>" In The InputBox
And user Enters The Password "<Password>" In The InputBox
Then user Clicks The Login Button And It Navigates To The SearchHotelPage

#To give multiple values
#Scenario Outline: Login_Functionality
#Examples:  


Examples:

	|Username|Password|
	|sangeetha|3116|
	|sangi|4242|
	|Sangeetha99|Aura*99|

Scenario: Search Hotel_Functionality
When user Selects The Location In The Dropdown
And user Select The Hotel In The Dropdown
And user Select The Room Type In The Dropdown
And user Select The Number of Rooms In The Dropdown
And user Enter The Check In Date In The InputBox
And user Enter The Check Out Date In The InputBox
And user Select The Adults Per Room In The Dropdown
And user Select The Children Per Room In The Dropdown
Then user Clicks The Search Button And It Navigates To The SelectHotelPage

Scenario: Select Hotel_Functionality
When user Select The Hotel Button
Then user Clicks The Continue Button

Scenario: BookHotel_Functionality
When user Enter The First Name In The InputBox
And user Enter The Last Name In The InputBox
And user Enter The Billing Address In The InputBox
And user Enter The Credit Card No In The InputBox
And user Select The Credit Card Type In The Dropdown
And user Select The Expiry Date In Select Month
And user Select The Expiry Date In Select Year
And user Enter The CVV Number In The InputBox
Then user Clicks The BookNow Button And It Navigates To Book ConfirmationPage




