package emailSignupPageFJ;

public class EmailSignupPageLocators {

    /**
     * Locators on Macys homepage
     */
    //Sign Up for emails banner on homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_EMAIL_SIGNUP_LINK_AS_IMAGE_BANNER = "//img[@alt='Email Banner']";

    /**
     * Locators on Email Signup page
     */
    // Email address input field: (ID)
    public static final String WEB_ELEMENT_INPUT_BOX_EMAIL_FIELD = "verifyemail";
    // Zip code input field: (ID)
    public static final String WEB_ELEMENT_INPUT_BOX_ZIP_CODE_FIELD = "tfqzip";
    // Month dropdown in the birth date section: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_MONTH = "//div[@class='date']/div/div[1]/select";
    // Date Dropdown in the birth date section: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_DATE = "//div[@class='date']/div/div[2]/select";
    // Year Dropdown in the birth date section: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_YEAR = "//div[@class='date']/div/div[3]/select";
    // year 1976 from the year dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_YEAR_1976 = "//div[@class='date']/div/div[3]/select/option[42]";
    // year 1983 from the year dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_YEAR_1983 = "//div[@class='date']/div/div[3]/select/option[35]";
    // Im not a robot checkbox: (XPATH - custom)
    public static final String WEB_ELEMENT_CHECKBOX_IM_NOT_A_ROBOT = "//div[@class='vfyCheck']/label";

    /**
     * Locators for each month in MONTH dropdown
     */
    //for JANUARY: (XPATH - custom)
    public static final String WEB_ELEMENT_JANUARY = "//div[@class='date']/div/div[1]/select/option[2]";
    //for FEBRUARY: (XPATH - custom)
    public static final String WEB_ELEMENT_FEBRUARY = "//div[@class='date']/div/div[1]/select/option[3]";
    //for MARCH: (XPATH - custom)
    public static final String WEB_ELEMENT_MARCH = "//div[@class='date']/div/div[1]/select/option[4]";
    //for APRIL: (XPATH - custom)
    public static final String WEB_ELEMENT_APRIL = "//div[@class='date']/div/div[1]/select/option[5]";
    //for MAY: (XPATH - custom)
    public static final String WEB_ELEMENT_MAY = "//div[@class='date']/div/div[1]/select/option[6]";
    //for JUNE: (XPATH - custom)
    public static final String WEB_ELEMENT_JUNE = "//div[@class='date']/div/div[1]/select/option[7]";
    //for JULY: (XPATH - custom)
    public static final String WEB_ELEMENT_JULY = "//div[@class='date']/div/div[1]/select/option[8]";
    //for AUGUST: (XPATH - custom)
    public static final String WEB_ELEMENT_AUGUST = "//div[@class='date']/div/div[1]/select/option[9]";
    //for SEPTEMBER: (XPATH - custom)
    public static final String WEB_ELEMENT_SEPTEMBER = "//div[@class='date']/div/div[1]/select/option[10]";
    //for OCTOBER: (XPATH - custom)
    public static final String WEB_ELEMENT_OCTOBER = "//div[@class='date']/div/div[1]/select/option[11]";
    //for NOVEMBER: (XPATH - custom)
    public static final String WEB_ELEMENT_NOVEMBER = "//div[@class='date']/div/div[1]/select/option[12]";
    //for DECEMBER: (XPATH - custom)
    public static final String WEB_ELEMENT_DECEMBER = "//div[@class='date']/div/div[1]/select/option[13]";

    /**
     * Locators for each date in DATE dropdown
     */
    //for date 1: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_1 = "//div[@class='date']/div/div[2]/select/option[2]";
    //for date 2: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_2 = "//div[@class='date']/div/div[2]/select/option[3]";
    //for date 3: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_3 = "//div[@class='date']/div/div[2]/select/option[4]";
    //for date 4: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_4 = "//div[@class='date']/div/div[2]/select/option[5]";
    //for date 5: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_5 = "//div[@class='date']/div/div[2]/select/option[6]";
    //for date 6: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_6 = "//div[@class='date']/div/div[2]/select/option[7]";
    //for date 7: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_7 = "//div[@class='date']/div/div[2]/select/option[8]";
    //for date 8: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_8 = "//div[@class='date']/div/div[2]/select/option[9]";
    //for date 9: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_9 = "//div[@class='date']/div/div[2]/select/option[10]";
    //for date 10: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_10 = "//div[@class='date']/div/div[2]/select/option[11]";
    //for date 11: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_11 = "//div[@class='date']/div/div[2]/select/option[12]";
    //for date 12: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_12 = "//div[@class='date']/div/div[2]/select/option[13]";
    //for date 13: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_13 = "//div[@class='date']/div/div[2]/select/option[14]";
    //for date 14: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_14 = "//div[@class='date']/div/div[2]/select/option[15]";
    //for date 15: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_15 = "//div[@class='date']/div/div[2]/select/option[16]";
    //for date 16: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_16 = "//div[@class='date']/div/div[2]/select/option[17]";
    //for date 17: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_17 = "//div[@class='date']/div/div[2]/select/option[18]";
    //for date 18: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_18 = "//div[@class='date']/div/div[2]/select/option[19]";
    //for date 19: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_19 = "//div[@class='date']/div/div[2]/select/option[20]";
    //for date 20: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_20 = "//div[@class='date']/div/div[2]/select/option[21]";
    //for date 21: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_21 = "//div[@class='date']/div/div[2]/select/option[22]";
    //for date 22: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_22 = "//div[@class='date']/div/div[2]/select/option[23]";
    //for date 23: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_23 = "//div[@class='date']/div/div[2]/select/option[24]";
    //for date 24: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_24 = "//div[@class='date']/div/div[2]/select/option[25]";
    //for date 25: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_25 = "//div[@class='date']/div/div[2]/select/option[26]";
    //for date 26: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_26 = "//div[@class='date']/div/div[2]/select/option[27]";
    //for date 27: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_27 = "//div[@class='date']/div/div[2]/select/option[28]";
    //for date 28: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_28 = "//div[@class='date']/div/div[2]/select/option[29]";
    //for date 29: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_29 = "//div[@class='date']/div/div[2]/select/option[30]";
    //for date 30: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_30 = "//div[@class='date']/div/div[2]/select/option[31]";
    //for date 31: (XPATH - custom)
    public static final String WEB_ELEMENT_DATE_31 = "//div[@class='date']/div/div[2]/select/option[32]";

    /**
     * Locators required for Assertions
     */
    // Invalid email error message text on email sign up page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_INVALID_EMAIL_ERROR_MESSAGE = "//div[@id='invalidEmail']/div[2]";

}
