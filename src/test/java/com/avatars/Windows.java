package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.avatars.utils.WebDriverUtils.driver;

public class Windows {
    
    public static void main(String[] args) {
        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        WebElement openWindowButton = driver.findElement(By.xpath("//button[contains(text(),'Open Window')]"));
        CommonMethods.scrollIntoView(openWindowButton);
        openWindowButton.click();
        CommonMethods.switchToNextWindow();
        driver.quit();
    }
}