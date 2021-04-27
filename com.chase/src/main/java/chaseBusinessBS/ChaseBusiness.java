package chaseBusinessBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static chaseBusinessBS.ChaseBusinessWebElements.*;

public class ChaseBusiness extends BaseAPI {

    public ChaseBusiness() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_PPP_LOAN_HEADER)
    public WebElement pppHeader;
    @FindBy(xpath = WEB_ELEMENT_PPP_LEARN_MORE)
    public WebElement learnMore;
    @FindBy(xpath = WEB_ELEMENT_WOMEN_ON_THE_MOVE_LEARN_MORE)
    WebElement womenOnTheMove;

    @FindBy(xpath = WEB_ELEMENT_100000_PAGE_TITLE)
    WebElement pageTitle;
    @FindBy(xpath = WEB_ELEMENT_WOMEN_ON_THE_MOVE_IMAGE )
    WebElement womenOnTheMoveText;

    public ChaseBusiness clickOnPPPLoanLearnMore(){
        clickElement(learnMore);

        return new ChaseBusiness();
    }

    public void clickOnBonusLearnMore(){
        clickElement(learnMore);

    }
    public void clickOnWomenOnTheMoveLearnMore(){
        clickElement(womenOnTheMove);
    }








}
