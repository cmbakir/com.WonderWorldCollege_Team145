package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoginScreenPage {
    public AdminLoginScreenPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@class='col-lg-4 col-md-4 col-sm-12 nopadding  ']")
    public WebElement formAdminScreen;
    // AdminLoginPage >> Admin Login Screen

    @FindBy(xpath = "//*[@class='col-lg-8 col-md-8 col-sm-12 nopadding-2']")
    public WebElement labelAdminLoginRightScreen;
    // AdminLoginPage >> Admin Login Screen

    @FindBy(xpath = "//*[@class='font-white bolds']")
    public WebElement labelAdminLogin;
    // AdminLoginPage >> Admin Login Screen


    @FindBy(xpath = "//*[@placeholder='Username']")
    public WebElement labelAdminUsername;
    // AdminLoginPage >> Admin Login Screen

    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement labelAdminPassword;
    // AdminLoginPage >> Admin Login Screen

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement buttonSignIn;
    // AdminLoginPage >> Admin Login Screen

    @FindBy (xpath = "//*[@class='forgot']")
    public WebElement labelForgotPassword;
    // AdminLoginPage >> Admin Login Screen

    @FindBy (xpath = "//*[@placeholder='Email']")
    public WebElement labelEmailAtForgotPassword;
    // AdminLoginPage >> Admin Forgot Password

    @FindBy (xpath = "//*[@class='btn']")
    public WebElement submitButtonForgotEmail;
    // AdminLoginPage >> Admin Forgot Password

    @FindBy (xpath = "//*[@class='alert alert-success']")
    public WebElement mailSentAlert;
    // AdminLoginPage >> Admin Forgot Password

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement linkAdminLogin;
    // AdminLoginPage >> Admin Forgot Password

    @FindBy(xpath = "//*[@href='https://qa.wonderworldcollege.com/site/userlogin']")
    public WebElement linkUserLogin;
    // AdminLoginPage >> Admin Login

    @FindBy(xpath = "//*[@href='https://qa.wonderworldcollege.com/']")
    public WebElement linkFrontSite;
    // AdminLoginPage >> User Login
































}
