package com.avatars.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberLogUtils extends WebDriverUtils{

    public static Scenario scenario;

    /**
     * USE BELOW METHOD TO ATTACH SCREENSHOTS TO MAVEN CUCUMBER HTML REPORTS
     */
    public static void logScreenShot() {
        if (scenario == null) {
            return;
        } else {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Attaching screenshot to reports"); // attach to the report
        }
    }
}
