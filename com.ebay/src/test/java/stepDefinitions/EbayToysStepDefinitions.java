package stepDefinitions;

import common.BaseAPI;
import ebayToysPageAR.ebayToysPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.BaseAPI.*;

public class EbayToysStepDefinitions extends BaseAPI {

    String url = "https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497";
    ebayToysPage ebayToys = new ebayToysPage();

    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
    }
    @After
    public void tearDown() {
        driver.close();
        driver.quit();

    }


//////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("User is on Ebay Toy's page")
    public void user_is_on_the_google_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @When("User enters {string} in search field")
    public void userEntersInSearchField(String keys) {
        ebayToys.sendKeysToSearchFieldUsingTable(keys);
        }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String keys) {
    ebayToys.verifyAttributeValueFromSearchField(keys);

    }

    @Then("User should see {string} as current URL")
    public void userShouldSeeAsCurrentURL(String keys) {
    ebayToys.verifyPageURLIsTrue(keys);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////


}
