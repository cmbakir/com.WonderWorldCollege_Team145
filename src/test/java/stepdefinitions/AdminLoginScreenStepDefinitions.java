package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.AdminLoginScreenPage;
import pages.AdminPage;
import pages.TeacherApplyLeavePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminLoginScreenStepDefinitions {

    AdminPage adminPage=new AdminPage();
    TeacherApplyLeavePage teacherApplyLeavePage = new TeacherApplyLeavePage();
    AdminLoginScreenPage adminLoginScreenPage = new AdminLoginScreenPage();


    @Given("It is verified that the URL used for accessing the Admin panel is reachable")
    public void it_is_verified_that_the_url_used_for_accessing_the_admin_panel_is_reachable() {
        //ReusableMethods.teacherLogin("adminAndTeacherLogin","adminValidEmailCem","adminValidPasswordCem ");

       String expectedUrl = "https://qa.wonderworldcollege.com/site/userlogin";
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
        adminLoginScreenPage.labelAdminUsername.click();
        Assertions.assertTrue(adminLoginScreenPage.labelAdminUsername.isSelected());

        Assertions.assertTrue(adminLoginScreenPage.labelAdminPassword.isDisplayed());
        adminLoginScreenPage.labelAdminPassword.click();
        Assertions.assertTrue(adminLoginScreenPage.labelAdminPassword.isSelected());

        Assertions.assertTrue(adminLoginScreenPage.buttonSignIn.isDisplayed());
    }

    @Given("Clicking the “Forgot password?” link opens a new page, where the email text box and Submit button are confirmed to be visible and functional")
    public void clicking_the_forgot_password_link_opens_a_new_page_where_the_email_text_box_and_submit_button_are_confirmed_to_be_visible_and_functional() {

    }
    @Then("It is verified that entering an email in the email text box on the Forgot Password page and clicking the Submit button sends an email to the entered email address")
    public void it_is_verified_that_entering_an_email_in_the_email_text_box_on_the_forgot_password_page_and_clicking_the_submit_button_sends_an_email_to_the_entered_email_address() {

    }
    @Then("It is verified that clicking the “Admin Login” link on the Forgot Password page redirects the user to the site login page")
    public void it_is_verified_that_clicking_the_admin_login_link_on_the_forgot_password_page_redirects_the_user_to_the_site_login_page() {

    }
    @Then("It is verified that clicking the “User login” link on the site login page redirects the user to the “user login” page")
    public void it_is_verified_that_clicking_the_user_login_link_on_the_site_login_page_redirects_the_user_to_the_user_login_page() {

    }
    @Then("It is confirmed that there is a link on the site login page to return to the Front Site, and clicking it redirects to the homepage")
    public void it_is_confirmed_that_there_is_a_link_on_the_site_login_page_to_return_to_the_front_site_and_clicking_it_redirects_to_the_homepage() {

    }
    @Then("Entering a registered email and password in the text boxes on the site login page and clicking the Sign In button confirms successful login to the respective panel")
    public void entering_a_registered_email_and_password_in_the_text_boxes_on_the_site_login_page_and_clicking_the_sign_in_button_confirms_successful_login_to_the_respective_panel() {

    }
    @Then("Entering an unregistered email and password in the text boxes on the site login page and clicking the Sign In button confirms that login to the panel is not possible")
    public void entering_an_unregistered_email_and_password_in_the_text_boxes_on_the_site_login_page_and_clicking_the_sign_in_button_confirms_that_login_to_the_panel_is_not_possible() {

    }


}
