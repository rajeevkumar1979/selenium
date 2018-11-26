package com.github.rk.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestHooks {
	// There are only two type of hooks Before and After

	@Before
	public void beforeScenario() {
		System.out.println("Before Scenarios");
	}

	@After
	public void afterScenarios() {
		System.out.println("After Sceanrios");
	}

	@Before("@Smoketest")
	public void beforeFirst() {
		System.out.println("This will run only before the scenario where tag is applied");
	}

	//In before start in increment ways 0,1,2
	@Before(order = 1)
	public void beforeScenario1() {
		System.out.println("Start the browser and Clear the cookies");
	}

	@Before(order = 0)
	public void beforeScenarioStart() {
		System.out.println("-----------------Start of Scenario-----------------");
	}

	//Start from decrement ways 2,1,0
	@After(order = 0)
	public void afterScenarioFinish() {
		System.out.println("-----------------End of Scenario-----------------");
	}

	@After(order = 1)
	public void afterScenario() {
		System.out.println("Log out the user and close the browser");
	}
}
