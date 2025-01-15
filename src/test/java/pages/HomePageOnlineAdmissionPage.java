package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePageOnlineAdmissionPage {

    public HomePageOnlineAdmissionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // General

    @FindBy(xpath = "(//*[@class='col-md-12'])[1]")
    public WebElement labelInstructions;

    @FindBy(xpath = "//*[@class='onlineformbtn mt10']")
    public WebElement submitButton;


    // Basic Details

    @FindBy(xpath = "//*[@id='class_id']")
    public WebElement dropDownClass;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement inputBoxFirstName;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement inputBoxLastName;

    @FindBy(xpath = "//*[@name='gender']")
    public WebElement dropDownGender;

    @FindBy(xpath = "(//*[@class='form-control date2'])[1]")
    public WebElement dropDownDateOfBirth;

    @FindBy(xpath = "(//*[@class='prev'])[1]")
    public WebElement dateOfBirthPrevMonthButton;

    @FindBy(xpath = "(//*[@class='prev'])[3]")
    public WebElement dateOfBirthPrevYearButton;

    @FindBy(xpath = "(//*[@class='datepicker-switch'])[1]")
    public WebElement dateOfBirthDatePickerMonthButton;

    @FindBy(xpath = "(//*[@class='datepicker-switch'])[2]")
    public WebElement dateOfBirthDatePickerYearButton;

    @FindBy(xpath = "(//*[@class='year'])[1]")
    public WebElement dateOfBirthYear;

    @FindBy(xpath = "(//*[@class='month'])[1]")
    public WebElement dateOfBirthMonth;

    @FindBy(xpath = "(//*[@class='day'])[1]")
    public WebElement dateOfBirthDay;

    @FindBy(xpath = "//*[@name='mobileno']")
    public WebElement inputBoxMobilePhone;

    @FindBy(xpath = "(//*[@name='email'])[2]")
    public WebElement inputBoxEmail;

    @FindBy(xpath = "(//*[@class='filestyle form-control'])[1]")
    public WebElement studentPhotoButton;

    @FindBy(xpath = "(//*[@class='req'])[8]")
    public WebElement iconClassRequired;

    @FindBy(xpath = "(//*[@class='req'])[10]")
    public WebElement iconFirstNameRequired;

    @FindBy(xpath = "(//*[@class='req'])[11]")
    public WebElement iconGenderRequired;

    @FindBy(xpath = "(//*[@class='req'])[12]")
    public WebElement iconDateOfBirthRequired;

    @FindBy(xpath = "(//*[@class='req'])[13]")
    public WebElement iconEmailRequired;

    @FindBy(xpath = "(//*[@class='dropify-clear'])[1]")
    public WebElement studentPhotoRemoveButton;

    // Parent Detail

    @FindBy(xpath = "//*[@id='father_name']")
    public WebElement inputFatherName;

    @FindBy(xpath = "//*[@id='mother_name']")
    public WebElement inputMotherName;

    // Guardian Details

    @FindBy(xpath = "(//*[@class='radio-inline'])[1]")
    public WebElement radioButtonFather;

    @FindBy(xpath = "(//*[@class='radio-inline'])[2]")
    public WebElement radioButtonMother;

    @FindBy(xpath = "(//*[@class='radio-inline'])[3]")
    public WebElement radioButtonOther;

    @FindBy(xpath = "//*[@id='guardian_name']")
    public WebElement inputGuardianName;

    @FindBy(xpath = "//*[@id='guardian_relation']")
    public WebElement inputGuardianRelation;

    @FindBy(xpath = "//*[@id='guardian_email']")
    public WebElement inputGuardianEmail;

    @FindBy(xpath = "//*[@id='guardian_phone']")
    public WebElement inputGuardianPhone;

    @FindBy(xpath = "//*[@id='guardian_occupation']")
    public WebElement inputGuardianOccupation;

    @FindBy(xpath = "//*[@id='guardian_address']")
    public WebElement inputGuardianAddress;

    @FindBy(xpath = "(//*[@class='filestyle form-control'])[2]")
    public WebElement guardianPhotoButton;

    @FindBy(xpath = "(//*[@class='req'])[14]")
    public WebElement iconIfGuardianIsRequired;

    @FindBy(xpath = "(//*[@class='req'])[15]")
    public WebElement iconGuardianNameRequired;

    @FindBy(xpath = "(//*[@class='req'])[16]")
    public WebElement iconGuardianRelationRequired;

    @FindBy(xpath = "(//*[@class='dropify-clear'])[2]")
    public WebElement guardianPhotoRemoveButton;

    // Miscellaneous Details

    @FindBy(xpath = "//*[@id='adhar_no']")
    public WebElement inputNationalID;

    @FindBy(xpath = "//*[@name='previous_school']")
    public WebElement inputPreviousSchool;

    // Upload Documents

    @FindBy(xpath = "//*[@id='document']")
    public WebElement uploadDocumentButton;

    @FindBy(xpath = "(//*[@class='dropify-clear'])[3]")
    public WebElement uploadDocumentRemoveButton;

    // Review Entered Details and Status

    @FindBy(xpath = "(//li)[34]//span")
    public WebElement rowReferenceNo;

    @FindBy(xpath = "(//li)[35]//span")
    public WebElement rowFormStatus;

    @FindBy(xpath = "(//li)[36]//span")
    public WebElement rowApplicationDate;

    @FindBy(xpath = "//*[@type='checkbox']")
    public WebElement termsAndConditionsCheckBox;

    @FindBy(xpath = "//*[@id='submitbtn']")
    public WebElement reviewSubmitButton;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement alertSuccess;

}
