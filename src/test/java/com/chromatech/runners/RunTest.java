package com.chromatech.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/cucumber-reports/cucumber-html-report.html","json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/com/chromatech/features",
        glue = "com.chromatech.Cucumber_BDD_Testing.stepDefinitions",
        tags = "@Progression",
        dryRun = false
)

public class RunTest extends AbstractTestNGCucumberTests {
}
