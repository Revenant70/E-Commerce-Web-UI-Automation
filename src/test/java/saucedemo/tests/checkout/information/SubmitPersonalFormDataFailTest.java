package saucedemo.tests.checkout.information;

import org.pages.saucedemo.checkout.CheckoutInformationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;

public class SubmitPersonalFormDataFailTest extends BaseTest {

    @Test
    public void submitPersonalFormDataFailTest(){
        loginPage.loginToApplication(username, password);
        productsPage.goToCartPage();
        CheckoutInformationPage checkoutInformationPage = cartPage.clickCheckoutCartButton();
        System.out.println(getCurrentURl());
        checkoutInformationPage.setCheckoutFormData(firstName, lastName, "");
        checkoutInformationPage.clickCheckoutContinueButton();
        Assert.assertTrue(checkoutInformationPage.isFormErrorPopupPresent());
    }

}
