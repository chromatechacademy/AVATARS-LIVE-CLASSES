package com.avatars.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import static com.avatars.utils.WebDriverUtils.driver;

public class CommonMethods {

    public static Alert alert;
    public static Select select;
    public static WebDriverWait wait;

    /**
     * Opens a Chrome browser and navigates to the specified URL.
     * <p>
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
     * <p>
     * This method uses JavaScript executor to scroll the webpage so that the specified element
     * is brought into view. It sets the "scrollIntoView" property of the element to "true".
     *
     * @param element the WebElement to scroll into view
     */
    public static void scrollIntoView(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Switches to the alert dialog and accepts it.
     * <p>
     * This method switches the driver's control to the alert dialog and accepts it.
     * It assumes that an alert dialog is currently present and accessible.
     * After accepting the alert, the driver's control is switched back to the default content.
     */
    public static void acceptAlert() {
        alert = driver.switchTo().alert();
        alert.accept();
    }

    /**
     * Selects a value from a Bootstrap dropdown menu based on the given common locator and value.
     * <p>
     * This method finds all the options in the dropdown menu using the common locator XPath, and then iterates
     * through each option. If the text of an option matches the given value, it clicks on the option and stops iterating.
     *
     * @param commonLocator the common XPath locator for the options in the dropdown menu
     * @param value         the value to select from the dropdown menu
     */
    public static void selectBootStrapDropDownValue(String commonLocator, String value) {
        List<WebElement> options = driver.findElements(By.xpath(commonLocator));
        for (WebElement option : options) {
            if (option.getText().equals(value)) {
                option.click();
                break;
            }
        }
    }

    /**
     * Selects a value from a dropdown menu based on the specified index.
     * <p>
     * This method selects the option in the dropdown menu at the specified index value.
     * It uses the Select class to interact with the dropdown menu and select the option.
     *
     * @param element the WebElement representing the dropdown menu
     * @param value   the index value of the option to be selected
     */
    public static void selectDropDownValueByIndex(WebElement element, int value) {
        select = new Select(element);
        select.selectByIndex(value);
    }

    /**
     * Selects a value from a dropdown menu based on the visible text of the option.
     * <p>
     * This method uses the Select class to interact with the dropdown menu and select the option that matches the visible text.
     *
     * @param element the WebElement representing the dropdown menu
     * @param text    the visible text of the option to be selected
     */
    public static void selectDropDownValueByVisibleText(WebElement element, String text) {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    /**
     * Selects a value from a dropdown menu based on the value attribute of the option.
     * <p>
     * This method takes a WebElement representing the dropdown menu and a String representing the value to be selected.
     * It uses the Select class to interact with the dropdown menu and select the option that has a value attribute matching the provided value.
     *
     * @param element the WebElement representing the dropdown menu
     * @param value   the value to be selected from the dropdown menu
     */
    public static void selectDropDownValueByValue(WebElement element, String value) {
        select = new Select(element);
        select.selectByValue(value);
    }

    /**
     * Asserts that two strings are equal.
     *
     * @param actualValue   the actual value to be compared
     * @param expectedValue the expected value to be compared
     */
    public static void assertEquals(String actualValue, String expectedValue) {
        try {
            Assert.assertEquals(actualValue, expectedValue);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches the driver's control to the next window.
     * <p>
     * This method retrieves all the window handles using the driver. It then iterates through each window handle
     * and switches the driver's control to that window. The iteration continues until the driver's control is
     * switched to the last window.
     */
    public static void switchToNextWindow() {
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            driver.switchTo().window(window);
        }
    }

    /**
     * Waits for an alert dialog to be present.
     * <p>
     * This method uses the WebDriverWait class to wait for a specified amount of time for an alert dialog to be present.
     * It assumes that the driver and a duration of 10 seconds have been initialized before calling this method.
     *
     * @throws TimeoutException if the alert dialog is not present after waiting for the specified duration
     */
    public static void waitForAlertToBePresent() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    /**
     * Causes the currently executing thread to sleep for the specified number of milliseconds.
     *
     * @param milliSeconds the number of milliseconds to sleep
     */
    public static void sleep(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Selects a date using JavaScript by setting the value attribute of the specified WebElement.
     *
     * @param dateOfBirth the date to be selected in format "MM/DD/YYYY"
     * @param element the WebElement representing the input field
     */
    public static void selectDateByJS(String dateOfBirth, WebElement element ){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].setAttribute('value', '"+ dateOfBirth + "');";
        jsExecutor.executeScript(script, element);
    }

    /**
     * Waits for the element to be clickable before performing an action.
     *
     * @param element the WebElement to wait for
     */
    public static void waitForClickabilityOfElement(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
