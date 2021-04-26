package stepDefinitions;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysDealsAR.MacysDeals;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MacysDealsStepDefinitions extends BaseAPI {

    String url = "https://www.macys.com/shop/coupons-deals?cm_sp=navigation-_-top_nav-_-deals&lid=glbtopnav_deals-us";
    MacysDeals macysDeals = new MacysDeals();

    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();

    }

    @Given("User is on Macy's Deals page")
    public void User_is_on_Macys_Deals_Page_() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

//////////////////////////////////////////////////////////////////////////////////////////////////
    }
    @When("User enters {string} in search field")
        public void userEntersInSearchField (String keys){
            macysDeals.SearchForItemsUsingTable(keys);

        }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String keys) {
        macysDeals.verifyAttributeValueFromSearchField(keys);
    }

    @Then("User should see {string} as current title")
    public void userShouldSeeAsCurrentTitle(String title) {
        macysDeals.verifyPageTitle(title);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////

    }


