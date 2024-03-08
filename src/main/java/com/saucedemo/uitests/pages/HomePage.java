package com.saucedemo.uitests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='inventory_filter_container']/div")
    WebElement homePageHeaderText;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
        public String getHomePageHeaderText(){
            return homePageHeaderText.getText();
        }

}