package macysDealsAR;

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static macysDealsAR.MacysDealsWebElements.*;

public class MacysDeals extends BaseAPI {

    public MacysDeals(){
        PageFactory.initElements(driver, this);
    }

    public void SearchForItemsUsingTable(String keys){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,keys);

    }

    public void verifyAttributeValueFromSearchField(String value){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"),value);
    }

    public void verifyPageTitle(String title){
        Assert.assertTrue(isTitleTrue(title));


        }
    }














