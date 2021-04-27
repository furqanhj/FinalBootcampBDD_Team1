package stepDefinitions;

import ebayDealsPageMA.ebayDealsPage;
import io.cucumber.java.en.*;

public class DealsStepDefinitions {
    ebayDealsPage ebayDealsPage;


    @Given("User is on the deals page")
    public void user_is_on_the_deals_page() {
        ebayDealsPage= new ebayDealsPage();
        ebayDealsPage.navigateToDealsPage();

    }

    @When("User clicks on the tech link")
    public void user_clicks_on_the_tech_link() {
        ebayDealsPage.clickOnTechLink();
    }

    @Then("User should land on the tech deals page")
    public void user_should_land_on_the_tech_deals_page() {
       ebayDealsPage.isElementDisplayed(ebayDealsPage.appleMacbookOnTECHPage);

    }

    @When("User click on the fashion link")
    public void userClickOnTheFashionLink() {

    }

    @Then("User should land on the fashion page")
    public void userShouldLandOnTheFashionPage() {

    }


    @When("User enters {string} in search field")
    public void userEntersInSearchField(String arg0) {
        
    }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String arg0) {
        
    }

    @Then("User should see {string} as current URL")
    public void userShouldSeeAsCurrentURL(String arg0) {

    }
}
