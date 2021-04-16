package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.poms.Logsout;
import com.adactin.runner.Runner;
import com.framework.baseclass.BaseClass;

import cucumber.api.java.en.Given;

public class LogoutStepDefinition extends BaseClass{
	public static WebDriver driver=Runner.driver;
	
	PageObjectManager pom=new PageObjectManager(driver);
	
	//Logsout lo=new Logsout(driver);
	
	@Given("^User select logout$")
	public void user_select_logout() throws Throwable {
	 clickTo(pom.getLo().getLogout());   
	}

}
