package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import static com.avatars.utils.CommonMethods.driver;

public class HardAssertPractice {

    public static void main(String[] args) {
        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Chroma Tech Academylkjh;lkjh";
        CommonMethods.assertEquals(actualPageTitle, expectedPageTitle);
        String actualHeaderText = driver.findElement(By.xpath("//h1[normalize-space()='Chroma Tech Academy Selenium Practice']")).getText();
        CommonMethods.assertEquals(actualHeaderText, "Chroma Tech Academy Selenium Practice!!!!!");
        driver.quit();
    }
}
