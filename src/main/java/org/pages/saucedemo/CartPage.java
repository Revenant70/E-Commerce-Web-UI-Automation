package org.pages.saucedemo;

import org.openqa.selenium.By;
import org.pages.BasePage;
import org.pages.saucedemo.checkout.CheckoutInformationPage;
import org.pages.saucedemo.checkout.CheckoutOverviewPage;

public class CartPage extends BasePage {

    private final By checkoutCartButton = By.id("checkout");


    public Boolean isBackpackRemoveButtonPresent(String backpackRemoveButton) {
        return driver.findElement(By.id(backpackRemoveButton)).isDisplayed();
    }

    public int doesCartHaveMultipleProducts() {
        return driver.findElements(By.cssSelector(".cart_item")).size();
    }

    public CheckoutInformationPage clickCheckoutCartButton() {
        click(checkoutCartButton);
        return new CheckoutInformationPage();
    }

}
