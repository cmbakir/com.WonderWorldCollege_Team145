package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ParentMyProfileAndProfilImagePage;
import pages.StudentSidebarPage;
import pages.TeacherReviewPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TeacherReviewStepDefinitions {


    TeacherReviewPage teacherReviewPage = new TeacherReviewPage();
    StudentSidebarPage studentSidebarPage = new StudentSidebarPage();
    ParentMyProfileAndProfilImagePage parentMyProfileAndProfilImagePage = new ParentMyProfileAndProfilImagePage();


    @Given("The user goes to the {string} page.")
    public void the_user_goes_to_the_page(String studentLogin) {
        Driver.getDriver().get(ConfigReader.getProperty(studentLogin));

    }

    @Then("The user enters their username and password.")
    public void the_user_enters_their_username_and_password() {
        ReusableMethods.login("studentAndParentLogin", "hakan.student", "wonderworld123");


    }

    @Then("The user clicks the {string} icon.")
    public void the_user_clicks_the_icon(String string) {
        teacherReviewPage.TeacherReview.click();


    }

    @Then("It is verified that the {string} header text is displayed.")
    public void ıt_is_verified_that_the_header_text_is_displayed(String string) {
        teacherReviewPage.TeacherReviewCheck.isDisplayed();


    }//TC02->Us53

    @Given("The user navigates to the Teacher Reviews page")
    public void the_user_navigates_to_the_teacher_reviews_page() {
        // ReusableMethods.login("studentAndParentLogin","hakan.student","wonderworld123");
        teacherReviewPage.TeacherReview.click();
    }

    @Then("Rate button click")
    public void rate_button_click() {
        teacherReviewPage.RateButton.click();
    }

    @Then("After voting, find and click a button such as {string} or {string} to save the vote.")
    public void after_voting_find_and_click_a_button_such_as_or_to_save_the_vote(String string, String string2) {
        teacherReviewPage.Rate2.click();
        ReusableMethods.bekle(5);
        teacherReviewPage.Comment.sendKeys(
                "Thank you for everything.");
        ReusableMethods.bekle(5);
        teacherReviewPage.Save.click();
        ReusableMethods.bekle(3);

    }

    @Then("After confirming that the results are correct, end the test and close the page.")
    public void after_confirming_that_the_results_are_correct_end_the_test_and_close_the_page() {

    }


    @Then("click logout")
    public void clickLogout() {
        studentSidebarPage.logutOutButtonStudent.click();

    }

    @Then("click logout_P")
    public void clickLogout_P() {
        studentSidebarPage.logutOutButtonStudent.click();

        parentMyProfileAndProfilImagePage.profileImageButton.click();
    }
}