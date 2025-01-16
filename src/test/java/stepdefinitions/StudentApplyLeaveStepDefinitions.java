package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import pages.StudentApplyLeavePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class StudentApplyLeaveStepDefinitions {


    StudentApplyLeavePage studentApplyLeavePage=new StudentApplyLeavePage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();



    @Given("clicks applyleave button from left side")
    public void clicks_applyleave_button_from_left_side() {
     ReusableMethods.bekle(3);
     studentApplyLeavePage.applyLeaveButton.click();

    }


    @Given("verifies access to leave list page")
    public void verifies_access_to_leave_list_page() {
   studentApplyLeavePage.leaveListPage.isDisplayed();


    }

    @Given("the user should be displayed column fields")
    public void the_user_should_be_displayed_column_fields() {

        studentApplyLeavePage.columnFields.isDisplayed();
    }

    // user edits  leave

    @Given("user clicks edit button")
    public void user_clicks_edit_button() {

    studentApplyLeavePage.editButton.click();
    ReusableMethods.bekle(2);

    }
    @Given("verifies editbuttonforms is displayed")
    public void verifies_editbuttonforms_is_displayed() {
     studentApplyLeavePage.editForm.isDisplayed();

    }

    @Given("enters any date into fromDatebox")
    public void enters_any_date_into_from_datebox() {
     studentApplyLeavePage.dateInputLeaveFromDate.click();
     studentApplyLeavePage.selectedDayFromDay.click();

    }
    @Given("enters any date into toDatebox")
    public void enters_any_date_into_to_datebox() {
     studentApplyLeavePage.dateInputToDate.click();
     studentApplyLeavePage.selectedDayToDay.click();
    }
    @Then("enters any reason into reasonbox")
    public void enters_any_reason_into_reasonbox() {
     studentApplyLeavePage.reasonArea.click();
     studentApplyLeavePage.reasonArea.sendKeys(faker.name().name());
    }
 @Then("clicks editSave button")
 public void clicksEditSaveButton() {
     studentApplyLeavePage.editSaveButton.click();
 }


    @Then("verifies edited leave message")
    public void verifies_edited_leave_message() {
        Driver.getDriver().switchTo().alert().accept();

    }



    // user deletes leave

    @Given("user clicks delete button")
    public void user_clicks_delete_button() {

     studentApplyLeavePage.deleteButton.click();

    }
    @Given("accepts message from alert")
    public void accepts_message_from_alert() {
        Driver.getDriver().switchTo().alert().accept();

    }


    @And("verifies leave is deleted") // delete edildiğini nasil test edicem
    public void verifiesLeaveIsDeleted() {


        Assertions.assertTrue(studentApplyLeavePage.deleteMessage.getText().contains("deleted"));

    }

     //Assertions.assertTrue();

    //user add new leave

    @Given("student  clicks add button")
    public void studentClicksAddButton() {
     studentApplyLeavePage.addButton.click();

    }

    @Then("views a new leave table")
    public void viewsANewLeaveTable() {
     Assertions.assertTrue(studentApplyLeavePage.addLeaveForm.isDisplayed());

    }



    @And("any date into fromdate section")
    public void anyDateIntoFromdateSection() {
     studentApplyLeavePage.dateInputLeaveFromDate.click();
     studentApplyLeavePage.dateInputLeaveFromDate.click();

    }

    @And("any date into toDate section")
    public void anyDateIntoToDateSection() {
     studentApplyLeavePage.dateInputToDate.click();
     studentApplyLeavePage.selectedDayToDay.click();

    }

    @And("any reason into reason section")
    public void anyReasonIntoReasonSection() {
     studentApplyLeavePage.reasonArea.click();
     studentApplyLeavePage.reasonArea.sendKeys(faker.name().name());

    }



    @And("clicks save button")
    public void clicksSaveButton() {
    studentApplyLeavePage.addLeaveSaveButton.click();

    }

    @And("accepts that is saved  from alert")
    public void acceptsThatIsSavedFromAlert() {
        Driver.getDriver().switchTo().alert().accept();
    }


 @Given("the user access student page")
 public void theUserAccessStudentPage() {

        Driver.getDriver().get("https://qa.wonderworldcollege.com/site/userlogin");
 }

 @Given("enters student user name")
 public void entersStudentUserName() {
   studentApplyLeavePage.studentUser.click();
   studentApplyLeavePage.studentUser.sendKeys(ConfigReader.getProperty("studentLoginMeltem"));
  //teacherExaminationPage.teacherUserNameButton.sendKeys(ConfigReader.getProperty("toGecerliTeacherEmail"));
 }

 @Given("enters student password")
 public void entersStudentPassword() {
  studentApplyLeavePage.studentPassword.click();
  //studentApplyLeavePage.studentPassword.sendKeys(ConfigReader.getProperty("studentpass"));
     studentApplyLeavePage.studentPassword.sendKeys("wonderworld123");
 }

 @Given("clicks submit button")
 public void clicksSubmitButton() {

        studentApplyLeavePage.submit.click();
 }



 //@Then("clicks editSave button")
 //public void clicksEditSaveButton() {

 }

