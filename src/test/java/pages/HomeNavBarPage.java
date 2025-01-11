package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeNavBarPage {

    public HomeNavBarPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@*='logo']")
    public WebElement logo;

    @FindBy(xpath = "(//*[text()='Home'])[2]")
    public WebElement topbarHome;

    @FindBy(xpath = "//*[text()='Online Admission']")
    public WebElement topbarOnlineAdm;

    @FindBy(xpath = "//*[text()='Exam Result']")
    public WebElement topbarExamRes;

    @FindBy(xpath = "(//*[text()='About Us'])[1]")
    public WebElement topbarAboUs;

    @FindBy(xpath = "//*[text()='Academics ']")
    public WebElement topbarAcadDropDw;

    @FindBy(xpath = "(//*[text()='Course'])[1]")
    public WebElement topbarCours;

    @FindBy(xpath = "(//*[text()='Gallery'])[1]")
    public WebElement topbarGalry;

    @FindBy(xpath = "(//*[text()='News'])[1]")
    public WebElement topbarNews;

    @FindBy(xpath = "(//*[text()='Contact'])[1]")
    public WebElement topbarContc;


    @FindBy(xpath = "//*[text()='Facilities']")
    public WebElement topbarADDFacilities;

    @FindBy(xpath = "//*[text()='School Uniform']")
    public WebElement topbarADDSchoolUni;

    @FindBy(xpath = "//*[text()='Principal Message']")
    public WebElement topbarADDPrincMes;

    @FindBy(xpath = "//*[text()='Know Us']")
    public WebElement topbarADDKnwUs;

    @FindBy(xpath = "//*[text()='Approach']")
    public WebElement topbarADDAppr;

    @FindBy(xpath = "//*[text()='Teacher']")
    public WebElement topbarADDTechr;

    @FindBy(xpath = "//*[text()='Houses & Mentoring']")
    public WebElement topbarADDHouMent;

    @FindBy(xpath = "//*[text()='Student Council']")
    public WebElement topbarADDStudCou;


    @FindBy(xpath = "//*[text()='Latest News']")
    public WebElement latestNews;

























}
