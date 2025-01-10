package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminPage;
import pages.StudentHomeworkPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentHomeworkStepDefinitions {

    AdminPage adminPage=new AdminPage();
    StudentHomeworkPage studentHomeworkPage=new StudentHomeworkPage();

    @Given("The user verifies that there is a clickable and visible {string} menu title in the sidebar.")
    public void the_user_verifies_that_there_is_a_clickable_and_visible_menu_title_in_the_sidebar(String homework) {

        ReusableMethods.login("studentAndParentLogin","pinar.student","wonderworld123");

        assertTrue(studentHomeworkPage.studentHwMenu.isDisplayed());
        assertTrue(studentHomeworkPage.studentHwMenu.isEnabled());

    }

    @Then("The user tests that the homework in the {string} section on the opened page are listed under the following headers: Class, Section, Subject, Homework Date, Submission Date, Evaluation Date, Max Marks, Marks Obtained, Note, Status, and Action.")
    public void the_user_tests_that_the_homework_in_the_section_on_the_opened_page_are_listed_under_the_following_headers_class_section_subject_homework_date_submission_date_evaluation_date_max_marks_marks_obtained_note_status_and_action(String string) {

        studentHomeworkPage.studentHwMenu.click();
        ReusableMethods.bekle(1);
        List<String> expectedTitles=new ArrayList<String>(Arrays.asList("Class","Section","Subject","Homework Date","Submission Date","Evaluation Date","Max Marks","Marks Obtained","Note","Status","Action"));

        List<String> actualTitles=ReusableMethods.stringListeyeCevir(studentHomeworkPage.upcommingHwTitles);
        ReusableMethods.bekle(1);
        String exp=expectedTitles.toString().replaceAll(",","");
        System.out.println(exp);
        String act=actualTitles.toString();
        System.out.println(act);
        assertEquals(exp,act);
        ReusableMethods.bekle(2);

    }



    @Then("The user tests that the homework details can be accessed and messages can be sent in the {string} section.")
    public void the_user_tests_that_the_homework_details_can_be_accessed_and_messages_can_be_sent_in_the_section(String string) {

        studentHomeworkPage.upcommingActionButton.click();
        ReusableMethods.bekle(2);
        assertTrue(studentHomeworkPage.upcommingActionHwDetailsMenu.isDisplayed());
        studentHomeworkPage.hwDetailsMessageBox.sendKeys("Done");
        ReusableMethods.bekle(2);
        studentHomeworkPage.hwDetailsSaveButton.click();
        ReusableMethods.bekle(1);
        assertTrue(studentHomeworkPage.firstRowOfAssignList.getText().contains("Submitted"));

    }



    @Then("The user tests that a message can be sent from the {string} section in the {string} section.")
    public void the_user_tests_that_a_message_can_be_sent_from_the_section_in_the_section(String string, String string2) {

        studentHomeworkPage.closedHwMenu.click();
        ReusableMethods.bekle(2);
        studentHomeworkPage.closedActionButton.click();
        ReusableMethods.bekle(2);
        studentHomeworkPage.hwDetailsMessageBox.sendKeys("I couldn't complete,sorry!");
        ReusableMethods.bekle(3);
        studentHomeworkPage.hwDetailsSaveButton.click();
        ReusableMethods.bekle(1);
        assertTrue(studentHomeworkPage.firstRowOfAssignList.getText().contains("Pending"));
    }

}
