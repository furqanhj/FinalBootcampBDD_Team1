package wweHomepageFJ;

public class WWEHomepageWebElements {

    /**
     * Locators for ESPN Homepage
     */
    //3 dots on the header for more links dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_MORE_OPTIONS_ON_HEADER = "//*[@id='global-nav']/ul/li[7]";
    //WWE link under the more options dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_WWE_LINK = "//nav[@id='global-nav']/ul/li[7]/div/ul/li[20]";

    /**
     * Locators for WWE Homepage
     */
    //Wrestle Mania 37 link on the header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_WRESTLE_MANIA_37_LINK = "//div[@class='global-nav-container']/ul/li[3]";
    //Tickets Link on the header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_TICKETS_LINK = "//div[@class='global-nav-container']/ul/li[9]";
    //Title Watch Link on the header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_TITLE_WATCH_LINK = "//div[@class='global-nav-container']/ul/li[7]";
    //Wrestler Profile link on the header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_WRESTLER_PROFILE_LINK = "//div[@class='global-nav-container']/ul/li[5]";
    //AJ Styles profile page link: (XPATH)
    public static final String WEB_ELEMENT_BUTTON_AJ_STYLES_PROFILE_PAGE_LINK = "//*[@id='article-feed']/article[1]/div/div[2]/p[1]/a[1]";


    /**
     * Locators required for Assertions
     */
    //Total number of links on the WWE homepage header (9 links): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_ON_WWE_HEADER = "//div[@class='global-nav-container']/ul/li";
    //Actual Text On header of Title Watch Landed page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_TITLE_WATCH_PAGE = "//section[@id='article-feed']/article[1]/div/header/h1";
    //Image of AJ Styles displayed on AJ Styles profile page: (XPATH)
    public static final String WEB_ELEMENT_IMAGE_DISPLAYED_OF_AJ_STYLES = "//*[@id='article-feed']/article[1]/div/figure/div/picture/img";


}
