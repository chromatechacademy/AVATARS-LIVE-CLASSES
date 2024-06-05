package com.chromatech;

import com.avatars.utils.FrameworkConstants;
import com.avatars.utils.WebDriverUtils;

public class Testing {

    public static void main(String[] args) {

        WebDriverUtils.setUp();
        System.out.println(FrameworkConstants.LOCAL_TEST_SETTINGS_FILEPATH);
        WebDriverUtils.tearDown();
    }
}