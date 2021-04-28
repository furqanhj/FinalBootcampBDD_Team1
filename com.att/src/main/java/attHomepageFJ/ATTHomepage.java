package attHomepageFJ;

import static attHomepageFJ.ATTHomepageLocators.*;

import attTVPageFJ.TVPage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ATTHomepage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_BUTTON_TV_LINK)
    public WebElement buttonTVLink;

    public ATTHomepage(){
        PageFactory.initElements(driver, this);
    }

    public TVPage navigateToTVPage(){
        clickElement(buttonTVLink);

        return new TVPage();
    }
}
