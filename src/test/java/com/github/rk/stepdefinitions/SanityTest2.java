package com.github.rk.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SanityTest2 {

	@Given("Open firefox browser")
	public void open_firefox_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Opening browser");
	}

	@When("Enter valid {string} and {string}\"")
	public void enter_valid_UserName_and_Password(String user, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entering User as: "+ user + "Password as: "+ pass);
	}

	@Then("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Closing browser");
	}
}
