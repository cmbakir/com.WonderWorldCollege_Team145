package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ParentPage {

    public ParentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





}
