package jdbc.DataSource.Druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用工具类
 */

public class demo_03 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = demo_02_Utils.getConnection();
            String sql = "insert into student values(null, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "帕斯卡");
            ps.setDouble(2, 18);
            ps.setInt(3, 0);
            System.out.println(ps);
            int result = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            demo_02_Utils.close(ps, conn);
        }
    }
}
