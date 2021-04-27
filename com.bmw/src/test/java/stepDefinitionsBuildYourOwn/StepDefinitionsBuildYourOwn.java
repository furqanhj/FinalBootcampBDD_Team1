package stepDefinitionsBuildYourOwn;


import bmwBuildYourOwnKE.BMW_BuildYourOwn;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class StepDefinitionsBuildYourOwn {
    BMW_BuildYourOwn bmw_buildYourOwn;
    @When("user clicks on Build Your Own Text link")
    public void user_clicks_on_build_your_own_text_link() {
        bmw_buildYourOwn = new BMW_BuildYourOwn();
        bmw_buildYourOwn.clickBuildYourOwn();

    }

    @When("user clicks SeriesX5 TextLink")
    public void user_clicks_series_x5_text_link() {
        bmw_buildYourOwn.clickSeriesX5TextLink();

    }

    @When("user clicks Series Convertible Select Button")
    public void user_clicks_series_convertible_select_button() {
        bmw_buildYourOwn.clickSeriesConverSelecBtn();

    }

    @When("user clicks Design Button")
    public void user_clicks_design_button() {
        bmw_buildYourOwn.waitForElementToBeClickable(bmw_buildYourOwn.designBtn);
        bmw_buildYourOwn.clickDesignBtn();

    }

    @Then("user should be launched on Choose Exterior Designs and Trims page")
    public void user_should_be_launched_on_choose_exterior_designs_trims_page() {
        bmw_buildYourOwn.waitForVisibilityOfElement(bmw_buildYourOwn.zipCodeAlert);
        Assert.assertTrue(bmw_buildYourOwn.zipCodeAlert.isDisplayed());

    }
    @When("user enters his Zip Code as {int}")
    public void user_enters_his_zip_code_as(Integer int1) {
        user_clicks_design_button();
        bmw_buildYourOwn.enterZipCode();
    }

    @Then("user should be launched on the zip code location")
    public void user_should_be_launched_on_the_zip_code_location() {

        bmw_buildYourOwn.waitTimeUsingImplicit(3);
        Assert.assertTrue(bmw_buildYourOwn.validatingEnteringZipCode.isDisplayed());

    }
    @When("user clicks Next Color Button")
    public void user_clicks_next_color_button() {
        user_enters_his_zip_code_as(22192);
        bmw_buildYourOwn.clickNextColor();

    }

    @When("user clicks  Jet Black Color Button")
    public void user_clicks_jet_black_color_button() {
        bmw_buildYourOwn.clickJetBlackColorBtn();

    }

    @Then("user should see the car Color changed to Jet Black")
    public void user_should_see_the_car_color_changed_to_jet_black() {
        String str1=bmw_buildYourOwn.getTextFromElement(bmw_buildYourOwn.jetBlackText);
        String str2="JET BLACK";
        bmw_buildYourOwn.compareStrings(str1,str2);

    }



}

