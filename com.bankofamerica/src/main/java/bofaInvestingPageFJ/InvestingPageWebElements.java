package bofaInvestingPageFJ;

public class InvestingPageWebElements {

    /**
     * Locators on Bank Of America homepage
     */
    // Investing link Dropdown on Bank of america homepage header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_INVESTING_LINK_DROPDOWN = "//ul[@class='main-nav-links']/li[7]/a[@id='navInvesting']";
    // Get Started button to navigate to Investing Page: (CSS)
    public static final String WEB_ELEMENT_BUTTON_GET_STARTED_INVESTING_DROPDOWN = "#btnInvesting";

    /**
     * Locators on Investing Page
     */
    // Why Merrill dropdown menu on Investing Page: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_WHY_MERRILL_OPTION = "//div[@id='dvMenuLevel_1']/ul/li[1]";
    // Investing & Trading dropdown menu on Investing Page: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_INVESTING_AND_TRADING_OPTION = "//div[@id='dvMenuLevel_1']/ul/li[2]";
    // Guidance & Retirement dropdown menu on Investing Page: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_GUIDANCE_AND_RETIREMENT_OPTION = "//div[@id='dvMenuLevel_1']/ul/li[3]";
    // Research dropdown menu on Investing Page: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_RESEARCH_OPTION = "//div[@id='dvMenuLevel_1']/ul/li[4]";
    // Investor Education dropdown menu on Investing Page: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_INVESTOR_EDUCATION_OPTION = "//div[@id='dvMenuLevel_1']/ul/li[5]";
    // Open An Account dropdown menu on Investing Page: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_OPEN_AN_ACCOUNT_OPTION = "//div[@id='dvMenuLevel_1']/ul/li[1]";
    // Get a Quote Input search field: (ID)
    public static final String WEB_ELEMENT_INPUT_BOX_GET_A_QUOTE = "ctl00_ctl00_siteContent_glQte_txtSymbol";
    // Get A Quote Search button: (ID)
    public static final String WEB_ELEMENT_BUTTON_GET_A_QUOTE_SEARCH = "ctl00_ctl00_siteContent_glQte_ctl02";
    // Search Merrill Edge input search field: (ID)
    public static final String WEB_ELEMENT_INPUT_BOX_SEARCH_MERRILL_EDGE = "dvoseSearchinner_ecmssearchtextbox";
    // Search Merrill Edge Search button: (ID)
    public static final String WEB_ELEMENT_BUTTON_SEARCH_MERRILL_EDGE = "dvoseSearchinner_ecmssearchbtn";

    // Play video button on Investing page: (ID)
    public static final String WEB_ELEMENT_BUTTON_PLAY_VIDEO = "videoCTA";
    // Bottom panel that holds all the buttons for running the video: (XPATH - custom)
    public static final String WEB_ELEMENT_VIDEO_BOTTOM_PANEL_WITH_ALL_BUTTONS = "//div[@class='vjs-control-bar vjs-focus-within']";
    // Make video full-screen button in bottom panel: (XPATH - custom)
    public static final String WEB_ELEMENT_FULL_SCREEN_BUTTON = "//button[@class='vjs-fullscreen-control vjs-control vjs-button']";
    // Entire video frame to hover over in order to make the bottom panel visible: (ID)
    public static final String WEB_ELEMENT_VIDEO_FRAME_TO_HOVER_OVER = "vjs_video_3_html5_api";
    // Video body when video running in full screen mode: (XPATH - custom)
    public static final String WEB_ELEMENT_VIDEO_BODY_WHEN_IN_FULL_SCREEN = "//video-js[@id='vjs_video_3']";


    /**
     * Locators required for Assertions
     */
    // Actual number of links on the Investing Page Header: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUM_OF_LINKS_ON_INVESTING_PAGE_HEADER = "//div[@id='dvMenuLevel_1']/ul/li";
    // Video play/ pause button element when video is being played - assert on attribute title (play/ pause): (XPATH -custom)
    public static final String WEB_ELEMENT_PLAY_PAUSE_BUTTON_IN_VIDEO_PANEL = "//div[@class='vjs-control-bar vjs-focus-within']/button[1]";
    // Get Quote search result dropdown modal window body: (XPATH - custom)
    public static final String WEB_ELEMENT_GET_QUOTE_SEARCH_RESULT_MODAL_WINDOW_BODY = "//div[@id='ctl00_ctl00_siteContent_glQte_GlobalQuote1Container']";
    // Search Result page after searching in Search Merrill Edge field: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_MERRILL_EDGE_LANDED_PAGE = "//span[@class='txtBold  fl pt-s mr-s']";

}
