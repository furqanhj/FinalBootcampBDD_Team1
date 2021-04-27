package stepDefinitions;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jsoup.Connection;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChaseSharedSteps extends BaseAPI {

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
}
