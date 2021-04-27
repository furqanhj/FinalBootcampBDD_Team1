package stepDefinitions;

import common.BaseAPI;
import ebayMusicPageAB.EbayMusicPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class EbayMusicStepDefinitions extends BaseAPI {



    String url = "https://www.ebay.com/b/Music/bn_7000710860";
    EbayMusicPage ebayMusicPage = new EbayMusicPage();

    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
//        driverWait = new WebDriverWait(driver, 10);
    }
    @AfterTest
    public void tearDown() {

        driver.close();
        driver.quit();
        driver.manage().window().setPosition(new Point(-2000, 0));
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("User is on Ebay Music page")
    public void user_is_on_the_ebay_music_pages() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

//        driver.manage().window().setPosition(new Point(-2000, 0));
    }


    @When("User enters {string} in the search field")
    public void userEntersInTheSearchField(String Keys) throws InterruptedException {
        ebayMusicPage.sendKeysToSearchFieldUsingTable(Keys);
    }

    @Then("User should see {string} as the current URL")
    public void userShouldSeeAsTheCurrentURL(String Keys) {
        ebayMusicPage.verifyPageURLIsTrue(Keys);
    }

    @And("User should see {string} written in the search field")
    public void userShouldSeeWrittenInTheSearchField(String Keys) {
        ebayMusicPage.verifyAttributesValuesFromSearchField(Keys);
    }
}
