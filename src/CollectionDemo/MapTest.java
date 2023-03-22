package CollectionDemo;

import TeamSchedulePackage.domain.Emp.Programmer;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * ClassName: MapTest <br/>
 * Description: <br/>
 * date: 2022/5/19 18:27<br/>
 *
 * @author li111<br />
 */
public class MapTest {
    @Test
    public void Test1(){
        Map map = new HashMap();
        //添加put()
        map.put(123,"li");
        map.put(234,"jun");
        map.put(134,"hua");

        //修改
        map.put(123,"hhh");
        System.out.println(map);

        //查找
        System.out.println(map.get(123));
        Map map1 = new HashMap();
        map1.put(444,"li");
        map1.put(555,"ooo");

        //将一个map添加到另外一个map中
        map.putAll(map1);
        System.out.println(map);

        //map中存放的元素个数
        System.out.println(map.size());

        //将map中指定key的元素清除
        map.remove(444);
        System.out.println(map);
        //将map中所有元素清除
        //map.clear();
        //System.out.println(map);

        //判断map是否为空
        System.out.println(map.isEmpty());

        System.out.println(map.containsKey(555));
        System.out.println(map.containsValue("ooo"));
    }

    @Test
    public void Test2(){
        //遍历map
        Map map = new HashMap();
        map.put(123,"li");
        map.put(234,"jun");
        map.put(134,"hua");

        //遍历key
        Set set = map.keySet();
        Iterator ite = set.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        //遍历value
        Collection values = map.values();
        for (Object obj:values) {
            System.out.println(obj);
        }

        //遍历entry
        Set set1 = map.entrySet();
        Iterator it = set1.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }

    @Test
    public void test(){
        FileInputStream fis = null;
        try {
            Properties properties = new Properties();
            fis = new FileInputStream("jdbc.properties");
            properties.load(fis);
            String name = properties.getProperty("name");
            String password = properties.getProperty("password");
            System.out.println("name = " + name + " password = "+ password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
