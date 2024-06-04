package com.chromatech;

import com.avatars.utils.WebDriverUtils;

public class Testing {

    public static void main(String[] args) {

        WebDriverUtils.setUp("edge");
        WebDriverUtils.tearDown();
    }
}
