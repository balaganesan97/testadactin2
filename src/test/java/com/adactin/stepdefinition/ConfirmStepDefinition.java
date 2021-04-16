package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.poms.Confirm;
import com.adactin.runner.Runner;
import com.framework.baseclass.BaseClass;

import cucumber.api.java.en.*;

public class ConfirmStepDefinition extends BaseClass{
	
public static WebDriver driver=Runner.driver; 	
	PageObjectManager pom=new PageObjectManager(driver);
	
//Confirm cp=new Confirm(driver);
	@Given("^User enters firstname$")
	public void user_enters_firstname() throws Throwable {
	  inputTo(pom.getCp().getFname(), "Bala");  
	}

	@When("^User enters lastname$")
	public void user_enters_lastname() throws Throwable {
	    inputTo(pom.getCp().getLname(), "ganesan");
	}

	@When("^User enters billingaddress$")
	public void user_enters_billingaddress() throws Throwable {
		inputTo(pom.getCp().getAddr(), "221B,bakers street, london");
		
	}

	@When("^User enters ccnumber$")
	public void user_enters_ccnumber() throws Throwable {
	    inputTo(pom.getCp().getCcnum(), "1111222233334444");
	}

	@When("^User enters cc_type$")
	public void user_enters_cc_type() throws Throwable {
dropdown(pom.getCp().getCctype(), "AMEX", "value");
	}

	@When("^User enters cc_expirymonth$")
	public void user_enters_cc_expirymonth() throws Throwable {
	    dropdown(pom.getCp().getCcmonth(),  "1", "value");
	}

	@When("^User enters cc_expiryyear$")
	public void user_enters_cc_expiryyear() throws Throwable {
	    dropdown(pom.getCp().getCcyear(),  "2022", "value");
	}

	@When("^User enters ccv_no$")
	public void user_enters_ccv_no() throws Throwable {
	    inputTo(pom.getCp().getCccvv(), "322");
	}

	@Then("^User selects book_now$")
	public void user_selects_book_now() throws Throwable {
	    clickTo(pom.getCp().getBook()); 
	}
}
