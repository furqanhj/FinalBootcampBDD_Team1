package stepDefinitions;

import common.BaseAPI;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sharedSteps extends BaseAPI {

    WebDriver driver;
    WebDriverWait driverWait;
    String url = "https://www.bankofamerica.com/smallbusiness/";
    Actions actions;

    @Before
    public void setUp(){
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






