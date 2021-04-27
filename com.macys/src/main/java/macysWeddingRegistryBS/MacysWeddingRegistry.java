package macysWeddingRegistryBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static macysWeddingRegistryBS.MacysWeddingRegistryWebElements.*;

public class MacysWeddingRegistry extends BaseAPI {

    public MacysWeddingRegistry(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_DREAM_FUND_BUTTON)
    public WebElement dreamFundButton;
    @FindBy(xpath = WEB_ELEMENT_DREAM_FUND_IMAGE)
    public WebElement dreamFundImage;

    public void searchRegistryItemsUsingTable(String keys){
        typeOnElementNEnter(WEB_ELEMENT_REGISTRY_SEARCH_FIELD,keys);
    }

    public void verifyAttributeValueFromSearchField(String value){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_REGISTRY_SEARCH_FIELD,"value"),value);
    }

    public void verifyPageTitle(String title){
        Assert.assertTrue(isTitleTrue(title));
    }

    public void clickOnDreamFundButton(){
//        clickElement(dreamFundButton);
        clickJScript(dreamFundButton);
    }
}
