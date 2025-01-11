package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StudentHomeworkPage {

    public StudentHomeworkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[@class='fa fa-flask ftlayer']")
    public WebElement studentHwMenu;

    @FindBy (xpath = "(//*[@class='active'])[2]")
    public WebElement upcommingHwMenu;

    @FindBy (xpath = "(//*[@role='row'])[1]")
    public List<WebElement> upcommingHwTitles;

    @FindBy (xpath = "//*[@class='btn btn-default btn-xs']")
    public WebElement upcommingActionButton;

    @FindBy (xpath = "(//*[@class='btn btn-default btn-xs'])[2]")
    public WebElement closedActionButton;

    @FindBy (xpath = "//*[@name='message']")
    public WebElement hwDetailsMessageBox;

    @FindBy (xpath = "//*[@id='submit']")
    public WebElement hwDetailsSaveButton;

    @FindBy (xpath = "//*[text()='Homework Details']")
    public WebElement upcommingActionHwDetailsMenu;

    @FindBy (xpath = "//*[@class='closed-exam']")
    public WebElement closedHwMenu;

    @FindBy (xpath = "//*[@class='box-tools pull-right']")
    public WebElement dailyAssignmentButton;

    @FindBy (xpath = "//*[@class='btn btn-sm btn-primary']")
    public WebElement addDailyAssignmentButton;

    @FindBy (xpath = "//*[text()=' Daily Assignment List']")
    public WebElement dailyAssignmentListLabel;



    @FindBy (xpath = "//*[@id='subject']")
    public WebElement addDailyAssignSubjectButton;

    @FindBy (xpath = "//*[@id='title']")
    public WebElement addDailyAssignTitleButton;

    @FindBy (xpath = "//*[text()='Add Daily Assignment']")
    public WebElement labeladdDailyAssign;


    @FindBy (xpath = "//*[@value='92']")
    public WebElement firstOptionOfSubject;


    @FindBy (xpath = "(//*[text()='Save'])[1]")
    public WebElement addDailyAssignSaveButton;

    @FindBy (xpath = "(//*[@role='row'])[2]")
    public WebElement firstRowOfAssignList;


    @FindBy (xpath = "//*[@class='fa fa-pencil']")
    public WebElement dailyAssignmentEditButton;

    @FindBy (xpath = "//*[@class='fa fa-remove']")
    public WebElement dailyAssignmentDeleteButton;

    @FindBy (xpath = "(//*[@class='btn btn-info pull-right'])[2]")
    public WebElement editdailyAssSaveButton;

    @FindBy (xpath = "(//*[@type='text'])[4]")
    public WebElement editdailyAssTitleBox;



    @FindBy (xpath = "//*[@id='DataTables_Table_0']")
    public WebElement tableDailyAssList;










}
