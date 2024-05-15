package Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SecretsLoader {
    private static Properties properties;

    public static void loadProperties() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("secrets.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSqlPassword() {
        return SecretsLoader.properties.getProperty("sql.password");
    }
}
