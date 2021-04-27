package stepDefinitions;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysWeddingRegistryBS.MacysWeddingRegistry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MacysWeddingRegistryStepDefinitions extends BaseAPI {

    WebDriver driver;
    WebDriverWait driverWait;
    String url = "https://www.macys.com/s/registry-top-reasons/";
    MacysWeddingRegistry macys;

    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    @Given("User is on the Macys Wedding Registry Page")
    public void user_in_on_the_macys_registry_page() {
        macys = new MacysWeddingRegistry();
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        macys.waitTimeUsingImplicit(5);
    }

    @When("User enters {string} in search field")
    public void userEntersInSearchField(String keys) {
        macys.searchRegistryItemsUsingTable(keys);
    }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String keys) {
        macys.verifyAttributeValueFromSearchField(keys);
    }

    @Then("User should see {string} as title")
    public void userShouldSeeAsTitle(String title) {
        macys.verifyPageTitle(title);
    }

    @When("User clicks on Dream Fund Button")
    public void userClicksOnDreamFundButton() {
        macys = new MacysWeddingRegistry();
        macys.clickOnDreamFundButton();
        macys.waitTimeUsingImplicit(5);
    }

    @Then("User should see Dream Fund Image on the Wedding Registry page")
    public void userShouldSeeDreamFundImageOnTheWeddingRegistryPage() {
        macys = new MacysWeddingRegistry();
        Assert.assertTrue(isElementDisplayed(macys.dreamFundImage));
    }
}



