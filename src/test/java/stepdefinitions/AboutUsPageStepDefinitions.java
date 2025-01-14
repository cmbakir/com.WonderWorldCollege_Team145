package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.HomeAboutAsPage;
import pages.HomeNavBarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.*;

public class AboutUsPageStepDefinitions {

    HomeNavBarPage homeNavBarPage=new HomeNavBarPage();
    HomeAboutAsPage homeAboutAsPage=new HomeAboutAsPage();

    @Given("The user navigates to the Home Page")
    public void the_user_navigates_to_the_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));

    }
    @Then("The user clicks on the About US menu title in the top bar of the home page confirms that it redirects to the {string} page.")
    public void the_user_clicks_on_the_about_us_menu_title_in_the_top_bar_of_the_home_page_confirms_that_it_redirects_to_the_page(String string) {

        homeNavBarPage.topbarAboUs.click();
        ReusableMethods.bekle(1);
        assertTrue(homeAboutAsPage.labelWhoWeAre.isDisplayed());


    }
    @Then("The User verifies that the About Us page has {string} and {string} sections.")
    public void the_user_verifies_that_the_about_us_page_has_and_sections(String string, String string2) {

        assertTrue(homeAboutAsPage.labelWhoWeAre.isDisplayed());
        assertTrue(homeAboutAsPage.labelWhyChooseOurInst.isDisplayed());


    }
    @Then("On the About Us page, it is verified that the titles Scholarship Facility, Skilled Lecturers, Book Library & Store, Library Facilities, Book Collection and Digital Resources are visible in the {string} section.")
    public void on_the_about_us_page_it_is_verified_that_the_titles_scholarship_facility_skilled_lecturers_book_library_store_library_facilities_book_collection_and_digital_resources_are_visible_in_the_section(String string) {

        assertTrue(homeAboutAsPage.labelScholarshipFac.isDisplayed());
        ReusableMethods.bekle(1);
        assertTrue(homeAboutAsPage.labelBookCollection.isDisplayed());
        assertTrue(homeAboutAsPage.labelBookLibrary.isDisplayed());
        assertTrue(homeAboutAsPage.labelLibraryFac.isDisplayed());
        ReusableMethods.bekle(1);
        assertTrue(homeAboutAsPage.labelSkilledLec.isDisplayed());
        assertTrue(homeAboutAsPage.labelDigitalRes.isDisplayed());

    }

}
