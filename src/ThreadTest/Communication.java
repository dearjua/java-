package ThreadTest;

/**
 * ClassName: Communication <br/>
 * Description: <br/>
 * date: 2022/5/14 13:46<br/>
 *
 * @author li111<br />
 */
public class Communication {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}

class Printer implements Runnable{

    private int Number = 1;

    @Override
    public void run() {
        while(true){
            synchronized (this){
                this.notify();
                if(Number<100){
                    System.out.println(Thread.currentThread().getName() + ":" + Number);
                    Number++;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}