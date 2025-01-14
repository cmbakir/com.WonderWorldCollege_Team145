package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.HomeNavBarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class HomePageNavbarStepDefinitions {

    HomeNavBarPage homeNavBarPage = new HomeNavBarPage();
    String beforelogoclick;


    @Given("The user access the site with the given URL")
    public void the_user_access_the_site_with_the_given_url() {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        String expectedURL  =  "https://qa.wonderworldcollege.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedURL,actualUrl);

    }
    @Given("The user dont access the site with wrong URL")
    public void the_user_dont_access_the_site_with_wrong_url() {

        Driver.getDriver().get(ConfigReader.getProperty("homeWrongPage"));
        String expectedURL  =  "https://qa.wonderworldcollege.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertNotEquals(expectedURL,actualUrl);

    }

    @Given("The user sees Latest News information as a scrolling text on the top bar of the home page.")
    public void the_user_sees_latest_news_information_as_a_scrolling_text_on_the_top_bar_of_the_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        assertTrue(homeNavBarPage.latestNews.isDisplayed());

        homeNavBarPage.topbarNews.click();
        homeNavBarPage.headofNews.contains(homeNavBarPage.scrollingtext);


    }

    @Given("The user click on the site logo at the top bar of the home page and  confirm that the home page has been refreshed")
    public void the_user_click_on_the_site_logo_at_the_top_bar_of_the_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        String beforelogoclick  = Driver.getDriver().getCurrentUrl();
        homeNavBarPage.logo.click();
        String afterlogoclick = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(beforelogoclick,afterlogoclick);


    }

    @Given("The user verifies that  menu headings  are visible on the top bar of the home page.")
    public void the_user_verifies_that_menu_headings_are_visible_on_the_top_bar_of_the_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));

        assertTrue(homeNavBarPage.topbarHome.isDisplayed());
        assertTrue(homeNavBarPage.topbarOnlineAdm.isDisplayed());
        assertTrue(homeNavBarPage.topbarExamRes.isDisplayed());
        assertTrue(homeNavBarPage.topbarAboUs.isDisplayed());
        assertTrue(homeNavBarPage.topbarAcadDropDw.isDisplayed());
        assertTrue(homeNavBarPage.topbarCours.isDisplayed());
        assertTrue(homeNavBarPage.topbarGalry.isDisplayed());
        assertTrue(homeNavBarPage.topbarNews.isDisplayed());
        assertTrue(homeNavBarPage.topbarContc.isDisplayed());
        assertTrue(homeNavBarPage.topbarGalry.isDisplayed());

    }
    @Given("The user access these pages")
    public void the_user_access_these_pages() {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        ReusableMethods.verifyUrlChangeAfterClick(homeNavBarPage.topbarOnlineAdm);
        ReusableMethods.verifyUrlChangeAfterClick(homeNavBarPage.topbarExamRes);
        ReusableMethods.verifyUrlChangeAfterClick(homeNavBarPage.topbarAboUs);
        ReusableMethods.verifyUrlChangeAfterClick(homeNavBarPage.topbarCours);
        ReusableMethods.verifyUrlChangeAfterClick(homeNavBarPage.topbarGalry);
        ReusableMethods.verifyUrlChangeAfterClick(homeNavBarPage.topbarNews);
        ReusableMethods.verifyUrlChangeAfterClick(homeNavBarPage.topbarContc);


    }

    @Given("The user verifies the pages in the Academics drop-down menu in the top bar of the home page.")
    public void the_user_verifies_the_pages_in_the_academics_drop_down_menu_in_the_top_bar_of_the_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        homeNavBarPage.topbarAcadDropDw.click();
        ReusableMethods.bekle(3);
        assertTrue(homeNavBarPage.topbarADDFacilities.isDisplayed());
        assertTrue(homeNavBarPage.topbarADDSchoolUni.isDisplayed());
        assertTrue(homeNavBarPage.topbarADDPrincMes.isDisplayed());
        assertTrue(homeNavBarPage.topbarADDKnwUs.isDisplayed());
        assertTrue(homeNavBarPage.topbarADDAppr.isDisplayed());
        assertTrue(homeNavBarPage.topbarADDTechr.isDisplayed());
        assertTrue(homeNavBarPage.topbarADDHouMent.isDisplayed());
        assertTrue(homeNavBarPage.topbarADDStudCou.isDisplayed());

    }
    @Given("The user access these {int} pages")
    public void the_user_access_these_pages(Integer int1) {

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDFacilities);
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDSchoolUni);
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDPrincMes);
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDKnwUs);
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDAppr);
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDTechr);
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDHouMent);
        ReusableMethods.verifyUrlChangeAfterClickDropdw(homeNavBarPage.topbarADDStudCou);

    }
}
