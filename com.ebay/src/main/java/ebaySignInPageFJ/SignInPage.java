package ebaySignInPageFJ;

import static ebaySignInPageFJ.SignInPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_BUTTON_SIGN_IN)
    public WebElement buttonSignIn;
    @FindBy(id = WEB_ELEMENT_INPUT_EMAIL_USERNAME_FIELD)
    public WebElement inputEmailUsernameField;
    @FindBy(id = WEB_ELEMENT_BUTTON_CONTINUE_AFTER_EMAIL_INPUT)
    public WebElement buttonContinueSignInPage;
    @FindBy(id = WEB_ELEMENT_INPUT_PASSWORD_FIELD)
    public WebElement inputPasswordField;
    @FindBy(id = WEB_ELEMENT_BUTTON_SIGN_IN_AFTER_PASSWORD_INPUT)
    public WebElement buttonSignInAfterPasswordInput;
    @FindBy(id = WEB_ELEMENT_BUTTON_CREATE_AN_ACCOUNT_FROM_SIGN_IN_PAGE)
    public WebElement buttonCreateAnAccountLink;
    @FindBy(id = WEB_ELEMENT_INPUT_FIRST_NAME_FIELD)
    public WebElement inputFirstNameField;
    @FindBy(id = WEB_ELEMENT_INPUT_LAST_NAME_FIELD)
    public WebElement inputLastNameField;
    @FindBy(id = WEB_ELEMENT_INPUT_EMAIL_FIELD_ON_CREATE_ACCOUNT_PAGE)
    public WebElement inputEmailFieldOnCreateAccountPage;
    @FindBy(id = WEB_ELEMENT_INPUT_PASSWORD_FIELD_ON_CREATE_ACCOUNT_PAGE)
    public WebElement inputPasswordFieldOnCreateAccountPage;
    @FindBy(xpath = WEB_ELEMENT_CHECKBOX_SHOW_PASSWORD)
    public WebElement checkboxShowPassword;
    @FindBy(id = WEB_ELEMENT_BUTTON_CREATE_ACCOUNT)
    public WebElement buttonCreateAccount;
    @FindBy(id = WEB_ELEMENT_BUTTON_CONTINUE_WITH_FACEBOOK)
    public WebElement buttonContinueWithFacebook;
    @FindBy(id = WEB_ELEMENT_BUTTON_CONTINUE_WITH_GOOGLE)
    public WebElement buttonContinueWithGoogle;
    @FindBy(id = WEB_ELEMENT_BUTTON_CONTINUE_WITH_APPLE)
    public WebElement buttonContinueWithApple;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_INVALID_EMAIL_CONTINUE)
    public WebElement actualTextInvalidEmailContinue;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_CREATE_AN_ACCOUNT_PAGE)
    public WebElement actualTextOnCreateAnAccountPage;
    @FindBy(id = WEB_ELEMENT_ACTUAL_TEXT_ON_HOMEPAGE_AFTER_ACCOUNT_CREATION)
    public WebElement actualTextOnHomepageAfterAccountCreation;
    @FindBy(id = WEB_ELEMENT_ACTUAL_TEXT_PASSWORD_ERROR_UNSUCCESSFUL_ACCOUNT_CREATION)
    public WebElement actualTextPasswordErrorUnsuccessfulAccountCreation;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_LOG_IN_WITH_FACEBOOK_PAGE)
    public WebElement actualTextOnLoginWithFacebookPage;
    @FindBy(className = WEB_ELEMENT_ACTUAL_TEXT_ON_LOG_IN_WITH_GOOGLE_PAGE)
    public WebElement actualTextOnLogInWithGooglePage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_LOG_IN_WITH_APPLE_ID)
    public WebElement actualTextOnLoginWithAppleID;

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToSignInPage(){
        clickElement(buttonSignIn);
    }

    public void sendKeysToEmailUsernameField(String email){
        sendKeysToElement(inputEmailUsernameField, email);
    }

    public void clickContinueButton(){
        clickElement(buttonContinueSignInPage);
    }

    public void sendKeysToEmailAndClickContinue(String email){
        sendKeysToEmailUsernameField(email);
        clickContinueButton();
    }

    public void clickCreateAnAccountLink(){
        clickElement(buttonCreateAnAccountLink);
    }

    public void enterTextInFirstNameField(String firstName){
        sendKeysToElement(inputFirstNameField, firstName);
    }

    public void enterTextInLastNameField(String lastName){
        sendKeysToElement(inputLastNameField, lastName);
    }

    public void enterTextInEmailFieldInCreateAccountPage(String email){
        sendKeysToElement(inputEmailFieldOnCreateAccountPage, email);
    }

    public void enterTextInPasswordFieldInCreateAccountPage(String password){
        sendKeysToElement(inputPasswordFieldOnCreateAccountPage, password);
    }

    public void selectCheckboxOptionShowPassword(){
        selectElement(checkboxShowPassword);
    }

    public void clickOnCreateAccountButton(){
        clickElement(buttonCreateAccount);
    }

    public void clickOnContinueWithFacebookButton(){
        clickElement(buttonContinueWithFacebook);
    }

    public void clickOnContinueWithGoogleButton(){
        clickElement(buttonContinueWithGoogle);
        switchToNewWindow();
    }

    public void clickOnContinueWithAppleButton(){
        clickElement(buttonContinueWithApple);
        waitTimeUsingImplicit(5);
    }
}
