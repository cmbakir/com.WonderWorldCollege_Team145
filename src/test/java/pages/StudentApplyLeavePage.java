package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentApplyLeavePage {

    //// WO Student
    public StudentApplyLeavePage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@name='username']")
    public WebElement studentUser;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement studentPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;  // login button to student panel

    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/user/apply_leave\"]")
    public WebElement applyLeaveButton ;  // from left sidebar

    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement leaveListPage; // access to leave list page

    @FindBy (xpath = "//th")
    public WebElement columnFields; // column fields on the leave list page

    @FindBy(xpath = "//i[@class='fa fa-pencil']")
    public WebElement editButton; // under actions of leave list page

    //editing leave form
    @FindBy(xpath = "//h4[@class='box-title']")
    public WebElement editForm;

    @FindBy (xpath = "//input[@name='from_date']")
    public WebElement dateInputLeaveFromDate;
    // StudentApplyLeavePage >> LeaveFromDate

    @FindBy(xpath = "//tr//td[2][@class='day']")
    public WebElement selectedDayFromDay;

    @FindBy(xpath = "//input[@name='to_date']")
    public WebElement dateInputToDate;   // StudentApplyLeavePage >> ToDate

    @FindBy(xpath = "//tr//td[2][@class='day']")
    public WebElement selectedDayToDay;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement reasonArea;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement editSaveButton;



   // @FindBy(xpath = "//*[@class='fa fa-download']")
    //public WebElement downloadButton;

    @FindBy(xpath = "//i[@class='fa fa-remove']")
    public  WebElement deleteButton;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement addButton;

    @FindBy(xpath = "//h4[@class='box-title']")
    public  WebElement addLeaveForm;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement addLeaveSaveButton; // save button on the add leve form


    @FindBy(xpath = "//*[@class='box-header with-border']")
    public WebElement deleteMessage;
}
