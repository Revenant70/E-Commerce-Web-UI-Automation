package org.pages.saucedemo.checkout;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.pages.BasePage;

public class CheckoutInformationPage extends BasePage {

    private final By checkoutInformationHeader = By.cssSelector("[data-test='title']");

    public Boolean isCheckoutTitleBannerPreset() {
        return find(checkoutInformationHeader).isDisplayed();
    }

}
