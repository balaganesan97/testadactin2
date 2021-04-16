package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.framework.baseclass.BaseClass;

import cucumber.api.java.en.*;

public class SearchStepDefinition extends BaseClass {
	public static WebDriver driver=Runner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	
	
	@Given("^User enter location$")
	public void user_enter_location() throws Throwable {
		dropdown(pom.getSp().getCity(), "London", "value");
}

	@When("^User enter hotel$")
	public void user_enter_hotel() throws Throwable {
		dropdown(pom.getSp().getHotels(), "Hotel Sunshine", "value");
		}

	@When("^User enter room_type$")
	public void user_enter_room_type() throws Throwable {
		dropdown(pom.getSp().getRoom(), "Standard", "value");
	}

	@When("^User enter room_nos$")
	public void user_enter_room_nos() throws Throwable {
		   dropdown(pom.getSp().getRoom_nos(), "1", "value");   
	}

	@When("^User enter date_in$")
	public void user_enter_date_in() throws Throwable {
		 inputTo(pom.getSp().getDatein(), "29/03/2021");

	}

	@When("^User enter date_out$")
	public void user_enter_date_out() throws Throwable {
		inputTo(pom.getSp().getDateout(), "30/03/2021");
		
		
			        
	}

	@When("^User enter adult$")
	public void user_enter_adult() throws Throwable {
		dropdown(pom.getSp().getAdult(), "1", "value");
	}

	@When("^User enter children$")
	public void user_enter_children() throws Throwable {
		dropdown(pom.getSp().getChild(), "0", "value");
	}

	@Then("^User enter submit$")
	public void user_enter_submit() throws Throwable {
		clickTo(pom.getSp().getOk());
	}


}
