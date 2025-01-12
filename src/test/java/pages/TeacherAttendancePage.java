package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherAttendancePage {

    public TeacherAttendancePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//*[@class=\"fa fa-search\"])[3]")
    public WebElement perAttDateTitleText;






}
