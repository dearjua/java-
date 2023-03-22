package ThreadTest;

/**
 * 多线程创建，方式一：继承Thread类
 * 1.创建一个继承Thread类的子类
 * 2.重写Thread类的run() -->将此线程执行操作声明在run()中
 * 3.创建Threa类的子类的对象
 * 4.此对象调用start()方法
 *
 */
public class ThreadCreat {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("线程一");
        MyThread myThread1 = new MyThread("线程二");
        //myThread.setName("线程一");
        myThread.start();
        myThread1.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        //直接调用run()无法启动新线程，必须调用start()
        for (int i=0; i<100; i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+":" + i+"主线程");
            }

            if (i == 20){
                try {
                    myThread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<100; i++){
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName() +":" + i);
            }
            if (i%10 == 0){
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /*if(i%20 == 0){
                Thread.currentThread().yield();//释放当前cpu的执行权
            }*/
        }
    }

    public MyThread(String name){
        super(name);
    }
}