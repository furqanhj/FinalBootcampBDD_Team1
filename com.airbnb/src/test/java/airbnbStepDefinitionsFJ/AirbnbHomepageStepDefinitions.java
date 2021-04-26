package airbnbStepDefinitionsFJ;

import airbnbHomepageFJ.AirbnbHomepage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class AirbnbHomepageStepDefinitions {

    AirbnbHomepage homepage;

    @Given("user is on the airbnb homepage")
    public void userIsOnTheAirbnbHomepage() {
        homepage = new AirbnbHomepage();
    }

    @When("user clicks on the more options dropdown menu")
    public void user_clicks_on_the_more_options_dropdown_menu() {
        homepage.clickOnMoreOptionsDropdownMenu();
        homepage.waitTimeUsingImplicit(5);
    }

    @Then("user should see five options in the dropdown menu")
    public void user_should_see_options_in_the_dropdown_menu() {
        int actualNumOfLinks = homepage.actualLinksInMoreOptionsDropdownMenu.size();
        int expectedNumOfLinks = 5;

        Assert.assertTrue(homepage.compareIntegers(expectedNumOfLinks, actualNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    @And("user clicks on the signup button")
    public void userClicksOnTheSignupButton() {
        homepage.clickOnSignupButton();
        homepage.waitTimeUsingImplicit(5);
        
    }

    @Then("user should see a modal window saying {string}")
    public void userShouldSeeAModalWindowSaying(String arg0) {

        String actualText = homepage.getTextFromElement(homepage.actualTextOnSignupModalWindow);

        Assert.assertEquals(arg0, actualText, "TEXT DO NOT MATCH");
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + arg0);
    }

    @And("user clicks on Continue With Facebook button")
    public void userClicksOnContinueWithFacebookButton() {
        homepage.clickOnContinueWithFacebookButton();
    }

    @Then("user should be directed to a new window with Facebook Log in options")
    public void userShouldBeDirectedToANewWindowWithFacebookLogInOptions() {
        Assert.assertTrue(homepage.isElementDisplayed(homepage.facebookLogInButtonDisplayed));
    }


    @And("user clicks on the Continue With Google button")
    public void userClicksOnTheContinueWithGoogleButton() {
        homepage.clickOnContinueWithGoogleButton();
    }

    @Then("user should be directed to a new window with the header as {string}")
    public void userShouldBeDirectedToANewWindowWithTheHeaderAs(String arg0) {
        String actualText = homepage.getTextFromElement(homepage.actualTextOnHeaderSignInWithGoogleNewWindow);

        Assert.assertTrue(homepage.compareStrings(arg0, actualText));
    }

    @And("user clicks on the Continue With Apple button")
    public void userClicksOnTheContinueWithAppleButton() {
        homepage.clickOnContinueWithAppleButton();
    }

    @Then("user should be directed to the new window with the text as {string}")
    public void userShouldBeDirectedToTheNewWindowWithTheTextAs(String arg0) {

        String actualText = homepage.getTextFromElement(homepage.actualTextInBodyOfAppleLoginNewWindow);

        Assert.assertEquals(arg0, actualText, "TEXT DO NOT MATCH");
    }

    @And("user enters invalid phone number as {string}")
    public void userEntersInvalidPhoneNumberAs(String arg0) {
        homepage.enterKeysInPhoneNumberInputField(arg0);
    }

    @And("user clicks on the continue button in the modal window")
    public void userClicksOnTheContinueButtonInTheModalWindow() {
        homepage.clickContinueButtonInModalWindow();
    }

    @Then("user should see the following text {string}")
    public void userShouldSeeTheFollowingText(String arg0) {

        String actualText = homepage.getTextFromElement(homepage.actualTextWithInvalidPhoneNumberError);

        Assert.assertTrue(homepage.compareStrings(arg0, actualText));
    }
}
