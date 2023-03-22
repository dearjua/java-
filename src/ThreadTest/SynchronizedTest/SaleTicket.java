package ThreadTest.SynchronizedTest;

/**
 * ClassName: SaleTicket <br/>
 * Description: <br/>
 * date: 2023/3/2 20:05<br/>
 *
 * @author li111<br />
 */
public class SaleTicket implements Runnable{
    static int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized (this){
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

class ThreadTest{
    public static void main(String[] args) {
        SaleTicket s1 = new SaleTicket();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}