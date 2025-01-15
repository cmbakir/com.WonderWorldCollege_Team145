package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.ParentLoginPage;
import pages.StudentLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.*;

public class StudentLoginPageStepDefinitions {

    Faker faker=new Faker();
    ParentLoginPage parentLoginPage=new ParentLoginPage();
    StudentLoginPage studentLoginPage=new StudentLoginPage();

    @Given("The user navigates to the user login page.")
    public void the_user_navigates_to_the_user_login_page() {

        Driver.getDriver().get(ConfigReader.getProperty("studentAndParentLogin"));

    }
    @Then("The user verify that a login form is viewed on the User Login page.")
    public void the_user_verify_that_a_login_form_is_viewed_on_the_user_login_page() {

        assertTrue( parentLoginPage.loginForm.isDisplayed());


    }
    @Then("The user verify that Login Form includes username and password text boxes")
    public void the_user_verify_that_login_form_includes_username_and_password_text_boxes() {

        Assertions.assertTrue( parentLoginPage.passwordBox.isDisplayed());
        ReusableMethods.bekle(1);
        Assertions.assertTrue( parentLoginPage.userNameBox.isDisplayed());
        ReusableMethods.bekle(1);
    }


    @Then("The user enters their username and password correctly and clicks the sign in button")
    public void the_user_enters_their_username_and_password_correctly_and_clicks_the_sign_in_button() {

        ReusableMethods.login("studentAndParentLogin","pinar.student","wonderworld123");
        ReusableMethods.bekle(1);
    }
    @Then("accesses the student home page.")
    public void accesses_the_student_home_page() {

        assertTrue(studentLoginPage.labelStudentHomePage.isDisplayed());

    }

    @Then("The user enters an invalid username and valid password and clicks the sign in button")
    public void the_user_enters_an_invalid_username_and_clicks_the_sign_in_button() {

        studentLoginPage.studentLoginUsername.sendKeys(faker.name().username());
        ReusableMethods.bekle(1);
        studentLoginPage.studentLoginPassword.sendKeys("wonderworld123");
        ReusableMethods.bekle(1);
        studentLoginPage.studentLoginSignInButton.click();
        ReusableMethods.bekle(1);

    }

    @Then("The user enters a valid username and an invalid password and clicks the sign in button")
    public void the_user_enters_an_invalid_password_and_clicks_the_sign_in_button() {

        studentLoginPage.studentLoginUsername.sendKeys("pinar.student");
        ReusableMethods.bekle(2);
        studentLoginPage.studentLoginPassword.sendKeys(faker.internet().password());
        ReusableMethods.bekle(2);
        studentLoginPage.studentLoginSignInButton.click();
        ReusableMethods.bekle(1);


    }

    @Then("Verifies that the error message “Invalid Username Or Password” is displayed.")
    public void verifies_that_the_error_message_invalid_username_or_password_is_displayed() {

        assertTrue(studentLoginPage.studentLoginInvalidMessage.isDisplayed());


    }

    @Then("The user clicks the forgot password button and verify that the forgot password page opens")
    public void the_user_clicks_the_forgot_password_button_and_verify_that_the_forgot_password_page_opens() {

        studentLoginPage.studentLoginForgotPasswordButton.click();
        ReusableMethods.bekle(1);
        assertTrue(studentLoginPage.titleForgotPassPage.isDisplayed());

    }

    @Then("The user enters the email to the emailbox of the forgot password page")
    public void the_user_enters_the_email_to_the_emailbox_of_the_forgot_password_page() {

        studentLoginPage.ForgotPassPageEmailBox.sendKeys("pinar.student");
        ReusableMethods.bekle(1);
    }

    @Then("selects the student radio button and then clicks the submit button")
    public void selects_the_student_radio_button_and_then_clicks_the_submit_button() {

        studentLoginPage.ForgotPassStudentRadioButton.click();
        ReusableMethods.bekle(1);
        studentLoginPage.ForgotPassSubmitButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("verifies that success message {string} is viewed")
    public void verifies_that_success_message_is_viewed(String string) {

        assertTrue(studentLoginPage.ForgotPasswordEmailSendMessage.isDisplayed());

    }



}
