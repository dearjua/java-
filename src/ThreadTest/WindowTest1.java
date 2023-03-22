package ThreadTest;

/**
 * ClassName: WindowTest1 <br/>
 * Description: <br/>
 * date: 2022/5/13 14:44<br/>
 *
 * @author li111<br />
 */
public class WindowTest1 {
    public static void main(String[] args) {
        window1 w1 = new window1();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.start();
        t2.start();
        t3.start();
    }


}

class window1 implements Runnable{
    private int ticket = 100;
    Object object = new Object();

    public synchronized void show(){//同步监视器：this
        if(ticket > 0){
            System.out.println("火车票：" + ticket);
            ticket--;
        }
    }
    @Override
    public void run() {
        while(true){
            show();
           /*synchronized (object){
               if(ticket > 0){
                   System.out.println("火车票：" + ticket);
                   ticket--;
               }else{
                   break;
               }
           }*/
        }
    }
}