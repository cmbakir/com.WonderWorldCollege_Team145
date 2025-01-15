package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StudentExaminationsPage {
    public StudentExaminationsPage(){PageFactory.initElements(utilities.Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@class=\"fa fa-map-o ftlayer\"]")
    public WebElement SutedentExaminationsButton;
    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/user/examschedule\"]")
    public WebElement StdExSchduleMenuButton;
    @FindBy(xpath = "//*[@type=\"search\"]")
    public WebElement SearchBox;
    @FindBy(xpath = "//td[contains(@class, 'sorting_1')]")
    public List<WebElement> examElements;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[1]")
    public WebElement SNText;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[2]")
    public WebElement ExamText;
    @FindBy(xpath = "(//*[@class=\"sorting\"])[3]")
    public WebElement DescriptionText;
    @FindBy(xpath = "//*[@class=\"text-right noExport sorting\"]")
    public WebElement ActionText;
    @FindBy(xpath = "(//*[@class=\"fa fa-eye\"])[1]")
    public WebElement ViewButton;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example1']//th")
    public List<WebElement> examDetailHeaders;
    @FindBy(xpath = "//*[@id=\"tabledata\"]")
    public WebElement sinavDetayFormu;



}
