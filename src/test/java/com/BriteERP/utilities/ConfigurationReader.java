package com.BriteERP.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private  static Properties configFile;


    static {
        try{
            String path = "configuration.properties";
            System.out.println(path);
            FileInputStream input = new FileInputStream(path);
            //initialize configFile
            configFile = new Properties();
            //load properties file
            configFile.load(input);
            input.close();
            //close input strame
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return configFile.getProperty(key);
    }
}