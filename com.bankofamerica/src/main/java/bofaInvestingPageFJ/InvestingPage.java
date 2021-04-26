package bofaInvestingPageFJ;

import static bofaInvestingPageFJ.InvestingPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.event.KeyEvent;
import java.util.List;

public class InvestingPage extends BaseAPI {

    /**
     * Initialization of elements on BofA Homepage
     */
    @FindBy(xpath = WEB_ELEMENT_BUTTON_INVESTING_LINK_DROPDOWN)
    public WebElement buttonInvestingLinkDropdown;
    @FindBy(css = WEB_ELEMENT_BUTTON_GET_STARTED_INVESTING_DROPDOWN)
    public WebElement buttonGetStartedInInvestingDropdown;

    /**
     * Initialization of elements on Investing Page
     */
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_WHY_MERRILL_OPTION)
    public WebElement dropdownWhyMerrillOption;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_INVESTING_AND_TRADING_OPTION)
    public WebElement dropdownInvestingNTradingOption;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_GUIDANCE_AND_RETIREMENT_OPTION)
    public WebElement dropdownGuidanceNRetirementOption;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_RESEARCH_OPTION)
    public WebElement dropdownResearchOption;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_INVESTOR_EDUCATION_OPTION)
    public WebElement dropdownInvestorEducationOption;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_OPEN_AN_ACCOUNT_OPTION)
    public WebElement dropdownOpenAnAccountOption;

    @FindBy(id = WEB_ELEMENT_INPUT_BOX_GET_A_QUOTE)
    public WebElement inputBoxGetAQuote;
    @FindBy(id = WEB_ELEMENT_BUTTON_GET_A_QUOTE_SEARCH)
    public WebElement buttonGetAQuoteSearch;

    @FindBy(id = WEB_ELEMENT_INPUT_BOX_SEARCH_MERRILL_EDGE)
    public WebElement inputBoxSearchMerrillEdge;
    @FindBy(id = WEB_ELEMENT_BUTTON_SEARCH_MERRILL_EDGE)
    public WebElement buttonSearchMerrillEdge;

    @FindBy(id = WEB_ELEMENT_BUTTON_PLAY_VIDEO)
    public WebElement buttonPlayVideo;
    @FindBy(xpath = WEB_ELEMENT_VIDEO_BOTTOM_PANEL_WITH_ALL_BUTTONS)
    public WebElement videoBottomPanelWithAllButtons;
    @FindBy(xpath = WEB_ELEMENT_FULL_SCREEN_BUTTON)
    public WebElement buttonFullScreen;
    @FindBy(id = WEB_ELEMENT_VIDEO_FRAME_TO_HOVER_OVER)
    public WebElement videoFrameToHoverOver;
    @FindBy(xpath = WEB_ELEMENT_VIDEO_BODY_WHEN_IN_FULL_SCREEN)
    public WebElement videoBodyWhenInFullScreenMode;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUM_OF_LINKS_ON_INVESTING_PAGE_HEADER)
    public List<WebElement> actualNumOfLinksOnInvestingPageHeader;
    @FindBy(xpath = WEB_ELEMENT_PLAY_PAUSE_BUTTON_IN_VIDEO_PANEL)
    public WebElement buttonPlayPauseInVideoPanel;
    @FindBy(xpath = WEB_ELEMENT_GET_QUOTE_SEARCH_RESULT_MODAL_WINDOW_BODY)
    public WebElement getQuoteSearchResultModalWindowBody;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_MERRILL_EDGE_LANDED_PAGE)
    public WebElement actualTextOnSearchMerrillEdgeLandedPage;


    public InvestingPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToInvestingPage(){
        clickElement(buttonInvestingLinkDropdown);
//        clickElement(buttonGetStartedInInvestingDropdown);
        clickJScript(buttonGetStartedInInvestingDropdown);
    }

    public void hoverOverWhyMerrillDropdown(){
        mouseHoverJScript(dropdownWhyMerrillOption);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverInvestingNTradingDropdown(){
        mouseHoverJScript(dropdownInvestingNTradingOption);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverGuidanceNRetirementDropdown(){
        mouseHoverJScript(dropdownGuidanceNRetirementOption);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverResearchDropdown(){
        mouseHoverJScript(dropdownResearchOption);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverInvestorEducationDropdown(){
        mouseHoverJScript(dropdownInvestorEducationOption);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverOpenAnAccountDropdown(){
        mouseHoverJScript(dropdownOpenAnAccountOption);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverAllOptionsOnHeader(){
        hoverOverWhyMerrillDropdown();
        hoverOverInvestingNTradingDropdown();
        hoverOverGuidanceNRetirementDropdown();
        hoverOverResearchDropdown();
        hoverOverInvestorEducationDropdown();
        hoverOverOpenAnAccountDropdown();
    }

    public void scrollDownTillVideoFrame() throws InterruptedException {
        robotScrollDown(50);
    }

    public void clickPlayVideoButton() throws InterruptedException {
        clickJScript(buttonPlayVideo);
        robotScrollDown(5);
    }

    public void hoverOverVideoFrame(){
        if(!isElementDisplayed(videoBottomPanelWithAllButtons))
            mouseHoverJScript(videoFrameToHoverOver);
    }

    public void clickOnPlayPauseButton(){
        clickElement(buttonPlayPauseInVideoPanel);
    }

    public void clickOnFullScreenButton(){
        clickJScript(buttonFullScreen);
    }

    public void exitFullScreen(){
        robot.keyPress(KeyEvent.VK_ESCAPE);
    }

    public void enterTextInGetQuoteField(String getQuoteText){
        sendKeysToElement(inputBoxGetAQuote, getQuoteText);
    }

    public void clickSearchGetQuoteButton(){
        clickElement(buttonGetAQuoteSearch);
    }

    public void enterTextInSearchMerrillEdgeField(String searchMerrillEdgeText){
        sendKeysToElement(inputBoxSearchMerrillEdge, searchMerrillEdgeText);
    }

    public void clickSearchMerrillEdgeSearchButton(){
        clickElement(buttonSearchMerrillEdge);
    }

}
