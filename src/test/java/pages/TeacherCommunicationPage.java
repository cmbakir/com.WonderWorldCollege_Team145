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

public class TeacherCommunicationPage {

    public TeacherCommunicationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Communicate']")
    public WebElement sideNavCommunicateButton;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[7]/ul/li[2]/a")
    public WebElement sideNavSendEmailButton;

    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public WebElement emailTemplateDDM;

    @FindBy(xpath = "//*[@id=\"group_title\"]")
    public WebElement titleBox;

    @FindBy(xpath = "//iframe[@title='Rich Text Editor, group_msg_text']")
    public WebElement iframeBodyBox;

    @FindBy (xpath = "(//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders'])[1]")
    public static WebElement iframeTextArea;

    @FindBy (xpath = "(//*[@type='checkbox'])[1]")
    public WebElement messageToStudent;

    @FindBy (xpath = "(//*[@type='checkbox'])[2]")
    public WebElement messageToGurdian;

    @FindBy (xpath = "(//*[@type='checkbox'])[3]")
    public WebElement messageToAdmin;

    @FindBy (xpath = "(//*[@type='checkbox'])[4]")
    public WebElement messageToTeacher;

    @FindBy (xpath = "(//*[@type='checkbox'])[5]")
    public WebElement messageToAccuntant;

    @FindBy (xpath = "(//*[@type='checkbox'])[6]")
    public WebElement messageToLiberarian;

    @FindBy (xpath = "(//*[@type='checkbox'])[7]")
    public WebElement messageToReceptionist;

    @FindBy (xpath = "(//*[@type='checkbox'])[8]")
    public WebElement messageToSuperAdmin;

    @FindBy (xpath = "(//*[@type='submit'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement popTextMsg;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/ul/li[2]/a")
    public WebElement sendEmailClassTab;

    @FindBy (xpath = "//*[@value='schedule']")
    public WebElement scheduleRadioButton;

    @FindBy(xpath = "//*[@id='schedule_date_time']")
    public WebElement scheduleDateBox;



    public void teacherLogin() {
        StudentAttendancePage studentAttendancePage = new StudentAttendancePage();

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("TeacherLogin"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(studentAttendancePage.studentEmailBox));

        studentAttendancePage.studentEmailBox.sendKeys(ConfigReader.getProperty("teacherId"));
        studentAttendancePage.studentPasswordBox.sendKeys(ConfigReader.getProperty("teacherPass"));

        studentAttendancePage.studentSubmitButton.click();



    }
}
