package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Select;
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
       //System.out.println(ExpectedUrlApplyLeave);
       //System.out.println(ActualUrlApplyLeave);

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
        Assertions.assertTrue(teacherApplyLeavePage.labelApplyDate.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.dateInputLeaveFromDate.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.dateInputLeaveToDate.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.dropDownAvailableLeave.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.inputBoxReason.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.saveButtonApplyLeave.isDisplayed());


    }

    @Then("In the Add Details window, the user fills in the required fields, clicks the Save button, and creates a new leave record.")
    public void in_the_add_details_window_the_user_fills_in_the_required_fields_clicks_the_save_button_and_creates_a_new_leave_record() {

        teacherApplyLeavePage.dropDownAvailableLeave.click();
        ReusableMethods.bekle(2);
        //teacherApplyLeavePage.dropDownAvailableLeave.sendKeys("Casual Leave (20)");
        Select select = new Select(teacherApplyLeavePage.dropDownAvailableLeave);
        select.selectByValue("2");


        // teacherApplyLeavePage.dateInputLeaveToDate.click();
        teacherApplyLeavePage.dateInputLeaveFromDate.click();
        ReusableMethods.bekle(2);
        teacherApplyLeavePage.dateChoiceLeaveFromDate.click();
        // teacherApplyLeavePage.dateInputLeaveFromDate.sendKeys("20/01/2025");
        // ReusableMethods.bekle(1);
        // System.out.println(teacherApplyLeavePage.dateInputLeaveToDate.getText());
        teacherApplyLeavePage.dateInputLeaveToDate.click();
        ReusableMethods.bekle(2);
        teacherApplyLeavePage.dateChoiceLeaveToDate.click();
        // System.out.println(teacherApplyLeavePage.dateInputLeaveFromDate);

        // teacherApplyLeavePage.dateInputLeaveFromDate.sendKeys("20/01/2025");
        // ReusableMethods.bekle(5);

        teacherApplyLeavePage.inputBoxReason.sendKeys("They will deliver the new car I will purchase.");
        ReusableMethods.bekle(2);

        teacherApplyLeavePage.saveButtonApplyLeave.click();
        ReusableMethods.bekle(6);

        Assertions.assertTrue(teacherApplyLeavePage.row1stLeave.isDisplayed());

        //teacherApplyLeavePage.row1stLeave.isDisplayed();
        //System.out.println(teacherApplyLeavePage.row1stLeave.getText());
        Assertions.assertTrue(teacherApplyLeavePage.row1stLeave.getText().contains("Leave"));

    }
    @When("All created leave records are displayed in the Leaves List with the headings Staff, Leave Type, Leave Date, Days, Apply Date, Status, and Action.")
        public void all_created_leave_records_are_displayed_in_the_leaves_list_with_the_headings_staff_leave_type_leave_date_days_apply_date_status_and_action() {
        Assertions.assertTrue(teacherApplyLeavePage.labelStaffAtLeaves.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.labelLeaveTypeAtLeaves.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.labelLeaveDateAtLeaves.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.labelDaysAtLeaves.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.labelApplyDateAtLeaves.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.labelStatusAtLeaves.isDisplayed());
        Assertions.assertTrue(teacherApplyLeavePage.labelActionAtLeaves.isDisplayed());

        }
    @Then("It is verified that the status of the leave record is displayed under the Status heading in the Leaves List.")
        public void it_is_verified_that_the_status_of_the_leave_record_is_displayed_under_the_status_heading_in_the_leaves_list() {

        }
    @Then("Under the Action heading in the Leaves List, the delete icon is displayed for leave records with a status of pending.")
        public void under_the_action_heading_in_the_leaves_list_the_delete_icon_is_displayed_for_leave_records_with_a_status_of_pending() {

        }
   @Then("the icon under the Action heading is clicked, the corresponding record is deleted.")
        public void the_icon_under_the_action_heading_is_clicked_the_corresponding_record_is_deleted() {
        teacherApplyLeavePage.iconDeleteAtLeaves.click();
        Driver.getDriver().switchTo().alert().accept();


        }
   @Then("The details window of the selected leave record can be accessed by clicking the view icon under the Action heading.")
        public void the_details_window_of_the_selected_leave_record_can_be_accessed_by_clicking_the_view_icon_under_the_action_heading() {

       teacherApplyLeavePage.applyLeaveButton.click();
       ReusableMethods.bekle(2);
       String popUpWindowNewWH = Driver.getDriver().getWindowHandle();
       Driver.getDriver().switchTo().window(popUpWindowNewWH);

       teacherApplyLeavePage.dropDownAvailableLeave.click();
       ReusableMethods.bekle(2);

       Select select = new Select(teacherApplyLeavePage.dropDownAvailableLeave);
       select.selectByValue("2");

       teacherApplyLeavePage.dateInputLeaveFromDate.click();
       ReusableMethods.bekle(2);
       teacherApplyLeavePage.dateChoiceLeaveFromDate.click();

       teacherApplyLeavePage.dateInputLeaveToDate.click();
       ReusableMethods.bekle(2);
       teacherApplyLeavePage.dateChoiceLeaveToDate.click();

       teacherApplyLeavePage.inputBoxReason.sendKeys("They will deliver the new car I will purchase.");
       ReusableMethods.bekle(2);

       teacherApplyLeavePage.saveButtonApplyLeave.click();
       ReusableMethods.bekle(6);


        teacherApplyLeavePage.iconViewAtLeaves.click();
        ReusableMethods.bekle(4);
       String popUpViewWindowWH = Driver.getDriver().getWindowHandle();
       Driver.getDriver().switchTo().window(popUpViewWindowWH);
       Assertions.assertTrue(teacherApplyLeavePage.tableViewAtLeaves.isDisplayed());
       Assertions.assertTrue(teacherApplyLeavePage.tableViewAtLeaves.getText().contains("Details"));

        }


    }
