package com.adactin.stepdefinition;

import java.io.IOException;

import com.framework.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	
	@Before
	private void beforeHooks(Scenario scenario) {
		String status = scenario.getName();
		System.out.println(status);
	}
	
	@After
	private void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println(status);
		if (scenario.isFailed()) {
getScreenshot("FailedScenario");
			
		}

	}
	
	
	
}
