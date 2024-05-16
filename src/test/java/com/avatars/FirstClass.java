package com.avatars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        
        String url = "https://chroma.mexil.it/site/login";
        // METHOD ONE TO NAVIGATE TO A WEBSITE 
       // driver.get(url);

       // METHOD TWO TO NAVIGATE TO A WEBSITE
        driver.navigate().to(url);
        Thread.sleep(3000);
        driver.navigate().refresh();
        
        // NAVIGATE TO GOOGLE.COM THEN NAVIGATE BACK
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();

    }
}
