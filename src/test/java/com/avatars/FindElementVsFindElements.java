package com.avatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        boolean flag = driver.findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-light']")).isDisplayed();
        System.out.println("IS DROPDOWN DISPLAYED: " + flag);

        List<WebElement> list = driver.findElements(By.xpath("//*[@value='asdfasdfasdfasdf']"));

        System.out.println("Number of elements found: " + list.size());


        Thread.sleep(3000);
        driver.quit();
    }
}