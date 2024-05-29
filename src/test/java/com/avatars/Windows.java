package com.avatars;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        WebElement openWindowButton = driver.findElement(By.xpath("//button[contains(text(),'Open Window')]"));
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", openWindowButton);
        Thread.sleep(2000);

        openWindowButton.click();

        Set<String> windows = driver.getWindowHandles();

        for(String window : windows){
            driver.switchTo().window(window);
        }

        Thread.sleep(2000);
        //driver.close();

        driver.quit();
    }

}
