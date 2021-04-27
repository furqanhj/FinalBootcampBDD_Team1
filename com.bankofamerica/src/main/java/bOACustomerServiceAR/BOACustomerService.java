package bOACustomerServiceAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static bOACustomerServiceAR.BOACustomerServiceWebElements.*;

public class BOACustomerService extends BaseAPI {



@FindBy( css = WEB_ELEMENT_CONTACT_US_LINK)
    WebElement contactUsLink;

@FindBy (xpath = WEB_ELEMENT_SEARCH_FIELD)
    WebElement searchField;

@FindBy (xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;


public BOACustomerService(){
    PageFactory.initElements(driver,this);
}

public void enterTextInSearchField(String text){
clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_FIELD);
typeOnElement(WEB_ELEMENT_SEARCH_FIELD, text);
}

public void clickSearchButton(){
    implicitWait(10);
}

public void verifySearchFieldValues(String value){
    Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),value);
}


}
