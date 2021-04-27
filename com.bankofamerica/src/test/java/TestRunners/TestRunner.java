package TestRunners;


    import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features={"src/test/resources/features"},
            glue={"bankOfAmericaStepDefinitions"},
           // tags="",
            monochrome = true,
            plugin = {"pretty"}
    )
    public class TestRunner  {
    }

