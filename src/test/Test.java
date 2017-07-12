import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * 测试类
 * Created by 13969 on 2017/7/12.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-spring-config.xml");
        BasicDataSource dataSource = (BasicDataSource) context.getBean("dataSource");
        try {
            Object a = dataSource.getConnection();
            System.out.print(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
