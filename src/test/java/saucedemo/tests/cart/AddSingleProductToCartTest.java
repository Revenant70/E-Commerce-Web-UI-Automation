package saucedemo.tests.cart;

import org.pages.saucedemo.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;


public class AddSingleProductToCartTest extends BaseTest {

    @Test
    public void addToCartSingle() {
        loginPage.loginToApplication(username, password);
        productsPage.addProductToCart("add-to-cart-sauce-labs-backpack");
        CartPage cartPage = productsPage.goToCartPage();
        Assert.assertTrue(cartPage.isBackpackRemoveButtonPresent("remove-sauce-labs-backpack"));
    }

}
