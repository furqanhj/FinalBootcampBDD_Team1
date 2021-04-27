package stepDefinitions;

import bOACustomerServiceAR.BOACustomerService;
import common.BaseAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankOfAmericaStepDefinitions {
    //Test Class
    //when importing, just use * to import all methods.

    BOACustomerService boa = new BOACustomerService();

    @Given("User is on the Customer Service Page")
    public void UserIsOnTheCustomerServicePage() {

    }

    @When("User enters text in the search field as {string}")
    public void userEntersTextInTheSearchFieldAs(String keys) {
        boa.enterTextInSearchField(keys);
    }

    @When("User waits until text is visible in the search field")
    public void userClicksTheSearchButton() {
        boa.clickSearchButton();
    }

    @Then("User is able to view {string} in the search field")
    public void userIsAbleToViewSearchResults(String value) {
        boa.verifySearchFieldValues(value);
    }
}