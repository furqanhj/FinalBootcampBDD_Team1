package expediaSignInPageFJ;

public class SignInPageLocators {

    /**
     * Locators on Expedia homepage
     */
    // SignIn dropdown on homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_SIGN_IN_ON_HEADER = "//div[@class='global-navigation-site-header-container']/div/div[2]/div/button";
    // Sign-in button inside SignIn dropdown: (XPATH)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_INSIDE_DROPDOWN = "//div[@id='gc-custom-header-nav-bar-acct-menu']/div/div[1]/div/div/a[1]";
    /**
     * Locators on SignIn page
     */
    // Sign in with Google button: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_WITH_GOOGLE = "//div[@class='googleSignInDiv cols-row']/form/button";
    // Sign in with Apple button: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_WITH_APPLE = "//div[@class='appleSignInDiv']/form/button";
    // Sign in with Facebook button: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_WITH_FACEBOOK = "//button[@id='e3login-facebook-button']";


    /**
     * Locators required for Assertions
     */
    // Actual text on Sign in with google new window: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_SIGN_IN_WITH_GOOGLE_NEW_WINDOW = "//div[@class='ZxXxWb']/div[2]";
    // Input box Apple ID field: (ID)
    public static final String WEB_ELEMENT_INPUT_BOX_APPLE_ID = "account_name_text_field";
    // Actual Text on Sign in with Facebook New window header: (ID)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_FACEBOOK_SIGN_IN_NEW_WINDOW_HEADER = "homelink";
}
