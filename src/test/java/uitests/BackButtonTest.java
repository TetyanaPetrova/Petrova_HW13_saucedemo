package uitests;

import com.saucedemo.uitests.pages.ListOfProductPage;
import com.saucedemo.uitests.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackButtonTest extends TestLoginWithPO {
    @Test
    public void backButtonTest() {

        driver.get("https://www.saucedemo.com/v1/inventory.html");
        ListOfProductPage objProd1 = new ListOfProductPage(driver);
        ProductPage objProd = new ProductPage(driver);
        objProd1.clickGo();
        objProd.clickBack();
        Assert.assertTrue(objProd1.getProductsAll().toLowerCase().contains("products"));


    }


}
