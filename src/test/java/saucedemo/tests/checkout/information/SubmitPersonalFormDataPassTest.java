package saucedemo.tests.checkout.information;

import org.pages.saucedemo.checkout.CheckoutInformationPage;
import org.pages.saucedemo.checkout.CheckoutOverviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;

public class SubmitPersonalFormDataPassTest extends BaseTest {

    @Test
    public void submitPersonalFormDataTest(){
        loginPage.loginToApplication(username, password);
        productsPage.goToCartPage();
        CheckoutInformationPage checkoutInformationPage = cartPage.clickCheckoutCartButton();
        checkoutInformationPage.setCheckoutFormData(firstName, lastName, postalCode);
        CheckoutOverviewPage checkoutOverviewPage = checkoutInformationPage.clickCheckoutContinueButton();
        Assert.assertTrue(checkoutOverviewPage.isCheckoutTitlePresent());
    }

}
