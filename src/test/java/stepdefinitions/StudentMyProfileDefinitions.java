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

    @Given("On the page that opens, the user sees the box consisting of Student's name, Admission No, Role Number, Class, Section, Gender, barcode field")
    public void on_the_page_that_opens_the_user_sees_the_box_consisting_of_student_s_name_admission_no_role_number_class_section_gender_barcode_field() {

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

    @Given("The user sees that the My Profile page consists of Profile, Exam, and Documents menus in the navbar")
    public void the_user_sees_that_the_my_profile_page_consists_of_profile_exam_and_documents_menus_in_the_navbar() {
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
    @Given("The user access the relevant fields when logging in to the Profil")
    public void the_user_access_the_relevant_fields_when_logging_in_to_the_profil() {
        studentMyProfilePage.studentLogin();
        ReusableMethods.bekle(1);
        studentMyProfilePage.sidebarMyPro.click();

        assertTrue(studentMyProfilePage.adressdetails.isDisplayed());
        assertTrue(studentMyProfilePage.partGuardnDet.isDisplayed());
        assertTrue(studentMyProfilePage.miscelDets.isDisplayed());
        assertTrue(studentMyProfilePage.guardiaName.isDisplayed());

    }
    @Given("The user access the relevant fields when logging in to the Exam")
    public void the_user_access_the_relevant_fields_when_logging_in_to_the_exam() {

        studentMyProfilePage.studentLogin();
        studentMyProfilePage.sidebarMyPro.click();
        studentMyProfilePage.exam.click();

        assertTrue(studentMyProfilePage.examNamefirst.isDisplayed());
    }
    @Given("The user access the relevant fields when logging in to the Documents")
    public void the_user_access_the_relevant_fields_when_logging_in_to_the_documents() {
        studentMyProfilePage.studentLogin();
        studentMyProfilePage.sidebarMyPro.click();

        studentMyProfilePage.documents.click();
        assertTrue(studentMyProfilePage.Namefirst.isDisplayed());
    }
}
