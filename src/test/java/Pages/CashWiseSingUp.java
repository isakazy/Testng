package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashWiseSingUp {
    public CashWiseSingUp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    ///*** SING UP ***///
    @FindBy(xpath = "(//button[.='Sign up'])[1]")
    public WebElement singUoButton;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement singUpEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement singUpPasswordInput;

    @FindBy(xpath = "//input[@name='repeat_password']")
    public WebElement singUpPasswordRepeat;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement singUpButtonContinue;


    ///***SING UP STEP TWO ***///

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement singUpStepTwoNameInput;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement singUpStepTwoLastNameInput;

    @FindBy(xpath = "//input[@name='company_name']")
    public WebElement singUpStepTwoCompanyNameInput;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement singUpStepTwoAddressInput;

    @FindBy(xpath = "//div[@id='mui-component-select-currency']")
    public WebElement singUpStepTwoCurrencyOption;

    @FindBy(xpath = "//ul/li[1]")
    public WebElement singUpStepTwoKGcurrency;

    @FindBy(xpath = "//ul/li[2]")
    public WebElement singUpStepTwoUScurrency;

    @FindBy(xpath = "(//button[.='Sign up'])[3]")
    public WebElement singUpStepTwoSingUpButton;


}