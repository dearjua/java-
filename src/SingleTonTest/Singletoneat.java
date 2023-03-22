package SingleTonTest;

/**
 * ClassName: Singletoneat <br/>
 * Description: <br/>
 * date: 2022/5/8 21:35<br/>
 *
 * @author li111<br />
 */
public class Singletoneat {
    public static void main(String[] args) {
        Bank instance = Bank.getInstance();
        Bank instance1 = Bank.getInstance();
        System.out.println(instance1 == instance);
    }
}
//饿汉式
class Bank{
    //私有化类的构造器
    private Bank(){

    }

    //内部创建类的对象
    private static Bank instance = new Bank();

    public static Bank getInstance(){
        return instance;
    }
}