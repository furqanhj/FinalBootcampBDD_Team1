package wweRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"wweStepDefinitionsFJ"},
        monochrome = true,
        plugin = {"pretty"}
)
public class WWERunner {
}
