package com.chromatech.pages;

import com.avatars.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    /* USERNAME TEXT BOX */
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextBox;

    /* PASSWORD TEXT BOX */
    @FindBy(xpath = "//input[@id='form-password']")
    public WebElement passwordTextBox;

    /* SIGN IN BUTTON */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    public LoginPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}