package DateClass;

import org.junit.Test;

import java.util.Date;

/**
 * ClassName: DateTest <br/>
 * Description: <br/>
 * date: 2022/5/15 16:04<br/>
 *
 * @author li111<br />
 */
public class DateTest {

    /*
    java.util.Date类
           |---java.sql.Date类

    1.两个构造器的使用
        >构造器一：Date()：创建一个对应当前时间的Date对象
        >构造器二：创建指定毫秒数的Date对象
    2.两个方法的使用
        >toString():显示当前的年、月、日、时、分、秒
        >getTime():获取当前Date对象对应的毫秒数。（时间戳）

    3. java.sql.Date对应着数据库中的日期类型的变量
        >如何实例化
        >如何将java.util.Date对象转换为java.sql.Date对象
     */
    @Test
    public void test1(){
        long sc = System.currentTimeMillis();
        System.out.println(sc);
        Date date1 = new Date(sc);
        System.out.println(date1.toString());

        System.out.println(date1.getTime());

        java.sql.Date date = new java.sql.Date(date1.getTime());
        System.out.println(date.toString());
    }

    public String reverse(String str,int left, int right){
       String str1 = str.substring(left,right);
       char[] chars = str1.toCharArray();
       for (int i=0; i<chars.length; i++){
           if (i < chars.length-1-i){
               char a = chars[i];
               chars[i] = chars[chars.length-i-1];
               chars[chars.length-i-1] = a;
           }
       }

       String str2 = new String(chars);
       String str3 = str.replace(str1,str2);
       return str3;
    }

    //int lastIndexOf(String str, int fromIndex)：
    // 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索

    public int NumStr(String mainStr,String subStr){
        int Num = 0;
        int index = 0;
        int mainLength = mainStr.length();
        int subLength = subStr.length();

        if (subLength <= mainLength){
            while((index = mainStr.indexOf(subStr,index)) != -1){
                Num++;
                index += subLength;
            }
            return Num;
        }else{
            return 0;
        }

    }
    //4.获取两个字符串中最大相同子串。比如：
    //str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
    //提示：将短的那个串进行长度依次递减的子串与较长的串比较。
    public String MaxSubString(String str1,String str2){
        String MaxStr = (str1.length() >= str2.length())?str1:str2;
        String MinStr = (str1.length() < str2.length())?str1:str2;

        int len = MinStr.length();
        for (int i=0; i<len; i++){
            for (int x=0,y=len-i;y<=len;x++,y++){
                String minStr = MinStr.substring(x,y);
                if(MaxStr.contains(minStr)){
                    return minStr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        /*String str = "abcdefg";
        DateTest dt = new DateTest();
        System.out.println(dt.reverse(str,2,6));*/


        /*DateTest dt = new DateTest();
        String str1 = "aabcabcababab";
        String str2 = "ab";
        System.out.println(dt.NumStr(str1, str2));*/

        DateTest dt = new DateTest();
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        String str3 = dt.MaxSubString(str1,str2);
        System.out.println(str3);

    }
}
