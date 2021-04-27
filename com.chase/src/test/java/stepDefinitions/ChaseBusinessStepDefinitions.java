package stepDefinitions;

import chaseBusinessBS.ChaseBusiness;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static chaseBusinessBS.ChaseBusinessWebElements.*;


public class ChaseBusinessStepDefinitions {

    WebDriver driver;
    WebDriverWait driverWait;
    String url = "https://www.chase.com/business";

    ChaseBusiness chase;


    @Given("User is on the Chase Business page")
    public void user_is_on_the_chase_business_page() {
        chase = new ChaseBusiness();
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        chase.waitTimeUsingImplicit(5);
    }

    @When("User clicks on Learn More Button under PPP loan update")
    public void user_clicks_on_learn_more_button_under_ppp_loan_update() {
        chase = new ChaseBusiness();
        chase.clickOnPPPLoanLearnMore();
    }

    @Then("User should see {string} header")
    public void user_should_see_header(String string) {
        chase = new ChaseBusiness();

        Assert.assertTrue(chase.isElementDisplayed(chase.pppHeader));

    }

    @When("User clicks on the bonus points Learn More button")
    public void userClicksOnTheBonusPointsLearnMoreButton() {
        chase = new ChaseBusiness();
        chase.clickOnBonusLearnMore();
    }


    @Then("User should see bonus points text on the page")
    public void userShouldSeeBonusPointsTextOnThePage() {
        chase = new ChaseBusiness();
        Assert.assertTrue(chase.isTitleTrue(WEB_ELEMENT_100000_PAGE_TITLE));

    }

    @When("User clicks on the Women on the move Learn More Button")
    public void userClicksOnTheWomenOnTheMoveLearnMoreButton() {
        chase = new ChaseBusiness();
        chase.clickOnWomenOnTheMoveLearnMore();

    }

    @Then("User should be directed to Women on the move page with text as {string}")
    public void userShouldBeDirectedToWomenOnTheMovePageWithText(String arg0) {
        chase = new ChaseBusiness();
        Assert.assertTrue(chase.isElementDisplayed(WEB_ELEMENT_WOMEN_ON_THE_MOVE_IMAGE));

    }
}
