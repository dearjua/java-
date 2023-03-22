package Exception;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: ExceptionTest <br/>
 * Description: <br/>
 * date: 2022/5/11 13:03<br/>
 *
 * @author li111<br />
 */
public class ExceptionTest {

    //NullPointException空指针异常
    @Test
    public void test1(){
        String s = "asd";
        s = null;
        s.charAt(0);
    }

    //ArrayIndexOutOfBoundException数组角标越界
    @Test
    public void test2(){
        int[] a = new int[10];
        System.out.println(a[10]);
    }

    //ClassCastException类型转换异常
    @Test
    public void test3(){
        Object o = new String("abc");
        Double d = (Double)o;
        System.out.println(d);
    }

    //NumberFormatException数字格式化异常
    @Test
    public void test4(){
        String str = new String("abc");
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    //InputMismatchException输入不匹配异常
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }

    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }



}
