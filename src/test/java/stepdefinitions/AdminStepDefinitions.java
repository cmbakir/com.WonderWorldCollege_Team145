package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdminStepDefinitions {

    AdminPage adminPage=new AdminPage();
    WebDriver driver;


    @Given("logged in as an admin")
    public void logged_in_as_an_admin() {
        Driver.getDriver().get(ConfigReader.getProperty("adminAndTeacherLogin"));
        ReusableMethods.login("adminlogin","ozlem.admin@wonderworldcollege.com","o6*d@fko3PXL1");

    }
    @When("click on the {string} option in the left sidebar")
    public void click_on_the_option_in_the_left_sidebar(String StudentInformation) {
        adminPage.labelStudentInformation.click();
        ReusableMethods.bekle(1);
    }
    @Then("see the {string} link listed")
    public void see_the_link_listed(String OnlineAdmission) {
        assertTrue(adminPage.labelOnlineAdmission.isDisplayed());
        assertTrue(adminPage.labelOnlineAdmission.isEnabled());
    }


    @When("click on the {string} link")
    public void click_on_the_link(String OnlineAdmission) {
        adminPage.labelOnlineAdmission.click();
        ReusableMethods.bekle(1);

    }
    @Then("see the {string} table with the following  headers \\(Reference No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Student Mobile Number, Form Status, Enrolled, Created At, Action titles)")
    public void see_the_table_with_the_following_headers_reference_no_student_name_class_father_name_date_of_birth_gender_category_student_mobile_number_form_status_enrolled_created_at_action_titles(String string) {

        List<String>expectedTitles= new ArrayList<String>(Arrays.asList("Reference No","Student Name","Class","Father Name","Date Of Birth","Gender","Category","Student Mobile Number","Form Status","Enrolled","Created At","Acion"));
        List<String> actualTitles = ReusableMethods.stringListeyeCevir(adminPage.columnHeader);
        ReusableMethods.bekle(1);
        String exp=expectedTitles.toString().replaceAll(",","");
        String act=actualTitles.toString();
        assertEquals(exp,act);
        ReusableMethods.bekle(2);

    }
    @When("enter a student name in the search box")
    public void enter_a_student_name_in_the_search_box() {
        adminPage.labelSearch.sendKeys("ozlem");

    }
    @Then("see only the details of the relevant student in the search results")
    public void see_only_the_details_of_the_relevant_student_in_the_search_results() {

    }











}
