package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeAboutAsPage {

    public HomeAboutAsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Who We Are']")
    public WebElement labelWhoWeAre;


    @FindBy(xpath = "//*[text()='Why Choose Our Institution?']")
    public WebElement labelWhyChooseOurInst;

    @FindBy(xpath = "//*[text()='Scholarship Facility']")
    public WebElement labelScholarshipFac;

    @FindBy(xpath = "//*[text()='Skilled Lecturers']")
    public WebElement labelSkilledLec;

    @FindBy(xpath = "//*[text()='Book Library & Store']")
    public WebElement labelBookLibrary;

    @FindBy(xpath = "//*[text()='Library Facilities']")
    public WebElement labelLibraryFac;

    @FindBy(xpath = "//*[text()='Book Collection']")
    public WebElement labelBookCollection;

    @FindBy(xpath = "//*[text()='Digital Resources']")
    public WebElement labelDigitalRes;

}
