package stepDefinitions;

import common.BaseAPI;
import ebayFashionBS.EbayFashion;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayFashionStepDefinitions extends BaseAPI{

    EbayFashion fashion;

    @Given("User is on the ebay fashion page")
    public void userIsOnTheEbayFashionPage() {
        fashion = new EbayFashion();
    }



    @When("User enters {string} in search field")
    public void userEntersInSearchField(String keys) {
        fashion.sendKeysToSearchFieldUsingTable(keys);
    }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String keys) {
        fashion.verifyAttributeValuesFromSearchField(keys);
    }

    @Then("User should see {string} as current URL")
    public void userShouldSeeAsCurrentURL(String keys) {
        fashion.verifyPageURLIsTrue(keys);
    }



}

