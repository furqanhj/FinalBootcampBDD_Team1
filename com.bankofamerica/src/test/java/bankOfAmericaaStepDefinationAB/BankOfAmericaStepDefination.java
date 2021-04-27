package bankOfAmericaaStepDefinationAB;

import bankPfAmericaAB.BankOfAmericaPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class BankOfAmericaStepDefination {

    BankOfAmericaPage bankOfAmericaPage;

    @When("User enters {string} in search field")
    public void user_enters_in_search_field(String string) {
        bankOfAmericaPage=new BankOfAmericaPage();

        bankOfAmericaPage.enterTextInSearchBar(string);
    }

    @Then("User should see {string} written in search field")
    public void user_should_see_written_in_search_field(String string) {
       bankOfAmericaPage=new BankOfAmericaPage();

       String ActualText=bankOfAmericaPage.creditCard.getText();
       String ExpectedText=string;
        Assert.assertEquals(ExpectedText,ActualText,"Text do not match");
    }
}
