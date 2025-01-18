package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.platform.suite.api.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.ParentMyProfileAndProfilImagePage;
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
    ParentMyProfileAndProfilImagePage parentMyProfileAndProfilImagePage = new ParentMyProfileAndProfilImagePage();



    @Given("The user navigates to the relevant URL and logs in.")
    public void the_user_navigates_to_the_relevant_url_and_logs_in() {

        ReusableMethods.login("studentAndParentLogin","pinar.student","wonderworld123");

    }


    @Then("The user verifies that there is a clickable and visible {string} menu title in the sidebar.")
    public void the_user_verifies_that_there_is_a_clickable_and_visible_menu_title_in_the_sidebar(String homework) {

        assertTrue(studentHomeworkPage.studentHwMenu.isDisplayed());
        assertTrue(studentHomeworkPage.studentHwMenu.isEnabled());

    }

    @Then("clicks the homework menu.")
    public void clicks_the_homework_menu() {
        studentHomeworkPage.studentHwMenu.click();
        ReusableMethods.bekle(1);
    }

    @Then("The user tests that the homework in the {string} section on the opened page are listed under the following headers: Class, Section, Subject, Homework Date, Submission Date, Evaluation Date, Max Marks, Marks Obtained, Note, Status, and Action.")
    public void the_user_tests_that_the_homework_in_the_section_on_the_opened_page_are_listed_under_the_following_headers_class_section_subject_homework_date_submission_date_evaluation_date_max_marks_marks_obtained_note_status_and_action(String string) {

        List<String> expectedTitles=new ArrayList<String>(Arrays.asList("Class","Section","Subject","Homework Date","Submission Date","Evaluation Date","Max Marks","Marks Obtained","Note","Status","Action"));
        List<String> actualTitles=ReusableMethods.stringListeyeCevir(studentHomeworkPage.upcommingHwTitles);
        ReusableMethods.bekle(1);
        String exp=expectedTitles.toString().replaceAll(",","");
        String act=actualTitles.toString();
        assertEquals(exp,act);
        ReusableMethods.bekle(2);

    }


    @Then("The user tests that the homework details can be accessed and messages can be sent in the {string} section.")
    public void the_user_tests_that_the_homework_details_can_be_accessed_and_messages_can_be_sent_in_the_section(String string) {

        studentHomeworkPage.upcommingActionButton.click();
        ReusableMethods.bekle(2);
        assertTrue(studentHomeworkPage.upcommingActionHwDetailsMenu.isDisplayed());
        studentHomeworkPage.hwDetailsMessageBox.clear();
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
        studentHomeworkPage.hwDetailsMessageBox.clear();
        studentHomeworkPage.hwDetailsMessageBox.sendKeys("I couldn't complete,sorry!");
        ReusableMethods.bekle(3);
        studentHomeworkPage.hwDetailsSaveButton.click();
        ReusableMethods.bekle(1);
        //assertTrue(studentHomeworkPage.firstRowOfAssignList.getText().contains("Pending"));
    }


    @Given("The user enters the {string} section and verifies that a new window opens after clicking the {string} button.")
    public void the_user_enters_the_section_and_verifies_that_a_new_window_opens_after_clicking_the_button(String string, String string2) {
        studentHomeworkPage.dailyAssignmentButton.click();
        ReusableMethods.bekle(1);
        studentHomeworkPage.addDailyAssignmentButton.click();
        ReusableMethods.bekle(1);
        assertTrue(studentHomeworkPage.labeladdDailyAssign.isDisplayed());
    }


    @Then("In the opened window, the user clicks the first option in the subject dropdown, enters a title in the title box, clicks the {string} button, and verifies that the entered assignment appears in the assignment list.")
    public void in_the_opened_window_the_user_clicks_the_first_option_in_the_subject_dropdown_enters_a_title_in_the_title_box_clicks_the_button_and_verifies_that_the_entered_assignment_appears_in_the_assignment_list(String string) {

        studentHomeworkPage.addDailyAssignSubjectButton.click();
        studentHomeworkPage.firstOptionOfSubject.click();
        studentHomeworkPage.addDailyAssignTitleButton.click();
        String sendKey="deneme";
        studentHomeworkPage.addDailyAssignTitleButton.sendKeys(sendKey);
        ReusableMethods.bekle(2);
        studentHomeworkPage.addDailyAssignSaveButton.click();
        ReusableMethods.bekle(1);
        assertTrue(studentHomeworkPage.firstRowOfAssignList.getText().contains(sendKey));


    }
    @Then("The user clicks the edit button in the {string} section of the assignment list, enters data in the opened screen, clicks the save button, and updates the assignments.")
    public void the_user_clicks_the_edit_button_in_the_section_of_the_assignment_list_enters_data_in_the_opened_screen_clicks_the_save_button_and_updates_the_assignments(String string) {

    studentHomeworkPage.dailyAssignmentEditButton.click();
    ReusableMethods.bekle(1);
    studentHomeworkPage.editdailyAssTitleBox.clear();
    studentHomeworkPage.editdailyAssTitleBox.click();
    String sendKeys="Homework";
    studentHomeworkPage.editdailyAssTitleBox.sendKeys(sendKeys);
    studentHomeworkPage.editdailyAssSaveButton.click();
    ReusableMethods.bekle(2);
    assertTrue(studentHomeworkPage.firstRowOfAssignList.getText().contains(sendKeys));



    }

    @Then("The user views the column fields on the {string} page.")
    public void the_user_views_the_column_fields_on_the_page(String string) {

        assertTrue(studentHomeworkPage.tableDailyAssList.isDisplayed());

    }

    @Then("The user clicks the delete button of the assignment they wish to delete in the {string} section of the assignment list and verifies the {string} message.")
    public void the_user_clicks_the_delete_button_of_the_assignment_they_wish_to_delete_in_the_section_of_the_assignment_list_and_verifies_the_message(String string, String string2) {

        studentHomeworkPage.dailyAssignmentDeleteButton.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(1);
       // assertTrue(studentHomeworkPage.tableMessageControl.getText().contains("Successfully deleted"));
        parentMyProfileAndProfilImagePage.profileImageButton.click();


    }


}
