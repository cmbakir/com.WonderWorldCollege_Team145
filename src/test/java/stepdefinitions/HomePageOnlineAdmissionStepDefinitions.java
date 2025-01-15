package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import pages.HomePageOnlineAdmissionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageOnlineAdmissionStepDefinitions {

    HomePageOnlineAdmissionPage homePageOnlineAdmissionPage = new HomePageOnlineAdmissionPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user goes to the {string}")
    public void user_goes_to_the(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("click on the Online Admission menu heading in the top bar")
    public void click_on_the_online_admission_menu_heading_in_the_top_bar() {

        Driver.getDriver().findElement(By.linkText("Online Admission")).click();
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

        homePageOnlineAdmissionPage.studentPhotoButton
                .sendKeys("C:\\Users\\legen\\OneDrive\\Masaüstü\\Her Şey\\Resimler\\named.jpg");

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
                .sendKeys("C:\\Users\\legen\\OneDrive\\Masaüstü\\Her Şey\\Resimler\\named.jpg");

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
}
