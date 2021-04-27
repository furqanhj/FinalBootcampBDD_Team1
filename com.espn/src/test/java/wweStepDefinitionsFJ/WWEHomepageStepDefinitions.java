package wweStepDefinitionsFJ;

import common.BaseAPI;
import io.cucumber.java.en.*;
import org.testng.Assert;
import wweHomepageFJ.WWEHomepage;

public class WWEHomepageStepDefinitions {

    WWEHomepage wweHomepage;

    @Given("user is on WWE Homepage")
    public void user_is_on_wwe_homepage() {
        wweHomepage = new WWEHomepage();
        wweHomepage.navigateToWWEHomepage();
    }

    @Then("user should be able to see {int} links on the header")
    public void userShouldBeAbleToSeeLinksOnTheHeader(int arg0) {
        wweHomepage = new WWEHomepage();
        int actualNumOfLinks = wweHomepage.actualNumOfLinksOnWWEHomepageHeader.size();

        Assert.assertTrue(wweHomepage.compareIntegers(arg0, actualNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NNUMBER OF LINKS = " + arg0);
    }

    @When("user clicks on the Wrestle Mania link")
    public void userClicksOnTheWrestleManiaLink() {
        wweHomepage = new WWEHomepage();
        wweHomepage.clickOnWrestleMania37Link();
    }

    @Then("user shall be directed to the Wrestle Mania page")
    public void userShallBeDirectedToTheWrestleManiaPage() {
        wweHomepage = new WWEHomepage();
        String actualURL = BaseAPI.driver.getCurrentUrl();
        String expectedURL = "https://www.espn.com/wwe/story/_/id/31012524/" +
                "wwe-wrestlemania-37-matches-card-date-location-news-stories-information";

        Assert.assertTrue(wweHomepage.compareStrings(expectedURL, actualURL));
    }

    @When("user clicks on the Tickets link")
    public void userClicksOnTheTicketsLink() {
        wweHomepage = new WWEHomepage();
        wweHomepage.clickOnTicketsLink();
    }

    @Then("user shall be directed to the Vividseats.com page in a new window")
    public void userShallBeDirectedToTheVividseatsComPageInANewWindow() {
        wweHomepage = new WWEHomepage();
        String actualURL = BaseAPI.driver.getCurrentUrl();
        String expectedURL = "https://www.vividseats.com/wwe/";

        Assert.assertTrue(wweHomepage.compareStrings(expectedURL, actualURL));
    }

    @When("user clicks on the Title Watch link")
    public void userClicksOnTheTitleWatchLink() {
        wweHomepage = new WWEHomepage();
        wweHomepage.clickOnTitleWatchLink();
    }

    @Then("user shall be directed to the Title Watch page")
    public void userShalBeDirectedToTheTitleWatchPage() {
        wweHomepage = new WWEHomepage();
        String actualText = wweHomepage.getTextFromElement(wweHomepage.actualTextOnTitleWatchPage);
        String expectedText = "WWE title watch";

        Assert.assertEquals(expectedText, actualText, "TEXT DO NOT MATCH");
    }

    @When("user clicks on Wrestler profiles link")
    public void userClicksOnWrestlerProfilesLink() {
        wweHomepage = new WWEHomepage();
        wweHomepage.clickWrestlerProfilesLink();
    }

    @And("user clicks on AJ Styles profile link")
    public void userClicksOnAJStylesProfileLink() {
        wweHomepage = new WWEHomepage();
        wweHomepage.clickOnAJStylesProfileLink();
    }

    @Then("user shall be directed to AJ Styles profile page and AJ Styles image should be displayed")
    public void userShallBeDirectedToAJStylesProfilePageAndAJStylesImageShouldBeDisplayed() {
        wweHomepage = new WWEHomepage();
        boolean isImageDisplayed = wweHomepage.isElementDisplayed(wweHomepage.imageDisplayedOfAJStyles);

        Assert.assertTrue(isImageDisplayed);
    }
}
