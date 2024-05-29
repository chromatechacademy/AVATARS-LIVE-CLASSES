package com.avatars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://chromatechacademy.net/selenium-explicit-wait-practice/";

        driver.get(url);

        WebElement alertButton = driver.findElement(By.xpath("//button[normalize-space()='Click me to open an Alert after 5 seconds']"));

        alertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        // HANDLING ALERT
        driver.switchTo().alert().accept();

        // WAITING FOR SELENIUM TEXT TO DISPLAY
        WebElement seleniumTextButton = driver.findElement(By.xpath("//button[normalize-space()='Change Text to Selenium Webdriver']"));
        seleniumTextButton.click();
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2[@class='target-text']")),"Selenium Webdriver" ));

        // WAITING FOR BUTTON TO DISPLAY
        WebElement displayButton = driver.findElement(By.xpath("//button[normalize-space()='Display button after 10 seconds']"));
        displayButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Enabled']")));

        // CHECK CHECKBOX AFTER TEN SECONDS
        WebElement checkbox = driver.findElement(By.xpath("//button[normalize-space()='Check Checkbox after 10 seconds']"));
        checkbox.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));

        driver.quit();
    }
}
