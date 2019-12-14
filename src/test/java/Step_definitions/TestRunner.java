package Step_definitions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature_files/",
        plugin={"html:target/ReportsDestination", "pretty",}, tags={"@devEnvironment"}, glue={"Step_definitions"})

public class TestRunner {
}
