package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:/Users/Deb/Downloads/-TestAutomationEGGTimer-master/-TestAutomationEGGTimer-master/src/main/java/com/qa/features",
                 glue = {"com.qa.StepDefinition"},
                 plugin = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.junit"},
                 dryRun = false, // to check the mapping is proper between feature file and Step definition
                 monochrome = true, // display the console output in a proper readable format
                 strict = true, // it will check if any step is not defined in Step definition File
                 tags = {"@automated"}
		)


public class TestRunner {

}
