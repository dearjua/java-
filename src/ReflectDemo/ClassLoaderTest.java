package ReflectDemo;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

/**
 * ClassName: ClassLoaderTest <br/>
 * Description: <br/>
 * date: 2022/5/28 16:05<br/>
 *
 * @author li111<br />
 */
public class ClassLoaderTest {

    @Test
    public void test() throws IOException {
        Properties ps = new Properties();

        //读取配置文件方式一
//        FileInputStream fis1 = new FileInputStream("jdbc.properties");
//        ps.load(fis1);

        //方式二：使用ClassLoader
        //配置文件识别为module下的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc2.properties");
        ps.load(resourceAsStream);
        String name = ps.getProperty("name");
        String password = ps.getProperty("password");
        System.out.println("name = " + name + " password = " + password);
    }

    //创建运行时类的对象
    @Test
    public void test3(){
        try {
            int num = new Random().nextInt(3);
            String classPath = "";
            switch (num){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "ReflectDemo.Persons";
                    break;
            }

            Object obj = getInstance(classPath);
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public Object getInstance(String instanceStr) throws ClassNotFoundException, NoSuchMethodException {
        Class aClass = Class.forName(instanceStr);
        return aClass.getConstructor();
    }
}
