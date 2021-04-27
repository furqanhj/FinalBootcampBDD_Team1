package macysStepDefinations;

import common.BaseAPI;
import io.cucumber.java.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedSteps extends BaseAPI {

 String URL="https://www.macys.com/";

  @Before
  public void setup(){
    driver=getLocalDriver("chrome");
    driverWait=new WebDriverWait(driver,10);
    driver.get(URL);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();


  }
@After
    public void tearDown(){
     driver.close();
     driver.quit();


}


}
