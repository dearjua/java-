package CollectionDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * ClassName: CollectionTest <br/>
 * Description: <br/>
 * date: 2022/5/18 10:07<br/>
 *
 * @author li111<br />
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection conn = new ArrayList();
        conn.add("abc");
        conn.add("li");
        conn.add(123);
        conn.add(new Date());

        System.out.println(conn.size());
        System.out.println(conn);

        Collection conn2 = new ArrayList();
        conn2.add("345");
        conn.addAll(conn2);

        System.out.println(conn);

        conn2.clear();
        System.out.println(conn2);

        System.out.println(conn2.isEmpty());
    }

    @Test
    public void test2(){
        Collection conn = new ArrayList();
        conn.add("lijunhua");
        conn.add("123");
        conn.add(new String("Tom"));
        conn.add(new Animal("jarry",40));

        boolean jarry = conn.contains(new Animal("jarry", 40));
        System.out.println(jarry);
        System.out.println(conn.contains(new Animal("jarry", 40)));
    }
}
