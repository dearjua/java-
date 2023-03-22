package ThreadTest;

/**
 * ClassName: producerTest <br/>
 * Description: <br/>
 * date: 2022/5/14 14:15<br/>
 *
 * @author li111<br />
 */
public class producerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        producer p1 = new producer(clerk);
        p1.setName("生产者一");

        customer1 c1 = new customer1(clerk);
        c1.setName("消费者一");

        customer1 c2 = new customer1(clerk);
        c2.setName("消费者二");

        p1.start();
        c1.start();
        c2.start();
    }
}

class Clerk{

    private int Number = 0;

    public synchronized void productBegain() {
        if (Number < 20){
            Number++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + Number + "件产品");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumePro() {
        if (Number > 0){
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + Number + "件产品");
            Number--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class producer extends Thread{
    private Clerk clerk;

    public producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始生产产品");
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.productBegain();
        }
    }
}

class customer1 extends Thread{
    private Clerk clerk;

    public customer1(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费产品");
        while(true){
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumePro();
        }
    }
}