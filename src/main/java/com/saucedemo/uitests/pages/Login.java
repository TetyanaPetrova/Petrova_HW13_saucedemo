package com.saucedemo.uitests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    @FindBy(name = "user-name")
    WebElement inputUserName;

    @FindBy(name = "password")
    WebElement inputPassword;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public Login(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String strUserName) {
        inputUserName.sendKeys(strUserName);
    }

    //Set password
    public void setPassword(String strPassword) {
        inputPassword.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin() {
        loginButton.click();
    }

    public void login(String strUserName, String strPasword) {
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();
    }
}
