package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CTSMS_Login {

    public static void main(String[] args) {
        
        // 1. Instantiate chrome browser, maximize window, delete all cookies
        // 2. enter username and password using locators of your choice
        // 3. log in

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chroma.mexil.it/site/login");
        CommonMethods.driver.quit();
    }
}
