package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.avatars.utils.CommonMethods.driver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        WebElement iFrameExampleText = driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        CommonMethods.scrollIntoView(iFrameExampleText);

        //driver.switchTo().frame(0); // switch by index
        //driver.switchTo().frame("courses-iframe"); // switch by name or id

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));

        WebElement enrollNowButton = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[1]"));
        enrollNowButton.click();

        // get out of the frame

        driver.switchTo().defaultContent();

        // then scroll to the top of the page and click on Home
        WebElement newElement = driver.findElement(By.xpath("//button[normalize-space()='Home']"));
        CommonMethods.scrollIntoView(newElement);
        newElement.click();
        driver.quit();
    }
}