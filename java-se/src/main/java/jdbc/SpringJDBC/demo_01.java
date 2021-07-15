package jdbc.SpringJDBC;

import jdbc.DataSource.Druid.demo_02_Utils;
import org.springframework.jdbc.core.JdbcTemplate;

public class demo_01 {
    public static void main(String[] args) {
        // 创建JdbcTemplate对象
        JdbcTemplate template = new JdbcTemplate(demo_02_Utils.getDataSource());
        // 定义sql
        String sql = "update score set score = ? where s_id = ?";
        // 调用方法  之后无需手动释放资源
        int i = template.update(sql, 50, 1);
        System.out.println(i);
    }
}
