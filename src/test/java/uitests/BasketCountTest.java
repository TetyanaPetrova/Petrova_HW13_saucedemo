package uitests;

import com.saucedemo.uitests.pages.ListOfProductPage;
import com.saucedemo.uitests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketCountTest extends TestLoginWithPO{

    @Test
    public void basketCountTest() {

        driver.get("https://www.saucedemo.com/v1/inventory.html");
        ListOfProductPage objProd1 = new ListOfProductPage(driver);
        ProductPage objProd = new ProductPage(driver);
        objProd1.clickGo();
        objProd.clickAdd();
        Assert.assertTrue(objProd.getBasketCount().toLowerCase().contains("1"));


    }
}
