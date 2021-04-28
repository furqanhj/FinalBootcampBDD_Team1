package emailSignupPageFJ;

import static emailSignupPageFJ.EmailSignupPageLocators.*;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailSignupPage extends BaseAPI {

    /**
     * Initialization of elements on homepage
     */
    @FindBy(xpath = WEB_ELEMENT_BUTTON_EMAIL_SIGNUP_LINK_AS_IMAGE_BANNER)
    public WebElement buttonEmailSignupLinkAsImageBanner;

    /**
     * Initialization of elements on email signup page
     */
    @FindBy(id = WEB_ELEMENT_INPUT_BOX_EMAIL_FIELD)
    public WebElement inputBoxEmailField;
    @FindBy(id = WEB_ELEMENT_INPUT_BOX_ZIP_CODE_FIELD)
    public WebElement inputBoxZipCodeField;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_MONTH)
    public WebElement dropdownMonth;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_DATE)
    public WebElement dropdownDate;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_YEAR)
    public WebElement dropdownYear;
    @FindBy(xpath = WEB_ELEMENT_CHECKBOX_IM_NOT_A_ROBOT)
    public WebElement checkboxImNotARobot;

    /**
     * Initialization of elements for each months in MONTH dropdown
     */
    @FindBy(xpath = WEB_ELEMENT_JANUARY)
    public WebElement january;
    @FindBy(xpath = WEB_ELEMENT_FEBRUARY)
    public WebElement february;
    @FindBy(xpath = WEB_ELEMENT_MARCH)
    public WebElement march;
    @FindBy(xpath = WEB_ELEMENT_APRIL)
    public WebElement april;
    @FindBy(xpath = WEB_ELEMENT_MAY)
    public WebElement may;
    @FindBy(xpath = WEB_ELEMENT_JUNE)
    public WebElement june;
    @FindBy(xpath = WEB_ELEMENT_JULY)
    public WebElement july;
    @FindBy(xpath = WEB_ELEMENT_AUGUST)
    public WebElement august;
    @FindBy(xpath = WEB_ELEMENT_SEPTEMBER)
    public WebElement september;
    @FindBy(xpath = WEB_ELEMENT_OCTOBER)
    public WebElement october;
    @FindBy(xpath = WEB_ELEMENT_NOVEMBER)
    public WebElement november;
    @FindBy(xpath = WEB_ELEMENT_DECEMBER)
    public WebElement december;

    /**
     * Initialization of elements for all Dates in DATE dropdown
     */
    @FindBy(xpath = WEB_ELEMENT_DATE_1)
    public WebElement date1;
    @FindBy(xpath = WEB_ELEMENT_DATE_2)
    public WebElement date2;
    @FindBy(xpath = WEB_ELEMENT_DATE_3)
    public WebElement date3;
    @FindBy(xpath = WEB_ELEMENT_DATE_4)
    public WebElement date4;
    @FindBy(xpath = WEB_ELEMENT_DATE_5)
    public WebElement date5;
    @FindBy(xpath = WEB_ELEMENT_DATE_6)
    public WebElement date6;
    @FindBy(xpath = WEB_ELEMENT_DATE_7)
    public WebElement date7;
    @FindBy(xpath = WEB_ELEMENT_DATE_8)
    public WebElement date8;
    @FindBy(xpath = WEB_ELEMENT_DATE_9)
    public WebElement date9;
    @FindBy(xpath = WEB_ELEMENT_DATE_10)
    public WebElement date10;
    @FindBy(xpath = WEB_ELEMENT_DATE_11)
    public WebElement date11;
    @FindBy(xpath = WEB_ELEMENT_DATE_12)
    public WebElement date12;
    @FindBy(xpath = WEB_ELEMENT_DATE_13)
    public WebElement date13;
    @FindBy(xpath = WEB_ELEMENT_DATE_14)
    public WebElement date14;
    @FindBy(xpath = WEB_ELEMENT_DATE_15)
    public WebElement date15;
    @FindBy(xpath = WEB_ELEMENT_DATE_16)
    public WebElement date16;
    @FindBy(xpath = WEB_ELEMENT_DATE_17)
    public WebElement date17;
    @FindBy(xpath = WEB_ELEMENT_DATE_18)
    public WebElement date18;
    @FindBy(xpath = WEB_ELEMENT_DATE_19)
    public WebElement date19;
    @FindBy(xpath = WEB_ELEMENT_DATE_20)
    public WebElement date20;
    @FindBy(xpath = WEB_ELEMENT_DATE_21)
    public WebElement date21;
    @FindBy(xpath = WEB_ELEMENT_DATE_22)
    public WebElement date22;
    @FindBy(xpath = WEB_ELEMENT_DATE_23)
    public WebElement date23;
    @FindBy(xpath = WEB_ELEMENT_DATE_24)
    public WebElement date24;
    @FindBy(xpath = WEB_ELEMENT_DATE_25)
    public WebElement date25;
    @FindBy(xpath = WEB_ELEMENT_DATE_26)
    public WebElement date26;
    @FindBy(xpath = WEB_ELEMENT_DATE_27)
    public WebElement date27;
    @FindBy(xpath = WEB_ELEMENT_DATE_28)
    public WebElement date28;
    @FindBy(xpath = WEB_ELEMENT_DATE_29)
    public WebElement date29;
    @FindBy(xpath = WEB_ELEMENT_DATE_30)
    public WebElement date30;
    @FindBy(xpath = WEB_ELEMENT_DATE_31)
    public WebElement date31;

    /**
     * Initialization of elements in YEAR dropdown
     */
    @FindBy(xpath = WEB_ELEMENT_YEAR_1976)
    public WebElement year1976;
    @FindBy(xpath = WEB_ELEMENT_YEAR_1983)
    public WebElement year1983;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_INVALID_EMAIL_ERROR_MESSAGE)
    public WebElement actualTextInvalidEmailErrorMessage;


    public EmailSignupPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToEmailSignupPage() throws InterruptedException {
        robotScrollDown(135);
        waitForVisibilityOfElement(buttonEmailSignupLinkAsImageBanner);
        clickJScript(buttonEmailSignupLinkAsImageBanner);
    }

    public void enterTextInEmailField(String email) {
        sendKeysToElement(inputBoxEmailField, email);
        waitTimeUsingFluent(5);
    }

    public void enterTextInZipCode(String zipCode) {
        sendKeysToElement(inputBoxZipCodeField, zipCode);
        waitTimeUsingFluent(5);
    }

    public void clickOnMonthDropdown() {
        clickElement(dropdownMonth);
        clickJScript(dropdownMonth);
        waitTimeUsingFluent(5);
    }

    public void clickOnDateDropdown() {
        clickElement(dropdownDate);
        clickJScript(dropdownDate);
        waitTimeUsingFluent(5);
    }

    public void clickOnYearDropdown() {
        clickElement(dropdownYear);
        clickJScript(dropdownYear);
        waitTimeUsingFluent(5);
    }

    public void selectMonth(String monthAsNumber) {
        switch (monthAsNumber) {
            case "1":
                clickElement(january);
//                clickJScript(january);
                break;
            case "2":
                clickElement(february);
//                clickJScript(february);
                break;
            case "3":
                clickElement(march);
//                clickJScript(march);
                break;
            case "4":
                clickElement(april);
//                clickJScript(april);
                break;
            case "5":
                clickElement(may);
//                clickJScript(may);
                break;
            case "6":
                clickElement(june);
//                clickJScript(june);
                break;
            case "7":
                clickElement(july);
//                clickJScript(july);
                break;
            case "8":
                clickElement(august);
//                clickJScript(august);
                break;
            case "9":
                clickElement(september);
//                clickJScript(september);
                break;
            case "10":
                clickElement(october);
//                clickJScript(october);
                break;
            case "11":
                clickElement(november);
//                clickJScript(november);
                break;
            case "12":
                clickElement(december);
//                clickJScript(december);
                break;
        }
        waitTimeUsingFluent(5);
    }

    public void selectDate(String date) {
        switch (date) {
            case "1":
                clickElement(date1);
//                clickJScript(date1);
                break;
            case "2":
                clickElement(date2);
//                clickJScript(date2);
                break;
            case "3":
                clickElement(date3);
//                clickJScript(date3);
                break;
            case "4":
                clickElement(date4);
//                clickJScript(date4);
                break;
            case "5":
                clickElement(date5);
//                clickJScript(date5);
                break;
            case "6":
                clickElement(date6);
//                clickJScript(date6);
                break;
            case "7":
                clickElement(date7);
//                clickJScript(date7);
                break;
            case "8":
                clickElement(date8);
//                clickJScript(date8);
                break;
            case "9":
                clickElement(date9);
//                clickJScript(date9);
                break;
            case "10":
                clickElement(date10);
//                clickJScript(date10);
                break;
            case "11":
                clickElement(date11);
//                clickJScript(date11);
                break;
            case "12":
                clickElement(date12);
//                clickJScript(date12);
                break;
            case "13":
                clickElement(date13);
//                clickJScript(date13);
                break;
            case "14":
                clickElement(date14);
//                clickJScript(date14);
                break;
            case "15":
                clickElement(date15);
//                clickJScript(date15);
                break;
            case "16":
                clickElement(date16);
//                clickJScript(date16);
                break;
            case "17":
                clickElement(date17);
//                clickJScript(date17);
                break;
            case "18":
                clickElement(date18);
//                clickJScript(date18);
                break;
            case "19":
                clickElement(date19);
//                clickJScript(date19);
                break;
            case "20":
                clickElement(date20);
//                clickJScript(date20);
                break;
            case "21":
                clickElement(date21);
//                clickJScript(date21);
                break;
            case "22":
                clickElement(date22);
//                clickJScript(date22);
                break;
            case "23":
                clickElement(date23);
//                clickJScript(date23);
                break;
            case "24":
                clickElement(date24);
//                clickJScript(date24);
                break;
            case "25":
                clickElement(date25);
//                clickJScript(date25);
                break;
            case "26":
                clickElement(date26);
//                clickJScript(date26);
                break;
            case "27":
                clickElement(date27);
//                clickJScript(date27);
                break;
            case "28":
                clickElement(date28);
//                clickJScript(date28);
                break;
            case "29":
                clickElement(date29);
//                clickJScript(date29);
                break;
            case "30":
                clickElement(date30);
//                clickJScript(date30);
                break;
            case "31":
                clickElement(date31);
//                clickJScript(date31);
                break;
        }
        waitTimeUsingFluent(5);
    }

    public void selectYear1976() {
        clickElement(year1976);
//        clickJScript(year1976);
        waitTimeUsingFluent(5);
    }

    public void selectYear1983() {
        clickElement(year1983);
//        clickJScript(year1983);
        waitTimeUsingFluent(5);
    }

    public void selectCheckboxImNotARobot() {
        selectElement(checkboxImNotARobot);
        waitTimeUsingFluent(5);
    }


}
