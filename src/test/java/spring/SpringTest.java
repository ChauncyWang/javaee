package spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;


/**
 * Spring 测试类
 * Created by hy on 17-8-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:WEB-INF/spring-beans.xml"})
public class SpringTest {
    @Resource
    Date date;

    @Test
    public void test() {
        System.out.println(date);
    }
}
