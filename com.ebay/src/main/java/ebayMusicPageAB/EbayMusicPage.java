package ebayMusicPageAB;

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static ebayMusicPageAB.EbayMusicPageElement.WEB_ELEMENT_SEARCH_FIELD;

public class EbayMusicPage extends BaseAPI {

        public EbayMusicPage(){
            PageFactory.initElements(driver, this);

        }

        public void sendKeysToSearchFieldUsingTable(String Keys) throws InterruptedException {

            typeOnElementNEnter(WEB_ELEMENT_SEARCH_FIELD,Keys);
                Thread.sleep(10000);


        }

        public void verifyAttributesValuesFromSearchField(String Keys){
            Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"),Keys);

        }
        public void verifyPageURLIsTrue(String URL){
            Assert.assertTrue(isCurrentUrlTrue(URL));
        }


    }





