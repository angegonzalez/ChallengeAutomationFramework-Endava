package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"authentication.stepdefs", "companies.stepdefs", "common"},
        plugin = {"pretty", "json:target/cucumber/cucumber.json"}
)
public class RunCucumberTests {
}