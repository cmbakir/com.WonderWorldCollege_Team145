package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.RemoteWebElement;
import pages.ParentMyProfileAndProfilImagePage;
import pages.TeachHomeworkPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TeachHomeworkStepDefinition {
    TeachHomeworkPage teachHomeworkPage=new TeachHomeworkPage();
    Faker faker=new Faker();
    ParentMyProfileAndProfilImagePage parentMyProfileAndProfilImagePage = new ParentMyProfileAndProfilImagePage();

    @Given("Go to {string}")
    public void go_to(String TeacherHomeUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(TeacherHomeUrl));
        teachHomeworkPage.LogBox.sendKeys(ConfigReader.getProperty("teacherEmail"));
        ReusableMethods.bekle(2);
        teachHomeworkPage.passBox.sendKeys(ConfigReader.getProperty("teacherPass1"));
        ReusableMethods.bekle(2);
        teachHomeworkPage.SubButton.click();
        ReusableMethods.bekle(2);
        teachHomeworkPage.HomeCon.click();
        ReusableMethods.bekle(1);
        Assertions.assertTrue(teachHomeworkPage.HomeCon.isDisplayed());
        ReusableMethods.bekle(1);



    }
    @Then("Click on Add Homework Link")
    public void click_on_add_homework_link() {

        teachHomeworkPage.HomeCon.click();
        teachHomeworkPage.HomeWb.click();
        ReusableMethods.bekle(1);



    }
    @Then("Verify Redirect")
    public void verify_redirect() {
        Assertions.assertTrue(teachHomeworkPage.BoxTitle.isDisplayed());
        ReusableMethods.bekle(1);



    }
    @Given("Go to HomeWork")
    public void go_to_home_work() {
        ReusableMethods.login("TeacherHomeUrl","hakan.ersu@wonderworldcollege.com","o6*d@fko3PXL1");



    }
    @Then("Class Dropdown Menu Control")
    public void class_dropdown_menu_control() {
        teachHomeworkPage.HomeCon.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.HomeWb.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.class11.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.no11.click();
        ReusableMethods.bekle(1);




    }
    @Then("Section Dropdown Menu Control")
    public void section_dropdown_menu_control() {
        teachHomeworkPage.sectionAA.click();
        ReusableMethods.bekle(1);


    }
    @Then("Subject Group Dropdown Menu Control")
    public void subject_group_dropdown_menu_control() {

        teachHomeworkPage.subjeGrup.click();
        ReusableMethods.bekle(1);


    }
    @Then("Subject Dropdown Menu Control")
    public void subject_dropdown_menu_control() {
        teachHomeworkPage.SubEng.click();
        ReusableMethods.bekle(1);


    }
    @Then("Search Button Control")
    public void search_button_control() {
       teachHomeworkPage.searchButton.click();
       ReusableMethods.bekle(5);


    }
    @Given("Go to HomeWorkList")
    public void go_to_home_work_list() {
        ReusableMethods.login("TeacherHomeUrl","hakan.ersu@wonderworldcollege.com","o6*d@fko3PXL1");

    }
    @Then("Click on the icon to evaluate")
    public void click_on_the_icon_to_evaluate() {
        teachHomeworkPage.HomeCon.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.HomeWb.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.class11.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.no11.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.sectionAA.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.subjeGrup.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.SubEng.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.searchButton.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.EvaluateR.click();
        ReusableMethods.bekle(3);


    }
    @Then("See student details from the window that opens and comment on the student")
    public void see_student_details_from_the_window_that_opens_and_comment_on_the_student() {



    }
    @Given("Access to Homework List")
    public void access_to_homework_list() {
        ReusableMethods.login("TeacherHomeUrl","hakan.ersu@wonderworldcollege.com","o6*d@fko3PXL1");


    }
    @Then("Click on the edit icon")
    public void click_on_the_edit_icon() {
        teachHomeworkPage.HomeCon.click();

        teachHomeworkPage.HomeWb.click();

        teachHomeworkPage.class11.click();

        teachHomeworkPage.no11.click();

        teachHomeworkPage.sectionAA.click();

        teachHomeworkPage.subjeGrup.click();

        teachHomeworkPage.SubEng.click();

        teachHomeworkPage.searchButton.click();


    }
    @Then("Edit Homework")
    public void edit_homework() {
        teachHomeworkPage.EditButton.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.word.sendKeys("Have a nice holiday");
        ReusableMethods.bekle(1);




    }
    @Then("Click on the save button")
    public void click_on_the_save_button() {
        teachHomeworkPage.saveB.click();
        ReusableMethods.bekle(1);



    }
    @Then("Verify that you are registered")
    public void verify_that_you_are_registered() {
        Assertions.assertTrue(teachHomeworkPage.ToastM.isDisplayed());



    }
    @Given("Go to Homework List")
    public void go_to_homework_list() {
//        ReusableMethods.login("TeacherHomeUrl","hakan.ersu@wonderworldcollege.com","o6*d@fko3PXL1");
        ReusableMethods.bekle(2);
        teachHomeworkPage.HomeCon.click();
        ReusableMethods.bekle(2);
        teachHomeworkPage.HomeWb.click();
        teachHomeworkPage.class11.click();
        teachHomeworkPage.no11.click();
        teachHomeworkPage.sectionAA.click();
        teachHomeworkPage.subjeGrup.click();
        teachHomeworkPage.SubEng.click();
        teachHomeworkPage.searchButton.click();


    }
    @Then("Click on the icon to access and delete the Assignment List")
    public void click_on_the_icon_to_access_and_delete_the_assignment_list() {
        teachHomeworkPage.deleteButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        ReusableMethods.bekle(1);

    }
    @Then("Continue to complete the deletion process")
    public void continue_to_complete_the_deletion_process() {
        teachHomeworkPage.deletedSucces.isDisplayed();
        ReusableMethods.bekle(1);


    }
    @Given("Go to HomeWork icon")
    public void go_to_home_work_icon() {
        ReusableMethods.login("TeacherHomeUrl","hakan.ersu@wonderworldcollege.com","o6*d@fko3PXL1");

    }
    @Then("Add Homework click")
    public void add_homework_click() {
        teachHomeworkPage.HomeCon.click();
        teachHomeworkPage.HomeWb.click();
    }
    @Then("Add+ icon click")
    public void add_icon_click() {
        teachHomeworkPage.add5.click();
        ReusableMethods.bekle(1);


    }
    @Then("Fill in the relevant fields Class, Section, Course Group, Lesson, Assignment Date, Due Date, Maximum Points and Description and save.")
    public void fill_in_the_relevant_fields_class_section_course_group_lesson_assignment_date_due_date_maximum_points_and_description_and_save() {
        teachHomeworkPage.Class11.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.SectionA.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.SubG.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.Ng1.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.ilkDATE.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.Date2.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.notes.sendKeys("80");
        ReusableMethods.bekle(1);
        teachHomeworkPage.Descrip.sendKeys("Have a nice holiday");
        ReusableMethods.bekle(1);
        teachHomeworkPage.SaveG.click();
        ReusableMethods.bekle(1);





    }
    @Then("Verify and close the page")
    public void verify_and_close_the_page() {
        teachHomeworkPage.Succsflyy.isDisplayed();
        ReusableMethods.bekle(1);



    }
    @Given("Go to WWC")
    public void go_to_wwc() {
        ReusableMethods.login("TeacherHomeUrl","hakan.ersu@wonderworldcollege.com","o6*d@fko3PXL1");
        teachHomeworkPage.HomeCon.click();
        teachHomeworkPage.HomeWb.click();
        teachHomeworkPage.class11.click();
        teachHomeworkPage.no11.click();
        teachHomeworkPage.sectionAA.click();
        teachHomeworkPage.subjeGrup.click();
        teachHomeworkPage.SubEng.click();
        teachHomeworkPage.searchButton.click();

    }
    @Then("Upcoming Homework and Closed Homework visibility verification")
    public void upcoming_homework_and_closed_homework_visibility_verification() {
        teachHomeworkPage.Close.click();
        ReusableMethods.bekle(1);
        teachHomeworkPage.Upcom.click();
        ReusableMethods.bekle(1);



    }
    @Then("Closed Homework in all deleted")
    public void closed_homework_in_all_deleted() {
        teachHomeworkPage.Close.click();
        teachHomeworkPage.All.click();
        teachHomeworkPage.Dledet.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }






}
