package cbsLoginPageFJ;

public class CBSLoginPageLocators {

    /**
     * Locators on CBS SPORTS Homepage
     */
    // Login button on homepage header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_LOGIN_ON_HEADER = "//ul[@class='site-nav-side-inner']/li[5]/a";

    /**
     * Locators on CBS Login page
     */
    //Log in with facebook button: (ID)
    public static final String WEB_ELEMENT_BUTTON_LOGIN_WITH_FACEBOOK = "sso-facebook";
    //Sign in with google button: (ID)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_WITH_GOOGLE = "sso-google";
    //Input field email or Member ID: (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_BOX_EMAIL_FIELD = "//input[@id='userid']";
    //Input field password: (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_BOX_PASSWORD_FIELD = "//input[@id='password']";
    //Log In button after email and password input field: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_LOGIN_AFTER_INPUT = "//input[@value='Log In']";
    //Forgot your password link: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_FORGOT_YOUR_PASSWORD_LINK = "//a[@class='tools getPassword']";
    //Dont have an account link: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_DONT_HAVE_AN_ACCOUNT_SIGN_UP_LINK = "//div[@class='help-links']/div[2]";


    /**
     * Locators require for Assertions
     */
    //Actual text on facebook sign in new window header: (ID)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_FACEBOOK_SIGN_IN_NEW_WINDOW = "homelink";
    //Actual text on google sign in new window header: (CLASS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_GOOGLE_SIGN_IN_NEW_WINDOW = "kHn9Lb";
    //Actual text on forgot your password page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_FORGOT_YOUR_PASSWORD_PAGE = "//span[@class='title-text']";
    //Actual text on Register page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_REGISTER_PAGE = "//span[@class='title-text']";
    //Actual text after invalid register attempt: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_INVALID_REGISTER_ERROR_MESSAGE = "//div[@class='formErrorSummary']";
}
