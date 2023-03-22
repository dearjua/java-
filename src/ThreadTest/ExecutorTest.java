package ThreadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName: ExecutorTest <br/>
 * Description: <br/>
 * date: 2022/5/14 16:24<br/>
 *
 * @author li111<br />
 */
public class ExecutorTest {
    public static void main(String[] args) {
        //提供指定线程数量的线程池
        ExecutorService executorService =  Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;
        //设置线程池属性
        service.setMaximumPoolSize(20);

        executorService.execute(new NumberThread());
        executorService.shutdown();
    }
}

class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<=100; i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +i);
            }
        }
    }
}