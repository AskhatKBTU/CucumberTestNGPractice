package com.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/features"}, glue= {"com.cucumber.runner", "com.cucumber.stepdef"})
public class RunCuke extends AbstractTestNGCucumberTests {
	
}
