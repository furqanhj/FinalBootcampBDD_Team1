package airbnbHomepageFJ;

public class AirbnbHomepageWebElements {

    /**
     * Locators for elements on homepage
     */
    // more options dropdown menu on homepage: (XPATH- custom)
    public static final String WEB_ELEMENT_MORE_OPTIONS_DROPDOWN_MENU = "//div[@class='_167wsvl']/button";
    // sign up button inside more options dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGNUP_OPTION = "//div[@class='_7nxhq3b']/div/a[1]";
    // Continue with Facebook button: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_FACEBOOK = "//button[@data-testid='social-auth-button-facebook']";
    // Continue with Google button: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_GOOGLE = "//button[@data-testid='social-auth-button-google']";
    // Continue with Apple button: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_APPLE = "//button[@data-testid='social-auth-button-apple']";
    // Phone number input field: (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_PHONE_NUMBER_FIELD = "//input[@name='phoneNumber']";
    // Continue button on Signup modal window: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_SIGNUP_MODAL_WINDOW = "//button[@data-testid='signup-login-submit-btn']";


    /**
     * Locators required for Assertions
     */
    // Total number of options in more options dropdown menu (5 options): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_LINKS_ON_MORE_OPTIONS_DROPDOWN_MENU = "//div[@class='_7nxhq3b']/div/a";
    // Actual text on signup modal window: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_SIGNUP_MODAL_WINDOW = "//div[@data-testid='login-pane']/div/h3";
    // facebook Log In button element displayed on continue with facebook new window: (XPATH - custom)
    public static final String WEB_ELEMENT_FACEBOOK_LOG_IN_BUTTON_DISPLAYED = "//input[@value='Log In']";
    // Actual text on header of sign in with google new window: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_HEADER_SIGN_IN_WITH_GOOGLE = "//div[@class='ZxXxWb']/div[2]";
    // Actual text on Log in with Apple ID page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_IN_BODY_OF_APPLE_LOGIN_NEW_WINDOW = "//button[@data-testid='social-auth-button-apple']/div/div[2]";
    // Actual text after clicking continue button with invalid phone number: (CSS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_INVALID_PHONE_NUMBER_ERROR = "#phone-number-error";


}
