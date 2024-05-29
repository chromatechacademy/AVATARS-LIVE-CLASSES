package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.avatars.utils.CommonMethods.driver;

public class AlertsAndModalDialogs {

    public static void main(String[] args) throws InterruptedException {

        CommonMethods.openChromeBrowser();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        WebElement alertButton = driver.findElement(By.xpath("//input[@value='Alert']"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", alertButton);
        Thread.sleep(2000);

        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement confirmButton = driver.findElement(By.xpath("//input[@value='Confirm']"));

        confirmButton.click();

        System.out.println("TEXT OF ALERT IS: " + alert.getText());
        alert.dismiss();
        Thread.sleep(3000);

        driver.quit();
    }

}
