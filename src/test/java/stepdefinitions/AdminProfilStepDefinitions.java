package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.AdminProfilPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.*;

public class AdminProfilStepDefinitions {

    AdminProfilPage adminProfilPage = new AdminProfilPage();


    @Given("user enters admin page")
    public void user_enters_admin_page() {

        ReusableMethods.adminlogin("adminAndTeacherLogin","caner.admin@wonderworldcollege.com","o6*d@fko3PXL1");
    }
    @Then("user sees profile icon on top bar of Admin panel and clicks it")
    public void user_sees_profile_icon_on_top_bar_of_admin_panel_and_clicks_it() {

        adminProfilPage.proficon.click();
    }
    @Then("user Admin panel's top bar profile icon should be clicked on the window, account owner's name, role and Profile, Password, Logout links should be visible")
    public void user_admin_panel_s_top_bar_profile_icon_should_be_clicked_on_the_window_account_owner_s_name_role_and_profile_password_logout_links_should_be_visible() {

        ReusableMethods.bekle(2);

        assertTrue(adminProfilPage.proficonName.isDisplayed());
        assertTrue(adminProfilPage.proficonAdmin.isDisplayed());
        assertTrue(adminProfilPage.proficonProfile.isDisplayed());
        assertTrue(adminProfilPage.proficonPassword.isDisplayed());
        assertTrue(adminProfilPage.proficonLogout.isDisplayed());

    }
    @Then("user Profile link should be clicked on the opened page Profile, Payroll, Leaves, Attendance, Documents menus should be visible on navbar")
    public void user_profile_link_should_be_clicked_on_the_opened_page_profile_payroll_leaves_attendance_documents_menus_should_be_visible_on_navbar() {

        adminProfilPage.proficonProfile.click();

        assertTrue(adminProfilPage.profProfile.isDisplayed());
        assertTrue(adminProfilPage.profPayrll.isDisplayed());
        assertTrue(adminProfilPage.profAttdnc.isDisplayed());
        assertTrue(adminProfilPage.profLeaves.isDisplayed());
        assertTrue(adminProfilPage.profDocu.isDisplayed());
    }
    @Then("user Profile page profile menu General Information, Address Details, Bank Account Details, Social Media Link titles should be visible")
    public void user_profile_page_profile_menu_general_ınformation_address_details_bank_account_details_social_media_link_titles_should_be_visible() {

        assertTrue(adminProfilPage.profGenInf.isDisplayed());
        assertTrue(adminProfilPage.profAddDet.isDisplayed());
        assertTrue(adminProfilPage.profBankAccDet.isDisplayed());
        assertTrue(adminProfilPage.profSocMedLink.isDisplayed());

    }
    @Then("user Profile page Payroll menu information boards \\(Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) should be visible")
    public void user_profile_page_payroll_menu_information_boards_total_net_salary_paid_total_gross_salary_total_earning_total_deduction_should_be_visible() {
         adminProfilPage.profPayrll.click();

        assertTrue(adminProfilPage.pyrllTotNetSal.isDisplayed());
        assertTrue(adminProfilPage.pyrllTotGrsSal.isDisplayed());
        assertTrue(adminProfilPage.pyrllTotEar.isDisplayed());
        assertTrue(adminProfilPage.pyrllTotDed.isDisplayed());
    }
    @Then("user Profile page Payroll menu Payslip List's Mont-Year, Date, Mode, Status, Net Salary, Action titles should be displayed")
    public void user_profile_page_payroll_menu_payslip_list_s_mont_year_date_mode_status_net_salary_action_titles_should_be_displayed() {

        assertTrue(adminProfilPage.pyrllPayslp.isDisplayed());
        assertTrue(adminProfilPage.pyrllYear.isDisplayed());
        assertTrue(adminProfilPage.pyrllDate.isDisplayed());
        assertTrue(adminProfilPage.pyrllMode.isDisplayed());
        assertTrue(adminProfilPage.pyrllStats.isDisplayed());
        assertTrue(adminProfilPage.pyrllNetSal.isDisplayed());
        assertTrue(adminProfilPage.pyrllAction.isDisplayed());
    }
    @Then("user Profile page Payroll menu Paylist on Payroll page a search textBox should be displayed and clickable should be tested")
    public void user_profile_page_payroll_menu_paylist_on_payroll_page_a_search_text_box_should_be_displayed_and_clickable_should_be_tested() {

        assertTrue(adminProfilPage.pyrSearchBox.isDisplayed());
        assertTrue(adminProfilPage.pyrSearchBox.isEnabled());

    }
    @Then("user Profile page Leaves menu Leave List \\(Leave Type, Leave Date, Days, Apply Date, Status, Action) menu titles should be displayed.")
    public void user_profile_page_leaves_menu_leave_list_leave_type_leave_date_days_apply_date_status_action_menu_titles_should_be_displayed() {
        adminProfilPage.profLeaves.click();

        assertTrue(adminProfilPage.leavesLtype.isDisplayed());
        assertTrue(adminProfilPage.leavesDate.isDisplayed());
        assertTrue(adminProfilPage.leavesDays.isDisplayed());
        assertTrue(adminProfilPage.leavesApplyDate.isDisplayed());
        assertTrue(adminProfilPage.leavesStatus.isDisplayed());
        assertTrue(adminProfilPage.leavesAction.isDisplayed());
    }
    @Then("The user profile page should display information boards \\(Total Present, Total Late, Total Absent, Total Half Day, Total Holiday) in the Attendance menu.")
    public void the_user_profile_page_should_display_information_boards_total_present_total_late_total_absent_total_half_day_total_holiday_in_the_attendance_menu() {
        adminProfilPage.profAttdnc.click();

        assertTrue(adminProfilPage.AttTotalPres.isDisplayed());
        assertTrue(adminProfilPage.AttTotaLate.isDisplayed());
        assertTrue(adminProfilPage.AttTotalAbsent.isDisplayed());
        assertTrue(adminProfilPage.AttTotalHalf.isDisplayed());
        assertTrue(adminProfilPage.AttTotalHolidy.isDisplayed());

    }
    @Then("The user profile page should display attendance years in the Attendance menu.")
    public void the_user_profile_page_should_display_attendance_years_in_the_attendance_menu() {

        assertTrue(adminProfilPage.AttYear.isDisplayed());
        assertTrue(adminProfilPage.AttYearDropDown.isDisplayed());

    }
    @Then("The user profile page should display explanations indicating the meanings of the letters \\(P,L,A,F,H) used for attendance in the Attendance menu.")
    public void the_user_profile_page_should_display_explanations_indicating_the_meanings_of_the_letters_p_l_a_f_h_used_for_attendance_in_the_attendance_menu() {

        assertTrue(adminProfilPage.AttAllLetters.isDisplayed());

    }
    @Then("The user profile page should display attendance months and the first day's attendance letter in the Attendance menu.")
    public void the_user_profile_page_should_display_attendance_months_and_the_first_day_s_attendance_letter_in_the_attendance_menu() {
        assertFalse(adminProfilPage.AttMonthsRow.isEmpty());

        assertTrue(adminProfilPage.AttFirstdayrow.isDisplayed());

    }

