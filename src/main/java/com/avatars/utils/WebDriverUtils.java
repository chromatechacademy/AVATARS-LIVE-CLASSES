package com.avatars.utils;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverUtils {

    public static WebDriver driver;

    public static void setUp() {

        ConfigReader.readProperties(FrameworkConstants.LOCAL_TEST_SETTINGS_FILEPATH);
        String browser = ConfigReader.getPropertyValue("browser");
        String chris = ConfigReader.getPropertyValue("chris");

        if (browser.equalsIgnoreCase("chrome") && chris.equalsIgnoreCase("true")) {
            driver = new ChromeDriver();
            int width = driver.manage().window().getSize().getWidth();
            driver.manage().window().setPosition(new Point(width / 2, 0));
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
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

    public static void tearDown() {
        driver.quit();
    }
}
