package attTVPageFJ;

public class TVPageLocators {

    /**
     * Locators on TV PAGE
     */
    // AT&T TV link on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_ATT_TV_LINK_ON_HEADER = "//div[@id='HEADBAND0']/ul/li[1]";
    // Channel line-up link on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CHANNEL_LINE_UP_ON_HEADER = "//div[@id='HEADBAND0']/ul/li[2]";
    // Packages link on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_PACKAGES_LINK_ON_HEADER = "//div[@id='HEADBAND0']/ul/li[3]";
    // Device & features link on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_DEVICE_N_FEATURES_LINK_ON_HEADER = "//div[@id='HEADBAND0']/ul/li[4]";
    // Sports link on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SPORTS_LINK_ON_HEADER = "//div[@id='HEADBAND0']/ul/li[5]";
    // Bundles link on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENT_BUNDLES_LINK_ON_HEADER = "//div[@id='HEADBAND0']/ul/li[6]";
    // Direct TV link on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENT_DIRECT_TV_LINK_ON_HEADER = "//div[@id='HEADBAND0']/ul/li[7]";

    /**
     * Locators required for Assertions
     */
    // Actual number of links on the header of TV Page: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_ON_HEADER_TV_PAGE = "//div[@id='HEADBAND0']/ul/li";
    // Actual text on Channel lineup page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_CHANNEL_LINEUP_PAGE = "//h1[@data-test-id='panelHeading_2D7Lw']";
    // Actual text on Device & Features Page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_DEVICE_N_FEATURES_PAGE = "//p[@data-test-id='panelHeading_35h93']/h2";
    // Table of TV packages displayed on Packages page: (XPATH - custom)
    public static final String WEB_ELEMENT_TABLE_OF_PACKAGES_ON_PACKAGES_PAGE = "//table[@class='mar-b-xs _3Jcbm ']";
    // Shop AT&T Bundles button on Bundles page: (XPATHJ - custom)
    public static final String WEB_ELEMENT_BUTTON_SHOP_ATT_BUNDLES = "//a[@href='/buy/bundles/?product_suite=NDTVN_NBB&contract=EDSP']";
    // Actual Text on DirectTV page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_DIRECT_TV_PAGE = "//*[@id=\"STORYOFFER2story\"]/div/div/div/h2";

}
