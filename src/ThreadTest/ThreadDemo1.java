package ThreadTest;

/**
 * ClassName: ThreadDemo1 <br/>
 * Description: <br/>
 * date: 2022/10/13 21:43<br/>
 *
 * @author li111<br />
 */
public class ThreadDemo1{
    public static void main(String[] arg) {
        OurThread o1 = new OurThread();

        o1.start();

        for (int j = 0; j < 100; j++){
            System.out.println("Main线程"+j);
        }
    }
}


class OurThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("线程" + i);
        }
    }
}