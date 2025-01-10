package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminPage;
import pages.StudentPage_Pinar;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.*;

public class StudentStepDefinitons_Pinar {

    AdminPage adminPage=new AdminPage();
    StudentPage_Pinar studentPagePinar=new StudentPage_Pinar();

    @Given("The user verifies that there is a clickable and visible {string} menu title in the sidebar.")
    public void the_user_verifies_that_there_is_a_clickable_and_visible_menu_title_in_the_sidebar(String homework) {

        ReusableMethods.login("studentAndParentLogin","pinar.student","wonderworld123");

        assertTrue(studentPagePinar.studentHwMenu.isDisplayed());
        assertTrue(studentPagePinar.studentHwMenu.isEnabled());

    }
    @Then("The user tests that the homework in the {string} section on the opened page are listed under the following headers: Class, Section, Subject, Homework Date, Submission Date, Evaluation Date, Max Marks, Marks Obtained, Note, Status, and Action.")
    public void the_user_tests_that_the_homework_in_the_section_on_the_opened_page_are_listed_under_the_following_headers_class_section_subject_homework_date_submission_date_evaluation_date_max_marks_marks_obtained_note_status_and_action(String string) {

    }
    @Then("The user tests that the homework details can be accessed and messages can be sent in the {string} section.")
    public void the_user_tests_that_the_homework_details_can_be_accessed_and_messages_can_be_sent_in_the_section(String string) {

    }
    @Then("The user tests that a message can be sent from the {string} section in the {string} section.")
    public void the_user_tests_that_a_message_can_be_sent_from_the_section_in_the_section(String string, String string2) {

    }

}
