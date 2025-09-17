package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

    public static WebDriver driver;

    public static String username = "standard_user";
    public static String password = "secret_sauce";


    public void setDriver(WebDriver driver) { BasePage.driver = driver; }

    protected WebElement find(By locator) { return driver.findElement(locator); }

    protected void set(By locator, String value) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    protected void click(By locator) { find(locator).click(); }

}