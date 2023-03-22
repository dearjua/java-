package interfaceDe;

/**
 * ClassName: USBTest <br/>
 * Description: <br/>
 * date: 2022/5/10 11:31<br/>
 *
 * @author li111<br />
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transport(flash);
        //非匿名实现类的匿名对象
        computer.transport(new Flash());
        //匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("启动");
            }

            @Override
            public void stop() {
                System.out.println("关闭");
            }
        };
        computer.transport(phone);
        //匿名实现类的匿名对象
        computer.transport(new USB() {
            @Override
            public void start() {
                System.out.println("mp3启动");
            }

            @Override
            public void stop() {
                System.out.println("mp3关闭");
            }
        });
    }
}

class Computer{
    public void transport(USB usb){
        usb.start();
        System.out.println("电脑开始读取信息");
        usb.stop();
    }
}
interface USB{
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("u盘启动");
    }

    @Override
    public void stop() {
        System.out.println("u盘拔出");
    }
}