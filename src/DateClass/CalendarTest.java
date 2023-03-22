package DateClass;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

/**
 * ClassName: CalendarTest <br/>
 * Description: <br/>
 * date: 2022/5/15 22:18<br/>
 *
 * @author li111<br />
 */
public class CalendarTest {

    @Test
    public void test(){
        //实例化
        //调用静态方法getInstance()
        //实际上创建其子类GregorianCalendar的对象
        Calendar cd = Calendar.getInstance();

        //常用方法
        //get()
        int days = cd.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        //set()
        cd.set(Calendar.DAY_OF_YEAR,22);
        int days1 = cd.get(Calendar.DAY_OF_YEAR);
        System.out.println(days1);
        //add()
        cd.add(Calendar.DAY_OF_YEAR,23);
        int days2 = cd.get(Calendar.DAY_OF_YEAR);
        System.out.println(days2);
        //getTime()

    }


    @Test
    public void test2(){
        //now() 获取当前时间
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        //of() 设置指定的时间
        LocalDateTime of = LocalDateTime.of(2022, 02, 22, 9, 22, 22);
        System.out.println(of);

        //getXxx()
        System.out.println(of.getDayOfMonth());
        System.out.println(of.getDayOfYear());

        //修改日期时间
        LocalDate localDate = now.withDayOfMonth(24);
        System.out.println(localDate);
        //不可变性
        System.out.println(now);

        LocalDate localDate1 = now.minusMonths(1);
        System.out.println(localDate1);
    }
}
