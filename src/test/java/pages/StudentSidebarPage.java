package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentSidebarPage {

    public StudentSidebarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/user/onlineexam\"]")
    public WebElement SutudentOnlineExamButton;

    @FindBy(xpath = "(//*[@class=\"fa fa fa-eye\"])[1]")
    public WebElement viewButoon;

    @FindBy(xpath = "//*[@class=\"box-title titlefix\"]")
    public WebElement OnlineExamText;

    @FindBy(xpath = "//*[@class=\"active\"]")
    public WebElement UpcomingExamsText;

    @FindBy(xpath = "(//*[@class=\"sorting\"])[1]")
    public WebElement UpExExamButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[2]")
    public WebElement UpExQuizButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[3]")
    public WebElement UpExDateFromButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[4]")
    public WebElement UpExDateToButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[5]")
    public WebElement UpExDurationButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[6]")
    public WebElement UpExTotalAttemptedButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[7]")
    public WebElement UpExAttemptedButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[8]")
    public WebElement UpExStatusButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[9]")
    public WebElement ClExExamButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[10]")
    public WebElement ClExQuizButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[11]")
    public WebElement ClExDateFromButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[12]")
    public WebElement ClExDateToButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[13]")
    public WebElement ClExDurationButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[14]")
    public WebElement ClExTotalAttemptedButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[15]")
    public WebElement ClExAttemptedButton;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[16]")
    public WebElement ClExStatusButton;
    @FindBy(xpath = "(//*[@class=\"text-right noExport dt-body-right sorting_disabled\"])[1]")
    public WebElement UpExActionButton;
    @FindBy(xpath = "(//*[@class=\"text-right noExport dt-body-right sorting_disabled\"])[2]")
    public WebElement ClExActionButton;

    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/user/onlineexam/view/227\"]")
    public WebElement UpviewTittleText;
    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/user/onlineexam/view/226\"]")
    public WebElement ClviewTittleText;
    @FindBy(xpath = "//*[@class=\"box-body\"]")
    public WebElement UpClExViewForm;

    @FindBy(xpath = "//*[@class=\"closed-exam\"]")
    public WebElement ClExBolumButonu;

    @FindBy(xpath = "//*[@class=\"active\"]")
    public WebElement aktivSectionText;

    @FindBy (xpath = "//*[@href='https://qa.wonderworldcollege.com/site/logout']")
    public WebElement logutOutButtonStudent;



}