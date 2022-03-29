package com.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelBooking_R extends HotelBooking_B{
	
	public static void main(String[] args) {
		
		
		browserlaunch("browser");
		
		launchurl("https://adactinhotelapp.com/index.php");
		
		WebElement user = driver.findElement(By.name("username"));
		sendkey(user, "Sangeetha17");
		
		WebElement password = driver.findElement(By.id("password"));
		sendkey(password, "Soul*99");
		
		WebElement login = driver.findElement(By.name("login"));
		clickButton(login);
		
		WebElement location = driver.findElement(By.name("location"));
		dropdownvisible(location, "Melbourne");
				
		WebElement hotel = driver.findElement(By.name("hotels"));
		dropdownvisible(hotel, "Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		dropdownvalue(roomtype, "Double");
		
		WebElement norooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		dropdownindex(norooms, 2);
		
		WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		clear1(checkin);
		sendkey(checkin, "07/03/2022");
		
		WebElement checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		clear1(checkout);
		sendkey(checkout, "08/03/2022");
		
		WebElement adultspr = driver.findElement(By.xpath("(//select[@name='adult_room'])"));
		dropdownindex(adultspr, 2);
		
		WebElement childspr = driver.findElement(By.xpath("(//select[@name='child_room'])"));
		dropdownvalue(childspr, "2");
		
		WebElement search = driver.findElement(By.name("Submit"));
		clickButton(search);
		
		WebElement radiobtn = driver.findElement(By.xpath("(//input[@name='radiobutton_0'])"));
		clickButton(radiobtn);
		
		WebElement cont = driver.findElement(By.name("continue"));
	    clickButton(cont);
	    
	    WebElement fname = driver.findElement(By.xpath("(//input[@name='first_name'])"));
	    sendkey(fname, "Sangeetha");
	    
	    WebElement lname = driver.findElement(By.xpath("(//input[@name='last_name'])"));
	    sendkey(lname, "Mj");
	    
	    WebElement address = driver.findElement(By.name("address"));
	    sendkey(address, "Chennai");
	    
	    WebElement ccnum = driver.findElement(By.xpath("(//input[@name='cc_num'])"));
		sendkey(ccnum, "2281311442314242");
		
		WebElement cardtype = driver.findElement(By.xpath("(//select[@name='cc_type'])"));
	    dropdownindex(cardtype, 2);
	    
	    WebElement expmonth = driver.findElement(By.xpath("(//select[@name='cc_exp_month'])"));
	    dropdownvisible(expmonth, "April");
	    
	    WebElement expyear = driver.findElement(By.xpath("(//select[@name='cc_exp_year'])"));
	    dropdownindex(expyear, 4);
	    
	    WebElement cvvnum = driver.findElement(By.xpath("(//input[@name='cc_cvv'])"));
	    sendkey(cvvnum, "421");
	    
	    WebElement booknow = driver.findElement(By.xpath("(//input[@name='book_now'])"));
	    clickButton(booknow);
	    
	    WebElement itinerary = driver.findElement(By.xpath("(//input[@name='my_itinerary'])"));
	    clickButton(itinerary);
	    
	    WebElement bookedite = driver.findElement(By.xpath("((//input[@type='checkbox']))[5]"));
	    clickButton(bookedite);
	    
	    WebElement logout = driver.findElement(By.name("logout"));
	    clickButton(logout);
	    
	}

		
	}	
	


