package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",tags="@Searchbox",
glue= {"StepDefinition"})
public class LoginRunner {

}
