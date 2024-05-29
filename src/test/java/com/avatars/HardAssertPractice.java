package com.avatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class HardAssertPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://chromatechacademy.net/selenium-practice/";
        driver.get(url);

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Chroma Tech Academylkjh;lkjh";


        try{
            Assert.assertEquals(actualPageTitle, expectedPageTitle);
        }catch(AssertionError e){
            e.printStackTrace();
        }

       String actualHeaderText = driver.findElement(By.xpath("//h1[normalize-space()='Chroma Tech Academy Selenium Practice']")).getText();

       try{
           Assert.assertEquals(actualHeaderText, "Chroma Tech Academy Selenium Practice!!!!!");
       } catch(Throwable e){
           e.printStackTrace();
       }

        driver.quit();
    }
}
