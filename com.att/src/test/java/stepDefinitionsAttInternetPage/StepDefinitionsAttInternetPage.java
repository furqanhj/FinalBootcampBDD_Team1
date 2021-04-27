package stepDefinitionsAttInternetPage;

import attInternetPageKE.AttInternetPage;
import common.BaseAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinitionsAttInternetPage extends BaseAPI {
    AttInternetPage attInternetPage;



        @When("user clicks on internet Text link")
        public void user_clicks_on_internet_text_link () {
        attInternetPage=new AttInternetPage();
        attInternetPage.clickInternetImageLink();


        }

        @Then("user should be launched on result page")
        public void user_should_be_launched_on_result_page () {
            String actualTitle = driver.getTitle();
            String expectedTitle = "AT&T INTERNET | Internet for your Home including AT&T Fiber";
            Assert.assertEquals(actualTitle, expectedTitle, "Text Not Matching");
            System.out.println(actualTitle);


        }
    @When("User clicks Account TextLink")
    public void user_clicks_account_text_link() {
            user_clicks_on_internet_text_link();
            attInternetPage.clickAccountTextLink();
    }

    @Then("User should see options to select")
    public void user_should_see_options_to_select() {
        String expectedText="Manage profile";
        String actualText = getTextFromElement(attInternetPage.manageProfileTextLink);
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Actual is :" + actualText);

    }
    @When("User clicks Check Availability Button")
    public void user_clicks_check_availability_button() {
        user_clicks_on_internet_text_link();
        attInternetPage.clickCheckAvailabilityButton();

    }

    @Then("User should see a Check for service Tab window")
    public void user_should_see_a_check_for_service_tab_window() {
        String expectedText="Check for service";
        String actualText = getTextFromElement(attInternetPage.textCheckForService);
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Actual is :" + actualText);

    }
    @When("user enters address in input box as {string}")
    public void userEntersAddressInInputBoxAs(String string) {

        user_clicks_check_availability_button();
        attInternetPage.sendAddressTOTextField(string);

    }

    @When("user clicks on Check Availability Button")
    public void user_clicks_on_check_availability_button() {

        attInternetPage.clickCheckAvailabilityButton2();
    }

    @Then("user should be able to see the  result if the Service Available")
    public void user_should_be_able_to_see_the_result_if_the_service_available() {
        String actualText=getTextFromElement(attInternetPage.textMessage);
        String expectedText="Looks like high-speed internet isn’t available at your address. However, you can still get great TV service.";
        Assert.assertEquals(actualText,expectedText);

        System.out.println(actualText);


    }




}


