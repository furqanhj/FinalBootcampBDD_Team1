package ebaySignInPageFJ;

public class SignInPageWebElements{


    /**
     * Locators on ebay homepage
     */
    //Sign in button on homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN = "//li[@class='gh-t ']/span[1]/a";


    /**
     * Locators on sign-in page
     */
    // Input box for Email or username on sign-in page: (ID)
    public static final String WEB_ELEMENT_INPUT_EMAIL_USERNAME_FIELD = "userid";
    // Continue button after email input: (ID)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_AFTER_EMAIL_INPUT = "signin-continue-btn";
    // Input box for Password on sign-in page: (ID)
    public static final String WEB_ELEMENT_INPUT_PASSWORD_FIELD = "pass";
    // Continue button after password input: (ID)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_AFTER_PASSWORD_INPUT = "sgnBt";
    // Create An Account link on sign in page: (ID)
    public static final String WEB_ELEMENT_BUTTON_CREATE_AN_ACCOUNT_FROM_SIGN_IN_PAGE = "create-account-link";
    // Continue with Facebook Button: (ID)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_FACEBOOK = "signin_fb_btn";
    // Continue with Google button: (ID)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_GOOGLE = "signin_ggl_btn";
    // Continue with Apple button: (ID)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_APPLE = "signin_appl_btn";


    /**
     * Locators on Create An Account Page
     */
    // First name input field: (ID)
    public static final String WEB_ELEMENT_INPUT_FIRST_NAME_FIELD = "firstname";
    // Last name input field: (ID)
    public static final String WEB_ELEMENT_INPUT_LAST_NAME_FIELD = "lastname";
    // Email input field: (ID)
    public static final String WEB_ELEMENT_INPUT_EMAIL_FIELD_ON_CREATE_ACCOUNT_PAGE = "Email";
    // Password input field: (ID)
    public static final String WEB_ELEMENT_INPUT_PASSWORD_FIELD_ON_CREATE_ACCOUNT_PAGE = "password";
    // Show password checkbox in password input field: (XPATH - custom)
    public static final String WEB_ELEMENT_CHECKBOX_SHOW_PASSWORD = "//div[@id='showpasswordcontainer']/div/span/span";
    // Create Account button on Create An account page: (ID)
    public static final String WEB_ELEMENT_BUTTON_CREATE_ACCOUNT = "EMAIL_REG_FORM_SUBMIT";

    /**
     * Locators required for Assertions
     */
    // Scenario1: Actual text after entering invalid email and clicking continue: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_INVALID_EMAIL_CONTINUE = "//p[@id='signin-error-msg']";
    // Scenario2: Actual text on create an account page: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_CREATE_AN_ACCOUNT_PAGE = "//div[@id='mainContent']/div[3]/h1";
    // Scenario3: Actual text on ebay homepage after successful account creation: (ID)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_HOMEPAGE_AFTER_ACCOUNT_CREATION = "gh-ug";
    // Scenario3: Actual text unsuccessful account creation, password error: (ID)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_PASSWORD_ERROR_UNSUCCESSFUL_ACCOUNT_CREATION = "password_err";
    // Scenario4: Actual text on Sign in with Facebook page: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_LOG_IN_WITH_FACEBOOK_PAGE = "//div[@class='_9axz']";
    // Scenario5: Actual text on Sign in with Google New window: (CLASS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_LOG_IN_WITH_GOOGLE_PAGE = "kHn9Lb";
    // Scenario6: Actual text on AppleID sign in page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_LOG_IN_WITH_APPLE_ID = "//h1[@class='si-container-title tk-intro  ']";

}
