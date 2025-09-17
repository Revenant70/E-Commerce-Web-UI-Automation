package saucedemo.tests.login;

import org.junit.Assert;
import org.testng.annotations.Test;
import saucedemo.BaseTest;

public class LoginInvalidUsernamePasswordTest extends BaseTest {

    @Test
    public void login(){
        loginPage.loginToApplication(username, password);
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Username and password do not match any user in this service"));
    }
}
