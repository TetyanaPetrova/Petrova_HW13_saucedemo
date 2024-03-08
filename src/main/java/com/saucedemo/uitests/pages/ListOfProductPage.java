package com.saucedemo.uitests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfProductPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement product1;

    @FindBy(xpath = "//a[@id='item_4_title_link']/../../div/div[@class='inventory_item_price']")
    WebElement price1;

    @FindBy(css = "a#item_4_title_link>div")
    WebElement goButton;
    @FindBy(css=".product_label")
    WebElement productsAll;
    public ListOfProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickGo() {
        goButton.click();
    }

     public String getProduct1List(){
        return product1.getText();
    }
    public String getPrice1List(){
        return price1.getText();
    }
    public void Product(){
        this.getProduct1List();
        this.getPrice1List();
        this.clickGo();
    }
    public String getProductsAll(){
        return productsAll.getText();
    }
}
