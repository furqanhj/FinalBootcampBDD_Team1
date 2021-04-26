package attRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"attStepDefinitionsFJ"},
        monochrome = true,
        plugin = {"pretty"}
)
public class ATTRunner {
}
