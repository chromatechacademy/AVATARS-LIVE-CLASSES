package com.avatars.utils;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class WebDriverUtils {

    public static WebDriver driver;

    /**
     * Sets up the WebDriver for test execution.
     * Reads the properties from the local test settings file and initializes the driver
     * based on the browser specified.
     * If the browser is "chrome", it creates a ChromeDriver instance.
     * If the browser is "edge", it creates an EdgeDriver instance.
     * If the browser is "firefox", it creates a FirefoxDriver instance.
     * If none of the above, it throws a RuntimeException with the message "INVALID BROWSER NAME".
     *
     * If the "headless" property is set to "true", it creates a headless ChromeDriver.
     * If the "chris" property is set to "true", it positions the browser window at the center of the screen.
     *
     * The driver window is maximized, all cookies are deleted, and the implicit wait timeout is set to 10 seconds.
     */
    public static void setUp() {
        ConfigReader.readProperties(FrameworkConstants.LOCAL_TEST_SETTINGS_FILEPATH);
        String browser = ConfigReader.getPropertyValue("browser");
        String chris = ConfigReader.getPropertyValue("chris");
        String isHeadless = (ConfigReader.getPropertyValue("headless"));

        if (browser.equalsIgnoreCase("chrome")) {
            if (isHeadless.equalsIgnoreCase("true")) {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless=new");
                driver = new ChromeDriver(chromeOptions);
            } else if (chris.equalsIgnoreCase("true")) {
                int width = driver.manage().window().getSize().getWidth();
                driver.manage().window().setPosition(new Point(width / 2, 0));
            } else {
                driver = new ChromeDriver();
            }
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("* * * * INVALID BROWSER NAME * * * *");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Closes the WebDriver instance and releases all associated resources.
     */
    public static void tearDown() {
        driver.quit();
    }
}