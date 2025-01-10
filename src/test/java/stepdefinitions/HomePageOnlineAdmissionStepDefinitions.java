package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.cucumber.java.eo.Se;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import pages.HomePageOnlineAdmissionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageOnlineAdmissionStepDefinitions {

    HomePageOnlineAdmissionPage homePageOnlineAdmissionPage = new HomePageOnlineAdmissionPage();
    Faker faker = new Faker();


    @Given("user goes to the {string}")
    public void user_goes_to_the(String url) {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
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

        homePageOnlineAdmissionPage.submitButton.click();

        ReusableMethods.bekle(2);

        Assertions.assertTrue(homePageOnlineAdmissionPage.labelClassRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.labelFirstNameRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.labelGenderRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.labelDateOfBirthRequired.isDisplayed());
        Assertions.assertTrue(homePageOnlineAdmissionPage.labelEmailRequired.isDisplayed());
    }

    @Then("enters random data into Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email textBoxes")
    public void enters_random_data_into_class_first_name_last_name_gender_date_of_birth_mobile_number_email_text_boxes() {

        Select selectClass = new Select(homePageOnlineAdmissionPage.dropDownClass);
        Select selectGender = new Select(homePageOnlineAdmissionPage.dropDownGender);

        selectClass.selectByIndex(0);

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


    }



}
