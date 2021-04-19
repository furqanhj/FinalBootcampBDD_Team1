package googleHomepageFJ;

import static googleHomepageFJ.GoogleHomepageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_INPUT_SEARCH_BAR)
    public WebElement inputSearchBar;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_GOOGLE_SEARCH)
    public WebElement buttonGoogleSearch;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_FEELING_LUCKY_SEARCH)
    public WebElement buttonFeelingLuckSearch;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_AFTER_TEXT_GOOGLE_SEARCH)
    public WebElement buttonAfterTextGoogleSearch;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_AFTER_TEXT_FEELING_LUCKY_SEARCH)
    public WebElement buttonAfterTextFeelingLucky;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_RESULT_PAGE)
    public WebElement actualTextOnSearchResultPage;

    public GoogleHomepage() {
        PageFactory.initElements(driver, this);
    }

    public void enterTextInSearchBar(String enterText){
        sendKeysToElement(inputSearchBar, enterText);
    }

    public void clickOnGoogleSearchButton(){
        clickElement(buttonGoogleSearch);
    }

    public void clickOnAfterTextGoogleSearchButton(){
        clickElement(buttonAfterTextGoogleSearch);
    }

    public void doSearchUsingGoogleSearchButton(String textToSearch){
        enterTextInSearchBar(textToSearch);
        clickOnGoogleSearchButton();
    }
}
