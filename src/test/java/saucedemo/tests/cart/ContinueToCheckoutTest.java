package saucedemo.tests.cart;

import org.pages.saucedemo.checkout.CheckoutInformationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;

public class ContinueToCheckoutTest extends BaseTest {

    @Test
    public void continueToCheckout(){
        loginPage.loginToApplication(username, password);
        productsPage.goToCartPage();
        CheckoutInformationPage checkoutInformationPage = cartPage.clickCheckoutCartButton();
        Boolean isCurrentPageCheckoutInformation = checkoutInformationPage.isCheckoutTitleBannerPreset();
        Assert.assertTrue(isCurrentPageCheckoutInformation);
    }

}
