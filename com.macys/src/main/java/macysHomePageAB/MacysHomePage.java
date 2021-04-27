package macysHomePageAB;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static macysHomePageAB.MacysHomePageWebElement.*;

public class MacysHomePage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_DEALS_LINK)
    public WebElement dealsLink;

    @FindBy(xpath = WEB_ELEMENT_DEALS_OFFER)
    public WebElement dealsOffer;

    public MacysHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnDealsLink(){

        clickElement(dealsLink);
    }
//########################################################################################


}