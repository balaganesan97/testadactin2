package com.adactin.stepdefinition;


import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.poms.Booking;
import com.adactin.runner.Runner;
import com.framework.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class BookingStepDefinition extends BaseClass{

public static WebDriver driver=Runner.driver;
	
	//Booking  bp=new Booking(driver);
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^User select radio_button$")
	public void user_select_radio_button() throws Throwable {
	    clickTo(pom.getBp().getRad_btn());
	}

	@Then("^User select Continue_button$")
	public void user_select_Continue_button() throws Throwable {
	    clickTo(pom.getBp().getCon_btn());
	}


}
