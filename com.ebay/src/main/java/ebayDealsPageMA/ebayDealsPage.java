package ebayDealsPageMA;

import static ebayDealsPageMA.ebayToysPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ebayDealsPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_TECH_LINK_BUTTON)
    public WebElement techLinkButton;
    @FindBy (xpath = WEB_ELEMENT_DAILY_DEALS_LINK)
    public WebElement dailyDealsLink;
    @FindBy (xpath =WEB_ELEMENT_APPLE_MACBOOK_ON_TECH_PAGE )
    public WebElement appleMacbookOnTECHPage;

    public ebayDealsPage (){
        PageFactory.initElements(driver, this);

    }

    public void navigateToDealsPage (){
        clickElement(dailyDealsLink);

    }
    public void clickOnTechLink (){
        clickElement(techLinkButton);
    }

    @Override
    public void clickElement(WebElement elementToClick) {

    }
/////////////////////////////////////////////////////////////////////////////////

    public void sendKeysToSearchFieldUsingTable(String keys){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,keys);
    }

    public void verifyAttributeValueFromSearchField(String keys){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),keys);

    }


    }


