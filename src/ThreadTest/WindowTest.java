package ThreadTest;

/**
 * ClassName: WindowTest <br/>
 * Description: <br/>
 * date: 2022/5/13 13:45<br/>
 *
 * @author li111<br />
 */
public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread{
    private static int ticket = 100;
    private static Object object1 = new Object();
    @Override
    public void run() {
        while(true){
            show();
            /*synchronized (object1){
                if(ticket > 0){
                    System.out.println("买了票：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }*/
        }
    }

    private static synchronized void show(){//同步监视器：Window.class
        if(ticket > 0){
            System.out.println("买了票：" + ticket);
            ticket--;
        }
    }
}