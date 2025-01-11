package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherApplyLeavePage {

    public TeacherApplyLeavePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@class=\"form-username form-control\"]")
    public WebElement labelTeacherUsername;
    // TeacherLoginPage >> username

    @FindBy(xpath = "//*[@class='form-password form-control']")
    public WebElement labelTeacherPassword;
    // TeacherLoginPage >> password

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement teacherSignInButton;
    // TeacherloginPage >> SignInButton


    @FindBy(xpath = "(//*[@class=\"fa fa-sitemap ftlayer\"])[2]")
    public WebElement dropDownHumanResource;
    // TeacherSideBar >> HumanResource


    @FindBy (xpath = "(//*[@href=\"https://qa.wonderworldcollege.com/admin/staff/leaverequest\"])[2]")
    public WebElement linkApplyLeave;
    // TeacherSideBar >> ApplyLeave


    @FindBy (xpath = "//*[@onclick=\"addLeave()\"]")
    public WebElement applyLeaveButton;
    // TeacherApplyLeavePage >> ApplyLeaveButton


    @FindBy (xpath = "//*[@class=\"form-control date\"]")
    public WebElement dateInputAddLeave;
    // TeacherApplyLeavePage >> ApplyDate

    @FindBy (xpath = "//*[@name=\"leave_type\"]")
    public WebElement dropDownAvailableLeave;
    // TeacherApplyLeavePage >> AvailableLeave


    @FindBy (xpath = "//*[@name=\"leave_from_date\"]")
    public WebElement dateInputLeaveFromDate;
    // TeacherApplyLeavePage >> LeaveFromDate


    @FindBy (xpath = "/*[@name=\"leave_to_date\"]")
    public WebElement dateInputLeaveToDate;
    // TeacherApplyLeavePage >> LeaveToDate

    @FindBy (xpath = "//*[@name=\"reason\"]")
    public WebElement ınputBoxReason;
    // TeacherApplyLeavePage >> Reason


    @FindBy (xpath = "//*[@id=\"submitbtn\"]")
    public WebElement saveButtonApplyLeave;
    // TeacherApplyLeavePage >> save

    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]")
    public WebElement tableLeaves;
    // TeacherApplyLeavePage >> leaves





























}
