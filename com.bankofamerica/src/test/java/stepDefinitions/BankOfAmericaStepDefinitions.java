package stepDefinitions;

import bankOfAmericaSmallBusinessBS.BankOfAmericaSmallBusiness;
import common.BaseAPI;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class BankOfAmericaStepDefinitions {
//TEST CLASS
//when importing, just use * to import all methods

BankOfAmericaSmallBusiness bank;


    @Given("user is on the small business page")
    public void user_is_on_the_small_business_page() {
        bank = new BankOfAmericaSmallBusiness();

    }

    @When("user enters text in the search box as {string}")
    public void user_enters_text_in_the_search_box_as(String searchText) {
        bank = new BankOfAmericaSmallBusiness();
        bank.enterTextInSearchBox(searchText);

    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        bank = new BankOfAmericaSmallBusiness();
        bank.clickSearchButton();

    }


    @Then("user should see search results dropdown with {string}")
    public void userShouldSeeSearchResultsDropdownWith(String results) {
        bank = new BankOfAmericaSmallBusiness();
        String actualText = bank.getTextFromElement(bank.expectedTextResultsFor);
        String expectedText = "Search results for: " + results;

        Assert.assertEquals(expectedText, actualText,"TEXT DOES NOT MATCH");

    }
}
