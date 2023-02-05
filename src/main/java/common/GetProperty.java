package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GetProperty {
    public static final Properties prop_file = new Properties();
    public static final String properties_path = "/resources/data.properties";

    static {

        try {
            FileInputStream fileInputStream = new FileInputStream(properties_path);
            prop_file.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static String getBy(String key){
    return prop_file.getProperty(key);
    }
}
