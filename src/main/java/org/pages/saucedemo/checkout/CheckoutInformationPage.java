package org.pages.saucedemo.checkout;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.pages.BasePage;

public class CheckoutInformationPage extends BasePage {

    private final By checkoutInformationHeader = By.cssSelector("[data-test='title']");

    private final By continueCheckoutButton = By.id("continue");

    private final By formErrorPopup = By.className("error-button");

    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");

    public Boolean isCheckoutTitleBannerPreset() {
        return find(checkoutInformationHeader).isDisplayed();
    }


    public Boolean isFormErrorPopupPresent() {
        return find(formErrorPopup).isDisplayed();
    }


    public void setFirstNameFieldValue(String firstName) {
        set(firstNameField, firstName);
    }

    public void setLastNameFieldValue(String lastName) {
        set(lastNameField, lastName);
    }

    public void setPostalCodeFieldValue(String postalCode) {
        set(postalCodeField, postalCode);
    }

    public void setCheckoutFormData(String firstName, String lastName, String postalCode) {
        setFirstNameFieldValue(firstName);
        setLastNameFieldValue(lastName);
        setPostalCodeFieldValue(postalCode);
    }

    public CheckoutOverviewPage clickCheckoutButton() {
        click(continueCheckoutButton);
        return new CheckoutOverviewPage();
    }

}
