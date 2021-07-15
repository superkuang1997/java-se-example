package jdbc.BasicJDBC;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class demo_JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;


    static {
        try {
            Properties properties = new Properties();
            // 获得类加载器
            ClassLoader loader = demo_JDBCUtils.class.getClassLoader();
            // 获得URL对象
            URL resource = loader.getResource("db.properties");
            // 通过URL对象获得path
            String path = resource.getPath();
            // properties加载配置文件
            properties.load(new FileReader(path));

            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源
     *
     * @param statement
     * @param connection
     */
    public static void close(ResultSet rs, Statement statement, Connection connection) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
