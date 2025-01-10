package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefinitionsCem {

    @Given("The user navigates to the “homePage” address.")
    public void the_user_navigates_to_the_home_page_address() {
        Driver.getDriver().get(ConfigReader.getProperty("homePage"));

    }

    @Then("Verifies that the homepage is successfully reached.")
    public void verifies_that_the_homepage_is_successfully_reached() {
        String expectedURL  =  "https://qa.wonderworldcollege.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedURL,actualUrl);



    }
}
