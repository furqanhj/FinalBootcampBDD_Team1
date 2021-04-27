package stepDefinitions;

import common.BaseAPI;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import macysKidsAndBabyMA.MacysKidsAndBaby;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.BaseAPI.getLocalDriver;

public class MacysKidsAndBabyStepDefinitions extends BaseAPI  {
    public static MacysKidsAndBaby macys= new MacysKidsAndBaby();

    @Given("User is on the macys Kids And Baby")
    public void user_in_on_the_macy_Kids_And_Baby() {

    }

    @When("User enters {string} in search field")
    public void userEntersInSearchField(String keys) {}


    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String keys) {
        macys.verifyAttributeValueFromSearchField(keys);
    }

    @Then("User should see {string} as title")
    public void userShouldSeeAsTitle(String title) {
        macys.verifyPageTitle(title);
    }

    @Given("User is on the macys Kids And Baby")
    public void userIsOnTheMacysKidsAndBabyPage() {
    }

    @When("User enters Kids And Baby")
    public void userEntersKidsAndBaby() {

    }

    @When("User clicks Boys sizes")
    public void userClicksBoysSizes() {
        macys.clickBoysSizes();
    }

    @And("User clicks on Toddler Boys size")
    public void userClicksOnToddlerBoysSize() {
        macys.clickToddlerBoysSize();
    }


    @And("User clicks on polo shirt")
    public void userClicksOnPoloShirt() {
        macys.clickToddlerTshirt();
    }

    @Then("User verify {string} page header")
    public void userVerifyPageHeader(String expecterHeader) {
        macys.verifyPageHeader(expecterHeader);
    }
}



