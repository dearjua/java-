package SingleTonTest;

/**
 * ClassName: SingleTonto <br/>
 * Description: <br/>
 * date: 2022/5/8 21:42<br/>
 *
 * @author li111<br />
 */
public class SingleTonto {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        System.out.println(o1 == o2);
    }
}
class Order{
    //1.私有化类的构造器
    private Order(){

    }

    //2.声明当前类的对象，没有初始化
    //4.此对象也必须声明为static
    private static Order instance = null;

    //声明public,static返回当前类对象的方法
    //线程安全方式一：
    //public static synchronized Order getInstance(){

    //线程安全方式二
    public static Order getInstance(){
        if (instance == null){
            synchronized(Order.class){
                if (instance == null){
                    instance = new Order();
                    return instance;
                }
            }
        }
        return instance;
    }
}