package staticProxyDemo;

/**
 * ClassName: StaticProxyTest <br/>
 * Description: <br/>
 * date: 2022/5/28 19:46<br/>
 *
 * @author li111<br />
 */

interface ClothFactorey{
    void productCloth();
}

class ProxyFactory implements ClothFactorey{

    private ClothFactorey clothFactorey;

    public ProxyFactory(ClothFactorey clothFactorey){
        this.clothFactorey = clothFactorey;
    }

    @Override
    public void productCloth() {
        System.out.println("准备工作");
        clothFactorey.productCloth();
        System.out.println("收尾工作");
    }
}

class NikeFactory implements ClothFactorey{

    @Override
    public void productCloth() {
        System.out.println("生产NIke鞋子");
    }
}
public class StaticProxyTest {
    public static void main(String[] args) {
        NikeFactory nike = new NikeFactory();
        ProxyFactory proxyFactory = new ProxyFactory(nike);
        proxyFactory.productCloth();
    }
}
