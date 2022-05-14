package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//TO RUN ALL FEATRUES USE: "src/test/java/features"
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Login.feature", glue = "stepDefinition")
public class TestRunner {

}
