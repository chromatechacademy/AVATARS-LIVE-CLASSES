package com.avatars;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        WebElement openTabButton = driver.findElement(By.xpath("//a[contains(text(),'Open Tab')]"));

        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", openTabButton);
        Thread.sleep(2000);

        String mainWindowHandle = driver.getWindowHandle();

        openTabButton.click();

        System.out.println("NEW WINDOW TITLE: " + driver.getTitle());

        Set<String> allWindows = driver.getWindowHandles();
        for(String window : allWindows){
            driver.switchTo().window(window);
            System.out.println("HANDLES OF WINDOWS: " + window.toString());
        }

        System.out.println("NEW WINDOW TITLE: " + driver.getTitle());

        driver.switchTo().window(mainWindowHandle);

        System.out.println("SWITCHING BACK TO MAIN WINDOW: " + driver.getTitle());
        
    }
    
}
