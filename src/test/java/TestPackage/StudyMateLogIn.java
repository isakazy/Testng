package TestPackage;

import Pages.StudyMate;
import Utilities.ApplicationFlow;
import Utilities.Config;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Date;

public class StudyMateLogIn {
    StudyMate studyMate = new StudyMate();
    LocalDate currentDate = LocalDate.now();
    Faker faker = new Faker();
    @Test
    public void test1(){
        Driver.getDriver().get(Config.getValue("studymate"));
        studyMate.emailInput.sendKeys(Config.getValue("studymateEmail"));
        studyMate.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        String currantUrl = Driver.getDriver().getCurrentUrl();
        studyMate.logInButton.click();
        ApplicationFlow.pause(1000);
        Assert.assertNotEquals(currantUrl, Driver.getDriver().getCurrentUrl());

    }

    @Test
    public void createGroupsTest(){
        Driver.getDriver().get(Config.getValue("studymate"));
        studyMate.emailInput.sendKeys(Config.getValue("studymateEmail"));
        studyMate.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studyMate.logInButton.click();
        studyMate.groupsButton.click();
        studyMate.createGroupsButton.click();
        String groupName = faker.lordOfTheRings().character() + System.currentTimeMillis();
        studyMate.inputGroupName.sendKeys(groupName);
        studyMate.inputGroupDescription.sendKeys(faker.lordOfTheRings().location() + System.currentTimeMillis());
        studyMate.inputDateOfGroup.click();
        studyMate.inputDateOfGroup.sendKeys(currentDate.toString());
        studyMate.createButton.click();
        String xpath = "//div[.='" + groupName + "']";
        WebElement createGroup = Driver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(createGroup.isDisplayed());


    }
}