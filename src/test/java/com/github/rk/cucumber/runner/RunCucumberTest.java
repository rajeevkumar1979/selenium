package com.github.rk.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "Features",
glue = { "com.github.rk.stepdefinitions" }, 
plugin = {"pretty",
		"html:target/cucumber-reports",
		"json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml"},
monochrome = true,
tags= {"@Smoketest"})

//Execute all tests of a Feature tagged as @FunctionalTest : Feature Tagging
//Execute all tests tagged as @SmokeTest OR @RegressionTest
//tags= {"@Smoketest,@RegressionTest"}
//Execute all tests tagged as @SmokeTest AND @RegressionTest
//tags= {"@Smoketest","@RegressionTest"}
//Execute all tests of the feature tagged as @FunctionalTests but skip scenarios tagged as @SmokeTest
//tags= {"~@Smoketest","@RegressionTest"}
//Execute all tests which are not at all tagged in all the Features
//tags= {"~@Smoketest","~@RegressionTest"}
//Cucumber supports hooks, which are blocks of code that run before or after each scenario. 

@RunWith(Cucumber.class)
public class RunCucumberTest {

}
