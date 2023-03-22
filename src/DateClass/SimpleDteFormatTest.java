package DateClass;

import TeamSchedulePackage.service.Data;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: SimpleDteFormatTest <br/>
 * Description: <br/>
 * date: 2022/5/15 21:28<br/>
 *
 * @author li111<br />
 */
public class SimpleDteFormatTest {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        //格式化  日期--->字符串
        Date d1 = new Date();
        String str = sdf.format(d1);
        System.out.println(str);

        //解析  字符串-->日期
        String str2 = "2022-06-16 22:22:22";
        Date d2 = sdf.parse(str2);
        System.out.println(d2);
    }

    @Test
    public void exec() throws ParseException {
        String str = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(str);
        java.sql.Date d2 = new java.sql.Date(d1.getTime());
        System.out.println(d2);
    }

    @Test
    public void fish() throws ParseException {
        //计算现在距离1990-01-01多少天
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = "1990-01-01";
        Date d1 = sdf.parse(str);
        System.out.println(d1.getTime());
        String str2 = "1990-01-02";
        Date d2 = sdf.parse(str2);
        System.out.println(d2.getTime());
        long FiveDate = 5*24*60*60*1000;
        long lastDate =(d2.getTime() - d1.getTime())%FiveDate;
        int d = (int) (lastDate/(24*60*60*1000));
        System.out.println(d);
        if(d == 0 || d == 4){
            System.out.println("今天晒网");
        }else{
            System.out.println("今天打鱼");
        }
    }
}
