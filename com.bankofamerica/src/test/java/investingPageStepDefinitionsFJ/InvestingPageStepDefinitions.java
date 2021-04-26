package investingPageStepDefinitionsFJ;

import bofaInvestingPageFJ.InvestingPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class InvestingPageStepDefinitions {

    InvestingPage investingPage;

    @Given("user is on the Investing Page")
    public void user_is_on_the_investing_page() {
        investingPage = new InvestingPage();
        investingPage.navigateToInvestingPage();
    }

    @When("user hovers over all the links on the header")
    public void userHoversOverAllTheLinksOnTheHeader() {
        investingPage.hoverOverAllOptionsOnHeader();
    }

    @Then("user should be able to see {int} links on the header")
    public void userShouldBeAbleToSeeLinksOnTheHeader(int arg0) {
        int actualNumOfOptionsOnHeader = investingPage.actualNumOfLinksOnInvestingPageHeader.size();

        Assert.assertTrue(investingPage.compareIntegers(arg0, actualNumOfOptionsOnHeader));
    }

    @When("user scrolls down to the video frame")
    public void userScrollsDownToTheVideoFrame() throws InterruptedException {
        investingPage = new InvestingPage();
        investingPage.scrollDownTillVideoFrame();

    }

    @And("user clicks on the Play video to learn more button")
    public void userClicksOnThePlayVideoToLearnMoreButton() throws InterruptedException {
        investingPage = new InvestingPage();
        investingPage.clickPlayVideoButton();
    }

    @Then("the video should start playing")
    public void theVideoShouldStartPlaying() {
        investingPage = new InvestingPage();

        Assert.assertTrue(investingPage.isElementDisplayed(investingPage.videoFrameToHoverOver));
    }

    @And("user hovers over the running video")
    public void userHoversOverTheRunningVideo() {
        investingPage = new InvestingPage();
        investingPage.hoverOverVideoFrame();
    }

    @Then("user should be able to see the video controls panel at the bottom")
    public void userShouldBeAbleToSeeTheVideoControlsPanelAtTheBottom() {
        Assert.assertTrue(investingPage.isElementDisplayed(investingPage.videoBottomPanelWithAllButtons));
    }

    @And("user clicks on the Full Screen button")
    public void userClicksOnTheFullScreenButton() {
        investingPage = new InvestingPage();
        investingPage.clickOnFullScreenButton();
        investingPage.waitTimeUsingImplicit(3);
    }

    @Then("the video shall be played in full screen")
    public void theVideoShallBePlayedInFullScreen() {
        investingPage = new InvestingPage();
        Assert.assertTrue(investingPage.isElementDisplayed(investingPage.videoBodyWhenInFullScreenMode));
    }

    @When("user enters text in Get Quote input box as {string}")
    public void userEntersTextInGetQuoteInputBoxAs(String arg0) {
        investingPage = new InvestingPage();
        investingPage.enterTextInGetQuoteField(arg0);
    }

    @And("user clicks on the Get Quote search button")
    public void userClicksOnTheGetQuoteSearchButton() {
        investingPage = new InvestingPage();
        investingPage.clickSearchGetQuoteButton();
    }

    @Then("user shall see a search result body as a dropdown under Get Quote input box")
    public void userShallSeeASearchResultBodyAsADropdownUnderGetQuoteInputBox() {
        investingPage = new InvestingPage();
        Assert.assertTrue(investingPage.isElementDisplayed(investingPage.getQuoteSearchResultModalWindowBody));
    }

    @When("user enters text in Search Merrill Edge input box as {string}")
    public void userEntersTextInSearchMerrillEdgeInputBoxAs(String arg0) {
        investingPage = new InvestingPage();
        investingPage.enterTextInSearchMerrillEdgeField(arg0);
    }

    @And("user clicks on Search button in Search Merrill Edge field")
    public void userClicksOnSearchButtonInSearchMerrillEdgeField() {
        investingPage = new InvestingPage();
        investingPage.clickSearchMerrillEdgeSearchButton();
    }

    @Then("user shall be directed to the Search Merrill Edge search result page")
    public void userShallBeDirectedToTheSearchMerrillEdgeSearchResultPage() {
        investingPage = new InvestingPage();
        String actualText = investingPage.getTextFromElement(investingPage.actualTextOnSearchMerrillEdgeLandedPage);
        String expectedText = "Search for";

        Assert.assertTrue(investingPage.compareStrings(expectedText, actualText));
    }
}
