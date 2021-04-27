package ebayFashionBS;

//ACTION METHODS

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static ebayFashionBS.EbayFashionWebElements.*;

public class EbayFashion extends BaseAPI {

    public EbayFashion() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_SEARCH_FIELD)
    public WebElement searchField;

    public void sendKeysToSearchFieldUsingTable(String keys){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,keys);
    }

    public void verifyAttributeValuesFromSearchField(String keys){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),keys);
    }
    public void verifyPageURLIsTrue(String URL){
        Assert.assertTrue(isCurrentUrlTrue(URL));
    }


}
