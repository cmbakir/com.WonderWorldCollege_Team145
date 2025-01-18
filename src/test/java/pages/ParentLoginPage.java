package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ParentLoginPage {

    public ParentLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class=\"complainbtn\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class=\"form-bottom\"]")
    public WebElement loginForm;

    @FindBy(xpath = "//*[@class=\"btn\"]")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement passwordBox;
    @FindBy(xpath = "//*[@name=\"username\"]")
    public WebElement userNameBox;
    @FindBy(xpath = "//*[@class=\"alert alert-danger\"]")
    public WebElement ErrorText;
    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/site/ufpassword\"]")
    public WebElement forgotButton;
    @FindBy(xpath = "//*[@class=\"font-white bolds\"]")
    public WebElement forgotPageText;

    @FindBy(xpath = "//*[@class=\"fa fa-sign-out fa-fw\"]")
    public WebElement studentLogoutButton;
    @FindBy(xpath = "//*[@class=\"topuser-image\"]")
    public WebElement studentProfil;

}
