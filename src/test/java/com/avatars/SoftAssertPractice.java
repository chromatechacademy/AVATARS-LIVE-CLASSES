package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static com.avatars.utils.WebDriverUtils.driver;

public class SoftAssertPractice {

    public static void main(String[] args) {
        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Chroma Tech Academylkjh;lkjh";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualPageTitle, expectedPageTitle);
        String actualHeaderText = driver.findElement(By.xpath("//h1[normalize-space()='Chroma Tech Academy Selenium Practice']")).getText();
        softAssert.assertEquals(actualHeaderText, "Chroma Tech Academy Selenium Practice!!!!!");
        softAssert.assertAll();
        driver.quit();
    }
}