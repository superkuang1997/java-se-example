package jdbc.DataSource.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * c3p0演示
 */
public class demo_c3p0 {
    public static void main(String[] args) throws SQLException {
        // 创建数据库连接池对象（使用默认配置）
        DataSource ds1 = new ComboPooledDataSource();
        // 使用其他配置
        DataSource ds2 = new ComboPooledDataSource("otherc3p0");
        // 获取连接对象
        Connection conn1 = ds1.getConnection();
        Connection conn2 = ds2.getConnection();
        // 打印
        System.out.println(conn1);
        System.out.println(conn2);
        // 归还连接对象
        conn1.close();
        conn2.close();
    }
}
