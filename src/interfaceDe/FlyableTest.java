package interfaceDe;

/**
 * ClassName: Flyable <br/>
 * Description: <br/>
 * date: 2022/5/9 22:34<br/>
 *
 * @author li111<br />
 */
public class FlyableTest {
    public static void main(String[] args) {
        System.out.println(Flyable.FirstSpeed);
        System.out.println(Flyable.MIN_SPEED);
        Fly f = new Fly();
        f.fly();
        f.stop();
    }
}

interface Flyable{

    public static final double FirstSpeed = 7.8;
    double MIN_SPEED = 1.0;

    public abstract void fly();
    void stop();
}

class Fly implements Flyable{

    @Override
    public void fly() {
        System.out.println("发动机启动");
    }

    @Override
    public void stop() {
        System.out.println("发动机停止");
    }
}