package stepDefinitions_BecomeHostPage;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedSteps extends BaseAPI {
    @Before
    public void setUp(){
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
    }
    @Given("user is on airbnb website")
    public void user_is_on_airbnb_website() {

        driver.get("https://www.airbnb.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