    @Then("user sees password icon on top bar of Admin panel and clicks")
    public void user_sees_password_icon_on_top_bar_of_admin_panel_and_clicks() {

        adminProfilPage.proficon.click();
        adminProfilPage.proficonPassword.click();

    }
    @Then("user should be able to see Current Password, New Password, Confirm Password textboxes and Change Password button on opened page")
    public void user_should_be_able_to_see_current_password_new_password_confirm_password_textboxes_and_change_password_button_on_opened_page() {

        assertTrue(adminProfilPage.CurrentPasswrd.isDisplayed());
        assertTrue(adminProfilPage.newPasswrd.isDisplayed());
        assertTrue(adminProfilPage.ConfrmPasswrd.isDisplayed());
    }

    @Given("when you click on the User Logout link, you should log out of the admin account.")
    public void when_you_click_on_the_user_logout_link_you_should_log_out_of_the_admin_account() {
        ReusableMethods.adminlogin("adminAndTeacherLogin","caner.admin@wonderworldcollege.com","o6*d@fko3PXL1");

        ReusableMethods.bekle(1);
        adminProfilPage.proficon.click();
        String beforeclick  = Driver.getDriver().getCurrentUrl();

        adminProfilPage.proficonLogout.click();
        String afterclick = Driver.getDriver().getCurrentUrl();
        Assertions.assertNotEquals(beforeclick,afterclick);

        String actualtitle = Driver.getDriver().getTitle();
        String expectedtitle = "Login : Wonder World College";

        assertEquals(actualtitle,expectedtitle);

    }

}
