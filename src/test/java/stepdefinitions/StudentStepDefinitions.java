package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.StudentAttendancePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class StudentStepDefinitions {

    StudentAttendancePage studentAttendancePage =new StudentAttendancePage();

    @Given("User logs in as a student")
    public void user_logs_in_as_a_student() {
        studentAttendancePage.studentLogin();
    }
    @When("The Attendance menu title is displayed in the sidebar of the Student panel")
    public void the_attendance_menu_title_is_displayed_in_the_sidebar_of_the_student_panel() {
        Assertions.assertTrue(studentAttendancePage.sideNavAttendenceButton.isDisplayed());
    }
    @When("User clicks on the Attendance menu")
    public void user_clicks_on_the_attendance_menu() {
        studentAttendancePage.sideNavAttendenceButton.click();
    }
    @Then("User should be redirected to the Attendance page")
    public void user_should_be_redirected_to_the_attendance_page() {
        String expectedUrl="https://qa.wonderworldcollege.com/user/attendence";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);

    }
    @Then("The browser is closed")
    public void the_browser_is_closed() {
        ReusableMethods.waitFor(3);
        Driver.quitDriver();
    }
    @When("The user selects a date from the date picker")
    public void the_user_selects_a_date_from_the_date_picker() {
        studentAttendancePage.attendencePageDateBox.clear();
        studentAttendancePage.attendencePageDateBox.sendKeys("08/01/2025");
        studentAttendancePage.attendencePageDateBox.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(2);
     }
    @When("The attendance records for the selected date should be displayed")
    public void the_attendance_records_for_the_selected_date_should_be_displayed() {


        List<String> attendenceResultList = ReusableMethods.getStringList(studentAttendancePage.attendenceResult);
        System.out.println(attendenceResultList);

        for (String eachAttendenceElement : attendenceResultList) {
            Assertions.assertTrue(attendenceResultList.contains(eachAttendenceElement));
        }
    }



    @And("The following column headers should be visible")
    public void theFollowingColumnHeadersShouldBeVisible() {

        List<String> attendenceHeaderTitleList = ReusableMethods.getStringList(studentAttendancePage.attendenceResultHeadTitleList);
        System.out.println(attendenceHeaderTitleList);
        for (String eachElement : attendenceHeaderTitleList) {
            Assertions.assertTrue(attendenceHeaderTitleList.contains(eachElement));

        }

     }


}
