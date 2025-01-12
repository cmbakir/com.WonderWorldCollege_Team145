package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ParentPage {

    public ParentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@class='topuser-image']")
    public WebElement profileImageButton;

    @FindBy(xpath = "//*[text()=' Change Password']")
    public WebElement profileImageChangePasswordButton;

    @FindBy(xpath = "//*[text()='Change Username']")
    public WebElement profileImageChangeUsernameSection;

    @FindBy(xpath = "//*[@id='passwordform']")
    public WebElement changeUsernameForm;

    @FindBy(xpath = "(//*[@class='form-control col-md-7 col-xs-12'])[1]")
    public WebElement currentUsernameBox;

    @FindBy(xpath = "(//*[@class='form-control col-md-7 col-xs-12'])[2]")
    public WebElement newUsernameBox;

    @FindBy(xpath = "(//*[@class='form-control col-md-7 col-xs-12'])[3]")
    public WebElement confirmUsernameBox;

    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement changeUsernameFormSaveButton;

    @FindBy(xpath = "//*[text()='The username must be at least 5 characters long.']")
    public WebElement labelAllertMessage;

    @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    public WebElement labelSuccessMessage;





}
