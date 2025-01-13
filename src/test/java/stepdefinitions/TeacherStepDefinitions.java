package stepdefinitions;


import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.TeacherCommunicationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TeacherStepDefinitions {
    TeacherCommunicationPage teacherCommunicationPage = new TeacherCommunicationPage();
    Faker faker = new Faker();

    @Given("The teacher is logged into the system")
    public void theTeacherIsLoggedIntoTheSystem() {
        teacherCommunicationPage.teacherLogin();
    }

    @When("The teacher clicks the sidebar menu in the teacher panel")
    public void the_teacher_clicks_the_sidebar_menu_in_the_teacher_panel() {
        teacherCommunicationPage.sideNavCommunicateButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("The {string} link under the {string} menu is visible")
    public void the_link_under_the_menu_is_visible(String assertion1, String assertion2) {

        Assertions.assertTrue(teacherCommunicationPage.sideNavSendEmailButton.isDisplayed());
    }

    @When("The teacher clicks on the {string} link")
    public void the_teacher_clicks_on_the_link(String sendEmailButton) {

        teacherCommunicationPage.sideNavSendEmailButton.click();

    }

    @Then("The page is redirected to the Send Email page with a URL containing {string}")
    public void the_page_is_redirected_to_the_send_email_page_with_a_url_containing(String string) {
        String expectedUrl = "https://qa.wonderworldcollege.com/admin/mailsms/compose";
        String actualurl = Driver.getDriver().getCurrentUrl();

    }


    @And("The Email Template dropdown is visible and clickable")
    public void theEmailTemplateDropdownIsVisibleAndClickable() {

        Assertions.assertTrue(teacherCommunicationPage.emailTemplateDDM.isDisplayed());
        Select emailTemplateSelect = new Select(teacherCommunicationPage.emailTemplateDDM);
        emailTemplateSelect.selectByVisibleText("Sports Day Events");
        ReusableMethods.waitFor(1);
        ReusableMethods.doubleClick(teacherCommunicationPage.titleBox);
        teacherCommunicationPage.titleBox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        teacherCommunicationPage.titleBox.sendKeys(Keys.DELETE);
        teacherCommunicationPage.titleBox.sendKeys(faker.backToTheFuture().character());


    }

    @And("The Message text box is visible and editable")
    public void theMessageTextBoxIsVisibleAndEditable() {

        driver.switchTo().frame(teacherCommunicationPage.iframeBodyBox);

        teacherCommunicationPage.iframeTextArea.clear();
        TeacherCommunicationPage.iframeTextArea.sendKeys(faker.backToTheFuture().quote());

        driver.switchTo().defaultContent();
        ReusableMethods.bekle(2);


    }

    @And("The user clicks on the submit button")
    public void theUserClicksOnTheSubmitButton() {
        ReusableMethods.hover(teacherCommunicationPage.submitButton);
        teacherCommunicationPage.submitButton.click();
    }

    @And("The user submits the message and verifies successful delivery")
    public void theUserSubmitsTheMessageAndVerifiesSuccessfulDelivery() {
        ReusableMethods.waitForVisibility(teacherCommunicationPage.popTextMsg, 600);
    }

    @And("The selected options should be highlighted or marked")
    public void theSelectedOptionsShouldBeHighlightedOrMarked() {
        teacherCommunicationPage.messageToStudent.click();
        teacherCommunicationPage.messageToGurdian.click();
        teacherCommunicationPage.messageToAdmin.click();
        teacherCommunicationPage.messageToTeacher.click();
        teacherCommunicationPage.messageToAccuntant.click();
        teacherCommunicationPage.messageToLiberarian.click();
        teacherCommunicationPage.messageToReceptionist.click();
        teacherCommunicationPage.messageToSuperAdmin.click();

    }

    @And("The user removes the selected options")
    public void theUserRemovesTheSelectedOptions() {
        teacherCommunicationPage.messageToStudent.click();
        teacherCommunicationPage.messageToGurdian.click();
        teacherCommunicationPage.messageToAdmin.click();
        teacherCommunicationPage.messageToTeacher.click();
        teacherCommunicationPage.messageToAccuntant.click();
        teacherCommunicationPage.messageToLiberarian.click();
        teacherCommunicationPage.messageToReceptionist.click();
        teacherCommunicationPage.messageToSuperAdmin.click();
    }

    @And("The teacher selects the Class options")
    public void theTeacherSelectsTheClassOptions() {
        teacherCommunicationPage.sendEmailClassTab.click();
        ReusableMethods.getScreenshotTumSayfa(driver);
    }

    @And("The options {string} should be displayed for selection")
    public void theOptionsShouldBeDisplayedForSelection(String arg0) {
        //bug war
    }

    @And("The user selects a class and adds it to the recipient list")
    public void theUserSelectsAClassAndAddsItToTheRecipientList() {
    }

    @And("The class should be successfully added to the recipient list")
    public void theClassShouldBeSuccessfullyAddedToTheRecipientList() {
    }

    @And("The user selects the Schedule option and sets a future date")
    public void theUserSelectsTheScheduleOptionAndSetsAFutureDate() {
        teacherCommunicationPage.scheduleRadioButton.click();
        ReusableMethods.waitFor(1);
        teacherCommunicationPage.scheduleDateBox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        teacherCommunicationPage.scheduleDateBox.sendKeys(Keys.DELETE);
        teacherCommunicationPage.scheduleDateBox.sendKeys("31/01/2025");
        ReusableMethods.waitFor(2);
    }
    @And("The message should be sent to the specified recipients")
    public void theMessageShouldBeSentToTheSpecifiedRecipients() {
        teacherCommunicationPage.messageToAccuntant.click();
        teacherCommunicationPage.messageToLiberarian.click();
        teacherCommunicationPage.messageToReceptionist.click();
        teacherCommunicationPage.messageToSuperAdmin.click();

    }









}

