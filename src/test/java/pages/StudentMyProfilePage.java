package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class StudentMyProfilePage {

    public StudentMyProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement sidebarMyPro;

    //Student My Profile Page

    @FindBy(xpath = "//*[@*='widget-user-username']")
    public WebElement name;

    @FindBy(xpath = "//*[@*='widget-user-desc mb5']")
    public WebElement admmNo;

    @FindBy(xpath = "//*[@*='widget-user-desc']")
    public WebElement rollNm;

    @FindBy(xpath = "//*[@*='list-group-item border0']")
    public WebElement clas;

    @FindBy(xpath = "(//*[@*='list-group-item'])[1]")
    public WebElement section;

    @FindBy(xpath = "(//*[@*='list-group-item'])[2]")
    public WebElement gender;

    @FindBy(xpath = "//*[@*='list-group-item listnoback']")
    public WebElement barcode;

    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement profile;

    @FindBy(xpath = "//*[text()='Exam']")
    public WebElement exam;

    @FindBy(xpath = "//*[text()='Documents']")
    public WebElement documents;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement adressdetails;

    @FindBy(xpath = "//*[text()='Parent Guardian Detail ']")
    public WebElement partGuardnDet;

    @FindBy(xpath = "//*[text()='Miscellaneous Details']")
    public WebElement miscelDets;

    @FindBy(xpath = "(//*[@class='bordertop'])[3]")
    public WebElement guardiaName;

    @FindBy(xpath = "(//*[@*='alert alert-danger'])[2]")
    public WebElement examNamefirst;

    @FindBy(xpath = "//*[@*='alert alert-danger']")
    public WebElement Namefirst;

    @FindBy(xpath = "//*[@*='mt0']")
    public WebElement welcome;



    @FindBy(id = "email")
    public WebElement studentEmailBox;

    @FindBy(id = "password")
    public WebElement studentPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement studentSubmitButton;

    public void studentLogin() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("studentAndParentLogin"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(studentEmailBox));


        studentEmailBox.sendKeys(ConfigReader.getProperty("studentidc"));
        studentPasswordBox.sendKeys(ConfigReader.getProperty("studentpass"));
        studentSubmitButton.click();
    }
}


