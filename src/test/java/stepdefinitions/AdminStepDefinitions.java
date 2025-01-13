package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdminStepDefinitions {

    AdminPage adminPage=new AdminPage();
    WebDriver driver;


    @Given("logged in as an admin")
    public void logged_in_as_an_admin() {
        ReusableMethods.adminlogin("adminAndTeacherLogin","ozlem.admin@wonderworldcollege.com","o6*d@fko3PXL1");
    }

    @When("click on the {string} option in the left sidebar")
    public void click_on_the_option_in_the_left_sidebar(String StudentInformation) {
        adminPage.labelStudentInformation.click();
        ReusableMethods.bekle(1);
    }

    @Then("see the {string} link listed")
    public void see_the_link_listed(String OnlineAdmission) {
        assertTrue(adminPage.labelOnlineAdmission.isDisplayed());
        assertTrue(adminPage.labelOnlineAdmission.isEnabled());
    }

    @When("click on the {string} link")
    public void click_on_the_link(String OnlineAdmission) {
        adminPage.labelOnlineAdmission.click();
        ReusableMethods.bekle(1);
    }

    @Then("see the {string} table with the following  headers \\(Reference No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Student Mobile Number, Form Status, Enrolled, Created At, Action titles)")
    public void see_the_table_with_the_following_headers_reference_no_student_name_class_father_name_date_of_birth_gender_category_student_mobile_number_form_status_enrolled_created_at_action_titles(String string) {
        List<String>expectedTitles= new ArrayList<>(Arrays.asList("Reference No","Student Name","Class","Father Name","Date Of Birth","Gender","Category","Student Mobile Number","Form Status","Enrolled","Created At","Action"));
        List<String> actualTitles = ReusableMethods.stringListeyeCevir(adminPage.columnHeader);
        ReusableMethods.bekle(1);
        String exp=expectedTitles.toString().replaceAll(",","");
        String act=actualTitles.toString();
        assertEquals(exp,act);
        ReusableMethods.bekle(2);
    }

    @When("enter a student name in the search box")
    public void enter_a_student_name_in_the_search_box() {
        adminPage.labelSearch.sendKeys("ozlem");
        ReusableMethods.bekle(2);

    }
    @Then("see only the details of the relevant student in the search results")
    public void see_only_the_details_of_the_relevant_student_in_the_search_results() {
        List<String> actualsearch = ReusableMethods.stringListeyeCevir(adminPage.columnfirst);
        assertTrue(actualsearch.toString().contains("ozlem"));

    }

    @Then("see the {string} table")
    public void see_the_table(String string) {
        assertTrue(adminPage.labelStudentList.isDisplayed());
    }

    @Then("see the {string} column")
    public void see_the_column(String string) {
        assertTrue(adminPage.columnFormStatus.isDisplayed());
        assertTrue(adminPage.columnEnrolled.isDisplayed());
    }

    @Then("the form status should be {string} for students who have not submitted the form")
    public void the_form_status_should_be_for_students_who_have_not_submitted_the_form(String expectedStatus) {
        assertTrue(adminPage.iconNotSubmitted.isDisplayed());
        assertTrue(adminPage.iconNotSubmitted.isEnabled());
    }

    @Then("the form status should be {string} for students who have submitted the form")
    public void the_form_status_should_be_for_students_who_have_submitted_the_form(String expectedStatus) {
        assertTrue(adminPage.iconSubmitted.isDisplayed());
        assertTrue(adminPage.iconSubmitted.isEnabled());
    }

    @Then("the enrollment status should display a {string} icon for students whose enrollment is complete")
    public void the_enrollment_status_should_display_a_icon_for_students_whose_enrollment_is_complete(String string) {
        assertTrue(adminPage.iconEnrolled.isDisplayed());
        assertTrue(adminPage.iconEnrolled.isEnabled());
    }

    @Then("the enrollment status should display a {string} icon for students whose enrollment is not complete")
    public void the_enrollment_status_should_display_a_icon_for_students_whose_enrollment_is_not_complete(String string) {
        assertTrue(adminPage.iconNotEnrolled.isDisplayed());
        assertTrue(adminPage.iconNotEnrolled.isEnabled());
    }

    @When("click the delete icon under the {string} column for a specific student")
    public void click_the_delete_icon_under_the_column_for_a_specific_student(String string) {
        adminPage.iconDelete.click();
        ReusableMethods.bekle(2);
    }

    @Then("confirm the delete action")
    public void confirm_the_delete_action() {
       assertTrue(adminPage.successAlert.isDisplayed());
        assertTrue(adminPage.successAlert.isEnabled());
    }

    // test case 4
    @When("click the {string} icon for a specific student")
    public void click_the_icon_for_a_specific_student(String string) {
        adminPage.iconEditAndEnroll.click();
        ReusableMethods.bekle(2);
    }

    @Then("the Online Admission form is displayed with pre-filled student details")
    public void the_online_admission_form_is_displayed_with_pre_filled_student_details() {
        assertTrue(adminPage.labelEditOnlineAdmission.isDisplayed());
    }

    @Then("the {string} field is filled in")
    public void the_field_is_filled_in(String string) {
        adminPage.inputBoxAdmissionNo.click();
        ReusableMethods.bekle(1);
        adminPage.inputBoxAdmissionNo.clear();
        ReusableMethods.bekle(1);
        String sendKey="12345";
        adminPage.inputBoxAdmissionNo.sendKeys(sendKey);
        ReusableMethods.bekle(2);
    }

    @When("the {string} section is completed, it is verified that the total fee is calculated automatically")
    public void the_section_is_completed_it_is_verified_that_the_total_fee_is_calculated_automatically(String string) {
        ReusableMethods.bekle(2);
        adminPage.checkBoxFees.click();
        ReusableMethods.bekle(2);
        assertTrue(adminPage.labelTotalFees.isDisplayed());
    }

    @When("the plus icon next to the {string} section is clicked")
    public void the_plus_icon_next_to_the_section_is_clicked(String string) {
        adminPage.iconPlusFeesDetails.click();
        ReusableMethods.bekle(2);
    }

    @Then("the fee breakdown details are displayed")
    public void the_fee_breakdown_details_are_displayed() {
        assertTrue(adminPage.rowFeesDetail.isDisplayed());
        assertTrue(adminPage.rowFeesDetail.isEnabled());
        ReusableMethods.bekle(1);
    }

    @Then("a confirmation dialog box is clicked")
    public void a_confirmation_dialog_box_is_clicked() {
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(2);
    }

    @When("the Save button is clicked")
    public void the_save_button_is_clicked() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",adminPage.saveButton);
        ReusableMethods.bekle(1);
        adminPage.saveButton.click();
        ReusableMethods.bekle(1);
    }

    @When("the Save and Enroll button is clicked")
    public void the_save_and_enroll_button_is_clicked() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",adminPage.saveAndEnrollButton);
        ReusableMethods.bekle(1);
        adminPage.saveAndEnrollButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("a confirmation message indicating successful saving is displayed")
    public void a_confirmation_message_indicating_successful_saving_is_displayed() {
        assertTrue(adminPage.successAlert.isDisplayed());
        assertTrue(adminPage.successAlert.isEnabled());
    }

    @Then("the {string} icon for a specific student is clicked")
    public void the_icon_for_a_specific_student_is_clicked(String string) {
        adminPage.iconEditAndEnroll.click();
        ReusableMethods.bekle(1);
    }

    @Then("it is verified that the student's enrollment status is updated to {string}.")
    public void it_is_verified_that_the_student_s_enrollment_status_is_updated_to(String string) {
        assertTrue(adminPage.iconEnrolled.isDisplayed());
    }
}
