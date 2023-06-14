package TestPackage;

import Pages.CashWiseSingUp;
import Utilities.Config;
import Utilities.Driver;
import org.testng.annotations.Test;

public class TestCashWiseClass {
    CashWiseSingUp cashWiseSingUp = new CashWiseSingUp();

    @Test
    public void test1(){
        Driver.getDriver().get(Config.getValue("studymate"));
     /*
     sakydin.tashmurzaev.kk@gmail.com
     Codewise2023@!
      */
    }
}
