package bankPfAmericaAB;


import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static bankPfAmericaAB.BankOfAmericaWebElement.*;



public class BankOfAmericaPage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BAR)
    public WebElement inputSearchBar;

    @FindBy(xpath=WEB_ELEMENT_CREDIT_CARD)
    public WebElement creditCard;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;


public BankOfAmericaPage(){
    PageFactory.initElements(driver, this);


}

public void enterTextInSearchBar(String sendKeys){
    sendKeysToElement(inputSearchBar,sendKeys );
    clickElement(searchButton);
    implicitWait(5);

}

}
