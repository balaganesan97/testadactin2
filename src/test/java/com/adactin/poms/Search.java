package com.adactin.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement city;

	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	


	public void setRoom_nos(WebElement room_nos) {
		this.room_nos = room_nos;
	}

	@FindBy(id="datepick_in")
	private WebElement datein;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement ok;
	
	public Search(WebDriver sdriver) {
		this.driver=sdriver;
		PageFactory.initElements(driver, this);
			}
	

	public WebElement getCity() {
		return city;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	
	public WebElement getRoom() {
		return room;
	}
	
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getOk() {
		return ok;
	}	
	
}
