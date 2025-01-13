package pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherExaminationPage {
    public TeacherExaminationPage() {
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//*[@placeholder='Username']")

    public WebElement teacherUserNameButton;

    @FindBy(xpath = "//input[@type='password']")

    public WebElement teacherPasswordButton;

    @FindBy (xpath = "//button[@type='submit']")

    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[2]/a/span")

    public WebElement examinationsBar;

    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/admin/examgroup'])[2]")
    public WebElement examGroupBar;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameSection;

    @FindBy(xpath = "//select[@name='exam_type']")
    public WebElement dropdownExamType;

    @FindBy(xpath = "(//*[@for='exampleInputEmail1'])[3]")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "(//*[@type='submit'])[3]")

    public WebElement submitButton;

    @FindBy(xpath = "//*[@class='box-title']")
    public WebElement ExamGroupPage;


    @FindBy(xpath = "//*[@class='alert alert-success text-left']")

    public WebElement successNewExamMessage;


    @FindBy(xpath = "//*[@class='box-title titlefix']")
    public  WebElement examGrupListYazisi;

    @FindBy (xpath = "//*[@id='description']")
    public WebElement  descriptionArea;

    @FindBy (xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement addButton; //under action section

    @FindBy(xpath = "the //*[@class='box-title titlefix']")
    public WebElement  directingExamList ; //  after clicks add(+) button under actions


    //edit exam group page
    @FindBy (xpath = "(//i[@class='fa fa-pencil'])[1]")
    public WebElement editbutton; // under action section

    @FindBy(xpath = "//input[@class='form-control'])[1]")
    public WebElement editNameArea;

    // delete exam group
    @FindBy (xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement deletebutton;

    @FindBy (xpath = "//*[@class='alert alert-success text-left']")
    public WebElement confirmDeleteExamGroup;
}

