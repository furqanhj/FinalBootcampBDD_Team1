package macysStepDefinitionsFJ;

import emailSignupPageFJ.EmailSignupPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class MacysStepDefinitions {

    EmailSignupPage emailSignup;

    @Given("user is on the Signup For Emails Page")
    public void user_is_on_the_signup_for_emails_page() throws InterruptedException {
        emailSignup = new EmailSignupPage();
        emailSignup.navigateToEmailSignupPage();
    }


    @When("user enters email address as {string}")
    public void userEntersEmailAddressAs(String email) {
        emailSignup = new EmailSignupPage();
        emailSignup.enterTextInEmailField(email);
    }

    @And("user enters zip code as {string}")
    public void userEntersZipCodeAs(String zipCode) throws InterruptedException {
        emailSignup = new EmailSignupPage();
        emailSignup.enterTextInZipCode(zipCode);
    }

    @And("user selects a month from the dropdown as {string}")
    public void userSelectsAMonthFromTheDropdownAs(String month) {
        emailSignup = new EmailSignupPage();
        emailSignup.clickOnMonthDropdown();
        emailSignup.selectMonth(month);
    }

    @And("user selects a date from the dropdown {string}")
    public void userSelectsADateFromTheDropdown(String date) {
        emailSignup = new EmailSignupPage();
        emailSignup.clickOnDateDropdown();
        emailSignup.selectDate(date);
    }

    @And("user selects a year from the dropdown")
    public void userSelectsAYearFromTheDropdown() throws InterruptedException {
        emailSignup = new EmailSignupPage();
        emailSignup.clickOnYearDropdown();
        emailSignup.selectYear1983();
    }

    @And("user clicks on the Im Not A Robot Checkbox")
    public void userClicksOnTheImNotARobotCheckbox() throws InterruptedException {
        emailSignup = new EmailSignupPage();
        emailSignup.selectCheckboxImNotARobot();
    }

    @Then("user should not be able to click the submit button, instead an error message should appear")
    public void userShouldNotBeAbleToClickTheSubmitButtonInsteadAnErrorMessageShouldAppear() {
        emailSignup = new EmailSignupPage();
        String actualText = emailSignup.actualTextInvalidEmailErrorMessage.getText();
        String expectedText = "Please enter a valid email address to continue.";

        Assert.assertFalse(emailSignup.compareStrings(expectedText, actualText));
    }


}
