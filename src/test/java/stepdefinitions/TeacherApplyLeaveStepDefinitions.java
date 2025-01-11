package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.TeacherApplyLeavePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TeacherApplyLeaveStepDefinitions {
    TeacherApplyLeavePage teacherApplyLeavePage = new TeacherApplyLeavePage();

    @Given("The user logs in as a teacher on the relevant Admin login screen using their username and password.")
    public void the_user_logs_in_as_a_teacher_on_the_relevant_admin_login_screen_using_their_username_and_password() {
        ReusableMethods.teacherLogin("https://qa.wonderworldcollege.com/site/login","cem.bakir@wonderworldcollege.com","o6*d@fko3PXL1");


    }

    @Then("The teacher user clicks on the Human Resource dropdown menu in the sidebar of the panel.")
    public void the_teacher_user_clicks_on_the_human_resource_dropdown_menu_in_the_sidebar_of_the_panel() {
        teacherApplyLeavePage.dropDownHumanResource.click();
        ReusableMethods.bekle(2);

    }

    @Then("The teacher user views the Apply Leave page link under the Human Resource menu.")
    public void the_teacher_user_views_the_apply_leave_page_link_under_the_human_resource_menu() {
        Assertions.assertTrue( teacherApplyLeavePage.linkApplyLeave.isDisplayed());

    }

    @Then("The teacher user verifies that clicking on the Apply Leave tab navigates to the corresponding page.")
    public void the_teacher_user_verifies_that_clicking_on_the_apply_leave_tab_navigates_to_the_corresponding_page() {
        teacherApplyLeavePage.linkApplyLeave.click();
       ReusableMethods.bekle(2);
       String ExpectedUrlApplyLeave = "https://qa.wonderworldcollege.com/admin/staff/leaverequest";

        String ActualUrlApplyLeave = Driver.getDriver().getCurrentUrl();

       Assertions.assertEquals(ExpectedUrlApplyLeave,ActualUrlApplyLeave);
       System.out.println(ExpectedUrlApplyLeave);
       System.out.println(ActualUrlApplyLeave);

    }

    @Then("The teacher user views and clicks the Apply Leave button located at the top right corner of the Apply Leave page.")
    public void the_teacher_user_views_and_clicks_the_apply_leave_button_located_at_the_top_right_corner_of_the_apply_leave_page() {
        Assertions.assertTrue(teacherApplyLeavePage.applyLeaveButton.isDisplayed());
        teacherApplyLeavePage.applyLeaveButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("In the opened Add Details window, the fields Apply Date, Available Leave, Leave From Date, Leave To Date, Reason box, and the Save button should be visible and active.")
    public void in_the_opened_add_details_window_the_fields_apply_date_available_leave_leave_from_date_leave_to_date_reason_box_and_the_save_button_should_be_visible_and_active() {
        String popUpWindowWH = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(popUpWindowWH);
        teacherApplyLeavePage.dateInputLeaveFromDate.sendKeys("03/01/2025");
        ReusableMethods.bekle(6);
        Assertions.assertTrue(teacherApplyLeavePage.dateInputLeaveFromDate.isDisplayed());



    }

    @Then("In the Add Details window, the user fills in the required fields, clicks the Save button, and creates a new leave record.")
    public void in_the_add_details_window_the_user_fills_in_the_required_fields_clicks_the_save_button_and_creates_a_new_leave_record() {

    }
}