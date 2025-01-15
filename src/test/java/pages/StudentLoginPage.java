package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentLoginPage {

    public StudentLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement studentLoginUsername;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement studentLoginPassword;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement studentLoginSignInButton;

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement studentLoginForgotPasswordButton;

    @FindBy(xpath = "//*[text()='Welcome, Pınar']")
    public WebElement labelStudentHomePage;


    @FindBy(xpath = "//*[text()='Invalid Username Or Password']")
    public WebElement studentLoginInvalidMessage;


    @FindBy(xpath = "//*[text()='Please Check Your Email To Recover Your Password']")
    public WebElement ForgotPasswordEmailSendMessage;


    @FindBy(xpath = "//*[text()='Forgot Password']")
    public WebElement titleForgotPassPage;

    @FindBy(xpath = "//*[@class='form-username form-control']")
    public WebElement ForgotPassPageEmailBox;

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement ForgotPassStudentRadioButton;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement ForgotPassSubmitButton;









}
