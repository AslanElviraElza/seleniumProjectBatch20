package com.project.utilities;

//package com.cybertek.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class BitrixReader {
    //#1- We created the properties object
    private static Properties properties = new Properties();
    static {
        try {
            //#2- We get the path and pass it into FileInputStream, to open the file
            FileInputStream file = new FileInputStream("Bitrix.Properties");
            //#3- We load the opened file into properties object
            properties.load(file);
            //#5- close the file
            file.close();
        } catch (IOException e) {
            System.out.println("Properties file not found!");
        }
    }
    //#4- We read from file
    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }
}
