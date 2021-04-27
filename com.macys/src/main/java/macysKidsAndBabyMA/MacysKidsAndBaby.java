package macysKidsAndBabyMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static macysKidsAndBabyMA.macysKidsAndBabyWebElement.*;

public class MacysKidsAndBaby extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_SEARCH_FIELD)
    public WebElement searchField;



    public MacysKidsAndBaby() {
        PageFactory.initElements(driver, this);
    }


    public void searchKidsAndBabyItemsUsingTable(String keys) {
        typeOnElementNEnter(WEB_ELEMENT_SEARCH_FIELD, keys);
    }

    public void verifyAttributeValueFromSearchField(String value) {
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"), value);
    }

    public void verifyPageTitle(String title) {
        Assert.assertTrue(isTitleTrue(title));


    }
}