package expediaStepDefinitionsFJ;

import common.BaseAPI;
import expediaSignInPageFJ.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedSteps extends BaseAPI {

    SignInPage signInPage;

    WebDriver driver;
    WebDriverWait driverWait;
    String url = "https://www.expedia.com/";
    Actions actions;

    @Before
    public void setUp(){
        signInPage = new SignInPage();
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        driverWait.until(ExpectedConditions.visibilityOf(signInPage.buttonSignInInsideDropdown));
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
