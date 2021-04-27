package stepDefinitonsSignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import verizonSignInPage_KE.SignInPage;

public class StepsDefinitionsSignIn {
    SignInPage signInPage;

    @When("user clicks sign In Button")
    public void userClicksSignInButton() {
        signInPage = new SignInPage();
        signInPage.clickSignInBtn();
    }

    @And("user enters user ID as {string}")
    public void userEntersUserIDAs(String userID) {
        signInPage.enterUserId(userID);


    }

    @When("user enters password as {string}")
    public void userEntersPasswordAs(String userPassword) {
        signInPage.enterPassword(userPassword);

    }

    @Then("sign in button is activated")
    public void signInButtonIsActivated() {
        signInPage.isElementEnabled(signInPage.signINBtn2);

    }


    @When("user click Register Link")
    public void userClickRegisterLink() {
        signInPage.clickRegisterLink();

    }

    @And("user selects In Home Radio Button")
    public void userSelectsInHomeRadioButton() {
        signInPage.selectInHomeRadioButton();

    }

    @And("user clicks on Continue Button")
    public void userClicksOnContinueButton() {
        signInPage.submitInHomeSelection();

    }

    @Then("user should be launched on Register My Account Page")
    public void shouldBeLaunchedOnRegisterMyAccountPage() {
        final boolean b = !signInPage.isElementEnabled(signInPage.continueBtn1);
        Assert.assertTrue(b);
    }

    @When("user selects Registration Method Options")
    public void userSelectsRegistrationMethodOptions() {
        signInPage = new SignInPage();
        signInPage.selectRegistrationMethodOptions();

    }

    @Then("The Option selected should be displayed")
    public void theOptionSelectedShouldBeDisplayed() {
        signInPage.isElementSelected(signInPage.option3);
    }
}
