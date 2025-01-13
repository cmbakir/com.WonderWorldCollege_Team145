package stepdefinitions;


import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.ParentLoginPage;
import pages.StudentSidebarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class StudentSidebarStepDefinitions {

    ParentLoginPage parentLoginPage=new ParentLoginPage();
    StudentSidebarPage studentSidebarPage=new StudentSidebarPage();

    //WWC148 TC01 -> US049 Test of seeing and clicking the Online Exam menu in the sidebar
    // of the student panel and viewing the titles in the Upcoming Exam that opens.

    @Given("User enters student username.")
    public void user_enters_student_username() {
        parentLoginPage.userNameBox.sendKeys(ConfigReader.getProperty("Student_username_009"));
        ReusableMethods.bekle(1);
    }
    @Then("User enters student password.")
    public void user_enters_student_password() {
        parentLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("Student_password_009"));
        ReusableMethods.bekle(1);
    }



    @Given("The user sees the Online Exam menu title in the sidebar of the Student panel.")
    public void the_user_sees_the_online_exam_menu_title_in_the_sidebar_of_the_student_panel() {
        studentSidebarPage.SutudentOnlineExamButton.isDisplayed();
        ReusableMethods.bekle(1);


    }
    @Then("The user clicks the Online Exam menu in the sidebar of the Student panel.")
    public void the_user_clicks_the_online_exam_menu_in_the_sidebar_of_the_student_panel() {
        studentSidebarPage.SutudentOnlineExamButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the text {string} on the page that opens.")
    public void the_user_sees_the_text_on_the_page_that_opens(String expectedText) {
        String actualText=studentSidebarPage.OnlineExamText.getText();
        Assertions.assertEquals(expectedText,actualText);
        ReusableMethods.bekle(1);

    }
    @Then("The user confirms with the title text that the active section is Upcoming Exam.")
    public void theUserConfirmsWithTheTitleTextThatTheActiveSectionIsUpcomingExam() {
        String expectedText3="Upcoming Exams";
        String actuelText3=studentSidebarPage.aktivSectionText.getText();
        Assertions.assertEquals(expectedText3,actuelText3);
    }

    @Then("The user sees the Exam title in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_exam_title_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExExamButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Quiz title in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_quiz_title_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExQuizButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Date From title in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_date_from_title_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExDateFromButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Date To title in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_date_to_title_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExDateToButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Duration title in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_duration_title_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExDurationButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Total Attempt title in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_total_attempt_title_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExTotalAttemptedButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Attempted title in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_attempted_title_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExAttemptedButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Status heading in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_status_heading_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExStatusButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Action heading in the Upcoming Exams section of the Online Exam page.")
    public void the_user_sees_the_action_heading_in_the_upcoming_exams_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.UpExActionButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    //WWC149 TC02 -> US049 Test of being able to view and click on the "View" button in the Action section
    // of Upcoming Exams and see the fields on the page that opens.

    @Given("The user sees the View in the Action section of Upcoming Exams.")
    public void the_user_sees_the_view_in_the_action_section_of_upcoming_exams() {
        Assertions.assertTrue(studentSidebarPage.UpviewTittleText.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("Then the user clicks the View in the Action section of Upcoming Exams.")
    public void then_the_user_clicks_the_view_in_the_action_section_of_upcoming_exams() {
        studentSidebarPage.UpviewTittleText.click();
        ReusableMethods.bekle(2);
    }
    @Then("Then the user sees the fields of the View page that opens and validates the page.")
    public void then_the_user_sees_the_fields_of_the_view_page_that_opens_and_validates_the_page() {
        Assertions.assertTrue(studentSidebarPage.UpClExViewForm.isDisplayed());

    }

    //WWC150 TC03 -> US049 User can view the titles in the Closed Exam section of the Online Exam menu.

    @Then("The user clicks on the Closed Exam section on the Online Exam page.")
    public void the_user_clicks_on_the_closed_exam_section_on_the_online_exam_page() {
        studentSidebarPage.ClExBolumButonu.click();
    }
    @Then("The user confirms with the title text that the active section is Closed Exam.")
    public void the_user_confirms_with_the_title_text_that_the_active_section_is_closed_exam() {
        String expectedText2="Closed Exam";
        String actuelText2=studentSidebarPage.aktivSectionText.getText();
        Assertions.assertEquals(expectedText2,actuelText2);
    }
    @Then("The user sees the Exam title in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_exam_title_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExExamButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Quiz title in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_quiz_title_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExQuizButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Date From title in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_date_from_title_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExDateFromButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Date To title in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_date_to_title_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExDateToButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Duration title in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_duration_title_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExDurationButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Total Attempt title in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_total_attempt_title_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExTotalAttemptedButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Attempted title in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_attempted_title_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExAttemptedButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Status heading in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_status_heading_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExStatusButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The user sees the Action heading in the Closed Exam section of the Online Exam page.")
    public void the_user_sees_the_action_heading_in_the_closed_exam_section_of_the_online_exam_page() {
        Assertions.assertTrue(studentSidebarPage.ClExActionButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    //WWC151 TC04 -> US049 Test of being able to view and click on the "View" button
    // in the Action section of Closed Exam and see the fields on the page that opens.

    @Given("The user sees the View in the Action section of Closed Exam.")
    public void theUserSeesTheViewInTheActionSectionOfClosedExam() {
        Assertions.assertTrue(studentSidebarPage.ClviewTittleText.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Then("Then the user clicks the View in the Action section of Closed Exam.")
    public void thenTheUserClicksTheViewInTheActionSectionOfClosedExam() {
        studentSidebarPage.ClviewTittleText.click();
        ReusableMethods.bekle(2);
    }

    @Then("Then the user sees the fields of the View page opened from the Closed Exam and validates the page.")
    public void thenTheUserSeesTheFieldsOfTheViewPageOpenedFromTheClosedExamAndValidatesThePage() {
        Assertions.assertTrue(studentSidebarPage.UpClExViewForm.isDisplayed());
    }







}
