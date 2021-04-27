package stepDefinitions;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import macysKidsAndBabyMA.MacysKidsAndBaby;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedSteps extends BaseAPI {

    WebDriver driver;
    WebDriverWait driverWait;
    String url = "https://www.macys.com/shop/kids-clothes?id=5991&cm_sp=us_hdr-_-kids-%26-baby-_-5991_kids-%26-baby";
    MacysKidsAndBaby macys = new MacysKidsAndBaby();

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
