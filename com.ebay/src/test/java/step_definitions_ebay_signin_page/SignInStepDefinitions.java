package step_definitions_ebay_signin_page;

import ebaySignInPageFJ.SignInPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

public class SignInStepDefinitions {

    SignInPage signInPage;

    @Given("user is on sign in page")
    public void user_is_on_sign_in_page() {
        signInPage = new SignInPage();
        signInPage.navigateToSignInPage();
    }

    @When("user enters text in email input field")
    public void user_enters_text_in_email_input_field_as() {
        signInPage = new SignInPage();
        signInPage.sendKeysToEmailUsernameField("furqanhj");
    }

    @When("user clicks on the continue button")
    public void user_clicks_on_the_continue_button() throws InterruptedException {
        signInPage = new SignInPage();
        signInPage.clickContinueButton();
        signInPage.waitTimeUsingImplicit(5);
    }

    @Then("user shall be directed to the password input page")
    public void user_shall_be_directed_to_the_password_input_page() {
        signInPage = new SignInPage();
        String actualText = signInPage.getTextFromElement(signInPage.actualTextInvalidEmailContinue);
        String expectedText = "Oops, that's not a match.";

        Assert.assertTrue(signInPage.compareStrings(expectedText, actualText));
    }

    @When("user clicks on the Create An Account link on sign up page")
    public void user_clicks_on_the_create_an_account_link_on_sign_up_page() {
        signInPage = new SignInPage();
        signInPage.clickCreateAnAccountLink();
        signInPage.waitTimeUsingImplicit(5);
    }

    @Then("user shall be directed to Create An Account page")
    public void user_shall_be_directed_to_create_an_account_page() {
        signInPage = new SignInPage();
        String actualText = signInPage.getTextFromElement(signInPage.actualTextOnCreateAnAccountPage);
        String expectedText = "Create an account";

        Assert.assertEquals(expectedText, actualText, "TEXT DO NOT MATCH");
//        Assert.assertTrue(signInPage.compareStrings(expectedText, actualText));
    }

    @When("user enters first name as {string}")
    public void user_enters_first_name_as(String string) {
        signInPage = new SignInPage();
        signInPage.enterTextInFirstNameField(string);
    }

    @When("user enters last name as {string}")
    public void user_enters_last_name_as(String string) {
        signInPage = new SignInPage();
        signInPage.enterTextInLastNameField(string);
    }

    @When("user enters email as {string}")
    public void user_enters_email_as(String string) {
        signInPage = new SignInPage();
        signInPage.enterTextInEmailFieldInCreateAccountPage(string);
    }

    @When("user enters password as {string} and verifies his password")
    public void user_enters_password_as_and_verifies_his_password(String string) {
        signInPage = new SignInPage();
        signInPage.enterTextInPasswordFieldInCreateAccountPage(string);
        signInPage.selectCheckboxOptionShowPassword();
    }

    @When("user clicks on Create Account button")
    public void user_clicks_on_create_account_button() {
        signInPage = new SignInPage();
        signInPage.clickOnCreateAccountButton();
    }

    @Then("user shall see {string} on homepage")
    public void user_shall_see_on_homepage(String string) {
        signInPage = new SignInPage();
        String actualText = signInPage.getTextFromElement(signInPage.actualTextOnHomepageAfterAccountCreation);
        String expectedText = "Hi "+string+"!";

//        String actualText = signInPage.getTextFromElement(signInPage.actualTextPasswordErrorUnsuccessfulAccountCreation);
//        String expectedText = "";

        Assert.assertEquals(expectedText, actualText, "TEXT DO NOT MATCH");
    }

    @When("user clicks on Continue With Facebook button")
    public void userClicksOnContinueWithFacebookButton() {
        signInPage = new SignInPage();
        signInPage.clickOnContinueWithFacebookButton();
        signInPage.waitTimeUsingImplicit(5);
    }

    @Then("user shall be directed to Log into facebook page")
    public void userShallBeDirectedToLogIntoFacebookPage() {
        signInPage = new SignInPage();
        String actualText = signInPage.getTextFromElement(signInPage.actualTextOnLoginWithFacebookPage);
        String expectedText = "Log Into Facebook";

        Assert.assertTrue(signInPage.compareStrings(expectedText, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    @When("user clicks on Continue With Google button")
    public void userClicksOnContinueWithGoogleButton() {
        signInPage = new SignInPage();
        signInPage.clickOnContinueWithGoogleButton();
        signInPage.waitTimeUsingImplicit(5);
    }

    @Then("user shall be directed to Log into Google new window")
    public void userShallBeDirectedToLogIntoGoogleNewWindow() {
        signInPage = new SignInPage();

        String actualText = signInPage.getTextFromElement(signInPage.actualTextOnLogInWithGooglePage);
        String expectedText = "Sign in with Google";

        Assert.assertTrue(signInPage.compareStrings(expectedText, actualText));
    }

    @When("user clicks on Continue With Apple button")
    public void userClicksOnContinueWithAppleButton() {
        signInPage = new SignInPage();
        signInPage.clickOnContinueWithAppleButton();
    }

    @Then("user shall be directed to Log in with Apple ID page")
    public void userShallBeDirectedToLogInWithAppleIDPage() {
        signInPage = new SignInPage();

        String actualText = signInPage.getTextFromElement(signInPage.actualTextOnLoginWithAppleID);
        String expectedText = "Use your Apple ID to sign in to eBay.";

        Assert.assertEquals(expectedText, actualText, "TEXT DO NOT MATCH");
    }
}
