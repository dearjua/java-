package CompareDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: CompareTest <br/>
 * Description: <br/>
 * date: 2022/5/16 9:57<br/>
 *
 * @author li111<br />
 */
public class CompareTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[4];
        goods[1] = new Goods("huawei",111);
        goods[2] = new Goods("mi",22);
        goods[0] = new Goods("dell",22);
        goods[3] = new Goods("mi",33);
        Arrays.sort(goods, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods goods1 = (Goods) o1;
                    Goods goods2 = (Goods) o2;
                    if (goods1.getName().equals(goods2.getName())){
                        return goods1.getName().compareTo(goods2.getName());
                    }else{
                        return Integer.compare(goods1.getAge(),goods2.getAge());
                    }
                }else{
                    throw new RuntimeException("输入的数据类型不一致");
                }
            }
        });
        System.out.println(Arrays.toString(goods));
    }

}
class Goods implements Comparable{
    private String name;
    private int age;

    public Goods() {
    }

    public Goods(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods good = (Goods)o;
            if (this.age > good.age){
                return 1;
            }else if(this.age < good.age){
                return -1;
            }else{
                return this.name.compareTo(good.name);
            }
        }else{
            throw new RuntimeException("无法比较，不是相同的类");
        }
    }
}