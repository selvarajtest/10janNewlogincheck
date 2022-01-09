package org.stepdefinitions;

import java.io.IOException;

import org.Utiltiles.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksClass extends BaseClass{

	@Before
	public void beforeScenario() {
		chromeLauch();
		loadUrl("https://www.walgreens.com/");
		winMax();
		System.out.println("Before Test scenario - executed ");
	}
	
	 
	@After
	public void afterScenario(Scenario s) throws IOException {
		System.out.println("After scenario");
		String name = s.getName();
		String scenarioName = name.replace(" ", "_");
		screenShots(scenarioName);
		
	}
	
}
