package googleHomepageFJ;

public class GoogleHomepageWebElements {

    //Search bar on google homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_SEARCH_BAR = "//input[@name='q']";
    //Google Search button on google homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_GOOGLE_SEARCH = "//div[@class='FPdoLc tfB0Bf']/center/input[1]";
    public static final String WEB_ELEMENT_BUTTON_AFTER_TEXT_GOOGLE_SEARCH = "//div[@jsname='VlcLAe']//input[1]";
    //ImFeelingLucky Search button on google homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_FEELING_LUCKY_SEARCH = "//div[@class='FPdoLc tfB0Bf']/center/input[2]";
    public static final String WEB_ELEMENT_BUTTON_AFTER_TEXT_FEELING_LUCKY_SEARCH = "//div[@jsname='VlcLAe']//input[2]";

    /**
     * Locators required for Assertions
     */
    //Text on search result page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_RESULT_PAGE = "//span[@class='N6sL8d']";

}
