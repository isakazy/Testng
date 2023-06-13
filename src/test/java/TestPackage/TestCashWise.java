package TestPackage;

import Pages.CashWiseMainPage;
import Pages.CashWiseSingIn;
import Pages.CashWiseSingUp;
import Utilities.ApplicationFlow;
import Utilities.Config;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class TestCashWise {
    CashWiseSingUp cashWiseSingUp = new CashWiseSingUp();
    CashWiseSingIn cashWiseSingIn = new CashWiseSingIn();
    CashWiseMainPage cashWiseMainPage = new CashWiseMainPage();
    Faker faker = new Faker();
    @Test
    public void test1(){
        Driver.getDriver().get(Config.getValue("cashwise"));
        cashWiseSingUp.singUoButton.click();
        cashWiseSingUp.singUpEmailInput.sendKeys(faker.internet().emailAddress());
        cashWiseSingUp.singUpPasswordInput.sendKeys("isakazy");
        cashWiseSingUp.singUpPasswordRepeat.sendKeys("isakazy");
        cashWiseSingUp.singUpButtonContinue.click();

        cashWiseSingUp.singUpStepTwoNameInput.sendKeys(faker.lordOfTheRings().character());
        cashWiseSingUp.singUpStepTwoLastNameInput.sendKeys(faker.lordOfTheRings().character());
        cashWiseSingUp.singUpStepTwoAddressInput.sendKeys(faker.address().fullAddress());
        cashWiseSingUp.singUpStepTwoCompanyNameInput.sendKeys(faker.company().name());
        cashWiseSingUp.singUpStepTwoCurrencyOption.click();
        cashWiseSingUp.singUpStepTwoUScurrency.click();
        cashWiseSingUp.singUpStepTwoSingUpButton.click();

        Driver.quit();

        ///** Address select is not working

    }
    @Test
    public void test2(){
     Driver.getDriver().get(Config.getValue("cashwise"));
            cashWiseSingIn.singInButton.click();
            cashWiseSingIn.emailInput.sendKeys(faker.internet().emailAddress());
            cashWiseSingIn.passwordInput.sendKeys(faker.internet().password());
            cashWiseSingIn.singInSingInButton.click();
            cashWiseSingIn.forgotPasswordLink.click();
            cashWiseSingIn.forgotPassWordEmailInput.sendKeys(faker.internet().emailAddress());
            cashWiseSingIn.resetPasswordRequestButton.click();
            Driver.quit();
        }

        @Test
    public void Test3(){
        Driver.getDriver().get(Config.getValue("cashwise"));
        cashWiseMainPage.contactUsNameInput.sendKeys(faker.harryPotter().character());
        cashWiseMainPage.contactUsEmailInput.sendKeys(faker.internet().emailAddress());
        cashWiseMainPage.contactUsPhoneInput.sendKeys("702832639");
        cashWiseMainPage.contactUsSandButton.click();


        }
    }

