package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.avatars.utils.WebDriverUtils.driver;

public class Tabs {

    public static void main(String[] args) {
        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        WebElement openTabButton = driver.findElement(By.xpath("//a[contains(text(),'Open Tab')]"));
        CommonMethods.scrollIntoView(openTabButton);
        String mainWindowHandle = driver.getWindowHandle();
        openTabButton.click();
        System.out.println("NEW WINDOW TITLE: " + driver.getTitle());
        CommonMethods.switchToNextWindow();
        System.out.println("NEW WINDOW TITLE: " + driver.getTitle());
        driver.switchTo().window(mainWindowHandle);
        System.out.println("SWITCHING BACK TO MAIN WINDOW: " + driver.getTitle());
        driver.quit();
    }
}