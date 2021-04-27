package stepDefinitions;

import chaseOpenAnAccountAR.ChaseOpenAnAccount;
import common.BaseAPI;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChaseStepDefinitions extends BaseAPI {
    WebDriver driver;
    WebDriverWait driverWait;
    String url = "https://account.chase.com/consumer/banking/seo?jp_aid_a=T_65596&jp_aid_p=chasehome_3/hero";
    ChaseOpenAnAccount chase;

    @Given("User is on the Chase Open an account page")
    public void user_is_on_the_chase_open_an_account_page() throws InterruptedException {
        chase = new ChaseOpenAnAccount();
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        chase.wait(20);
    }

    @When("User clicks on Open An Account button")
    public void user_clicks_on_open_an_account_button() {

    }

    @Then("User will see the header {string}")
    public void user_will_see_the_header(String string) {

    }





}
