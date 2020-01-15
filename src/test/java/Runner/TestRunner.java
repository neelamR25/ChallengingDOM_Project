package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/",
        glue = "Steps",
        tags = "@test",
        dryRun = false,
        strict = true,
        plugin = {
                "pretty",
                "json:target/cucumber/cucumber.json"
        }


)

public class TestRunner {
}
