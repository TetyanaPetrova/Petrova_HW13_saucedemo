package uitests;

import com.saucedemo.uitests.pages.HomePage;
import com.saucedemo.uitests.pages.ListOfProductPage;
import com.saucedemo.uitests.pages.Login;
import com.saucedemo.uitests.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLoginWithPO extends BaseTest {


    @Test(priority = 1)
    public void testSuccessLogin() {
        driver.get("https://www.saucedemo.com/v1/index.html");
        Login objLogin = new Login(driver);
        objLogin.login("standard_user", "secret_sauce");
        HomePage objHomePage = new HomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageHeaderText().toLowerCase().contains("products"));
    }




}
