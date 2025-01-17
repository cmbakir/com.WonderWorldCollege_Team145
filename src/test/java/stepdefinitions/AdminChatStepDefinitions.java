package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.AdminChatPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminChatStepDefinitions {

    AdminChatPage adminChatPage = new AdminChatPage();

    @Given("user logs in as admin")
    public void user_logs_in_as_admin() {

        ReusableMethods.adminlogin("adminAndTeacherLogin", "ahmet.emin.admin@wonderworldcollege.com", "o6*d@fko3PXL1");
    }

    @Given("confirms that the Chat icon is displayed in the top bar of the admin panel")
    public void confirms_that_the_chat_icon_is_displayed_in_the_top_bar_of_the_admin_panel() {

        ReusableMethods.bekle(1);

        Assertions.assertTrue(adminChatPage.iconAdminChat.isDisplayed());
    }

    @Then("clicks on the Chat icon and confirms that he is redirected to the Chat page")
    public void clicks_on_the_chat_icon_and_confirms_that_he_is_redirected_to_the_chat_page() {

        adminChatPage.iconAdminChat.click();

        ReusableMethods.bekle(1);

        String expectedUrlContent = "chat";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assertions.assertTrue(actualUrl.contains(expectedUrlContent));
    }

    @Then("confirms that conversations are displayed in the left bar of the page")
    public void confirms_that_conversations_are_displayed_in_the_left_bar_of_the_page() {

        Assertions.assertTrue(adminChatPage.firstChatButton.isDisplayed());

        ReusableMethods.bekle(1);
    }

    @Then("verifies that the number of incoming messages appears as an icon if there is a notification from a chat in the left bar of the page")
    public void verifies_that_the_number_of_incoming_messages_appears_as_an_icon_if_there_is_a_notification_from_a_chat_in_the_left_bar_of_the_page() {

        Assertions.assertTrue(adminChatPage.iconFirstNotification.isDisplayed());

        ReusableMethods.bekle(2);
    }

    @Then("click on the + icon on the page and search for {string} in the window that opens, click on the first result and click on the Add button")
    public void click_on_the_icon_on_the_page_and_search_for_in_the_window_that_opens_click_on_the_first_result_and_click_on_the_add_button(String name) {

        adminChatPage.addContactButton.click();

        ReusableMethods.bekle(1);

        adminChatPage.inputAddContactSearch.sendKeys(name);

        ReusableMethods.bekle(1);

        adminChatPage.rowAddContactFirstResult.click();

        ReusableMethods.bekle(1);

        adminChatPage.addContactAddButton.click();

    }

    @Then("verifies that the message Record Saved Successfully is displayed")
    public void verifies_that_the_message_record_saved_successfully_is_displayed() {

        Assertions.assertTrue(adminChatPage.alertSuccess.isDisplayed());
    }

    @Then("clicks on the added chat and verifies that the message field is displayed on the right side")
    public void clicks_on_the_added_chat_and_verifies_that_the_message_field_is_displayed_on_the_right_side() {

        adminChatPage.firstChatButton.click();

        ReusableMethods.bekle(1);

        Assertions.assertTrue(adminChatPage.firstChatButton.isDisplayed());
    }

    @Then("Write Your Message writes a message in the textBox and verifies that the send message button is clickable")
    public void write_your_message_writes_a_message_in_the_text_box_and_verifies_that_the_send_message_button_is_clickable() {

        adminChatPage.inputChat.sendKeys("message");

        ReusableMethods.bekle(1);

        Assertions.assertTrue(adminChatPage.submitButton.isEnabled());
    }

    @Then("presses the send message button and verifies that the message has been sent")
    public void presses_the_send_message_button_and_verifies_that_the_message_has_been_sent() {

        adminChatPage.submitButton.click();

        ReusableMethods.bekle(1);

        Assertions.assertTrue(adminChatPage.labelFirstMessage.isDisplayed());

        ReusableMethods.bekle(1);
    }


}
