package Wapper;

import org.junit.Test;

/**
 * ClassName: WapperTest <br/>
 * Description: <br/>
 * date: 2022/5/7 21:20<br/>
 *
 * @author li111<br />
 */
public class WapperTest {

    @Test
    public void test0(){
        int i = 10;
        Integer i1 = Integer.valueOf(i);
        System.out.println(i1.toString());

        Integer i2 = i;
        System.out.println(i2);

        int j = 0;
        j = i2.intValue();
        System.out.println(j);

        String str1 = String.valueOf(j+1);
        System.out.println(str1);

        Integer int1 = Integer.parseInt(str1);
        System.out.println(int1);
    }
    //String类型---->基本数据类型或包装类，调用包装类的parseXxx()
    @Test
    public void test4(){
        String str1 = "123";

        //错误的写法
        /*int num1 = (int)str1;
        Integer integer = (Integer)str1;*/
        int i = Integer.parseInt(str1);
        System.out.println(i);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }
    //基本数据类型，包装类变为String类型，调用String重载的valueOf(xxx)
    @Test
    public void test3() {
        int num = 10;
        //方式一，连接运算
        String str = num + "";
        //方式二，调用String重载的valueOf
        String str1 = String.valueOf(num);
        Integer int1 = 22;
        String str3 = String.valueOf(int1);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str3);
    }
    //自动装箱与自动拆箱
    @Test
    public void test2(){
        int i = 9;
        System.out.println(demo(i));

        Integer in2 = 123;
        int j = in2;
        System.out.println(j);
    }
    public Object demo(Object o){
        return o;
    }
    @Test
    public void test1(){
        int i = 10;
        Integer int1 = i;
        System.out.println(int1.toString());
        Integer int2 = Integer.valueOf("123");
        System.out.println(int2);
        Boolean b1 = Boolean.TRUE;
        System.out.println(b1);
        Boolean b2 = Boolean.valueOf("true123");
        System.out.println(b2);
        Float f1 = 11.2f;
        System.out.println(f1);
        person p1 = new person();
        System.out.println(p1.isFalse);//boolean的包装类初始值为null
        System.out.println(p1.isTrue);
    }
}
class person{
    boolean isTrue;
    Boolean isFalse;
}