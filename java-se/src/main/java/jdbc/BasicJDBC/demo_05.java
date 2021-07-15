package jdbc.BasicJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询school表的数据，将其封装为对象
 */
public class demo_05 {
    public static void main(String[] args) {
        List<Student> list = findAll();
        System.out.println(list);
    }

    public static List<Student> findAll() {
        // 提升变量作用域
        Statement statement = null;
        Connection connection = null;
        ResultSet rs = null;
        List<Student> list = null;
        try {
            connection = demo_JDBCUtils.getConnection();
            String sql = "select * from student";
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            Student student = null;
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int score = rs.getInt("score");
                student = new Student();
                student.setId(id);
                student.setName(name);
                student.setScore(score);
                // 装载集合
                list.add(student);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            demo_JDBCUtils.close(rs, statement, connection);
        }
        return list;
    }
}
