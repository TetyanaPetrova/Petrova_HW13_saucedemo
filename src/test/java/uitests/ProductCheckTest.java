package uitests;

import com.saucedemo.uitests.pages.ListOfProductPage;
import com.saucedemo.uitests.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductCheckTest extends TestLoginWithPO {

    @Test
    public void productCheckTest()  {
       // WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/v1/inventory.html");

        ListOfProductPage objProd1 = new ListOfProductPage(driver);
//        objProd1.getFirstProduct();
//        objProd1.Product();
//        //webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='item_4_title_link']/../../div/div[@class='inventory_item_price']")));
//        ProductPage objProd = new ProductPage(driver);

        Assert.assertEquals(objProd1.getFirstProductName(), "Sauce Labs Backpack");

        Assert.assertEquals(objProd1.getFirstProductPrice(), "29.99");
    }
}
