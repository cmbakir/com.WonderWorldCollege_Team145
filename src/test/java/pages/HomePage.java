package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//*[@href='https://qa.wonderworldcollege.com/site/userlogin']")
    public WebElement userLoginButton;
    // HomePage >> Login


    @FindBy(xpath = "//*[text()='Online Admission']")
    public WebElement linkOnlineAdmission;

}
