import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * commons-lang3 学习 and 测试
 * Created by 13969 on 2017/7/13.
 */
public class CommonsLang3Demo {
    public static void main(String[] args) {
        //randomStringUtilsDemo();
        systemUtilsDemo();
    }

    public static void systemUtilsDemo() {
        s(SystemUtils.FILE_SEPARATOR);
        s(SystemUtils.JAVA_CLASS_PATH);
    }

    /**
     * 随机字符串
     */
    public static void randomStringUtilsDemo() {
        s(RandomStringUtils.randomAscii(10));
        s(RandomStringUtils.random(10,"abcd"));
        s(RandomStringUtils.randomAlphabetic(10));
        s(RandomStringUtils.randomAlphanumeric(10));
        s(RandomStringUtils.randomNumeric(10));
    }

    public static void s(Object o) {
        System.out.println(o);
    }
}
