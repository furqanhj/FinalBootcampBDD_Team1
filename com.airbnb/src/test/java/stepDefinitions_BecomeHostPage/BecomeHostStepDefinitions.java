package stepDefinitions_BecomeHostPage;

import becomeHostPageKE.BecomeHostPage;
import common.BaseAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BecomeHostStepDefinitions extends BaseAPI {

    BecomeHostPage becomeHostPage;

    @When("user clicks Become Host Button")
    public void user_clicks_become_host_button(){
       // clickElement(driver.findElement(By.xpath("//a[normalize-space()='Become a host']")));
          becomeHostPage=new BecomeHostPage();
          becomeHostPage.clickBecomeHostButton();

}
    @When("user clicks get Started Button")
    public void userClicksGetStartedButton() {
        becomeHostPage.login();
    }
    @Then("user should be launched on result page")
    public void user_should_be_launched_on_result_page(){
        becomeHostPage.isElementDisplayed(becomeHostPage.continueBtn);


   }

    @When("user enters emails as {string}")
    public void userEntersBusinessEmailsAs(String  emails) {
        becomeHostPage.enterEmails(emails);
        
    }

    @When("user enters phone numbers as {string}")
    public void userEntersPhoneNumbersAs(String phoneNumbers) {
        becomeHostPage.enterPhoneNumbers(phoneNumbers);
        
    }

    @Then("user unchecks the check box")
    public void uncheckTheCheckBox() {

        isElementDisplayed(becomeHostPage.checkedBox);

    }
    @And("user clicks Why Host on Airbnb Picture Link")
    public void userClicksWhyHostOnAirbnbPictureLink() {
        becomeHostPage=new BecomeHostPage();


        becomeHostPage.clickWhyHostOnAirbnb();
    }

    @When("user clicks play video Button")
    public void userClicksPlayVideoButton()  {
        becomeHostPage=new BecomeHostPage();

        becomeHostPage.playMoviePlayerBtn();
    }

    @Then("video should be playing")
    public void videoShouldBePlaying() {
        becomeHostPage.isElementEnabled(becomeHostPage.moviePauseBtn);


    }




//    @When("Click on Get Started Button")
//    public void click_on_get_started_button() {
//
//    }
//
//    @And("Scroll down the Countries")
//    public void scroll_down_the_countries() {
//
//    }
//
//    @When("Select your country")
//    public void select_your_country() {
//
//    }
//
//    @Then("user should see his county selected")
//    public void user_should_see_his_county_selected() {
//
//    }


}
