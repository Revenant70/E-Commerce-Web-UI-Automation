package saucedemo.tests.cart;

import org.pages.saucedemo.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;

public class AddMultipleProductsToCartTest extends BaseTest {

    @Test
    public void addMultipleProductsToCartTest() {
        loginPage.loginToApplication(username, password);
        productsPage.addProductToCart("add-to-cart-sauce-labs-backpack");
        productsPage.addProductToCart("add-to-cart-sauce-labs-bike-light");
        CartPage cartPage = productsPage.goToCartPage();
        Assert.assertEquals(cartPage.doesCartHaveMultipleProducts(), 2, "Cart item count mismatch!");
    }
}
