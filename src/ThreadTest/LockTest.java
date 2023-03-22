package ThreadTest;

import java.util.concurrent.locks.ReentrantLock;


public class LockTest {
    public static void main(String[] args) {
        windows w1 = new windows();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class windows implements Runnable{
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock(true);//true表示公平，先进先出


    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "车票" + ticket);
                    ticket--;
                }else{
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}