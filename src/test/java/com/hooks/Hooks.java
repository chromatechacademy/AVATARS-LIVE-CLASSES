package com.hooks;

import com.avatars.utils.CucumberLogUtils;
import com.avatars.utils.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void start(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        WebDriverUtils.setUp();
    }

    @After
    public void end(){
        WebDriverUtils.tearDown();
    }
}
