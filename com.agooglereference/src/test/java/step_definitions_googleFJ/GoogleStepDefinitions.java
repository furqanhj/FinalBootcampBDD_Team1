package step_definitions_googleFJ;

import common.BaseAPI;
import googleHomepageFJ.GoogleHomepage;
import io.cucumber.java.*;
import io.cucumber.java.en.*; //Always use a * instead of method name like "Given" etc (This will import ALL methods)
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoogleStepDefinitions extends BaseAPI {

    String url = "https://www.google.com";
    GoogleHomepage homepage;

    @Before
    public void setUp(){
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);

        actions = new Actions(driver);
    }

    @Given("user is on the google homepage")
    public void user_is_on_the_google_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @When("user enters a text as {string}")
    public void user_enters_a_text_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        homepage = new GoogleHomepage();
        homepage.enterTextInSearchBar(string);
    }

    @When("user clicks on the Google Search button")
    public void user_clicks_on_the_google_search_button() {
        // Write code here that turns the phrase above into concrete actions
        homepage = new GoogleHomepage();
        homepage.clickOnAfterTextGoogleSearchButton();
    }

    @Then("user should be able to see the search result page")
    public void user_should_be_able_to_see_the_search_result_page() {
        // Write code here that turns the phrase above into concrete actions
        homepage = new GoogleHomepage();
        String expectedText = "Shop samsung watch 3";
        String actualText = getTextFromElement(homepage.actualTextOnSearchResultPage);

        Assert.assertEquals(expectedText, actualText, "TEXT DO NOT MATCH");
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
