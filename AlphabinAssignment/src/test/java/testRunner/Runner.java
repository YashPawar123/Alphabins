package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//step1 - @runwith
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/Flipkart/Assignment.feature", "@target/failedrerun.txt"}
 ,
    glue = "testDefinition",
    plugin = {"html:testoutput/cucumber.html", "junit:testoutput/cucumber.xml", "json:testoutput/cucumber.json",
    		"rerun:target/failedrerun.txt"} 
)
public class Runner{
	
}