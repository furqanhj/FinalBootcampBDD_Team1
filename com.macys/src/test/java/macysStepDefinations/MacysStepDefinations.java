package macysStepDefinations;

import io.cucumber.java.en.*;
import macysHomePageAB.MacysHomePage;
import org.testng.Assert;

public class MacysStepDefinations {
    MacysHomePage macysHomePage;

    @Given("User is on homepage")
    public void user_is_on_homepage() {
    macysHomePage=new MacysHomePage();
    }

    @When("User clicks on Deals Link")
    public void user_clicks_on_deals_link() {
        macysHomePage=new MacysHomePage();
        macysHomePage.clickOnDealsLink();


    }

    @Then("User should land on the deals page")
    public void user_should_land_on_the_deals_page() {
        macysHomePage=new MacysHomePage();
        String ActualText= macysHomePage.getTextFromElement(macysHomePage.dealsOffer);
        String ExpectedText="Offers";
        Assert.assertTrue(macysHomePage.compareStrings(ExpectedText,ActualText));
    }



}
