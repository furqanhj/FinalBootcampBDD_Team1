package cbsLoginPageFJ;

import static cbsLoginPageFJ.CBSLoginPageLocators.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CBSLoginPage extends BaseAPI {

    /**
     * Initialization of elements on homepage
     */
    @FindBy(xpath = WEB_ELEMENT_BUTTON_LOGIN_ON_HEADER)
    public WebElement buttonLoginOnHeader;

    /**
     * Initialization of elements on login page
     */
    @FindBy(id = WEB_ELEMENT_BUTTON_LOGIN_WITH_FACEBOOK)
    public WebElement buttonLoginWithFacebook;
    @FindBy(id = WEB_ELEMENT_BUTTON_SIGN_IN_WITH_GOOGLE)
    public WebElement buttonSignInWithGoogle;
    @FindBy(xpath = WEB_ELEMENT_INPUT_BOX_EMAIL_FIELD)
    public WebElement inputBoxEmailField;
    @FindBy(xpath = WEB_ELEMENT_INPUT_BOX_PASSWORD_FIELD)
    public WebElement inputBoxPasswordField;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_LOGIN_AFTER_INPUT)
    public WebElement buttonLoginAfterInput;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_FORGOT_YOUR_PASSWORD_LINK)
    public WebElement buttonForgotYourPasswordLink;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_DONT_HAVE_AN_ACCOUNT_SIGN_UP_LINK)
    public WebElement buttonDontHaveAnAccountSignUpLink;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(id = WEB_ELEMENT_ACTUAL_TEXT_FACEBOOK_SIGN_IN_NEW_WINDOW)
    public WebElement actualTextFacebookSignInNewWindow;
    @FindBy(className = WEB_ELEMENT_ACTUAL_TEXT_GOOGLE_SIGN_IN_NEW_WINDOW)
    public WebElement actualTextGoogleSignInNewWindow;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_FORGOT_YOUR_PASSWORD_PAGE)
    public WebElement actualTextForgotYourPasswordPage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_REGISTER_PAGE)
    public WebElement actualTextRegisterPage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_INVALID_REGISTER_ERROR_MESSAGE)
    public WebElement actualTextInvalidRegisterErrorMessage;

    public CBSLoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage(){
        clickElement(buttonLoginOnHeader);
    }

    public void clickOnLogInWithFacebookButton(){
        clickElement(buttonLoginWithFacebook);
        switchToNewWindow();
        waitTimeUsingImplicit(5);
    }

    public void clickOnSignInWithGoogleButton(){
        clickElement(buttonSignInWithGoogle);
        switchToNewWindow();
        waitTimeUsingImplicit(5);
    }

    public void clickOnForgotYourPasswordLink(){
        clickElement(buttonForgotYourPasswordLink);
    }

    public void clickOnDontHaveAnAccountSignUpLink(){
        clickElement(buttonDontHaveAnAccountSignUpLink);
    }

    public void enterTextInEmailInputBox(String email){
        sendKeysToElement(inputBoxEmailField, email);
    }

    public void enterTextInPasswordInputBox(String password){
        sendKeysToElement(inputBoxPasswordField, password);
    }

    public void clickLogInButtonAfterInput(){
        clickElement(buttonLoginAfterInput);
    }

}
