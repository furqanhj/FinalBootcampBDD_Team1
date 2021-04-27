package stepDefinitionsHomeLoansPage;

import chaseHomeLoansPageKE.HomeLoansPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinitionsHomeLoansPage {
    HomeLoansPage homeLoansPage;

    @When("user clicks on Home Loans Text")
    public void userClicksOnHomeLoansText() {
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.clickHomeLoansText1();
    }

    @And("user clicks on Mortgage Home Loans link")
    public void userClicksOnMortgageHomeLoansLink() {
        homeLoansPage.clickMortgageHomeLoans();
    }


    @Then("user should be launched on Mortgage Home Loans  page")
    public void userShouldBeLaunchedOnMortgageHomeLoansPage() {
        Assert.assertTrue(homeLoansPage.familyImage.isDisplayed());

    }


    @When("user clicks on Mortgage Home Loans Icon link")
    public void userClicksOnMortgageHomeLoansIconLink() {
        homeLoansPage=new HomeLoansPage();
        homeLoansPage.clickHomeLoansTextLink();
    }
    @And("user clicks Sign in first Button")
    public void userClicksSignInFirstButton() {
        homeLoansPage.clickSignInBtn();

            }

    @And("user enters userName as {string}")
    public void userEntersUserNameAs(String userName) {
        homeLoansPage.enterUserName(userName);

    }

    @When("user enters password as {string}")
    public void userEntersPasswordAs(String userPassword) {
        homeLoansPage.enterUserPassword(userPassword);


    }

    @And("user clicks Sign in second button")
    public void userClicksSignInSecondButton()  {
        homeLoansPage.clickSignINButton2();

    }

    @Then("user should get an error message")
    public void userShouldGetAnErrorMessage() {
        homeLoansPage.waitForVisibilityOfElement(homeLoansPage.logonMessage);
        String str1= homeLoansPage.logonMessage.getText();
        String str2="Please try again later. Thanks for your patience.";
        homeLoansPage.compareStrings(str1,str2);
    }




}
