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
import java.util.List;

public class StudentAttendancePage {

    public StudentAttendancePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@name='username']")
    public WebElement studentEmailBox;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement studentPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement studentSubmitButton;

    @FindBy(xpath = "//*[text()='Attendance']")
    public WebElement sideNavAttendenceButton;

    @FindBy(xpath = "//*[@id='dob']")
    public  WebElement attendencePageDateBox;

    @FindBy (xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/tbody/tr/td")
    public List<WebElement> attendenceResult;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/thead/tr/th")
    public List<WebElement>attendenceResultHeadTitleList;










//student objesinde cikmasiicin burada
    public void studentLogin() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("studentLogin"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(studentEmailBox));

        studentEmailBox.sendKeys(ConfigReader.getProperty("studentid"));
        studentPasswordBox.sendKeys(ConfigReader.getProperty("studentpass"));
        studentSubmitButton.click();
    }


}
