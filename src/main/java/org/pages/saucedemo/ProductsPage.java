package org.pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.BasePage;

public class ProductsPage extends BasePage {


    private final By productHeader = By.className("title");
    private final By cartField = By.className("shopping_cart_link");


    public Boolean isHeaderPresent() {
        return driver.findElement(productHeader).isDisplayed();
    }

    public void addProductToCart(String productId){
        click(By.id(productId));
    }

    public CartPage goToCartPage() {
        click(cartField);
        return new CartPage();
    }



}
