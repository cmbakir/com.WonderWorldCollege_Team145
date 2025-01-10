package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentLoginPage {

    public StudentLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='form-username form-control']")
    public WebElement studentLoginUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement studentLoginPassword;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement studentLoginSignInButton;




}
