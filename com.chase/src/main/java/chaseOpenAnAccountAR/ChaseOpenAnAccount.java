package chaseOpenAnAccountAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static chaseOpenAnAccountAR.ChaseOpenAnAccountWebElements.*;

public class ChaseOpenAnAccount extends BaseAPI {

    public ChaseOpenAnAccount(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = WEB_ELEMENT_OPEN_ACCOUNT_HEADER)
    public WebElement openAccountHeader;

    public void verifyOpenAnAccountPageHeader(){
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_OPEN_ACCOUNT_HEADER),"Enjoy $225");
    }




}
