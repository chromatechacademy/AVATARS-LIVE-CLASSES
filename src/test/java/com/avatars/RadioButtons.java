package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import static com.avatars.utils.CommonMethods.driver;

public class RadioButtons {

    public static void main(String[] args) {
        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        driver.findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();
        driver.quit();
    }
}