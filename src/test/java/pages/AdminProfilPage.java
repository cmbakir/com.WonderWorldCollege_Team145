package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminProfilPage {

    public AdminProfilPage(){
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "(//*[@*='User Image'])[1]")
    public WebElement proficon;

    @FindBy(xpath = "//*[@*='text-capitalize']")
    public WebElement proficonName;

    @FindBy(xpath = "//*[text()='Admin']")
    public WebElement proficonAdmin;

    @FindBy(xpath = "//*[@*='My Profile']")
    public WebElement proficonProfile;

    @FindBy(xpath = "//*[text()='Password']")
    public WebElement proficonPassword;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement proficonLogout;

    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement profProfile;

    @FindBy(xpath = "(//*[text()='Payroll'])[3]")
    public WebElement profPayrll;

    @FindBy(xpath = "//*[text()='Leaves']")
    public WebElement profLeaves;



    @FindBy(xpath = "(//*[text()='Attendance'])[4]")
    public WebElement profAttdnc;

    @FindBy(xpath = "//*[text()='Documents']")
    public WebElement profDocu;

    @FindBy(xpath = "//*[@class='profile-username text-center']")
    public WebElement profGenInf;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement profAddDet;

    @FindBy(xpath = "//*[text()='Bank Account Details']")
    public WebElement profBankAccDet;

    @FindBy(xpath = "//*[text()='Social Media Link']")
    public WebElement profSocMedLink;

    @FindBy(xpath = "//*[text()='Total Net Salary Paid']")
    public WebElement pyrllTotNetSal;

    @FindBy(xpath = "//*[text()='Total Gross Salary']")
    public WebElement pyrllTotGrsSal;

    @FindBy(xpath = "//*[text()='Total Earning']")
    public WebElement pyrllTotEar;

    @FindBy(xpath = "//*[text()='Total Deduction']")
    public WebElement pyrllTotDed;

    @FindBy(xpath = "//*[text()='Payslip #']")
    public WebElement pyrllPayslp;

    @FindBy(xpath = "//*[text()='Month - Year']")
    public WebElement pyrllYear;

    @FindBy(xpath = "(//*[text()='Date'])[1]")
    public WebElement pyrllDate;

    @FindBy(xpath = "//*[text()='Mode']")
    public WebElement pyrllMode;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement pyrllStats;

    @FindBy(xpath = "//*[text()='Net Salary ']")
    public WebElement pyrllNetSal;

    @FindBy(xpath = "(//*[text()='Action'])[1]")
    public WebElement pyrllAction;

    @FindBy(xpath = "(//*[@*='Search...'])[1]")
    public WebElement pyrSearchBox;

    @FindBy(xpath = "(//*[text()='Leave Type'])[3]")
    public WebElement leavesLtype;

    @FindBy(xpath = "//*[text()='Leave Date']")
    public WebElement leavesDate;

    @FindBy(xpath = "//*[text()='Days']")
    public WebElement leavesDays;

    @FindBy(xpath = "(//*[text()='Apply Date'])[1]")
    public WebElement leavesApplyDate;

    @FindBy(xpath = " (//*[text()='Status'])[2]")
    public WebElement leavesStatus;

    @FindBy(xpath = "(//*[text()='Action'])[2]")
    public WebElement leavesAction;

    @FindBy(xpath = "//*[text()='Total Present']")
    public WebElement AttTotalPres;

    @FindBy(xpath = "//*[text()='Total Late']")
    public WebElement AttTotaLate;

    @FindBy(xpath = "//*[text()='Total Absent']")
    public WebElement AttTotalAbsent;

    @FindBy(xpath = "//*[text()='Total Half Day']")
    public WebElement AttTotalHalf;

    @FindBy(xpath = "//*[text()='Total Holiday']")
    public WebElement AttTotalHolidy;

    @FindBy(xpath = "//*[text()='Year']")
    public WebElement AttYear;

    @FindBy(xpath = "//*[@name='year']")
    public WebElement AttYearDropDown;

    @FindBy(xpath = "//*[@class='halfday pull-right']")
    public WebElement AttAllLetters;

    @FindBy(xpath = "(//*[@role='row'])[4]")
    public List<WebElement> AttMonthsRow;

    @FindBy(xpath = "(//*[@role='row'])[5]")
    public WebElement AttFirstdayrow;


    @FindBy(xpath = "//*[text()='Current Password']")
    public WebElement CurrentPasswrd;

    @FindBy(xpath = "//*[text()='New Password']")
    public WebElement newPasswrd;

    @FindBy(xpath = "//*[text()='Confirm Password']")
    public WebElement ConfrmPasswrd;

    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement ChangePasswrd;


    //(//*[@type='password'])[1]
    // (//*[@type='password'])[2]
    //(//*[@type='password'])[3]

    //logout olunca sayfa title kontrol


























































}
