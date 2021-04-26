package airbnbHomepageFJ;

import static airbnbHomepageFJ.AirbnbHomepageWebElements.*;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AirbnbHomepage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_MORE_OPTIONS_DROPDOWN_MENU)
    public WebElement moreOptionsDropdownMenu;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SIGNUP_OPTION)
    public WebElement buttonSignupOption;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_WITH_FACEBOOK)
    public WebElement buttonContinueWithFacebook;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_WITH_GOOGLE)
    public WebElement buttonContinueWithGoogle;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_WITH_APPLE)
    public WebElement buttonContinueWithApple;
    @FindBy(xpath = WEB_ELEMENT_INPUT_PHONE_NUMBER_FIELD)
    public WebElement inputPhoneNumberField;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_SIGNUP_MODAL_WINDOW)
    public WebElement buttonContinueSignupModalWindow;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_LINKS_ON_MORE_OPTIONS_DROPDOWN_MENU)
    public List<WebElement> actualLinksInMoreOptionsDropdownMenu;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_SIGNUP_MODAL_WINDOW)
    public WebElement actualTextOnSignupModalWindow;
    @FindBy(xpath = WEB_ELEMENT_FACEBOOK_LOG_IN_BUTTON_DISPLAYED)
    public WebElement facebookLogInButtonDisplayed;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_HEADER_SIGN_IN_WITH_GOOGLE)
    public WebElement actualTextOnHeaderSignInWithGoogleNewWindow;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_IN_BODY_OF_APPLE_LOGIN_NEW_WINDOW)
    public WebElement actualTextInBodyOfAppleLoginNewWindow;
    @FindBy(css = WEB_ELEMENT_ACTUAL_TEXT_INVALID_PHONE_NUMBER_ERROR)
    public WebElement actualTextWithInvalidPhoneNumberError;

    public AirbnbHomepage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnMoreOptionsDropdownMenu(){
        clickElement(moreOptionsDropdownMenu);
    }

    public void clickOnSignupButton(){
        clickElement(buttonSignupOption);
    }

    public void clickOnContinueWithFacebookButton(){
        clickElement(buttonContinueWithFacebook);
        switchToNewWindow();
    }

    public void clickOnContinueWithGoogleButton(){
        clickElement(buttonContinueWithGoogle);
        switchToNewWindow();
    }

    public void clickOnContinueWithAppleButton(){
        clickElement(buttonContinueWithApple);
        switchToNewWindow();
    }

    public void enterKeysInPhoneNumberInputField(String phoneNumber){
        sendKeysToElement(inputPhoneNumberField, phoneNumber);
    }

    public void clickContinueButtonInModalWindow(){
        clickElement(buttonContinueSignupModalWindow);
    }
}
