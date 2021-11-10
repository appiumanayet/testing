package myproject;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

// Default:
@CucumberOptions(tags={"@smoke"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class TestRunner {

}
