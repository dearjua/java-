package CollectionDemo;

import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.*;

/**
 * ClassName: IteratorTest <br/>
 * Description: <br/>
 * date: 2022/5/18 15:09<br/>
 *
 * @author li111<br />
 */
public class IteratorTest {
    @Test
    public void test(){
        Collection conn = new ArrayList();
        conn.add("lijunhua");
        conn.add("123");
        conn.add(new String("Tom"));
        conn.add(new Animal("jarry",40));

        Iterator iterator = conn.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test1(){
        Collection conn = new ArrayList();
        conn.add("lijunhua");
        conn.add("123");
        conn.add(new String("Tom"));
        conn.add(new Animal("jarry",40));

        Iterator iterator = conn.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if (obj.equals("Tom")){
                iterator.remove();
            }
        }

        iterator = conn.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test4(){
        Set set = new TreeSet();
        set.add(new Employee("li",23,new MyDate(1999,06,16)));
        set.add(new Employee("jun",24,new MyDate(2000,01,15)));
        set.add(new Employee("hua",19,new MyDate(2001,03,13)));
        set.add(new Employee("hhh",20,new MyDate(2000,07,22)));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test5(){

        Comparator comm = new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;
                    int year = Integer.compare(e1.getBirthday().getYear(), e2.getBirthday().getYear());
                    if (year != 0){
                        return year;
                    }else{
                        int month = Integer.compare(e1.getBirthday().getMonth(),e2.getBirthday().getMonth());
                        if (month != 0){
                            return month;
                        }else{
                            return Integer.compare(e1.getBirthday().getDay(),e2.getBirthday().getDay());
                        }
                    }

                }else{
                    throw new RuntimeException("类型错误");
                }
            }
        };

        TreeSet set = new TreeSet(comm);
        set.add(new Employee("li",23,new MyDate(1999,06,16)));
        set.add(new Employee("jun",24,new MyDate(2000,01,15)));
        set.add(new Employee("hua",19,new MyDate(2001,03,13)));
        set.add(new Employee("hhh",20,new MyDate(2000,07,22)));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
