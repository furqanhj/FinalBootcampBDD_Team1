package stepDefinitions;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChaseSharedSteps extends BaseAPI {


    String url = "https://www.chase.com/business";


    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }





    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
