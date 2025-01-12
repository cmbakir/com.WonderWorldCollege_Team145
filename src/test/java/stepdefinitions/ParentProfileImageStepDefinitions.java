package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.ParentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParentProfileImageStepDefinitions {

    ParentPage parentPage=new ParentPage();

    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();


    @Given("The user navigates to the parent “homePage” address.")
    public void the_user_navigates_to_the_parent_home_page_address() {

        ReusableMethods.login("studentAndParentLogin",ConfigReader.getProperty("parentCurrentUsername"),"wonderworld123");

    }
    @Then("The user views the {string} button from the profile image.")
    public void the_user_views_the_button_from_the_profile_image(String string) {

        parentPage.profileImageButton.click();
        ReusableMethods.bekle(1);

        assertTrue(parentPage.profileImageChangePasswordButton.isDisplayed());

    }
    @Then("The user clicks the {string} button and accesses the relevant page.")
    public void the_user_clicks_the_button_and_accesses_the_relevant_page(String string) {


        parentPage.profileImageChangePasswordButton.click();
        ReusableMethods.bekle(1);
        parentPage.profileImageChangeUsernameSection.click();
        assertTrue(parentPage.changeUsernameForm.isDisplayed());

    }
    @Then("The user enters a username combination with fewer than {int} characters and verifies that the following warning message is received: {string}")
    public void the_user_enters_a_username_combination_with_fewer_than_characters_and_verifies_that_the_following_warning_message_is_received(Integer int1, String string) {

        parentPage.currentUsernameBox.sendKeys(ConfigReader.getProperty("parentCurrentUsername"));
        parentPage.newUsernameBox.sendKeys(ConfigReader.getProperty("parentGecersizNewUsername"));
        parentPage.confirmUsernameBox.sendKeys(ConfigReader.getProperty("parentGecersizNewUsername"));
        parentPage.changeUsernameFormSaveButton.click();
        ReusableMethods.bekle(1);

        String expectedMessage="The username must be at least 5 characters long.";
        String actualMessage=parentPage.labelAllertMessage.getText();
        assertEquals(expectedMessage,actualMessage);


    }
    @Then("The user enters the correct username combination and verifies that the message {string} is received.")
    public void the_user_enters_the_correct_username_combination_and_verifies_that_the_message_is_received(String string) {

        parentPage.currentUsernameBox.sendKeys(ConfigReader.getProperty("parentCurrentUsername"));
        parentPage.newUsernameBox.sendKeys(ConfigReader.getProperty("parentGecerliNewUsername"));
        parentPage.confirmUsernameBox.sendKeys(ConfigReader.getProperty("parentGecerliNewUsername"));
        ReusableMethods.bekle(1);
        parentPage.changeUsernameFormSaveButton.click();
        ReusableMethods.bekle(1);
        String expSuccessMessage="Record Saved Successfully";
        String actSuccessMessage=parentPage.labelSuccessMessage.getText();
        assertEquals(expSuccessMessage,actSuccessMessage);
    }

    @Then("The user accesses the {string} page.")
    public void the_user_accesses_the_page(String string) {

        parentPage.myProfileMenu.click();
        assertTrue(parentPage.myProfileTable.isDisplayed());

    }
    @Then("The user views the fields for Student's Name, Admission No, Class, Section, and Gender on this page.")
    public void the_user_views_the_fields_for_student_s_name_admission_no_class_section_and_gender_on_this_page() {

        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",parentPage.myProfileTable);
        ReusableMethods.bekle(1);

        List<String> expFields=new ArrayList<>(Arrays.asList("Admission No " , "Class", "Section", "Gender"));


        int kontrol=0;

        for (String each :expFields){

            if (parentPage.myProfileTable.getText().contains(each)){
                kontrol++;
            }


        }
        ReusableMethods.bekle(1);
        assertEquals(4,kontrol);

        ReusableMethods.bekle(1);

        assertTrue(parentPage.myProfileUsernameField.isDisplayed());



    }
    @Then("The user verifies that the Profile, Fees, Exam, and Documents sections and their functions are visible.")
    public void the_user_verifies_that_the_profile_fees_exam_and_documents_sections_and_their_functions_are_visible() {

        assertTrue(parentPage.myProfileProfile.isDisplayed());
        assertTrue(parentPage.myProfileFees.isDisplayed());
        assertTrue(parentPage.myProfileExam.isDisplayed());
        assertTrue(parentPage.myProfileDocuments.isDisplayed());

    }
    @Then("The user verifies that the Profile, Fees, Exam, and Documents sections are clickable, and the relevant fields are visible.")
    public void the_user_verifies_that_the_profile_fees_exam_and_documents_sections_are_clickable_and_the_relevant_fields_are_visible() {

        assertTrue(parentPage.myProfileProfile.isEnabled());
        assertTrue(parentPage.myProfileFees.isEnabled());
        ReusableMethods.bekle(1);
        assertTrue(parentPage.myProfileExam.isEnabled());
        assertTrue(parentPage.myProfileDocuments.isEnabled());
        ReusableMethods.bekle(1);

        parentPage.myProfileProfile.click();
        ReusableMethods.bekle(1);
        assertTrue(parentPage.myProfileProfileTable.isDisplayed());

        parentPage.myProfileFees.click();
        ReusableMethods.bekle(1);
        assertTrue(parentPage.myProfileFeesTable.isDisplayed());

        parentPage.myProfileExam.click();
        ReusableMethods.bekle(1);
        assertTrue(parentPage.myProfileExamTable.isDisplayed());

        parentPage.myProfileDocuments.click();
        ReusableMethods.bekle(1);
        assertTrue(parentPage.myProfileDocumentsTable.isDisplayed());

    }


}
