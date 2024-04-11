package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\prakash\\eclipse-workspace\\practice\\CucumProject\\src\\test\\resources\\useridentification.feature\\login.feature",glue="org.runner",dryRun=false)     


public class TestRunner {
	
}
