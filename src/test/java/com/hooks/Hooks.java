package com.hooks;

import com.avatars.utils.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void start(){
        WebDriverUtils.setUp();
    }

    @After
    public void end(){
        WebDriverUtils.tearDown();
    }
}
