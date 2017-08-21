import com.chava96.blog.dao.UserDao;
import com.chava96.blog.models.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class MainTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{
                "classpath:WEB-INF/mybatis-config.xml",
                "classpath:WEB-INF/spring-beans.xml"});
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoImpl");
        User user = new User();
        user.setId(1111);
        user.setLogin("1111");
        user.setPass("1234");
        user.setActivationKey("key");
        user.setDisplayName("王冲");
        user.setStatus(1);
        user.setNiceName("昵称");
        user.setUrl("http://");
        user.setRegistered("1999-11-11 11:11:11");
        user.setEmail("1239@qq.com");
        userDao.insert(user);
    }
}
