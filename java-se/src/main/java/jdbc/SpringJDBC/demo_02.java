package jdbc.SpringJDBC;

import jdbc.DataSource.Druid.demo_02_Utils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class demo_02 {
    public static void main(String[] args) {

    }

    private JdbcTemplate template = new JdbcTemplate(demo_02_Utils.getDataSource());

    @Test
    public void test01() {
        String sql = "update student set score = score - ? where id = ?";
        int i = template.update(sql, 10, 1);
        System.out.println(i);
    }

    @Test
    public void test02() {
        String sql = "insert into student(id, name, score, sex) values(?, ?, ?, ?)";
        int i = template.update(sql, null, "克总", 40, 0);
    }

    @Test
    public void test03() {
        String sql = "select * from student where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
    }

    @Test
    public void test04() {
        String sql = "select * from student";
        List<Map<String, Object>> list = template.queryForList(sql);
        System.out.println(list);
    }

    @Test
    public void test05() {
        String sql = "select * from student";
        List<Student> list = template.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student student = new Student();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double score = rs.getDouble("score");
                boolean sex = rs.getBoolean("sex");

                student.setId(id);
                student.setName(name);
                student.setScore(score);
                student.setSex(sex);
                return student;
            }
        });
        System.out.println(list);
    }

    @Test
    public void test06() {
        // test05简化版
        String sql = "select * from student";
        List<Student> list = template.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println(list);
    }

    @Test
    public void test07() {
        String sql = "select count(id) from student";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);

    }
}
