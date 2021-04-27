package bankOfAmericaStepDefinitions;

import aboutUsContactUsPageKE.ContactUsPage;
import bankOfAmericaAboutUsKE.AboutUsPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class StepDefinitions {
    AboutUsPage aboutUsPage;
    ContactUsPage contactUsPage;



    @When("user clicks on About us Text link")
    public void user_clicks_on_about_us_text_link() {
        aboutUsPage = new AboutUsPage();
        aboutUsPage.clickAboutUsMenu();

    }

    @When("user hovers on Our Company TextLink")
    public void user_hovers_on_our_company_text_link() {

        aboutUsPage.hoverOurCompanyTextLink();

    }

    @When("user clicks on Responsible Growth TextLink")
    public void user_clicks_on_responsible_growth_text_link() {
       // user_hovers_on_our_company_text_link();
        aboutUsPage.clickResponsibleGrowthTextLink();

    }

    @Then("user should be launched on result page")
    public void user_should_be_launched_on_result_page() {
        String actualHeadlineText =aboutUsPage.driver.getTitle();
        String expectedHeadlineText ="Bank of America's Focus on Responsible & Sustainable Growth";
        System.out.println(actualHeadlineText);
        Assert.assertEquals(actualHeadlineText, expectedHeadlineText,"Text Not Matching");

    }
    @When("user clicks on Business Practice TextLink")
    public void user_clicks_on_business_practice_text_link() {
        aboutUsPage.clickBusinessPracticesTextLink();

    }

    @Then("user should be launched on Business Practice page")
    public void user_should_be_launched_on_business_practice_page() {
        Assert.assertTrue(aboutUsPage.businessPracticesImage.isDisplayed());

    }
    @When("user clicks What We Offer TextLink")
    public void user_clicks_what_we_offer_text_link() {
        aboutUsPage.clickWhatWeOffer();
    }

    @Then("user should be launched on What We Offer page")
    public void user_should_be_launched_on_what_we_offer_page() {
        Assert.assertTrue(aboutUsPage.whatWeOfferImage.isDisplayed());

    }
    @When("user click on Contact us Text Link")
    public void user_click_on_contact_us_text_link() {
        contactUsPage= new ContactUsPage();
        contactUsPage.clickContactUsTextLink();
    }

    @When("user clicks on Search Field box")
    public void user_clicks_on_search_field_box() {
        contactUsPage.clickInSearchBar();

    }

    @When("user clicks on Billing Dispute TextLink")
    public void user_clicks_on_billing_dispute_text_link() {
        contactUsPage.clickBillingDisputeTextLink();
    }

    @When("user clicks Dispute Debit Card Button")
    public void user_clicks_dispute_debit_card_button() {
        contactUsPage.clickDisputeDebitCardButton();

    }

    @Then("user should be launched on Dispute Debit Card  page")
    public void user_should_be_launched_on_dispute_debit_card_page() {
        contactUsPage.isElementDisplayed(contactUsPage.phoneImage);

    }
    @When("user clicks Facebook Messenger Link")
    public void user_clicks_facebook_messenger_link() {

        contactUsPage.clickFacebookMessengerLink();
    }

    @When("user clicks Continue Btn")
    public void user_clicks_continue_btn() {
        contactUsPage.clickContinueBtn();

    }

    @Then("user should be launched on Bank of America Facebook page")
    public void user_should_be_launched_on_bank_of_america_facebook_page() {
        String str1 =contactUsPage.driver.getCurrentUrl();
        String str2="https://www.facebook.com/BankofAmerica";
        contactUsPage.compareStrings(str1,str2);

    }
    @When("user enters a text as {string}")
    public void user_enters_a_text_as(String string) {
        contactUsPage.enterTextInSearchBar(string);
    }
    @Then("user should be able to see suggestions result")
    public void userShouldBeAbleToSeeSuggestionsResult() {

      String str1= contactUsPage.getTextFromElement(contactUsPage.searchModuleSuggestionSave);
      String str2= "save password";
      contactUsPage.compareStrings(str1,str2);

    }



}
