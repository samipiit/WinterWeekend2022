package java_intermediate.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DatabaseConnection {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;
    static String systemPath = System.getProperty("user.dir");
    static String propPath = "\\src\\secret.properties";
    private static final File file = new File(systemPath + propPath);

    public DatabaseConnection() {
        Properties prop = null;
        FileInputStream fis = null;

        try {
            prop = loadProperties();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            fis = new FileInputStream(file);
            if (prop != null) {
                prop.load(fis);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException io) {
                io.printStackTrace();
            }
        }

        if (prop != null) {
            String driverClass = prop.getProperty("MYSQLJDBC.driver");
            String host = prop.getProperty("MYSQLJDBC.host");
            String user = prop.getProperty("MYSQLJDBC.userName");
            String password = prop.getProperty("MYSQLJDBC.password");

            try {
                Class.forName(driverClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                connect = DriverManager.getConnection(host, user, password);
                System.out.println("CONNECTED TO DATABASE!");
            } catch (SQLException sql) {
                System.out.println("\nUNABLE TO ESTABLISH CONNECTION TO DATABASE:\n" + sql.getMessage() + "\n");
            }
        }
    }

    private static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream(file);
        prop.load(ism);
        ism.close();
        return prop;
    }
}
