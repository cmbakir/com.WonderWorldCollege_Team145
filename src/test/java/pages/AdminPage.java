package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {




    @FindBy(xpath = "//*[@name='username']")
    public WebElement labelUsername;
    // AdminLoginPage >> username

    @FindBy(xpath = "//*[@class='form-password form-control']")
    public WebElement labelPassword;
    // AdminLoginPage >> password

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement SignInButton;
   // AdminloginPage >> SıgnInButton

    @FindBy(xpath = "(//*[text()='Student Information'])[2]")
    public WebElement labelStudentInformation;
    //  AdminPage>> StudentInformation ||

    @FindBy(xpath = "(//*[@href='https://qa.wonderworldcollege.com/admin/onlinestudent'])[2]")
    public WebElement labelOnlineAdmission;
    //  AdminPage>> StudentInformation >> Online Admission ||

    @FindBy (xpath = "//input[@type='search']")
    public WebElement labelSearch;
    //  AdminPage>> StudentInformation >> Online Admission >> Search Text

    @FindBy (xpath = "//h3[@class='box-title']")
    public WebElement labelStudentList;
    //  AdminPage>> StudentInformation >> Online Admission >> Title Student List

    @FindBy (xpath = "(//*[@role='row'])[1]")
    public WebElement columnHeader;
    // Student List >> Table Header
    // (Reference No,Student Name,Class,Father Name,Date Of Birth,Gender,Category,Student,Mobile Number,Form Status,Enrolled,Created At,Action)

    @FindBy (xpath = "(//*[@role='row'])[2]")
    public WebElement columnfist;
    // Student List >> 1. satırdaki veriler

    @FindBy (xpath = "(//*[@class='sorting'])[1]")
    public WebElement columnReferanceNo;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[2]")
    public WebElement columnStudentName;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[3]")
    public WebElement columnFatherName;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='white-space-nowrap sorting'])")
    public WebElement columnClass;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[4]")
    public WebElement columnDateofBirth;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[5]")
    public WebElement columnGender;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[6]")
    public WebElement columnCatagory;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[7]")
    public WebElement columnStudentMobileNo;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[8]")
    public WebElement columnFormStatus;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[9]")
    public WebElement columnEnrolled;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='sorting'])[10]")
    public WebElement columnDate;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='text-right noExport dt-body-right sorting_disabled'])")
    public WebElement columnAction;
    // Student List >> Table Title

    @FindBy (xpath = "(//*[@class='fa fa-remove'])[1]")
    public WebElement iconDelete;
    // Student List >> Action >> Delete Icon

    @FindBy (xpath = "(//*[@class='fa fa-pencil'])[1]")
    public WebElement iconEditAndEnroll;
    // Student List >> Action >> Edit And Enroll Icon

    @FindBy (xpath = "(//*[@class='label label-success'])[1]")
    public WebElement iconSubmitted;
    // Student List >> Form Status >> Submitted Icon

    @FindBy (xpath = "(//*[@class='label label-danger'])[1]")
    public WebElement iconNotSubmitted;
    // Student List >> Form Status >> Not Submitted Icon

    @FindBy (xpath = "(//*[@class='fa fa-check'])[1]")
    public WebElement iconEnrolled;
    // Student List >> Enrolled >> Tik Icon

    @FindBy (xpath = "(//*[@class='fa fa-minus-circle'])[1]")
    public WebElement iconNotEnrolled;
    // Student List >> Enrolled >> - negative Icon

}
