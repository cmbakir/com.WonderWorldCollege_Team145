package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.ParentLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class ParentLoginStepDefinitions {

    ParentLoginPage parentLoginPage=new ParentLoginPage();
    //WWC74 TC 01 -> US054 WWC Parent Login page Form visibility test
    @Given("User goes to homePage address")
    public void user_goes_to_home_page_address() {
        ReusableMethods.bekle(1);
        Driver.driver.get( ConfigReader.getProperty("homePage"));
        ReusableMethods.bekle(1);
    }
    @Then("Clicks on Login button on homepage")
    public void clicks_on_login_button_on_homepage() {
        ReusableMethods.bekle(1);
        parentLoginPage.loginButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("The username and password form on the User Login page should be visible.")
    public void the_username_and_password_form_on_the_user_login_page_should_be_visible() {
        ReusableMethods.bekle(1);
        Assertions.assertTrue( parentLoginPage.loginForm.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("The Sign In button on the User Login page should be visible.")
    public void the_sign_in_button_on_the_user_login_page_should_be_visible() {
        ReusableMethods.bekle(1);
        Assertions.assertTrue( parentLoginPage.signInButton.isDisplayed());
        ReusableMethods.bekle(1);

    }
    @Then("The Username and password boxes should be on the User Login page.")
    public void the_username_and_password_boxes_should_be_on_the_user_login_page() {
        ReusableMethods.bekle(1);
        Assertions.assertTrue( parentLoginPage.passwordBox.isDisplayed());
        ReusableMethods.bekle(1);
        Assertions.assertTrue( parentLoginPage.userNameBox.isDisplayed());
        ReusableMethods.bekle(1);
    }

    //WWC75 TC 02 -> US054 WWC Parent Login page

    @Given("User enters username.")
    public void user_enters_username() {
        parentLoginPage.userNameBox.sendKeys(ConfigReader.getProperty("Parent_username_009"));
        ReusableMethods.bekle(1);
    }
    @Then("User enters password.")
    public void user_enters_password() {
        parentLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("Parent_password_009"));
        ReusableMethods.bekle(1);
    }
    @Then("User clicks sign in button.")
    public void user_clicks_sign_in_button() {
        ReusableMethods.bekle(1);
        parentLoginPage.signInButton.click();
    }
    @Then("User confirms login.")
    public void user_confirms_login() {
        ReusableMethods.bekle(1);
        String expectedDashboardUrl="https://qa.wonderworldcollege.com/user/user/dashboard";
        String actualDashboardUrl=Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedDashboardUrl,actualDashboardUrl);
    }

    //WWC76 TC 03 -> US054 WWC Parent Login page negativ test
    @Given("User enters wrong username.")
    public void user_enters_wrong_username() {
        Faker faker=new Faker();
        parentLoginPage.userNameBox.sendKeys(faker.name().username());
        ReusableMethods.bekle(3);


    }
    @Then("User enters correckt password.")
    public void user_enters_correckt_password() {
        parentLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("Parent_password_009"));
        ReusableMethods.bekle(2);
    }

    @Then("User sees {string} warning message.")
    public void user_sees_warning_message(String expectedErrorText) {

        ReusableMethods.bekle(2);
        String actualErrorText=parentLoginPage.ErrorText.getText();
        ReusableMethods.bekle(2);

        Assertions.assertEquals(expectedErrorText,actualErrorText);
        parentLoginPage.userNameBox.clear();
        parentLoginPage.passwordBox.clear();
    }
    @Given("User enters correckt username.")
    public void user_enters_correckt_username() {
        parentLoginPage.userNameBox.sendKeys(ConfigReader.getProperty("Parent_username_009"));
        ReusableMethods.bekle(2);
    }

    @Then("User enters wrong password.")
    public void user_enters_wrong_password() {
        Faker faker=new Faker();
        parentLoginPage.passwordBox.sendKeys(faker.internet().password());
        ReusableMethods.bekle(2);
    }



    //WWC77 TC 04 -> US054 WWC Parent Forgot Password activation test
    @Given("The user clicks on the Forgot Password text on the login page.")
    public void the_user_clicks_on_the_forgot_password_text_on_the_login_page() {
        parentLoginPage.forgotButton.click();

        ReusableMethods.bekle(3);
    }
    @Then("The user sees the Forgot Password text on the form on the page that opens.")
    public void the_user_sees_the_forgot_password_text_on_the_form_on_the_page_that_opens() {

        String expectedText="Forgot Password";
        String actuelText=parentLoginPage.forgotPageText.getText();
        Assertions.assertEquals(expectedText,actuelText);

    }



}
