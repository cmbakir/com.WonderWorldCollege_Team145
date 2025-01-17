package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminLoginScreenStepDefinitions {

    AdminPage adminPage=new AdminPage();
    TeacherApplyLeavePage teacherApplyLeavePage = new TeacherApplyLeavePage();
    AdminLoginScreenPage adminLoginScreenPage = new AdminLoginScreenPage();
    HomePage homePage = new HomePage();
    StudentLoginPage studentLoginPage = new StudentLoginPage();


    @Given("It is verified that the URL used for accessing the Admin panel is reachable")
    public void it_is_verified_that_the_url_used_for_accessing_the_admin_panel_is_reachable() {
        //ReusableMethods.teacherLogin("adminAndTeacherLogin","adminValidEmailCem","adminValidPasswordCem ");
       //Driver.getDriver().get(ConfigReader.getProperty("adminAndTeacherLogin"));
        Driver.getDriver().get("https://qa.wonderworldcollege.com/site/login");

        String expectedUrl = "https://qa.wonderworldcollege.com/site/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);

    }
    @Then("On the site login page, it is confirmed that the login window is visible on the left side, and the “What’s New In Wonder World College” information is visible on the right side")
    public void on_the_site_login_page_it_is_confirmed_that_the_login_window_is_visible_on_the_left_side_and_the_what_s_new_in_wonder_world_college_information_is_visible_on_the_right_side() {
        Assertions.assertTrue(adminLoginScreenPage.formAdminScreen.isDisplayed());
        Assertions.assertTrue(adminLoginScreenPage.labelAdminLoginRightScreen.isDisplayed());

    }
    @Then("It is verified that the text “Admin Login” is visible within the login window on the site login page")
    public void it_is_verified_that_the_text_admin_login_is_visible_within_the_login_window_on_the_site_login_page() {

        Assertions.assertTrue(adminLoginScreenPage.labelAdminLogin.isDisplayed());
    }
    @Then("It is verified that the Username and Password text boxes and the Sign In button within the login window on the site login page are visible and functional")
    public void it_is_verified_that_the_username_and_password_text_boxes_and_the_sign_in_button_within_the_login_window_on_the_site_login_page_are_visible_and_functional() {

        Assertions.assertTrue(adminLoginScreenPage.labelAdminUsername.isDisplayed());
        Assertions.assertTrue(adminLoginScreenPage.labelAdminPassword.isDisplayed());
        Assertions.assertTrue(adminLoginScreenPage.buttonSignIn.isDisplayed());
        adminLoginScreenPage.labelAdminUsername.sendKeys(ConfigReader.getProperty("adminValidEmailCem"));
        adminLoginScreenPage.labelAdminPassword.sendKeys(ConfigReader.getProperty("adminValidPasswordCem"));
        adminLoginScreenPage.buttonSignIn.click();
        String expectedUrlAdmin = "https://qa.wonderworldcollege.com/admin/admin/dashboard";
        String actualUrlAdmin = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrlAdmin,actualUrlAdmin);
        Driver.getDriver().navigate().back();
    }

    @Given("Clicking the “Forgot password?” link opens a new page, where the email text box and Submit button are confirmed to be visible and functional")
    public void clicking_the_forgot_password_link_opens_a_new_page_where_the_email_text_box_and_submit_button_are_confirmed_to_be_visible_and_functional() {
    adminLoginScreenPage.labelForgotPassword.click();
    Assertions.assertTrue(adminLoginScreenPage.labelEmailAtForgotPassword.isDisplayed());
    adminLoginScreenPage.labelEmailAtForgotPassword.click();
    Assertions.assertTrue(adminLoginScreenPage.labelEmailAtForgotPassword.isSelected());

    Assertions.assertTrue(adminLoginScreenPage.submitButtonForgotEmail.isDisplayed());

    }
    @Then("It is verified that entering an email in the email text box on the Forgot Password page and clicking the Submit button sends an email to the entered email address")
    public void it_is_verified_that_entering_an_email_in_the_email_text_box_on_the_forgot_password_page_and_clicking_the_submit_button_sends_an_email_to_the_entered_email_address() {


   // adminLoginScreenPage.labelEmailAtForgotPassword.sendKeys("cem.admin@wonderworldcollege.com");
        adminLoginScreenPage.labelEmailAtForgotPassword.sendKeys(ConfigReader.getProperty("adminValidEmailCem"));
        adminLoginScreenPage.submitButtonForgotEmail.click();
        ReusableMethods.bekle(1);
        Assertions.assertTrue(adminLoginScreenPage.mailSentAlert.isDisplayed());


    }
    @Then("It is verified that clicking the “Admin Login” link on the Forgot Password page redirects the user to the site login page")
    public void it_is_verified_that_clicking_the_admin_login_link_on_the_forgot_password_page_redirects_the_user_to_the_site_login_page() {
        Driver.getDriver().navigate().back();
        adminLoginScreenPage.linkAdminLogin.click();
        String expectedUrlAdminLogin = "https://qa.wonderworldcollege.com/site/login";
        String actualUrlAdminLogin=Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrlAdminLogin,actualUrlAdminLogin);


    }
    @Then("It is verified that clicking the “User login” link on the site login page redirects the user to the “user login” page")
    public void it_is_verified_that_clicking_the_user_login_link_on_the_site_login_page_redirects_the_user_to_the_user_login_page() {

        adminLoginScreenPage.linkUserLogin.click();
        String expectedUrlUserLogin = "https://qa.wonderworldcollege.com/site/userlogin";
        String actualUrlUserLogin = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrlUserLogin,actualUrlUserLogin);

    }
    @Then("It is confirmed that there is a link on the site login page to return to the Front Site, and clicking it redirects to the homepage")
    public void it_is_confirmed_that_there_is_a_link_on_the_site_login_page_to_return_to_the_front_site_and_clicking_it_redirects_to_the_homepage() {

        adminLoginScreenPage.linkFrontSite.click();
        String expectedUrlFrontSite = "https://qa.wonderworldcollege.com/";
        String actualUrlFrontSite = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrlFrontSite,actualUrlFrontSite);

    }
    @Then("Entering a registered email and password in the text boxes on the site login page and clicking the Sign In button confirms successful login to the respective panel")
    public void entering_a_registered_email_and_password_in_the_text_boxes_on_the_site_login_page_and_clicking_the_sign_in_button_confirms_successful_login_to_the_respective_panel() {

        homePage.userLoginButton.click();
        studentLoginPage.studentLoginUsername.sendKeys(ConfigReader.getProperty("studentValidUsernameCem"));
        studentLoginPage.studentLoginPassword.sendKeys(ConfigReader.getProperty("studentValidPasswordCem"));
        studentLoginPage.studentLoginSignInButton.click();
        String expectedUrlStudent = "https://qa.wonderworldcollege.com/user/user/dashboard";
        String actualUrlStudent = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrlStudent,actualUrlStudent);

    }
    @Then("Entering an unregistered email and password in the text boxes on the site login page and clicking the Sign In button confirms that login to the panel is not possible")
    public void entering_an_unregistered_email_and_password_in_the_text_boxes_on_the_site_login_page_and_clicking_the_sign_in_button_confirms_that_login_to_the_panel_is_not_possible() {
        studentLoginPage.iconStudentUserImage.click();
        ReusableMethods.bekle(1);
        studentLoginPage.linkLogoutStudent.click();
        ReusableMethods.bekle(1);

        studentLoginPage.studentLoginUsername.sendKeys(ConfigReader.getProperty("studentInvalidUsernameCem"));
        studentLoginPage.studentLoginPassword.sendKeys(ConfigReader.getProperty("studentInvalidPasswordCem"));
        studentLoginPage.studentLoginSignInButton.click();
        Assertions.assertTrue(studentLoginPage.labelInvalidAlert.isDisplayed());


    }


}
