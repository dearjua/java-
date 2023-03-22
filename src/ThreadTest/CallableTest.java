package ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: CallableTest <br/>
 * Description: <br/>
 * date: 2022/5/14 15:57<br/>
 *
 * @author li111<br />
 */
public class CallableTest {
    public static void main(String[] args) {
        MyCall mc = new MyCall();

        FutureTask futureTask = new FutureTask(mc);

        new Thread(futureTask).start();

        try {
            Object sum = futureTask.get();
            System.out.println("总和为：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
//1.创建一个实现Callable的实现类
class MyCall implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i=0; i<=100; i++){
            if(i%2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

