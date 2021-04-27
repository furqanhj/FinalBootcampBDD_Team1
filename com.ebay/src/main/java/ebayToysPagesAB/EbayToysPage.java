package ebayToysPagesAB;

//action method in this class

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static ebayToysPagesAB.EbayToysPageWebElements.WEB_ELEMENT_SEARCH_FIELD;

public class EbayToysPage extends BaseAPI {

    public EbayToysPage(){
        PageFactory.initElements(driver, this);

    }

    public void sendKeysToSearchFieldUsingTable(String Keys){

        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,Keys);


    }

    public void verifyAttributesValuesFromSearchField(String Keys){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"),Keys);

    }
    public void verifyPageURLIsTrue(String URL){
        Assert.assertTrue(isCurrentUrlTrue(URL));
    }
}
