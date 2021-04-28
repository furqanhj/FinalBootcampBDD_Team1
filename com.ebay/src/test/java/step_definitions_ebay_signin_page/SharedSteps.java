package step_definitions_ebay_signin_page;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedSteps extends BaseAPI {

    WebDriver driver;
    WebDriverWait driverWait;
    Actions actions;
    String url = "https://www.ebay.com";

    @Before
    public void setUp(){
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        actions = new Actions(driver);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}