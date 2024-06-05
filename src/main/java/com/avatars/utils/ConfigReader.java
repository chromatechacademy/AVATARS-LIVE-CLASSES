package com.avatars.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    /*
     * THIS IS A STANDARD CONFIG READER CLASS
     */
    static Properties prop;

    // STEP 1 - READ THE FILE
    public static Properties readProperties(String filePath){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    // STEP 2: RETRIEVE VALUES FROM PROPERTIES FILE
    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }
}
