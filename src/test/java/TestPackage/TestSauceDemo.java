package TestPackage;

import Pages.SauceDemo;
import Utilities.Config;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSauceDemo {
    SauceDemo sauceDemo = new SauceDemo();
    @Test
    public void Test1(){
        Driver.getDriver().get(Config.getValue("sauceDemo"));
        sauceDemo.userInput.sendKeys("standard_user");
        sauceDemo.passInput.sendKeys("secret_sauce");
        String oldUrl = Driver.getDriver().getCurrentUrl();
        sauceDemo.button.click();
        Assert.assertNotEquals(oldUrl, Driver.getDriver().getCurrentUrl());

       for(int i = 0; i < sauceDemo.listOfButtons.size() - 1; i ++ ) {
           sauceDemo.listOfButtons.get(i).click();

       }
        System.out.println(sauceDemo.listOfButtons.size());
    }
}
