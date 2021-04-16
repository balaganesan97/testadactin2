package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;


import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.poms.LoginPage;
import com.adactin.runner.Runner;
import com.framework.baseclass.BaseClass;

import cucumber.api.java.en.*;
import junit.framework.Assert;


public class LoginStepDefinition extends BaseClass{

	public static WebDriver driver=Runner.driver;
	
	PageObjectManager pom= new PageObjectManager(driver);

	
	
	@Given("^User launch application$")
	public void user_launch_application() throws Throwable {
	  String url = FileReaderManager.getInstance().getCrInstance().getUrl();
	 Url(url);
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	    inputTo(pom.getLp().getUser(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		   inputTo(pom.getLp().getPass(), arg1);
	}

	@Then("^Use verify valid username and password$")
	public void use_verify_valid_username_and_password() throws Throwable {
	    clickTo(pom.getLp().getLog());
	   // Assert.assertEquals("abc", "ABC");
	}

}
