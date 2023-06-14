package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyMate {
   public StudyMate(){
       PageFactory.initElements(Driver.getDriver(), this );
   }

   //***LOG IN//**
   @FindBy (xpath = "//input[@name='email']")
    public WebElement emailInput;

   @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

   @FindBy(xpath = "//button[@type='submit']")
    public WebElement  logInButton;

   //**MAIN PAIGE//**

    @FindBy (xpath = "//li[.='Teachers']")
    public WebElement teacherButton;

    @FindBy (xpath = "//li[.='Groups']")
    public WebElement groupsButton;

    @FindBy(xpath = "//button[.='Create group']")
    public WebElement createGroupsButton;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputGroupName;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement inputGroupDescription;

    @FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
    public WebElement inputDateOfGroup;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createButton;

}
