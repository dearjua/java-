package interfaceDe;

/**
 * ClassName: ProxyTest <br/>
 * Description: <br/>
 * date: 2022/5/10 12:08<br/>
 *
 * @author li111<br />
 */
public class ProxyTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork{
    public void browse();
}
//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("服务器连接网络");
    }
}

//代理类
class ProxyServer implements NetWork{

    private NetWork netWork;

    public ProxyServer(NetWork netWork){
        this.netWork = netWork;
    }

    public void work(){
        System.out.println("工作");
    }
    @Override
    public void browse() {
        work();
        netWork.browse();
    }
}