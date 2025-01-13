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


    @FindBy (xpath = "(//*[text()='Apply Date'])[3]")
    public WebElement labelApplyDate;
    // TeacherApplyLeavePage >> ApplyDate

    @FindBy (xpath = "//*[@name='leave_type']")
    public WebElement dropDownAvailableLeave;
    // TeacherApplyLeavePage >> AvailableLeave


    @FindBy (xpath = "//*[@name='leave_from_date']")
    public WebElement dateInputLeaveFromDate;
    // TeacherApplyLeavePage >> LeaveFromDate

    @FindBy (xpath = "(//*[@class='day'])[18]")
    public WebElement dateChoiceLeaveFromDate;


    @FindBy (xpath = "//*[@name='leave_to_date']")
    public WebElement dateInputLeaveToDate;
    // TeacherApplyLeavePage >> LeaveToDate

    @FindBy (xpath = "(//*[@class='day'])[21]")
    public WebElement dateChoiceLeaveToDate;


    @FindBy (xpath = "//*[@id='reason']")
    public WebElement inputBoxReason;
    // TeacherApplyLeavePage >> Reason


    @FindBy (xpath = "//*[@id='submitbtn']")
    public WebElement saveButtonApplyLeave;
    // TeacherApplyLeavePage >> save

    @FindBy (xpath = "//*[@class='odd']")
    public WebElement row1stLeave;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']")
    public WebElement tableLeaves;
    // TeacherApplyLeavePage >> leaves

    @FindBy (xpath = "//*[@aria-label='Staff: activate to sort column ascending']")
    public WebElement labelStaffAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "//*[@aria-label='Leave Type: activate to sort column ascending']")
    public WebElement labelLeaveTypeAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "//*[@aria-label='Leave Date: activate to sort column ascending']")
    public WebElement labelLeaveDateAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "//*[@aria-label='Days: activate to sort column ascending']")
    public WebElement labelDaysAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "//*[@aria-label='Status: activate to sort column ascending']")
    public WebElement labelApplyDateAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "//*[@aria-label='Status: activate to sort column ascending']")
    public WebElement labelStatusAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "//*[@aria-label='Action: activate to sort column ascending']")
    public WebElement labelActionAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "//*[@class ='fa fa-remove']")
    public WebElement iconDeleteAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "(//*[@class='fa fa-reorder'])[1]")
    public WebElement iconViewAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

    @FindBy (xpath = "(//*[@class='modal-content'])[1]")
    public WebElement tableViewAtLeaves;
    // TeacherApplyLeavePage >> Apply Leave

//





















}
