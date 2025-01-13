package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherAttendancePage {

    public TeacherAttendancePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@class=\"box-title\"]")
    public WebElement perAttDateTitleText;
    @FindBy(xpath = "(//*[@class=\"fa fa-calendar-check-o ftlayer\"])[2]")
    public WebElement attendanceButton;
    @FindBy(xpath = "(//*[@href=\"https://qa.wonderworldcollege.com/admin/subjectattendence/reportbydate\"])[2]")
    public WebElement PerAttDateMenu;
    @FindBy(xpath = "(//*[@for=\"exampleInputEmail1\"])[1]")
    public WebElement selCrClassText;
    @FindBy(xpath = "//*[@name=\"class_id\"]")
    public WebElement selCrClassDropdown;
    @FindBy(xpath = "(//*[@for=\"exampleInputEmail1\"])[2]")
    public WebElement selCrSectionText;
    @FindBy(xpath = "//*[@name=\"section_id\"]")
    public WebElement selCrSectionDropdown;
    @FindBy(xpath = "(//*[@for=\"exampleInputEmail1\"])[3]")
    public WebElement selCrDateText;
    @FindBy(xpath = "//*[@name=\"date\"]")
    public WebElement selCrDateBox;
    @FindBy(xpath = "(//*[@name=\"search\"])[3]")
    public WebElement selCrSearchText;
    @FindBy(xpath = "(//*[@class=\"fa fa-search\"])[4]")
    public WebElement selCrSearchButton;

    @FindBy(xpath = "//*[@class=\"table-responsive\"]")
    public WebElement studentListForm;

    @FindBy(xpath = "(//th[\"Student\"])[1]")
    public WebElement StudentListTitle;

    @FindBy(xpath = "(//*[@class=\"text text-center\"])[1]")
    public WebElement studListDersTitleText;

    @FindBy(xpath = "(//*[@class=\"day\"])[8]")
    public WebElement dateTableBoxText;



}
