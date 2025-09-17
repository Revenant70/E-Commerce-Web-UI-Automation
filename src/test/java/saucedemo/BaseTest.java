package saucedemo;

import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.BasePage;
import org.pages.saucedemo.CartPage;
import org.pages.saucedemo.LoginPage;
import org.pages.saucedemo.ProductsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends BasePage {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    private String url = "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();

        basePage.setDriver(driver);
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
        cartPage = new CartPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
