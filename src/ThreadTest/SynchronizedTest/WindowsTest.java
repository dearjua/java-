package ThreadTest.SynchronizedTest;

import org.junit.experimental.theories.Theories;

/**
 * ClassName: WindowsTest <br/>
 * Description: <br/>
 * date: 2023/3/2 20:20<br/>
 *
 * @author li111<br />
 */
public class WindowsTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread{
    static int ticket = 100;

    @Override
    public void run() {
        while (true){
            synchronized (Window.class) {
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"售票,票号为:" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}