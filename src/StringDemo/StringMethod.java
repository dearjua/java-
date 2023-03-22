package StringDemo;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.sql.Array;
import java.util.Arrays;

/**
 *  int length()：返回字符串的长度： return value.length
 *  char charAt(int index)： 返回某索引处的字符return value[index]
 *  boolean isEmpty()：判断是否是空字符串：return value.length == 0
 *  String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
 *  String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
 *  String trim()：返回字符串的副本，忽略前导空白和尾部空白
 *  boolean equals(Object obj)：比较字符串的内容是否相同
 *  boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
 *  String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
 *  int compareTo(String anotherString)：比较两个字符串的大小
 *  String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从
 *  beginIndex开始截取到最后的一个子字符串。
 *  String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
 */
public class StringMethod {
    @Test
    public void test1() throws UnsupportedEncodingException {
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());

        System.out.println(s1.toLowerCase());
        String s2 = "   lijun hua   ";
        System.out.println(s2.trim());

        String s3 = "helloworld";
        System.out.println(s3.equalsIgnoreCase(s1));
        System.out.println(s1.concat(s2.trim()));

        String s4 = "abc";
        String s5 = "abd";
        System.out.println(s4.compareTo(s5));

        System.out.println(s1.substring(5));

        String s6 = "wo";
        System.out.println(s3.contains(s6));

        String str = "123abc中国";
        byte[] by = str.getBytes("gbk");
        System.out.println(Arrays.toString(by));
    }
}
