package jdbc.BasicJDBC;

import java.sql.*;

/**
 * 采用JDBC工具类函数
 */
public class demo_04 {
    public static void main(String[] args) {
        // 注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Statement statement = null;
        Connection conn = null;
        try {
            // 定义sql
            String sql = "select * from student";
            // 获取数据库连接对象
            conn = demo_JDBCUtils.getConnection();
            // 获取sql执行对象statement
            statement = conn.createStatement();
            // 执行sql
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                int score = rs.getInt("score");
                int sex = rs.getInt("sex");
                System.out.println(id + "-" + name + "-" + score + "-" + sex);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            demo_JDBCUtils.close(null, statement, conn);
        }
    }
}
