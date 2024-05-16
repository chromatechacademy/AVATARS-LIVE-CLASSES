package com.avatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetCurrentURL {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        String actualText = driver.getTitle();

        System.out.println("TITLE OF THE PAGE IS: " + actualText);

        String actualURL = driver.getCurrentUrl();

        System.out.println("URL OF PAGE IS: " + actualURL);

        WebElement actualHeaderText = driver.findElement(By.xpath("//h1[contains(text(),'Chroma')]"));

        System.out.println("HEADER TEXT IS: " + actualHeaderText.getText());

        // Home button
        WebElement firstButtonText = driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        System.out.println("Text of Home button is: " + firstButtonText.getText());
        // Practice button
        WebElement secondButtonText = driver.findElement(By.xpath("//button[contains(text(),'Practice')]"));
        System.out.println("Text of Practice button is: " + secondButtonText.getText());
        // Login button
        WebElement thirdButtonText = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        System.out.println("Text of Login button is: " + thirdButtonText.getText());
        // Signup button
        WebElement fourthButtonText = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
        System.out.println("Text of Signup button is: " + fourthButtonText.getText());
    }
}
