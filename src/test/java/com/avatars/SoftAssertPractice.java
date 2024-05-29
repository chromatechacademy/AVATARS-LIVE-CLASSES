package com.avatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://chromatechacademy.net/selenium-practice/";
        driver.get(url);

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
