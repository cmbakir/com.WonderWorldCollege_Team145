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

    @FindBy(className = "onlineformbtn mt10")
    public WebElement submitButton;


    // Basic Details

    @FindBy(id = "class_id")
    public WebElement dropDownClass;

    @FindBy(id = "firstname")
    public WebElement inputBoxFirstName;

    @FindBy(id = "lastname")
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

    @FindBy(xpath = "(//*[@class='text-danger'])[8]")
    public WebElement labelClassRequired;

    @FindBy(xpath = "(//*[@class='text-danger'])[10]")
    public WebElement labelFirstNameRequired;

    @FindBy(xpath = "(//*[@class='text-danger'])[12]")
    public WebElement labelGenderRequired;

    @FindBy(xpath = "(//*[@class='text-danger'])[13]")
    public WebElement labelDateOfBirthRequired;

    @FindBy(xpath = "(//*[@class='text-danger'])[15]")
    public WebElement labelEmailRequired;

    // Parent Detail


}
