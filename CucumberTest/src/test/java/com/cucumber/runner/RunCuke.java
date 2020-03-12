package com.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/com/cucumber/features"}, glue= {"com.cucumber.runner", "com.cucumber.stepdef", "com.cucumber.features"})
public class RunCuke extends AbstractTestNGCucumberTests {
	
}
