package ReflectDemo;

import org.junit.Test;

/**
 * ClassName: reflectTest <br/>
 * Description: <br/>
 * date: 2022/5/28 15:13<br/>
 *
 * @author li111<br />
 */
public class reflectTest {
    @Test
    public void test1() throws ClassNotFoundException {
        //通过运行时类的属性class
        Class clazz = Persons.class;
        System.out.println(clazz);

        //通过运行时类的对象，调用getClass()
        Persons persons = new Persons();
        Class aClass = persons.getClass();
        System.out.println(aClass);

        //调用Class的静态方法：forName(String classPath);
        Class aClass1 = Class.forName("ReflectDemo.Persons");
        System.out.println(aClass1);

        //使用类的加载器ClassLoader(了解)
        ClassLoader classLoader = reflectTest.class.getClassLoader();
        Class aClass2 = classLoader.loadClass("ReflectDemo.Persons");
        System.out.println(aClass2);

    }
}
