package stepDefinitionsElectronicsPage;

import ebayElectronicsPageKE.EbayElectronicsPage;
import io.cucumber.java.en.*;

public class StepDefinitionElectronicsPage {
    EbayElectronicsPage ebayElectronicsPage;


    @When("user clicks on Electronics Text link")
    public void user_clicks_on_electronics_text_link() {
        ebayElectronicsPage = new EbayElectronicsPage();
        ebayElectronicsPage.clickElectronicsTextLink();


    }

    @When("user clicks Cameras & Photos TextLink")
    public void user_clicks_cameras_photos_text_link() {
        ebayElectronicsPage.clickCamerasPhotoLinks();

    }

    @When("user clicks Cameras Drones Text link")
    public void user_clicks_cameras_drones_text_link() {
        ebayElectronicsPage.clickCamerasAndDronesTextLink();

    }

    @Then("user should be launched on Cameras Drones page")
    public void user_should_be_launched_on_cameras_drones_page() {
        ebayElectronicsPage.isElementDisplayed(ebayElectronicsPage.redDroneImage);

    }

    @When("user clicks Car Electronics Text link")
    public void user_clicks_car_electronics_text_link() {
        ebayElectronicsPage.clickCarElectronicsTextLink();
    }

    @Then("user should be launched on Car Electronics page")
    public void user_should_be_launched_on_car_electronics_page() {
        ebayElectronicsPage.isElementDisplayed(ebayElectronicsPage.gpsImg);

    }

    @And("user clicks Treat Her Button Text link")
    public void userClicksTreatHerButtonTextLink() {
        ebayElectronicsPage.clickTreatHerButton();

    }

    @Then("user should be launched on Treat Her Button page")
    public void userShouldBeLaunchedOnTreatHerButtonPage() {
        ebayElectronicsPage.isElementDisplayed(ebayElectronicsPage.laptopImg);
    }

    @When("user clicks on Register Text link")
    public void userClicksOnRegisterTextLink() {
        ebayElectronicsPage = new EbayElectronicsPage();
        ebayElectronicsPage.clickRegisterTextLink();
    }
    @When("user selects Business account radio button")
    public void userSelectsBusinessAccountRadioButton() {
       // ebayElectronicsPage.waitForElementToBeSelected(ebayElectronicsPage.businessAccRadioBtn);
        ebayElectronicsPage = new EbayElectronicsPage();
        ebayElectronicsPage.clickBusinessAccRadioBtn();

    }

    @And("user enters business name as {string}")
    public void userEntersBusinessNameAsBusinessNames(String BusinessNames) {
        ebayElectronicsPage = new EbayElectronicsPage();
    ebayElectronicsPage.entersBusinessName(BusinessNames);


    }

    @When("user enters business email as {string}")
    public void userEntersBusinessEmailAsBusinessEmails(String BusinessEmails) {
        ebayElectronicsPage = new EbayElectronicsPage();
        ebayElectronicsPage.entersBusinessEmail(BusinessEmails);

    }

    @When("user enters password as {string}")
    public void userEntersPasswordAsPasswords(String Passwords) {
        ebayElectronicsPage = new EbayElectronicsPage();
        ebayElectronicsPage.entersBusinessPassword(Passwords);
    }


    @And("user clicks on survey Icon")
    public void userClicksOnSurveyIcon() {
        ebayElectronicsPage.clickSurveyImageLink();
    }

    @And("user enters a survey as {string}")
    public void userEntersASurveyAs(String text) {
        ebayElectronicsPage.sendTextToSurveyBox();

    }

    @Then("Send Button is not activated")
    public void sendButtonActivated() {
        ebayElectronicsPage.verifyingSurveyBox.isEnabled();

    }

    @Then("Create Button Should be activated")
    public void createButtonShouldBeActivated() {
        ebayElectronicsPage.isElementEnabled(ebayElectronicsPage.businessAccBtn);
    }
}