package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.HomePageOnlineAdmissionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HomePageOnlineAdmissionStepDefinitions {

    HomePageOnlineAdmissionPage homePageOnlineAdmissionPage = new HomePageOnlineAdmissionPage();
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    String filePath = "/Users/copperdevil/Desktop/cem foto.png";

    @Given("user goes to the {string}")
    public void user_goes_to_the(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("click on the Online Admission menu heading in the top bar")
    public void click_on_the_online_admission_menu_heading_in_the_top_bar() {
        homePageOnlineAdmissionPage.linkOnlineAddmission.click();

       homePage.linkOnlineAdmission.click();
    }

    @Then("confirms that it redirects to the Online Admission page")
    public void confirms_that_it_redirects_to_the_online_admission_page() {

        String expectedTitle = "Online Admission Form";
        String actualTitle = Driver.getDriver().getTitle();

        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Then("verifies that the school enrollment criteria are displayed in the Instructions section on the page")
    public void verifiesThatTheSchoolEnrollmentCriteriaAreDisplayedInTheInstructionsSectionOnThePage() {

        Assertions.assertTrue(homePageOnlineAdmissionPage.labelInstructions.isDisplayed());
    }
    @Then("verifies that the required elements \\(Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email) are visible in the Basic Details section on the page")
    public void verifies_that_the_required_elements_class_first_name_last_name_gender_date_of_birth_mobile_number_email_are_visible_in_the_basic_details_section_on_the_page() {

        Assertions.assertTrue(homePageOnlineAdmissionPage.dropDownClass.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputBoxFirstName.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputBoxLastName.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.dropDownGender.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.dropDownDateOfBirth.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputBoxMobilePhone.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputBoxEmail.isDisplayed());
    }

    @Then("verifies that And Class, First Name, Gender, Date Of Birth TextBoxes are required fields to enter data")
    public void verifies_that_and_class_first_name_gender_date_of_birth_text_boxes_are_required_fields_to_enter_data() {

        Assertions.assertTrue(homePageOnlineAdmissionPage.iconClassRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.iconDateOfBirthRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.iconGenderRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.iconFirstNameRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.iconEmailRequired.isDisplayed());
    }

    @Then("enters random data into Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email textBoxes")
    public void enters_random_data_into_class_first_name_last_name_gender_date_of_birth_mobile_number_email_text_boxes() {

        Select selectClass = new Select(homePageOnlineAdmissionPage.dropDownClass);
        Select selectGender = new Select(homePageOnlineAdmissionPage.dropDownGender);

        selectClass.selectByIndex(1);

        homePageOnlineAdmissionPage.inputBoxFirstName.sendKeys(faker.name().firstName());
        homePageOnlineAdmissionPage.inputBoxLastName.sendKeys(faker.name().lastName());
        selectGender.selectByVisibleText("Male");

        homePageOnlineAdmissionPage.dropDownDateOfBirth.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.dateOfBirthDatePickerMonthButton.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.dateOfBirthDatePickerYearButton.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.dateOfBirthPrevYearButton.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.dateOfBirthYear.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.dateOfBirthMonth.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.dateOfBirthDay.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.inputBoxMobilePhone.sendKeys(faker.phoneNumber().cellPhone());
        homePageOnlineAdmissionPage.inputBoxEmail.sendKeys(faker.internet().emailAddress());
    }

    @Then("uploads a photo to the Student Photo section in Basic Details")
    public void uploads_a_photo_to_the_student_photo_section_in_basic_details() {

        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.studentPhotoButton.sendKeys(filePath);

        ReusableMethods.bekle(1);

        actions.moveToElement(homePageOnlineAdmissionPage.studentPhotoButton).perform();

        ReusableMethods.bekle(2);

        Assertions.assertTrue(homePageOnlineAdmissionPage.studentPhotoRemoveButton.isDisplayed());
    }

    @And("verifies that the Father Name, Mother Name TextBoxes are visible in the Parent Detail field on the sheet")
    public void verifiesThatTheFatherNameMotherNameTextBoxesAreVisibleInTheParentDetailFieldOnTheSheet() {

        Assertions.assertTrue(homePageOnlineAdmissionPage.inputFatherName.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputMotherName.isDisplayed());
    }

    @Then("enters random data in the Father Name, Mother Name TextBoxes in the Parent Detail field")
    public void entersRandomDataInTheFatherNameMotherNameTextBoxesInTheParentDetailField() {

        homePageOnlineAdmissionPage.inputFatherName.sendKeys(faker.name().firstName());
        homePageOnlineAdmissionPage.inputMotherName.sendKeys(faker.name().firstName());

        ReusableMethods.bekle(1);
    }

    @Then("that the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes are visible in the Guardian Details field on the And page")
    public void that_the_guardian_name_guardian_relation_guardian_email_guardian_phone_guardian_occupation_guardian_address_text_boxes_are_visible_in_the_guardian_details_field_on_the_and_page() {

        Assertions.assertTrue(homePageOnlineAdmissionPage.inputGuardianName.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputGuardianRelation.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputGuardianEmail.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputGuardianPhone.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputGuardianOccupation.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputGuardianAddress.isDisplayed());
    }
    @Then("verifies that If Guardian Is, Guardian Name, Guardian Relation TextBoxes in the Guardian Details field are required fields to enter data")
    public void verifies_that_if_guardian_is_guardian_name_guardian_relation_text_boxes_in_the_guardian_details_field_are_required_fields_to_enter_data() {

        Assertions.assertTrue(homePageOnlineAdmissionPage.iconIfGuardianIsRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.iconGuardianNameRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.iconGuardianRelationRequired.isDisplayed());
    }
    @Then("enters random values in the Guardian Name, Guardian Relation, Guardian Email, Guardian Phone, Guardian Occupation, Guardian Address TextBoxes in the Guardian Details field")
    public void enters_random_values_in_the_guardian_name_guardian_relation_guardian_email_guardian_phone_guardian_occupation_guardian_address_text_boxes_in_the_guardian_details_field() {

        homePageOnlineAdmissionPage.inputGuardianName.sendKeys(faker.name().firstName());
        homePageOnlineAdmissionPage.inputGuardianRelation.sendKeys("Father");
        homePageOnlineAdmissionPage.inputGuardianEmail.sendKeys(faker.internet().emailAddress());
        homePageOnlineAdmissionPage.inputGuardianPhone.sendKeys(faker.phoneNumber().phoneNumber());
        homePageOnlineAdmissionPage.inputGuardianOccupation.sendKeys(faker.job().field());
        homePageOnlineAdmissionPage.inputGuardianAddress.sendKeys(faker.address().fullAddress());
    }
    @Then("Guardian uploads photos for Parent in the Details field")
    public void guardian_uploads_photos_for_parent_in_the_details_field() {

        homePageOnlineAdmissionPage.guardianPhotoButton
                .sendKeys(filePath);

        ReusableMethods.bekle(1);

        actions.moveToElement(homePageOnlineAdmissionPage.guardianPhotoButton).perform();

        ReusableMethods.bekle(2);

        Assertions.assertTrue(homePageOnlineAdmissionPage.guardianPhotoRemoveButton.isDisplayed());
    }

    @And("Verifies that the radio buttons in the If Guardian Is question in the And Guardian Details field are visible and clickable")
    public void verifiesThatTheRadioButtonsInTheIfGuardianIsQuestionInTheAndGuardianDetailsFieldAreVisibleAndClickable() {

        Assertions.assertTrue(homePageOnlineAdmissionPage.radioButtonFather.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.radioButtonMother.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.radioButtonOther.isDisplayed());

        homePageOnlineAdmissionPage.radioButtonFather.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.radioButtonMother.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.radioButtonOther.click();
        ReusableMethods.bekle(1);
    }

    @And("verifies that the National Identification Number, Previous School Details TextBoxes are visible in the Miscellaneous Details field on the page")
    public void verifiesThatTheNationalIdentificationNumberPreviousSchoolDetailsTextBoxesAreVisibleInTheMiscellaneousDetailsFieldOnThePage() {

        actions.moveToElement(homePageOnlineAdmissionPage.inputNationalID).perform();

        ReusableMethods.bekle(1);

        Assertions.assertTrue(homePageOnlineAdmissionPage.inputNationalID.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.inputPreviousSchool.isDisplayed());
    }

    @Then("enters random values in the National Identification Number, Previous School Details TextBoxes in the Miscellaneous Details field")
    public void entersRandomValuesInTheNationalIdentificationNumberPreviousSchoolDetailsTextBoxesInTheMiscellaneousDetailsField() {

        homePageOnlineAdmissionPage.inputNationalID.sendKeys(faker.idNumber().valid());
        homePageOnlineAdmissionPage.inputPreviousSchool.sendKeys(faker.programmingLanguage().name());
    }

    @And("uploads a document to the Upload Documents field")
    public void uploadsADocumentToTheUploadDocumentsField() {

        actions.moveToElement(homePageOnlineAdmissionPage.uploadDocumentButton).perform();

        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.uploadDocumentButton
                .sendKeys(filePath);

        ReusableMethods.bekle(1);

        actions.moveToElement(homePageOnlineAdmissionPage.uploadDocumentButton).perform();

        ReusableMethods.bekle(1);

        Assertions.assertTrue(homePageOnlineAdmissionPage.uploadDocumentRemoveButton.isDisplayed());
    }

    @Then("fills out the form on the page and clicks Submit")
    public void fills_out_the_form_on_the_page_and_clicks_submit() {

        Select selectClass = new Select(homePageOnlineAdmissionPage.dropDownClass);
        Select selectGender = new Select(homePageOnlineAdmissionPage.dropDownGender);

        selectClass.selectByIndex(1);

        homePageOnlineAdmissionPage.inputBoxFirstName.sendKeys(faker.name().firstName());
        homePageOnlineAdmissionPage.inputBoxLastName.sendKeys(faker.name().lastName());
        selectGender.selectByVisibleText("Male");

        homePageOnlineAdmissionPage.dropDownDateOfBirth.click();

        homePageOnlineAdmissionPage.dateOfBirthDatePickerMonthButton.click();

        homePageOnlineAdmissionPage.dateOfBirthDatePickerYearButton.click();

        homePageOnlineAdmissionPage.dateOfBirthPrevYearButton.click();

        homePageOnlineAdmissionPage.dateOfBirthYear.click();

        homePageOnlineAdmissionPage.dateOfBirthMonth.click();

        homePageOnlineAdmissionPage.dateOfBirthDay.click();
        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.inputBoxMobilePhone.sendKeys(faker.phoneNumber().cellPhone());
        homePageOnlineAdmissionPage.inputBoxEmail.sendKeys(faker.internet().emailAddress());

        actions.moveToElement(homePageOnlineAdmissionPage.inputGuardianName).perform();

        ReusableMethods.bekle(1);

        homePageOnlineAdmissionPage.radioButtonFather.click();

        homePageOnlineAdmissionPage.inputGuardianName.sendKeys(faker.name().firstName());

        homePageOnlineAdmissionPage.submitButton.click();

        ReusableMethods.bekle(1);
    }

    @Then("verifies that the student is redirected to the Review Entered Details and Status page and that a Reference Number has been created on behalf of the student")
    public void verifies_that_the_student_is_redirected_to_the_review_entered_details_and_status_page_and_that_a_reference_number_has_been_created_on_behalf_of_the_student() {

        String expectedUrlIcerik = "online_admission_review";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assertions.assertTrue(actualUrl.contains(expectedUrlIcerik));

        Assertions.assertTrue(homePageOnlineAdmissionPage.rowReferenceNo.isDisplayed());
    }

    @Then("verifies that the Form Status on the page is Not Submitted and the Application Date is the date the record was created on the Online Admission page")
    public void verifies_that_the_form_status_on_the_page_is_not_submitted_and_the_application_date_is_the_date_the_record_was_created_on_the_online_admission_page() {

        String expectedFormStatus = "Not Submitted";
        String actualFormStatus = homePageOnlineAdmissionPage.rowFormStatus.getText();

        Assertions.assertEquals(expectedFormStatus, actualFormStatus);


        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);

        String expectedDate = formattedDate;
        String actualDate = homePageOnlineAdmissionPage.rowApplicationDate.getText();

        Assertions.assertEquals(expectedDate, actualDate);
    }

    @Then("verifies that the I Agree To The Terms And Conditions checkBox on the page is visible and clicks")
    public void verifies_that_the_i_agree_to_the_terms_and_conditions_check_box_on_the_page_is_visible_and_clicks() {

        actions.moveToElement(homePageOnlineAdmissionPage.termsAndConditionsCheckBox).perform();

        ReusableMethods.bekle(1);

        Assertions.assertTrue(homePageOnlineAdmissionPage.termsAndConditionsCheckBox.isDisplayed());

        homePageOnlineAdmissionPage.termsAndConditionsCheckBox.click();
    }

    @Then("clicks the Submit button on the page and verifies that the message Form Has Been Submitted Successfully...!! appears and the Form Status is Submitted")
    public void clicks_the_submit_button_on_the_page_and_verifies_that_the_message_form_has_been_submitted_successfully_appears_and_the_form_status_is_submitted() {

        homePageOnlineAdmissionPage.reviewSubmitButton.click();

        ReusableMethods.bekle(2);

        Assertions.assertTrue(homePageOnlineAdmissionPage.alertSuccess.isDisplayed());

        String expectedFormStatus = "Submitted";
        String actualFormStatus = homePageOnlineAdmissionPage.rowFormStatus.getText();

        Assertions.assertEquals(expectedFormStatus, actualFormStatus);

        ReusableMethods.bekle(2);
    }

}
