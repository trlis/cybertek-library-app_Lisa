package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="inputEmail")
    public WebElement EmailAddress;

    @FindBy(id="inputPassword")
    public WebElement Password;

    @FindBy(xpath="//button[.='Sign in']")
    public WebElement SignIn;

   public void logIn(){

       String lib59Username = ConfigurationReader.getProperty("lib59_username");
       String lib59Password = ConfigurationReader.getProperty("lib59_password");

       EmailAddress.sendKeys(lib59Username);
       Password.sendKeys(lib59Password);
       SignIn.click();
   }






}
