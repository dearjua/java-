package ThreadTest;

/**
 * ClassName: RunnableTest <br/>
 * Description: <br/>
 * date: 2022/5/13 14:24<br/>
 *
 * @author li111<br />
 */
public class RunnableTest {
    public static void main(String[] args) {
        MThread mThread = new MThread();
        Thread t1 = new Thread(mThread);
        t1.setName("线程一");
        t1.start();
    }
}

class MThread implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<100; i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+ ":" + i);
            }
        }
    }
}