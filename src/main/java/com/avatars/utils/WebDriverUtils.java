package com.avatars.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class WebDriverUtils {

    public static WebDriver driver;

    public static void setUp() {

        ConfigReader.readProperties(FrameworkConstants.LOCAL_TEST_SETTINGS_FILEPATH);

        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("firefox")) {
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
