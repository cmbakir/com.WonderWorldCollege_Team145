package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminChatPage {

    public AdminChatPage() {PageFactory.initElements(Driver.getDriver(), this);}

    // Admin Dashboard

    @FindBy(xpath = "(//*[@class='fa fa-whatsapp'])[2]")
    public WebElement iconAdminChat;


    // Chat Section General

    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement alertSuccess;

    // Chat Section Add Contact

    @FindBy(xpath = "//*[@id='addcontact']")
    public WebElement addContactButton;

    @FindBy(xpath = "//*[@class='search-query form-control']")
    public WebElement inputAddContactSearch;

    @FindBy(xpath = "(//*[@class='list-group-item'])[1]")
    public WebElement rowAddContactFirstResult;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement addContactAddButton;


    // Chat Section Left Bar

    @FindBy(xpath = "(//*[@class='contact']) [1]")
    public WebElement firstChatButton;

    @FindBy(xpath = "(//*[@class='chatbadge notification_count']) [1]")
    public WebElement iconFirstNotification;


    // Chat Section Message Area

    @FindBy(xpath = "//*[@class='messages']")
    public WebElement messagesArea;

    @FindBy(xpath = "//*[@class='chat_input']")
    public WebElement inputChat;

    @FindBy(xpath = "//*[@class='submit input_submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[@class='replies'])[1]")
    public WebElement labelFirstMessage;

}
