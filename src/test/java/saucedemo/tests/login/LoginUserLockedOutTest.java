package saucedemo.tests.login;

import org.junit.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;

public class LoginUserLockedOutTest extends BaseTest {

    @Test
    public void login(){
        loginPage.setUsername("locked_out_user");
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Sorry, this user has been locked out."));
    }
}
