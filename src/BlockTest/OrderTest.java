package BlockTest;

/**
 * ClassName: OrderTest <br/>
 * Description: <br/>
 * date: 2022/11/13 23:27<br/>
 *
 * @author li111<br />
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}
class Order{

    int orderId = 3;
    {
        orderId = 4;
    }

}
