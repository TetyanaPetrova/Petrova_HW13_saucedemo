package com.saucedemo.uitests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    @FindBy(css = ".inventory_details_name")
    WebElement product;

    @FindBy(css = ".inventory_details_price")
    WebElement price;
@FindBy(css=".inventory_details_back_button")
WebElement backButton;

    @FindBy(xpath = "//*[@class='btn_primary btn_inventory']")
    WebElement addButton;

    @FindBy(css = "span[class^='fa-layers-counter']")
    WebElement basketCount;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public String getProduct1(){
        return product.getText();
    }
    public String getPrice1(){
        return price.getText();
    }
    public void clickBack() {
        backButton.click();
    }
    public void clickAdd() {
        addButton.click();
    }

    public String getBasketCount(){
        return basketCount.getText();
    }
}
