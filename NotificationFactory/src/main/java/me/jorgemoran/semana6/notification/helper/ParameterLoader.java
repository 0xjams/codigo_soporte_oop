package me.jorgemoran.semana6.notification.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ParameterLoader {

        public static Map<String, String> loadPropertiesToMap(String filePath) {
            Properties properties = new Properties();
            Map<String, String> map = new HashMap<String,String>();

            try (FileInputStream inputStream = new FileInputStream(filePath)) {
                // Load the properties file
                properties.load(inputStream);

                // Iterate over properties and populate the map
                for (String key : properties.stringPropertyNames()) {
                    String value = properties.getProperty(key);
                    map.put(key, value);
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

            return map;
        }

        public static void main(String[] args) {
            String filePath = "params.properties";  // Specify the path to your properties file
            /*Map<String, String> propertiesMap = loadPropertiesToMap(filePath);

            // Print out the properties loaded into the HashMap
            propertiesMap.forEach((key, value) -> System.out.println(key + " = " + value));*/
        }
    }

