package expediaRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"expediaStepDefinitionsFJ"},
        monochrome = true,
        plugin = {"pretty"}
)
public class ExpediaRunner {
}
