package expediaStepDefinitionsFJ;

import expediaSignInPageFJ.SignInPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class SignInStepDefinitions {

    SignInPage signInPage;

    @Given("user is on the Sign In page")
    public void user_is_on_the_sign_in_page() {
        signInPage = new SignInPage();
        signInPage.navigateToSignInPage();
    }

    @When("user clicks on the Sign in with Google button")
    public void userClicksOnTheSignInWithGoogleButton() {
        signInPage = new SignInPage();
        signInPage.clickOnSignInWithGoogleLink();
    }

    @Then("user should be directed to the new window with Google sign in options")
    public void userShouldBeDirectedToTheNewWindowWithGoogleSignInOptions() {
        signInPage = new SignInPage();
        String actualText = signInPage.getTextFromElement(signInPage.actualTextSignInWithGoogleNewWindow);
        String expectedText = "Sign in with Google";

        Assert.assertTrue(signInPage.compareStrings(expectedText, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    @When("user clicks on the Sign in with Apple button")
    public void userClicksOnTheSignInWithAppleButton() {
        signInPage = new SignInPage();
        signInPage.clickOnSignInWithAppleLink();
    }

    @Then("user should be directed to the new window with Apple sign in options")
    public void userShouldBeDirectedToTheNewWindowWithAppleSignInOptions() {
        signInPage = new SignInPage();
        Assert.assertTrue(signInPage.isElementDisplayed(signInPage.inputBoxAppleID));
    }

    @When("user clicks on the Sign in with Facebook button")
    public void userClicksOnTheSignInWithFacebookButton() {
        signInPage = new SignInPage();
        signInPage.clickOnSignInWithFacebook();
    }

    @Then("user should be directed to the new window with Facebook sign in options")
    public void userShouldBeDirectedToTheNewWindowWithFacebookSignInOptions() {
        signInPage = new SignInPage();
        String actualText = signInPage.getTextFromElement(signInPage.actualTextFacebookSignInNewWindow);
        String expectedText = "Facebook";

        Assert.assertTrue(signInPage.compareStrings(expectedText, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }
}
