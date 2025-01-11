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

      public WebElement ExamTypeMenu;

      @FindBy(xpath = "(//*[@for='exampleInputEmail1'])[3]")
      public WebElement descriptionTextBox;

      @FindBy(xpath = "(//*[@type='submit'])[3]")

      public WebElement submitButton;

      @FindBy(xpath = "//*[@class='box-title']")
      public WebElement ExamGroupPage;
    }

