package com.avatars.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    /**
     * Opens a Chrome browser and navigates to the specified URL.
     *
     * This method initializes a new instance of the ChromeDriver, maximizes the browser window,
     * deletes all cookies, sets the implicit wait timeout to 10 seconds, and navigates to the
     * specified URL.
     *
     * @param url the URL to navigate to
     */
    public static void openChromeBrowserAndNavigateToSite(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    /**
     * Scrolls the webpage to bring the specified element into view.
     *
     * This method uses JavaScript executor to scroll the webpage so that the specified element
     * is brought into view. It sets the "scrollIntoView" property of the element to "true".
     *
     * @param element the WebElement to scroll into view
     */
    public static void scrollIntoView(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
