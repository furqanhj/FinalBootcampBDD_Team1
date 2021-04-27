package stepDefinitionsBuildYourOwn;

import common.BaseAPI;
import io.cucumber.java.*;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedSteps extends BaseAPI {
    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
    }
    @Given("user is on BMW website")
    public void user_is_on_BMW_website() {

        driver.get("https://www.bmwusa.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }


    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
