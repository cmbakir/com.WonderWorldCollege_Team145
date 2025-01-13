package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.StudentMyProfilePage;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.*;

public class StudentMyProfileDefinitions {

    StudentMyProfilePage studentMyProfilePage = new StudentMyProfilePage();

    @Given("the user successfully logs in to the student page")
    public void the_user_successfully_logs_in_to_the_student_page() {
        studentMyProfilePage.studentLogin();

        assertTrue(studentMyProfilePage.welcome.isDisplayed());
        assertTrue(studentMyProfilePage.welcome.isEnabled());

    }
    @Then("my profile menu should be displayed and clickable in the sidebar")
    public void my_profile_menu_should_be_displayed_and_clickable_in_the_sidebar() {

        assertTrue(studentMyProfilePage.sidebarMyPro.isDisplayed());
        assertTrue(studentMyProfilePage.sidebarMyPro.isEnabled());
    }

    @Given("On the page that opens, I should be able to see the box consisting of Student's name, Admission No, Role Number, Class, Section, Gender, barcode field")
    public void on_the_page_that_opens_i_should_be_able_to_see_the_box_consisting_of_student_s_name_admission_no_role_number_class_section_gender_barcode_field() {

        studentMyProfilePage.studentLogin();
        studentMyProfilePage.sidebarMyPro.click();

        assertTrue(studentMyProfilePage.name.isDisplayed());
        assertTrue(studentMyProfilePage.admmNo.isDisplayed());
        assertTrue(studentMyProfilePage.rollNm.isDisplayed());
        assertTrue(studentMyProfilePage.clas.isDisplayed());
        assertTrue(studentMyProfilePage.section.isDisplayed());
        assertTrue(studentMyProfilePage.gender.isDisplayed());
        assertTrue(studentMyProfilePage.barcode.isDisplayed());
    }

    @Given("As a student, I should be able to see that the My Profile page consists of Profile, Exam, and Documents menus in the navbar")
    public void as_a_student_i_should_be_able_to_see_that_the_my_profile_page_consists_of_profile_exam_and_documents_menus_in_the_navbar() {

        studentMyProfilePage.studentLogin();
        studentMyProfilePage.sidebarMyPro.click();
        ReusableMethods.bekle(2);

        assertTrue(studentMyProfilePage.profile.isDisplayed());
        assertTrue(studentMyProfilePage.profile.isEnabled());
        assertTrue(studentMyProfilePage.exam.isDisplayed());
        assertTrue(studentMyProfilePage.exam.isEnabled());
        assertTrue(studentMyProfilePage.documents.isDisplayed());
        assertTrue(studentMyProfilePage.documents.isEnabled());
    }

    @Given("I should be able to see the relevant fields when I log in to profil as a user")
    public void i_should_be_able_to_see_the_relevant_fields_when_i_log_in_to_profil_as_a_user() {

        studentMyProfilePage.studentLogin();
        ReusableMethods.bekle(1);
        studentMyProfilePage.sidebarMyPro.click();

        assertTrue(studentMyProfilePage.adressdetails.isDisplayed());
        assertTrue(studentMyProfilePage.partGuardnDet.isDisplayed());
        assertTrue(studentMyProfilePage.miscelDets.isDisplayed());
        assertTrue(studentMyProfilePage.guardiaName.isDisplayed());
    }

    @Given("I should be able to see the relevant fields when I log in to Exam as a user")
    public void i_should_be_able_to_see_the_relevant_fields_when_ı_log_in_to_exam_as_a_user() {

        studentMyProfilePage.studentLogin();
        studentMyProfilePage.sidebarMyPro.click();
        studentMyProfilePage.exam.click();

        assertTrue(studentMyProfilePage.examNamefirst.isDisplayed());
    }
    @Given("I should be able to go to the relevant fields when I log in to Documents as a user")
    public void i_should_be_able_to_go_to_the_relevant_fields_when_ı_log_in_to_documents_as_a_user() {

        studentMyProfilePage.studentLogin();
        studentMyProfilePage.sidebarMyPro.click();

        studentMyProfilePage.documents.click();
        assertTrue(studentMyProfilePage.documentNamefirst.isDisplayed());
    }

}
