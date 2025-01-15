package stepdefinitions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import io.cucumber.java.en.*;
import pages.StudentExaminationsPage;
import  utilities.Driver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentExaminationsStepDefinitions {

    StudentExaminationsPage studentExaminationsPage = new StudentExaminationsPage();

    // WWC101 TC_01 -> US_052 Test of Accessing the Exam Program Page from the Exam Program Link.

    @Given("User clicks the Examination menu on the sidebar of the student panel.")
    public void user_clicks_the_examination_menu_on_the_sidebar_of_the_student_panel() {
        studentExaminationsPage.SutedentExaminationsButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("User sees the Exam Schedule menu in the menu that opens.")
    public void user_sees_the_exam_schedule_menu_in_the_menu_that_opens() {
        Assertions.assertTrue(studentExaminationsPage.StdExSchduleMenuButton.isDisplayed(), "Exam Schedule menu is not visible.");
        ReusableMethods.bekle(1);
    }

    @Then("User clicks the Exam Schedule menu.")
    public void user_clicks_the_exam_schedule_menu() {
        studentExaminationsPage.StdExSchduleMenuButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("User verifies that they are on the {string} page.")
    public void user_verifies_that_they_are_on_the_page(String expextedExScduleUrl) {
        String actualExSchduleUrl = Driver.driver.getCurrentUrl();
        Assertions.assertEquals(expextedExScduleUrl, actualExSchduleUrl);
        ReusableMethods.bekle(1);
    }

    //WWC102 TC_02 -> US_052 Test to make the relevant exam visible in the table when the user filters the exam from the search box.

    @Given("The user enters the {string} exam that wants to find into the search box.")
    public void the_user_enters_the_exam_that_wants_to_find_into_the_search_box(String SearchExam) {
        studentExaminationsPage.SearchBox.sendKeys(SearchExam);
        ReusableMethods.bekle(1);
    }

    @Then("The user confirms that the filter has been made with the exam name under the Exam title in the table.")
    public void the_user_confirms_that_the_filter_has_been_made_with_the_exam_name_under_the_exam_title_in_the_table() {


        List<WebElement> elements = studentExaminationsPage.examElements;
        if (elements.size() > 0) {
            WebElement examElement = elements.get(0);
            String expectedExamName = "matematik 1";
            String actualExamName = examElement.getText();
            Assertions.assertEquals(expectedExamName, actualExamName);


        }


    }

    //WWC103 TC_03 -> US_052 Tests the Visibility of Column Headers on the Exam Page.

    @Then("Kullanici  Exam Schedule  sayfasindaki S.No. basligini görür")
    public void kullanici_exam_schedule_sayfasindaki_s_no_basligini_görür() {
        String expectedSNText="S.No.";
        String actuelSNText = studentExaminationsPage.SNText.getText();
        Assertions.assertEquals(expectedSNText, actuelSNText);
    }
    @Then("Kullanici  Exam Schedule  sayfasinda ki Exam basligini görür.")
    public void kullanici_exam_schedule_sayfasinda_ki_exam_basligini_görür() {
        String expectedExamText="Exam";
        String actuelExamText=studentExaminationsPage.ExamText.getText();
        Assertions.assertEquals(expectedExamText,actuelExamText);
    }
    @Then("Kullanici  Exam Schedule  sayfasinda ki Description basligini görür")
    public void kullanici_exam_schedule_sayfasinda_ki_description_basligini_görür() {
        String expectedDescriptionText="Description";
        String actuelDescriptionText=studentExaminationsPage.DescriptionText.getText();
        Assertions.assertEquals(expectedDescriptionText,actuelDescriptionText);
    }
    @Then("Kullanici, Exam Schedule  sayfasinda ki Action basligini görür")
    public void kullanici_exam_schedule_sayfasinda_ki_action_basligini_görür() {
        String expectedActionText="Action";
        String actuelActionText = studentExaminationsPage.ActionText.getText();
        Assertions.assertEquals(expectedActionText, actuelActionText);
    }

//WWC104 TC_04 -> US_052 Testing User's Access to "View" Option.

    @Then("Kullanici  Exam Schedule  sayfasinda Actionun altinda ki  View i gorur.")
    public void kullanici_exam_schedule_sayfasinda_actionun_altinda_ki_i_gorur() {
        ReusableMethods.bekle(1);
        Assertions.assertTrue( studentExaminationsPage.ViewButton.isDisplayed());

    }
    @Then("Kullanici  Exam Schedule  sayfasinda Actionun altinda ki  View’in erisilebilir oldugunu dogrular.")
    public void kullanici_exam_schedule_sayfasinda_actionun_altinda_ki_view_in_erisilebilir_oldugunu_dogrular() {
        Assertions.assertTrue(studentExaminationsPage.ViewButton.isEnabled());
        ReusableMethods.bekle(1);
    }



//WWC106 TC_05 -> US_052 Verification Test for Visibility of Column Headings on the Exam Detail Page.

    @Given("The user clicks View under Action on the Exam Schedule page.")
    public void theUserClicksViewUnderActionOnTheExamSchedulePage() {
        studentExaminationsPage.ViewButton.click();
        ReusableMethods.bekle(2);
    }


    @Then("The user verifies that the opened section is the exam detail section.")
    public void theUserVerifiesThatTheOpenedSectionIsTheExamDetailSection() {
        Assertions.assertTrue( studentExaminationsPage.sinavDetayFormu.isDisplayed());
    }

    @Then("the user verifies the exam details table headers")
    public void theUserVerifiesTheExamDetailsTableHeaders() {

        List<String> actualHeaders = studentExaminationsPage.examDetailHeaders.stream()
                .map(WebElement::getText)
                .filter(header -> !header.trim().isEmpty())
                .collect(Collectors.toList());


        List<String> expectedHeaders = Arrays.asList("Subject", "Date From", "Start Time", "Duration", "Credit Hours", "Room No.", "Marks (Max..)", "Marks (Min..)");


        Assertions.assertEquals(expectedHeaders, actualHeaders, "Table headings do not match expected!");
    }
}






