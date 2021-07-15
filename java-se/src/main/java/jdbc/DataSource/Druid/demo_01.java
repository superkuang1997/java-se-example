package jdbc.DataSource.Druid;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class demo_01 {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        InputStream is = demo_01.class.getClassLoader().getResourceAsStream("druid.properties");
        prop.load(is);
        // 通过DruidDataSourceFactory工厂类创建数据库连接池
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = ds.getConnection();
        System.out.println(conn);
        conn.close();
    }
}
