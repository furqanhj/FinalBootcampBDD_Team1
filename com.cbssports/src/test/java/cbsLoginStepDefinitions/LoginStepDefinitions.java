package cbsLoginStepDefinitions;

import cbsLoginPageFJ.CBSLoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginStepDefinitions {

    CBSLoginPage loginPage;

    @Given("user is on the Login page")
    public void user_is_on_the_login_page() {
        loginPage = new CBSLoginPage();
        loginPage.navigateToLoginPage();
    }

    @When("user clicks on the Log in with Facebook button")
    public void userClicksOnTheLogInWithFacebookButton() {
        loginPage = new CBSLoginPage();
        loginPage.clickOnLogInWithFacebookButton();
    }

    @Then("user should go to a new window and see the facebook log in options")
    public void userShouldGoToANewWindowAndSeeTheFacebookLogInOptions() {
        loginPage = new CBSLoginPage();
        String actualText = loginPage.getTextFromElement(loginPage.actualTextFacebookSignInNewWindow);
        String expectedText = "Facebook";

        Assert.assertTrue(loginPage.compareStrings(expectedText, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    @When("user clicks on the Sign in with Google button")
    public void userClicksOnTheSignInWithGoogleButton() {
        loginPage = new CBSLoginPage();
        loginPage.clickOnSignInWithGoogleButton();
    }

    @Then("user should go to a new window and see the Google sign in options")
    public void userShouldGoToANewWindowAndSeeTheGoogleSignInOptions() {
        loginPage = new CBSLoginPage();
        String actualText = loginPage.getTextFromElement(loginPage.actualTextGoogleSignInNewWindow);
        String expectedText = "Sign in with Google";

        Assert.assertTrue(loginPage.compareStrings(expectedText, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    @When("user clicks on Forgot Your Password link")
    public void userClicksOnForgotYourPasswordLink() {
        loginPage = new CBSLoginPage();
        loginPage.clickOnForgotYourPasswordLink();
    }

    @Then("user should be directed to the Password Retrieve Page")
    public void userShouldBeDirectedToThePasswordRetrievePage() {
        loginPage = new CBSLoginPage();
        String actualText = loginPage.getTextFromElement(loginPage.actualTextForgotYourPasswordPage);
        String expectedText = "Forgot Your Password";

        Assert.assertTrue(loginPage.compareStrings(expectedText, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    @When("user clicks on Dont Have An Account Yet link")
    public void userClicksOnDontHaveAnAccountYetLink() {
        loginPage = new CBSLoginPage();
        loginPage.clickOnDontHaveAnAccountSignUpLink();
    }

    @Then("user should be directed to the Register Page")
    public void userShouldBeDirectedToTheRegisterPage() {
        loginPage = new CBSLoginPage();
        String actualText = loginPage.getTextFromElement(loginPage.actualTextRegisterPage);
        String expectedText = "Register";

        Assert.assertTrue(loginPage.compareStrings(expectedText, actualText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    @When("user enters invalid email as {string}")
    public void userEntersInvalidEmailAs(String arg0) {
        loginPage = new CBSLoginPage();
        loginPage.enterTextInEmailInputBox(arg0);
    }

    @And("user enters invalid password as {string}")
    public void userEntersInvalidPasswordAs(String arg0) {
        loginPage = new CBSLoginPage();
        loginPage.enterTextInPasswordInputBox(arg0);
    }

    @And("user clicks on the Log in button")
    public void userClicksOnTheLogInButton() {
        loginPage = new CBSLoginPage();
        loginPage.clickLogInButtonAfterInput();
    }

    @Then("user should see an error message as {string}")
    public void userShouldSeeAnErrorMessageAs(String arg0) {
        loginPage = new CBSLoginPage();
        String actualText = loginPage.getTextFromElement(loginPage.actualTextInvalidRegisterErrorMessage);

        Assert.assertTrue(loginPage.compareStrings(arg0, actualText));
    }
}
