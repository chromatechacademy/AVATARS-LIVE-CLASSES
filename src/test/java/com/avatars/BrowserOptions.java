package com.avatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOptions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

}
