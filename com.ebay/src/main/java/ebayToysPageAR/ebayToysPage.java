package ebayToysPageAR;

//action methods in this class


import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static ebayToysPageAR.ebayToysPageWebElements.*;

public class ebayToysPage extends BaseAPI {

    public ebayToysPage(){
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchFieldUsingTable(String keys){
    typeOnElement(WEB_ELEMENT_SEARCH_FIELD,keys);
    }

    public void verifyAttributeValueFromSearchField(String keys){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),keys);

    }
    public void verifyPageURLIsTrue(String URL){
        Assert.assertTrue(isCurrentUrlTrue(URL));

    }
}
