package org.pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.BasePage;

import java.util.List;

public class CartPage extends BasePage {

    private final By cartHeader = By.className("title");

    public Boolean isHeaderPresent() {
        return driver.findElement(cartHeader).isDisplayed();
    }

    public Boolean isBackpackRemoveButtonPresent(String backpackRemoveButton) {
        return driver.findElement(By.id(backpackRemoveButton)).isDisplayed();
    }

    public int doesCartHaveMultipleProducts() {
        return driver.findElements(By.cssSelector(".cart_item")).size();
    }

}
