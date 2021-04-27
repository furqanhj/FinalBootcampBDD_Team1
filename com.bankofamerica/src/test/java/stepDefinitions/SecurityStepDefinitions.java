package stepDefinitions;


import BankOfAmericaSecurityPageMA.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Guice;

public class SecurityStepDefinitions {
    BankOfAmericaSecurityPage bankOfAmericaSecurityPage;

    @Given("User is on the bank of america security page")
    public void user_is_on_the_security_page (){
        bankOfAmericaSecurityPage = new BankOfAmericaSecurityPage ();

    }


    @When("User clicks on the lock and unlock your card")
    public void userClicksOnTheLockUnlockYourCard() {
        bankOfAmericaSecurityPage = new BankOfAmericaSecurityPage();
        bankOfAmericaSecurityPage.clickLockUnlockYourCard();
    }

    @And("User waits until visibility of lock and unlock your card page")
    public void userWaitsUntilVisibilityOfLockUnlockYourCardPage() {
        bankOfAmericaSecurityPage = new BankOfAmericaSecurityPage();
        bankOfAmericaSecurityPage.waitUntilVisibilityOfCardPage();
    }


    @Then("User should land on the lock and unlock your card page")
    public void userShouldLandOnTheLockAndUnlockYourCardPage() {
        bankOfAmericaSecurityPage = new BankOfAmericaSecurityPage();
        bankOfAmericaSecurityPage.verifyUserIsOnCardPage();

    }
}
