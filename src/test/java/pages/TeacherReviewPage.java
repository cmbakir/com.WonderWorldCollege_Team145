package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherReviewPage {

    public TeacherReviewPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//*[@name='username']")
    public static WebElement Studentid;

    @FindBy (xpath ="//*[@id='password']")
    public WebElement StudentPass;

    @FindBy (xpath ="//*[@type='submit']")
    public WebElement signInButton;
    @FindBy (xpath = "//*[@href='https://qa.wonderworldcollege.com/user/teacher']")
    public WebElement TeacherReview;
    @FindBy (xpath ="//h3[contains(text(), 'Teachers Reviews')]")
    public WebElement TeacherReviewCheck;

    @FindBy (xpath ="//*[@class='sorting_desc']")
    public WebElement TeacherName;

    @FindBy (xpath ="//*[@class='sorting'] [1]")
    public WebElement Subject;

    @FindBy (xpath ="//*[@class='fa fa-plus']")
    public WebElement RateButton;

    @FindBy (xpath ="//*[@id='rate2']")
    public WebElement Rate2;
    //*[@class='form-control'][1]
    @FindBy (xpath ="//*[@class='form-control'][1]")
    public WebElement Comment;

    @FindBy (xpath ="//*[@id='submit'][1]")
    public WebElement Sub1;

    @FindBy (xpath = "//*[@class='btn btn-info pull-right']")
    public WebElement Save;




    //*[@class='btn btn-info pull-right']















}
