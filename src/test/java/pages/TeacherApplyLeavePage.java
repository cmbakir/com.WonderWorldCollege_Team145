package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherApplyLeavePage {

    public TeacherApplyLeavePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@name='username']")
    public WebElement labelTeacherUsername;
    // TeacherLoginPage >> username

    @FindBy(xpath = "//*[@class='form-password form-control']")
    public WebElement labelTeacherPassword;
    // TeacherLoginPage >> password

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement TeacherSignInButton;
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




























}
