package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.Maven.BaseClass;
import com.pomofpom.PageObjectManager_B;
import com.reader.com.FileReaderManager;
import com.testrunner.com.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static WebDriver driver = AdactinRunner.driver;
	
	PageObjectManager_B pom = new PageObjectManager_B(driver);
	
	
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		
	LaunchUrl(FileReaderManager.getInstanceFR().getInstanceCR().geturl());

	}

//	@When("^user Enters The Username In The InputBox$")
//	public void user_Enters_The_Username_In_The_InputBox() throws Throwable {
//
//	sendvalues(pom.getInstanceLogin().getUsername(), "Sangeetha99");
//	
//	}
//
//	@When("^user Enters The Password In The InputBox$")
//	public void user_Enters_The_Password_In_The_InputBox() throws Throwable {
//
//	sendvalues(pom.getInstanceLogin().getPassword(), "Aura*99");
//	
//	}
	
	@When("^user Enters The Username \"([^\"]*)\" In The InputBox$")
	public void user_Enters_The_Username_In_The_InputBox(String username) throws Throwable {
		
		sendvalues(pom.getInstanceLogin().getUsername(), username);	
	
	}

	@When("^user Enters The Password \"([^\"]*)\" In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox(String password) throws Throwable {
		
		sendvalues(pom.getInstanceLogin().getPassword(), password);
	}

	@Then("^user Clicks The Login Button And It Navigates To The SearchHotelPage$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage() throws Throwable {
		
		clickElement(pom.getInstanceLogin().getLogin());
		
	
	}

	@When("^user Selects The Location In The Dropdown$")
	public void user_Selects_The_Location_In_The_Dropdown() throws Throwable {

		dropdownvisible(pom.getInstanceSearch().getLocation(), "Melbourne");
	}

	@When("^user Select The Hotel In The Dropdown$")
	public void user_Select_The_Hotel_In_The_Dropdown() throws Throwable {
	
		dropdownindex(pom.getInstanceSearch().getHotels(), 2);
	
	}

	@When("^user Select The Room Type In The Dropdown$")
	public void user_Select_The_Room_Type_In_The_Dropdown() throws Throwable {
		
		dropdownvalue(pom.getInstanceSearch().getRoomtype(), "Standard");
	
	}

	@When("^user Select The Number of Rooms In The Dropdown$")
	public void user_Select_The_Number_of_Rooms_In_The_Dropdown() throws Throwable {
	
		dropdownvisible(pom.getInstanceSearch().getNoroom(), "2 - Two");
	
	}

	@When("^user Enter The Check In Date In The InputBox$")
	public void user_Enter_The_Check_In_Date_In_The_InputBox() throws Throwable {
	
		clear1(pom.getInstanceSearch().getCheckin());
		
		sendvalues(pom.getInstanceSearch().getCheckin(), "26/03/2022");
	}

	@When("^user Enter The Check Out Date In The InputBox$")
	public void user_Enter_The_Check_Out_Date_In_The_InputBox() throws Throwable {

		clear1(pom.getInstanceSearch().getCheckout());
		
		sendvalues(pom.getInstanceSearch().getCheckout(), "28/03/2022");
	
	}

	@When("^user Select The Adults Per Room In The Dropdown$")
	public void user_Select_The_Adults_Per_Room_In_The_Dropdown() throws Throwable {
	
	dropdownvisible(pom.getInstanceSearch().getAdults(), "2 - Two");
	
	}

	@When("^user Select The Children Per Room In The Dropdown$")
	public void user_Select_The_Children_Per_Room_In_The_Dropdown() throws Throwable {
		
		dropdownvisible(pom.getInstanceSearch().getChilds(), "1 - One");
	
	}

	@Then("^user Clicks The Search Button And It Navigates To The SelectHotelPage$")
	public void user_Clicks_The_Search_Button_And_It_Navigates_To_The_SelectHotelPage() throws Throwable {
	
		clickElement(pom.getInstanceSearch().getSearch());
	
	}


	@When("^user Select The Hotel Button$")
	public void user_Select_The_Hotel_Button() throws Throwable {

		clickElement(pom.getInstanceSelecth().getSelect());
	}

	@Then("^user Clicks The Continue Button$")
	public void user_Clicks_The_Continue_Button() throws Throwable {

		clickElement(pom.getInstanceSelecth().getContinue1());
	}

	@When("^user Enter The First Name In The InputBox$")
	public void user_Enter_The_First_Name_In_The_InputBox() throws Throwable {

		sendvalues(pom.getInstanceBook().getFirstname(), "Sangeetha");
	}

	@When("^user Enter The Last Name In The InputBox$")
	public void user_Enter_The_Last_Name_In_The_InputBox() throws Throwable {
		
		sendvalues(pom.getInstanceBook().getLastname(), "Mj");
	}

	@When("^user Enter The Billing Address In The InputBox$")
	public void user_Enter_The_Billing_Address_In_The_InputBox() throws Throwable {
		
	sendvalues(pom.getInstanceBook().getAddress(), "Chennai");
	}

	@When("^user Enter The Credit Card No In The InputBox$")
	public void user_Enter_The_Credit_Card_No_In_The_InputBox() throws Throwable {
		
		sendvalues(pom.getInstanceBook().getCcnum(), "2318547291047194");
		}

	@When("^user Select The Credit Card Type In The Dropdown$")
	public void user_Select_The_Credit_Card_Type_In_The_Dropdown() throws Throwable {
	
		dropdownvisible(pom.getInstanceBook().getCctype(), "VISA");
	}

	@When("^user Select The Expiry Date In Select Month$")
	public void user_Select_The_Expiry_Date_In_Select_Month() throws Throwable {
		dropdownvisible(pom.getInstanceBook().getExpmonth(), "June");
	
	}

	@When("^user Select The Expiry Date In Select Year$")
	public void user_Select_The_Expiry_Date_In_Select_Year() throws Throwable {

		dropdownvalue(pom.getInstanceBook().getExpyear(), "2022");
	
	}

	@When("^user Enter The CVV Number In The InputBox$")
	public void user_Enter_The_CVV_Number_In_The_InputBox() throws Throwable {
		sendvalues(pom.getInstanceBook().getCvv(), "241");
	
	}

	@Then("^user Clicks The BookNow Button And It Navigates To Book ConfirmationPage$")
	public void user_Clicks_The_BookNow_Button_And_It_Navigates_To_Book_ConfirmationPage() throws Throwable {
		clickElement(pom.getInstanceBook().getBooknow());
		
	}
		
//	@When("^user Click The My Itinerary Button And It Navigates To Booked Itinerary Page$")
//	public void user_Click_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page() throws Throwable {
//		clickElement(pom.getInstanceConfirm().getItinerary());
//		
//	}
//
//	@When("^user Click The Order Id Button$")
//	public void user_Click_The_Order_Id_Button() throws Throwable {
//
//			clickElement(pom.getInstanceConfirm().getBookit());
//		}
//
//	@Then("^user Click The Logout Button$")
//	public void user_Click_The_Logout_Button() throws Throwable {
//		clickElement(pom.getInstanceConfirm().getLogout());
//	
//		}
	
}
