package attTVPageFJ;

import static attTVPageFJ.TVPageLocators.*;

import attHomepageFJ.ATTHomepage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TVPage extends BaseAPI {

    ATTHomepage homepage = new ATTHomepage();

    @FindBy(xpath = WEB_ELEMENT_BUTTON_ATT_TV_LINK_ON_HEADER)
    public WebElement buttonAttTVOnHeader;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CHANNEL_LINE_UP_ON_HEADER)
    public WebElement buttonChannelLineupOnHeader;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_PACKAGES_LINK_ON_HEADER)
    public WebElement buttonPackagesOnHeader;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_DEVICE_N_FEATURES_LINK_ON_HEADER)
    public WebElement buttonDeviceNFeatureOnHeader;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SPORTS_LINK_ON_HEADER)
    public WebElement buttonSportsOnHeader;
    @FindBy(xpath = WEB_ELEMENT_BUNDLES_LINK_ON_HEADER)
    public WebElement buttonBundlesOnHeader;
    @FindBy(xpath = WEB_ELEMENT_DIRECT_TV_LINK_ON_HEADER)
    public WebElement buttonDirectTVOnHeader;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_ON_HEADER_TV_PAGE)
    public List<WebElement> actualNumberOfLinksOnTVPageHeader;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_CHANNEL_LINEUP_PAGE)
    public WebElement actualTextOnChannelLineupPage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_DEVICE_N_FEATURES_PAGE)
    public WebElement actualTextOnDeviceNFeaturesPage;
    @FindBy(xpath = WEB_ELEMENT_TABLE_OF_PACKAGES_ON_PACKAGES_PAGE)
    public WebElement tableOfPackagesOnPackagesPage;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SHOP_ATT_BUNDLES)
    public WebElement buttonShopAttBundles;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_DIRECT_TV_PAGE)
    public WebElement actualTextOnDirectTVPage;

    public TVPage() {
        PageFactory.initElements(driver, this);
    }

    public void hoverOverAttTVlink() {
        mouseHoverJScript(buttonAttTVOnHeader);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverChannelLineupLink() {
        mouseHoverJScript(buttonChannelLineupOnHeader);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverPackagesLink() {
        mouseHoverJScript(buttonPackagesOnHeader);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverDeviceNFeaturesLink() {
        mouseHoverJScript(buttonDeviceNFeatureOnHeader);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverSportsLink() {
        mouseHoverJScript(buttonSportsOnHeader);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverBundlesLink() {
        mouseHoverJScript(buttonBundlesOnHeader);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverDirectTVLink() {
        mouseHoverJScript(buttonDirectTVOnHeader);
        waitTimeUsingImplicit(5);
    }

    public void hoverOverAllLinksOnHeader() {
        hoverOverAttTVlink();
        hoverOverChannelLineupLink();
        hoverOverPackagesLink();
        hoverOverDeviceNFeaturesLink();
        hoverOverSportsLink();
        hoverOverBundlesLink();
        hoverOverDirectTVLink();
    }

    public void clickOnAttTVLink(){
        clickElement(buttonAttTVOnHeader);
        waitTimeUsingFluent(5);
    }

    public void clickOnChannelLineupLink(){
        clickElement(buttonChannelLineupOnHeader);
        waitTimeUsingFluent(5);
    }

    public void clickOnPackagesLink(){
        clickElement(buttonPackagesOnHeader);
        waitTimeUsingFluent(5);
    }

    public void clickOnDeviceNFeaturesLink(){
        clickElement(buttonDeviceNFeatureOnHeader);
        waitTimeUsingFluent(5);
    }

    public void clickOnSportsLink(){
        clickElement(buttonSportsOnHeader);
        waitTimeUsingFluent(5);
    }

    public void clickOnBundlesLink(){
        clickElement(buttonBundlesOnHeader);
        waitTimeUsingFluent(5);
    }

    public void clickOnDirectTVLink(){
        clickElement(buttonDirectTVOnHeader);
        waitTimeUsingFluent(5);
    }

}
