package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, glue = "stepDefinitions",
        plugin = {"pretty", "html:test-output_1",
                "json:target/test-output_2.json"},
        features = "src/test/resources/functionalTest", tags = "@End2End")
public class TestRunner {

}


