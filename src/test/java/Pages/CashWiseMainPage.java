package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashWiseMainPage {
    public CashWiseMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactUsNameInput;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactUsPhoneInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement contactUsEmailInput;

    @FindBy(xpath = "//button[.='Send']")
    public WebElement contactUsSandButton;
}
