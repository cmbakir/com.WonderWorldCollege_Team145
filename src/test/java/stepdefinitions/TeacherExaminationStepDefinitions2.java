package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.TeacherExaminationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TeacherExaminationStepDefinitions2 {
    TeacherExaminationPage teacherExaminationPage=new TeacherExaminationPage();

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
        Assertions.assertTrue(teacherExaminationPage.ExamTypeMenu.isDisplayed());

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


}
