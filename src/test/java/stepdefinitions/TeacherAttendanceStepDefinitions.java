package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Select;
import pages.ParentLoginPage;
import pages.TeacherAttendancePage;
import utilities.ReusableMethods;
import utilities.Driver;
import utilities.ConfigReader;
public class TeacherAttendanceStepDefinitions {

    TeacherAttendancePage teacherAttendancePage=new TeacherAttendancePage();
    ParentLoginPage parentLoginPage=new ParentLoginPage();


    //WWC145  TC01 -> US037 Test of displaying the Period Attendance By Date page
    // link under the Attendance menu title in the sidebar of the Teacher panel
    // and being directed to the Period Attendance By Date page when clicked.

    @Given("User goes to TeacherLogin address")
    public void user_goes_to_teacher_login_address() {
        Driver.driver.get(ConfigReader.getProperty("adminAndTeacherLogin"));
    }
    @Given("User enters Teacher username.")
    public void user_enters_teacher_username() {
        parentLoginPage.userNameBox.sendKeys(ConfigReader.getProperty("Teacher_username_009"));
        ReusableMethods.bekle(1);
    }
    @Then("User enters Teacher password.")
    public void user_enters_teacher_password() {
        parentLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("Teacher_password_009"));
        ReusableMethods.bekle(1);
    }
    @Then("User click sign in button.")
    public void user_click_sign_in_button() {
        ReusableMethods.bekle(1);
        parentLoginPage.signInButton.click();
    }
    @Given("The user clicks the Attendance dropdawn menu in the sidebar.")
    public void the_user_clicks_the_attendance_dropdawn_menu_in_the_sidebar() {
        teacherAttendancePage.attendanceButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("The user sees the Period Attendance By Date menu under the Attendance dropdawn menu.")
    public void the_user_sees_the_period_attendance_by_date_menu_under_the_attendance_dropdawn_menu() {
        Assertions.assertTrue( teacherAttendancePage.PerAttDateMenu.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user clicks the Period Attendance By Date menu under the Attendance dropdawn menu.")
    public void the_user_clicks_the_period_attendance_by_date_menu_under_the_attendance_dropdawn_menu() {
        teacherAttendancePage.PerAttDateMenu.click();
        ReusableMethods.bekle(2);
    }
    @Then("The user confirms that they are on the Period Attendance By Date page with the {string} title text.")
    public void the_user_confirms_that_they_are_on_the_period_attendance_by_date_page_with_the_title_text(String expectedText) {
        String actualText= teacherAttendancePage.perAttDateTitleText.getText();
        Assertions.assertEquals(expectedText,actualText);

    }

    //WWC146 TC_02 -> US_037 On the Period Attendance By Date page, in the Select Criteria section, the Class,
    // Section dropdown menus, the Date box and the Search button are visible and tested to be active.

    @Given("The user sees the text Class in the Select Criteria section.")
    public void the_user_sees_the_text_class_in_the_select_criteria_section() {
        String expectedText="Class";
        String actualText=teacherAttendancePage.selCrClassText.getText();
        Assertions.assertEquals(expectedText,actualText);
        ReusableMethods.bekle(2);
    }
    @Then("The user sees the Class dropdown box in the Select Criteria section.")
    public void the_user_sees_the_class_dropdown_box_in_the_select_criteria_section() {
        Assertions.assertTrue(teacherAttendancePage.selCrClassDropdown.isDisplayed(),"Class Drop-down menu is not visible.");
        ReusableMethods.bekle(2);
    }
    @Then("The user tests that the Class dropdown box is active in the Select Criteria section.")
    public void the_user_tests_that_the_class_dropdown_box_is_active_in_the_select_criteria_section() {
        Assertions.assertTrue(teacherAttendancePage.selCrClassDropdown.isEnabled(),"Class Drop-down menu is not active.");
        ReusableMethods.bekle(2);
    }
    @Given("The user sees the text Section in the Select Criteria section.")
    public void the_user_sees_the_text_section_in_the_select_criteria_section() {
        String expectedText1="Section";
        String actualText1=teacherAttendancePage.selCrSectionText.getText();
        Assertions.assertEquals(expectedText1,actualText1);
        ReusableMethods.bekle(2);
    }
    @Then("The user sees the Section dropdown menu in the Select Criteria section.")
    public void the_user_sees_the_section_dropdown_menu_in_the_select_criteria_section() {
        Assertions.assertTrue(teacherAttendancePage.selCrSectionDropdown.isDisplayed(),"Section Drop-down menu is not visible.");
        ReusableMethods.bekle(2);
    }
    @Then("The user tests that the Section dropdown is active in the Select Criteria section.")
    public void the_user_tests_that_the_section_dropdown_is_active_in_the_select_criteria_section() {
        Assertions.assertTrue(teacherAttendancePage.selCrSectionDropdown.isEnabled(),"Section Drop-down menu is not active.");
        ReusableMethods.bekle(2);
    }
    @Given("The user sees the text Date in the Select Criteria section.")
    public void the_user_sees_the_text_date_in_the_select_criteria_section() {
        String expectedText2="Date";
        String actualText2=teacherAttendancePage.selCrDateText.getText();
        Assertions.assertEquals(expectedText2,actualText2);
        ReusableMethods.bekle(2);
    }
    @Then("The user sees the Date box in the Select Criteria section.")
    public void the_user_sees_the_date_box_in_the_select_criteria_section() {
        Assertions.assertTrue(teacherAttendancePage.selCrDateBox.isDisplayed(),"Date Box is not visible.");
        ReusableMethods.bekle(2);
    }
    @Then("The user tests that the Date box is active in the Select Criteria section.")
    public void the_user_tests_that_the_date_box_is_active_in_the_select_criteria_section() {
        Assertions.assertTrue(teacherAttendancePage.selCrDateBox.isEnabled(),"DateBox is not active.");
        ReusableMethods.bekle(2);
    }
    @Given("The user sees the Search button in the Select Criteria section.")
    public void the_user_sees_the_search_button_in_the_select_criteria_section() {
        Assertions.assertTrue(teacherAttendancePage.selCrSearchText.isDisplayed(),"Search Button is not visible.");
        ReusableMethods.bekle(2);
    }
    @Given("The user tests that the Search button in the Select Criteria section is active.")
    public void the_user_tests_that_the_search_button_in_the_select_criteria_section_is_active() {
        Assertions.assertTrue(teacherAttendancePage.selCrSearchButton.isEnabled(),"Search Button is not active.");
        ReusableMethods.bekle(2);
    }

    //WWC147 TC_03 -> US_037 Test for creating a Student List (with Student and course title) according
    // to the selected criteria and displaying the attendance records of all students.

    @Then("user clicks on the Class dropdown menu in the Select Criteria section.")
    public void userClicksOnTheClassDropdownMenuInTheSelectCriteriaSection() {
        teacherAttendancePage.selCrClassDropdown.click();
        ReusableMethods.bekle(1);
    }
    @Then("user selects {string} from the class dropdown menu in the Selected Criteria Section.")
    public void user_selects_from_the_class_dropdown_menu_in_the_selected_criteria_section(String className) {
        Select select=new Select(teacherAttendancePage.selCrClassDropdown);
        select.selectByVisibleText(className);
        String actualClassName=select.getFirstSelectedOption().getText();
        Assertions.assertEquals(className,actualClassName,"Class Dropdown nothing is selected.");
        ReusableMethods.bekle(1);
    }
    @Then("user clicks on the Section dropdown menu in the Select Criteria section.")
    public void userClicksOnTheSectionDropdownMenuInTheSelectCriteriaSection() {
        teacherAttendancePage.selCrSectionDropdown.click();
        ReusableMethods.bekle(1);
    }
    @Then("user selects {string} from the Section dropdown menu in the Selected Criteria Section.")
    public void user_selects_from_the_section_dropdown_menu_in_the_selected_criteria_section(String sectionName) {
        Select select=new Select(teacherAttendancePage.selCrSectionDropdown);
        select.selectByVisibleText(sectionName);
        String actuelSectionName=select.getFirstSelectedOption().getText();
        Assertions.assertEquals(sectionName,actuelSectionName,"Section Dropdown nothing is selected.");
        ReusableMethods.bekle(2);
    }
    @Then("user clicks on the Date Box menu in the Select Criteria section.")
    public void userClicksOnTheDateBoxMenuInTheSelectCriteriaSection() {
        teacherAttendancePage.selCrDateBox.click();
        ReusableMethods.bekle(1);
    }
    @Then("user selects {string} from the Date Box menu in the Select Criteria Section.")
    public void user_selects_from_the_date_box_menu_in_the_select_criteria_section(String expectedDate) {
        teacherAttendancePage.dateTableBoxText.click();
        String actualdate=teacherAttendancePage.selCrDateBox.getAttribute("value");
        Assertions.assertEquals(expectedDate, actualdate, "The selected date was not written in the box or was written incorrectly.");
        ReusableMethods.bekle(1);

    }
    @Then("user clicks the Search Button.")
    public void user_clicks_the_search_button() {
        teacherAttendancePage.selCrSearchButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("user sees the Student title in the opened Student List.")
    public void user_sees_the_student_title_in_the_opened_student_list() {
        Assertions.assertTrue(teacherAttendancePage.StudentListTitle.isDisplayed(),"There is no Student title in Student List");
        ReusableMethods.bekle(1);
    }
    @Then("user sees the Course name {string} in the opened Student List.")
    public void user_sees_the_course_name_in_the_opened_student_list(String Ders) {
        String actualDersTitleText=teacherAttendancePage.studListDersTitleText.getText();
        Assertions.assertTrue(actualDersTitleText.contains(Ders));
        ReusableMethods.bekle(1);
    }
    @Then("user sees the attendance records of all students.")
    public void user_sees_the_attendance_records_of_all_students() {
        Assertions.assertTrue(teacherAttendancePage.studentListForm.isDisplayed(),"Student List is not visible.");
        ReusableMethods.bekle(1);
    }







}
