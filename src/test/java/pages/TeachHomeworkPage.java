package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class TeachHomeworkPage {
    public TeachHomeworkPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@type =('text')]")
    public WebElement LogBox;

    @FindBy(xpath = "//*[@type = ('password')]")
    public WebElement passBox;

    @FindBy(xpath = "//*[@type = ('submit')]")
    public WebElement SubButton;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[8]/a/i[1]")
    public WebElement HomeCon;
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[8]/ul/li[1]/a")
    public WebElement HomeWb;
    @FindBy (xpath ="//*[@class=\"box-title\"]" )
    public WebElement BoxTitle;

    @FindBy (xpath = "//*[@id='searchclassid']")
    public WebElement class11;
    @FindBy (xpath = "//*[@id=\"searchclassid\"]/option[12]")
    public WebElement no11;

    @FindBy (xpath = "//*[@id=\"secid\"]/option[5]")
    public WebElement sectionAA;


    //*[@id="searchclassid"]/option[2]

    //*[@id="secid"]/option[5]
    //*[@id="searchclassid"]/option[2]
    @FindBy (xpath = "//*[@id=\"subject_group_id\"]")
    public WebElement subjeGrup;


    @FindBy (xpath = "//*[@id=\"subid\"]")
    public WebElement SubEng;

    @FindBy (xpath = "//*[@class =\"btn btn-primary btn-sm checkbox-toggle pull-right\"]")
    public WebElement searchButton;



    @FindBy (xpath = "//*[@id=\"evaluation_details\"]")
    public WebElement Evaluate;

    @FindBy (xpath = "//*[@class=\"tooltip fade top in\"]")
    public WebElement EvaluateButton;

    @FindBy (xpath = "//*[@class=\"btn btn-default btn-xs\"][1]")
    public WebElement EvaluateR;

    @FindBy (xpath = "//*[@class=\"fa fa-pencil\"][1]")
    public WebElement EditButton;

    @FindBy (xpath = "//*[@id=\"formadd\"]/div[1]/div/div/div/div[9]/div/iframe")
    public WebElement word;
    @FindBy (xpath = "//*[@id=\"submit\"]")
    public WebElement saveB;
    @FindBy (xpath = "//*[@class=\"toast-message\"]")
    public WebElement ToastM;
    //*[@class="toast-message"]

    @FindBy (xpath = "//*[@class=\"alert alert-success text-left\"]")
    public WebElement deletedSucces;
    @FindBy (xpath = "//*[@href=\"https://qa.wonderworldcollege.com/homework/delete/1009\"]")
    public WebElement deleteButton;



    @FindBy (xpath = "//*[@class=\"form-control modal_class_id\"]")
    public  WebElement Class11;
    @FindBy (xpath = "//*[@name=\"modal_section_id\"]")
    public WebElement SectionA;
    @FindBy (xpath = "//*[@name=\"modal_subject_group_id\"]")
    public  WebElement SubG;
    @FindBy (xpath = "//*[@name=\"modal_subject_id\"]")
    public WebElement Ng1;
    @FindBy (xpath = ("//*[@name=\"homework_date\"]"))
    public WebElement ilkDATE;
    @FindBy (xpath = "(//*[@class=\"day\"])[20]")
    public WebElement Date1;
    @FindBy (xpath = "//*[@value=\"17/01/2025\"]")
    public WebElement Date2;
    @FindBy (xpath = "//*[@id=\"homework_marks\"]")
    public WebElement notes;
    @FindBy (xpath = "//*[@class=\"wysihtml5-sandbox\"]")
    public WebElement Descrip;
    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElement SaveG;

    @FindBy (xpath = "//*[@class=\"fa fa-plus\"]")
    public WebElement add5;

    @FindBy (xpath = "//[@class=\"toast-message\"]")
    public WebElement Succsflyy;



    @FindBy (xpath = "//*[@class=\"closed-exam\"]")
    public WebElement Close;
    @FindBy(xpath = "//*[@href=\"#tab_1\"]")
    public WebElement Upcom;

    @FindBy(xpath = "//*[@name=\"checkAll\"]")
    public WebElement All;
    @FindBy (xpath = "//*[@id=\"delete_btn_id\"]")
    public WebElement Dledet;






















}
