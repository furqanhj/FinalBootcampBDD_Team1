package wweHomepageFJ;

import static wweHomepageFJ.WWEHomepageLocators.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WWEHomepage extends BaseAPI {

    /**
     * Initialization of elements on ESPN Homepage
     */
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_MORE_OPTIONS_ON_HEADER)
    public WebElement dropdownMoreOptionsOnHeader;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_WWE_LINK)
    public WebElement buttonWWELink;

    /**
     * Initialization of elements on WWE Homepage
     */
    @FindBy(xpath = WEB_ELEMENT_BUTTON_WRESTLE_MANIA_37_LINK)
    public WebElement buttonWrestleMania37Link;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_TICKETS_LINK)
    public WebElement buttonTicketsLink;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_TITLE_WATCH_LINK)
    public WebElement buttonTitleWatch;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_WRESTLER_PROFILE_LINK)
    public WebElement buttonWrestlerProfilesLink;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_AJ_STYLES_PROFILE_PAGE_LINK)
    public WebElement buttonAJStylesProfilePageLink;


    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_ON_WWE_HEADER)
    public List<WebElement> actualNumOfLinksOnWWEHomepageHeader;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_TITLE_WATCH_PAGE)
    public WebElement actualTextOnTitleWatchPage;
    @FindBy(xpath = WEB_ELEMENT_IMAGE_DISPLAYED_OF_AJ_STYLES)
    public WebElement imageDisplayedOfAJStyles;

    public WWEHomepage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToWWEHomepage(){
        clickJScript(dropdownMoreOptionsOnHeader);
        waitTimeUsingImplicit(3);
        clickJScript(buttonWWELink);
        clickElement(buttonWWELink);
    }

    public void clickOnWrestleMania37Link(){
        clickElement(buttonWrestleMania37Link);
    }

    public void clickOnTicketsLink(){
        clickElement(buttonTicketsLink);
        switchToNewWindow();
    }

    public void clickOnTitleWatchLink(){
        clickElement(buttonTitleWatch);
        waitTimeUsingImplicit(10);
    }

    public void clickWrestlerProfilesLink(){
        clickElement(buttonWrestlerProfilesLink);
    }

    public void clickOnAJStylesProfileLink(){
        clickElement(buttonAJStylesProfilePageLink);
    }
}
