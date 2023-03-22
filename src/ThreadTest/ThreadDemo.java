package ThreadTest;

/**
 * ClassName: ThreadDemo <br/>
 * Description: <br/>
 * date: 2022/5/13 12:51<br/>
 *
 * @author li111<br />
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    if(i%2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    if(i%2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}

