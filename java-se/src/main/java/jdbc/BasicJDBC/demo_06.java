package jdbc.BasicJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo_06 {
    public static void main(String[] args) {
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        Connection conn = null;
        try {
            conn = demo_JDBCUtils.getConnection();
            String sql1 = "update student set score = score + ? where id = ?";
            String sql2 = "update student set score = score - ? where id = ?";
            ps1 = conn.prepareStatement(sql1);
            ps2 = conn.prepareStatement(sql2);
            // 设置参数
            ps1.setInt(1, 20);
            ps1.setInt(2, 1);
            ps2.setInt(1, 20);
            ps2.setInt(2, 2);

            ps1.executeUpdate();
            ps2.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            demo_JDBCUtils.close(null, ps1, conn);
            demo_JDBCUtils.close(null, ps2, null);
        }
    }
}
