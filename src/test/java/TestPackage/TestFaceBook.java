package TestPackage;

import Utilities.Config;
import Utilities.Driver;
import org.testng.annotations.Test;


public class TestFaceBook {
    @Test
    public void test1(){
        Driver.getDriver().get(Config.getValue("faceBook"));
        System.out.println("testing git ");
    }
}
