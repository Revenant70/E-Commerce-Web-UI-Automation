package org.pages.saucedemo.checkout;

import org.openqa.selenium.By;
import org.pages.BasePage;

public class CheckoutOverviewPage extends BasePage {

        private final By checkoutTitleOverviewField = By.cssSelector("[data-test='title']");

        public Boolean isCheckoutTitlePresent() {
            return find(checkoutTitleOverviewField).isDisplayed();
        }
}
