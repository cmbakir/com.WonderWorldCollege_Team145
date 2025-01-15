package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoginScreenPage {
    public AdminLoginScreenPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "public AdminPage(){PageFactory.initElements(Driver.getDriver(),this);}")
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

    @FindBy(xpath = "(//*[@class='form-group has-feedback'])[2]")
    public WebElement labelAdminPassword;
    // AdminLoginPage >> Admin Login Screen

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement buttonSignIn;
    // AdminLoginPage >> Admin Login Screen




















}
