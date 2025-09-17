package saucedemo.tests.login;

import org.pages.saucedemo.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;

public class LoginValidUsernamePasswordTest extends BaseTest {

    @Test
    public void loginValidUsernamePasswordTest() {
        ProductsPage productsPage = loginPage.loginToApplication(username, password);
        Assert.assertTrue(productsPage.isHeaderPresent());
    }

}
