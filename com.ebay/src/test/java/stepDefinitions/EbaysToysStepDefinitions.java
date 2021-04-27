package stepDefinitions;

import common.BaseAPI;
import ebayToysPagesAB.EbayToysPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbaysToysStepDefinitions extends BaseAPI {


    String url = "https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497";
    EbayToysPage ebayToysPage = new EbayToysPage();

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

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("User is on Ebay Toy's page")
    public void user_is_on_the_ebay_toys_pages() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @When("User enters {string} in search field")
    public void userEntersInSearchField(String Keys) {
        ebayToysPage.sendKeysToSearchFieldUsingTable(Keys);

    }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String Keys) {
        ebayToysPage.verifyAttributesValuesFromSearchField(Keys);

    }
    @Then("User should see {string} as current URL")
    public void userShouldSeeAsCurrentURL(String Keys) {
        ebayToysPage.verifyPageURLIsTrue(Keys);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////



}



