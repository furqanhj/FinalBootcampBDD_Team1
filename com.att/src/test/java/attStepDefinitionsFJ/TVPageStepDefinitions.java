package attStepDefinitionsFJ;

import attHomepageFJ.ATTHomepage;
import attTVPageFJ.TVPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class TVPageStepDefinitions {

    ATTHomepage homepage;
    TVPage tvPage;

    @Given("user is on the TV page")
    public void user_is_on_the_tv_page() {
        homepage = new ATTHomepage();
        homepage.navigateToTVPage();
    }

    @When("user hovers over all the links on the header of TV page")
    public void userHoversOverAllTheLinksOnTheHeaderOfTVPage() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        tvPage.hoverOverAllLinksOnHeader();
    }

    @Then("user should see {int} links on the header")
    public void userShouldSeeLinksOnTheHeader(int arg0) {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        int actualNumOfLinksOnHeader = tvPage.actualNumberOfLinksOnTVPageHeader.size();

        Assert.assertTrue(homepage.compareIntegers(arg0, actualNumOfLinksOnHeader));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinksOnHeader);
        System.out.println("EXPECTED NUMBER OF LINKS = " + arg0);
    }


    @When("user clicks on the ATT TV link")
    public void userClicksOnTheAttTVLink() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        tvPage.clickOnAttTVLink();
    }

    @Then("user shall be directed to the ATT TV url")
    public void userShallBeDirectedToTheATTTVUrl() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        Assert.assertTrue(tvPage.isTitleTrue("https://www.atttv.com/"));
    }

    @When("user clicks on Channel Lineup link")
    public void userClicksOnChannelLineupLink() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        tvPage.clickOnChannelLineupLink();
    }


    @Then("user shall be directed to the Channel Lineup page with text as {string}")
    public void userShallBeDirectedToTheChannelLineupPageWithTextAs(String arg0) {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        String actualText = tvPage.getTextFromElement(tvPage.actualTextOnChannelLineupPage);

        Assert.assertTrue(tvPage.compareStrings(arg0, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + arg0);
    }

    @When("user clicks on Device & Features link")
    public void userClicksOnDeviceFeaturesLink() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        tvPage.clickOnDeviceNFeaturesLink();
    }

    @Then("user shall be directed to Device Features page with text as {string}")
    public void userShallBeDirectedToDeviceFeaturesPageWithTextAs(String arg0) {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        String actualText = tvPage.getTextFromElement(tvPage.actualTextOnDeviceNFeaturesPage);

        Assert.assertTrue(tvPage.compareStrings(arg0, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + arg0);
    }

    @When("user clicks on the Sports link")
    public void userClicksOnTheSportsLink() throws InterruptedException {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        tvPage.clickOnSportsLink();
        tvPage.robotScrollDown(65);
        tvPage.waitTimeUsingFluent(10);
    }

    @Then("user shall be directed to sports page")
    public void userShallBeDirectedToSportsPage() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        Assert.assertTrue(tvPage.isTitleTrue("Sports Packages for AT&T TV and DIRECTV"));
    }

    @When("user clicks on the Packages link")
    public void userClicksOnThePackagesLink() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        tvPage.clickOnPackagesLink();
    }

    @Then("user is shall be directed to packages page")
    public void userIsShallBeDirectedToPackagesPage() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        Assert.assertTrue(tvPage.isTitleTrue("https://www.att.com/tv/packages/"));
    }

    @And("user shall be able to see the table of packages")
    public void userShallBeAbleToSeeTheTableOfPackages() throws InterruptedException {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        tvPage.robotScrollDown(85);
        Assert.assertTrue(tvPage.isElementDisplayed(tvPage.tableOfPackagesOnPackagesPage));
    }

    @When("user clicks on the Bundles link")
    public void userClicksOnTheBundlesLink() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        tvPage.clickOnBundlesLink();
    }

    @Then("user shall be directed to the bundles page")
    public void userShallBeDirectedToTheBundlesPage() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        Assert.assertTrue(tvPage.isTitleTrue("AT&T Bundles | Our Best TV & Internet Bundles & Packages"));
    }

    @And("user shall be able to see the Shop AT&T bundles button")
    public void userShallBeAbleToSeeTheShopATTBundlesButton() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        Assert.assertTrue(tvPage.isElementDisplayed(tvPage.buttonShopAttBundles));
    }

    @When("user clicks on the DirectTV link")
    public void userClicksOnTheDirectTVLink() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();

        tvPage.clickOnDirectTVLink();
    }

    @Then("user shall land on the DirectTv page")
    public void userShallLandOnTheDirectTvPage() {
        homepage = new ATTHomepage();
        tvPage = new TVPage();
        String actualText = tvPage.getTextFromElement(tvPage.actualTextOnDirectTVPage);
        String expectedText = "CELEBRATE WITH AT&T/DIRECTV";

        Assert.assertTrue(tvPage.compareStrings(expectedText, actualText));
    }
}
