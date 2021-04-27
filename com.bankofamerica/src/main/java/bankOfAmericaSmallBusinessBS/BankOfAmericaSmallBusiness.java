package bankOfAmericaSmallBusinessBS;

import common.BaseAPI;
import static bankOfAmericaSmallBusinessBS.BankOfAmericaWebElements.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmericaSmallBusiness extends BaseAPI {

@FindBy(id = WEB_ELEMENT_SEARCH_INPUT_BOX)
    WebElement searchBox;
@FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;
@FindBy(xpath = WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULTS_FOR)
    public WebElement expectedTextResultsFor;

public BankOfAmericaSmallBusiness(){
    PageFactory.initElements(driver, this);
}


public void enterTextInSearchBox(String searchText){

    sendKeysToElement(searchBox,searchText);
    waitTimeUsingImplicit(5);
}

public void clickSearchButton(){
    clickJScript(searchButton);
//    waitForVisibilityOfElement(expectedTextResultsFor);
    waitTimeUsingImplicit(10);

}














}


