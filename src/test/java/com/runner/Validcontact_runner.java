package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Feature\\Testcase.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@tc11_ValidContactdetails"},
glue= {"steps"},
monochrome=true
)
public class Validcontact_runner {
	

}
