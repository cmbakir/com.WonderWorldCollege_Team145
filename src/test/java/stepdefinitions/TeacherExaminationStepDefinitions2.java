package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.TeacherExaminationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TeacherExaminationStepDefinitions2 {
    TeacherExaminationPage teacherExaminationPage=new TeacherExaminationPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();


    @Given("user clicks {string}")
    public void user_clicks(String adminAndTeacherLogin) {
        Driver.getDriver().get(ConfigReader.getProperty("adminAndTeacherLogin"));
    }
    @Then("enters user name")
    public void enters_user_name() {
        teacherExaminationPage.teacherUserNameButton.click();
        teacherExaminationPage.teacherUserNameButton.sendKeys(ConfigReader.getProperty("toGecerliTeacherEmail"));
    }
    @Then("enters password")
    public void enters_password() {
        teacherExaminationPage.teacherPasswordButton.click();
        teacherExaminationPage.teacherPasswordButton.sendKeys(ConfigReader.getProperty("toGecerliTeacherPassword"));
    }
    @Then("click signIn button")
    public void click_sign_ın_button() {
        teacherExaminationPage.signInButton.click();

    }
    @Then("verifies examinations  test bar is visible")
    public void verifies_examinations_test_bar_is_visible() {
        Assertions.assertTrue(teacherExaminationPage.examinationsBar.isDisplayed());

    }
    @Given("user clicks Examinations bar")
    public void userClicksExaminationsBar() {
        teacherExaminationPage.examinationsBar.click();
    }

    @Given("user clicks examGroup bar")
    public void user_clicks_exam_group_bar() {
        //  teacherExaminationPage.examinationsBar.click();
        teacherExaminationPage.examGroupBar.click();
    }
    @Given("verifies namesection")
    public void verifies_namesection() {
        Assertions.assertTrue(teacherExaminationPage.nameSection.isDisplayed());

    }
    @Given("verifies ExamTypeDropDownMenu")
    public void verifies_exam_type_drop_down_menu() {
        Assertions.assertTrue(teacherExaminationPage.dropdownExamType.isDisplayed());

    }
    @Then("verifies description area")
    public void verifies_description_area() {
        Assertions.assertTrue(teacherExaminationPage.descriptionTextBox.isDisplayed());
    }
    @Then("verifies save button")
    public void verifies_save_button() {
        Assertions.assertTrue(teacherExaminationPage.submitButton.isDisplayed());
    }

    @And("verifies redirecting examGroupPage")
    public void verifiesRedirectingExamGroupPage() {
        teacherExaminationPage.ExamGroupPage.isDisplayed();
    }

    @Given("user enters new name")
    public void user_enters_new_name() {
        teacherExaminationPage.nameSection.sendKeys(faker.name().name());
    }
    @Given("selects exam type from dropdown menu")
    public void selects_exam_type_from_dropdown_menu() {
        // Select select=new Select(teacherExaminationPage.ExamTypeMenu);
        //select sele
        teacherExaminationPage.dropdownExamType.click();
        ReusableMethods.bekle(3);
        Select selectExam=new Select(teacherExaminationPage.dropdownExamType);
        selectExam.selectByValue("average_passing");
    }
    @Then("types any description to box")
    public void types_any_description_to_box() {
        teacherExaminationPage.descriptionArea.click();
        teacherExaminationPage.descriptionArea.sendKeys(faker.name().name());
    }
    @Then("click save button")
    public void click_save_button() {
        teacherExaminationPage.submitButton.click(); // save button new exam group

    }
    @Then("verifies recorded new exam group")
    public void verifies_recorded_new_exam_group() {
        teacherExaminationPage.successNewExamMessage.isDisplayed();
    }

    @Given("user clicks add button  under action buttons")
    public void user_clicks_add_button_under_action_buttons() {

        teacherExaminationPage.addButton.click();

    }

    @Given("verify redirected Exam List Page")
    public void verify_redirected_exam_list_page() {
        ReusableMethods.bekle(3);
        teacherExaminationPage.directingExamList.isDisplayed();
        driver.navigate().back();
    }

    @Given("User clicks delete button under action section")
    public void user_clicks_delete_button_under_action_section() {
        teacherExaminationPage.deletebutton.click();
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("user clicks edit button under actions buton")
    public void userClicksEditButtonUnderActionsButon() {
      teacherExaminationPage.editbutton.click();
    }


    @Then("confirm deleted exam group")
    public void confirm_deleted_exam_group() {

      Assertions.assertTrue(teacherExaminationPage.confirmDeleteExamGroup.isDisplayed());
    }



}
