package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashWiseSingIn {

    public CashWiseSingIn(){
        PageFactory.initElements(Driver.getDriver(),this );
    }
    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement singInButton;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailInput;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "(//button[.='Sign in'])[2]")
    public WebElement singInSingInButton;


    @FindBy(xpath = "//span[.='Forgot password?']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement forgotPassWordEmailInput;

    @FindBy(xpath = "(//button)[5]")
    public WebElement resetPasswordRequestButton;
}
