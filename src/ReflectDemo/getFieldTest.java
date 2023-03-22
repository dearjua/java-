package ReflectDemo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: getFieldTest <br/>
 * Description: <br/>
 * date: 2022/5/28 18:34<br/>
 *
 * @author li111<br />
 */
public class getFieldTest {

    @Test
    public void test2() throws Exception {
        Class clazz = Persons.class;
        //创建运行时类的对象
        Persons p1 = (Persons) clazz.getDeclaredConstructor().newInstance();
        //获取运行时类变量名的属性
        Field name = clazz.getDeclaredField("name");
        //保证当前属性可访问
        name.setAccessible(true);
        //获取设置指定对象的属性值
        name.set(p1,"李军华");
        System.out.println(name.get(p1));
    }

    @Test
    public void test3() throws Exception {
        Class clazz = Persons.class;
        Persons p1 = (Persons) clazz.getDeclaredConstructor().newInstance();
        Method show = clazz.getDeclaredMethod("show");
        show.setAccessible(true);
        Object invoke = show.invoke(p1, null);
        System.out.println(invoke);

    }
}
