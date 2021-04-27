package expediaSignInPageFJ;

import static expediaSignInPageFJ.SignInPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseAPI {

    /**
     * Initialization of elements on homepage
     */
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_SIGN_IN_ON_HEADER)
    public WebElement dropdownSignInButtonOnHeader;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SIGN_IN_INSIDE_DROPDOWN)
    public WebElement buttonSignInInsideDropdown;

    /**
     * Initialization of elements on sign in page
     */
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SIGN_IN_WITH_GOOGLE)
    public WebElement buttonSignInWithGoogle;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SIGN_IN_WITH_APPLE)
    public WebElement buttonSignInWithApple;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SIGN_IN_WITH_FACEBOOK)
    public WebElement buttonSignInWithFacebook;

    /**
     * Locators required for Assertions
     */
    @FindBy(id = WEB_ELEMENT_ACTUAL_TEXT_FACEBOOK_SIGN_IN_NEW_WINDOW_HEADER)
    public WebElement actualTextFacebookSignInNewWindow;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_SIGN_IN_WITH_GOOGLE_NEW_WINDOW)
    public WebElement actualTextSignInWithGoogleNewWindow;
    @FindBy(id = WEB_ELEMENT_INPUT_BOX_APPLE_ID)
    public WebElement inputBoxAppleID;

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToSignInPage(){
        clickElement(dropdownSignInButtonOnHeader);
        clickJScript(buttonSignInInsideDropdown);
    }

    public void clickOnSignInWithGoogleLink(){
        clickJScript(buttonSignInWithGoogle);
        switchToNewWindow();
    }

    public void clickOnSignInWithAppleLink(){
        clickJScript(buttonSignInWithApple);
        switchToNewWindow();
    }

    public void clickOnSignInWithFacebook(){
        clickJScript(buttonSignInWithFacebook);
        switchToNewWindow();
    }


}
