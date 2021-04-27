package stepDefinitions;

import common.BaseAPI;
import ebayFashionBS.EbayFashion;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbaySharedSteps extends BaseAPI {


    String url = "https://www.ebay.com/b/Fashion/bn_7000259856";


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
