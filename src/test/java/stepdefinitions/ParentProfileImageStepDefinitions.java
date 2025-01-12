package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.ParentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.*;

public class ParentProfileImageStepDefinitions {

    ParentPage parentPage=new ParentPage();


    @Given("The user navigates to the parent “homePage” address.")
    public void the_user_navigates_to_the_parent_home_page_address() {

        ReusableMethods.login("studentAndParentLogin",ConfigReader.getProperty("parentCurrentUsername"),"wonderworld123");

    }
    @Then("The user views the {string} button from the profile image.")
    public void the_user_views_the_button_from_the_profile_image(String string) {

        parentPage.profileImageButton.click();
        ReusableMethods.bekle(1);

        assertTrue(parentPage.profileImageChangePasswordButton.isDisplayed());

    }
    @Then("The user clicks the {string} button and accesses the relevant page.")
    public void the_user_clicks_the_button_and_accesses_the_relevant_page(String string) {

        parentPage.profileImageChangePasswordButton.click();
        ReusableMethods.bekle(1);
        parentPage.profileImageChangeUsernameSection.click();
        assertTrue(parentPage.changeUsernameForm.isDisplayed());

    }
    @Then("The user enters a username combination with fewer than {int} characters and verifies that the following warning message is received: {string}")
    public void the_user_enters_a_username_combination_with_fewer_than_characters_and_verifies_that_the_following_warning_message_is_received(Integer int1, String string) {

        parentPage.currentUsernameBox.sendKeys(ConfigReader.getProperty("parentCurrentUsername"));
        parentPage.newUsernameBox.sendKeys(ConfigReader.getProperty("parentGecersizNewUsername"));
        parentPage.confirmUsernameBox.sendKeys(ConfigReader.getProperty("parentGecersizNewUsername"));
        parentPage.changeUsernameFormSaveButton.click();
        ReusableMethods.bekle(1);

        String expectedMessage="The username must be at least 5 characters long.";
        String actualMessage=parentPage.labelAllertMessage.getText();
        assertEquals(expectedMessage,actualMessage);


    }
    @Then("The user enters the correct username combination and verifies that the message {string} is received.")
    public void the_user_enters_the_correct_username_combination_and_verifies_that_the_message_is_received(String string) {

        parentPage.currentUsernameBox.sendKeys(ConfigReader.getProperty("parentCurrentUsername"));
        parentPage.newUsernameBox.sendKeys(ConfigReader.getProperty("parentGecerliNewUsername"));
        parentPage.confirmUsernameBox.sendKeys(ConfigReader.getProperty("parentGecerliNewUsername"));
        ReusableMethods.bekle(1);
        parentPage.changeUsernameFormSaveButton.click();
        ReusableMethods.bekle(1);
        String expSuccessMessage="Record Saved Successfully";
        String actSuccessMessage=parentPage.labelSuccessMessage.getText();
        assertEquals(expSuccessMessage,actSuccessMessage);
    }

}
