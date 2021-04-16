package com.adactin.runner;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.adactin.helper.FileReaderManager;
import com.framework.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\adactin.feature",
                  glue="com\\adactin\\stepdefinition",
                  monochrome=true,
                  plugin= {"html:Reports.html","pretty","json:Reports/JsonReport.json","com.cucumber.listener.ExtentCucumberFormatter:ExtentsReports/CucumberRepost.html"})
                  
                  //tags="@login1"
public class Runner {
	public static WebDriver driver;	

	@BeforeClass
	public static void setUp() throws IOException {
	
		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();
		driver=BaseClass.browserLaunch(browserName);
	
//driver=BaseClass.browserLaunch("chrome")
	}
@AfterClass
public static void tearDown() {
		driver.close();
}
}
