package BankOfAmericaSecurityPageMA;

import common.BaseAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static BankOfAmericaSecurityPageMA.BankOfAmericaSecurityWebElements.*;

public class BankOfAmericaSecurityPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_LOCK_UNLOCK_YOUR_CARD)
    public WebElement lockUnlockYourCard;

    public BankOfAmericaSecurityPage (){
        PageFactory.initElements(driver,this);
    }

    public void clickLockUnlockYourCard (){
        clickElement(lockUnlockYourCard);
    }

    public void waitUntilVisibilityOfCardPage (){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleIs("Bank of America | Online Banking | Sign In | Online ID"));
    }

    public void verifyUserIsOnCardPage (){
        Assert.assertTrue(isCurrentUrlTrue("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go?reason=managesettingsdebit"));
    }
}
