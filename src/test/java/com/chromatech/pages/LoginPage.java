package com.chromatech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextBox;

}
