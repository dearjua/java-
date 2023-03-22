package ObjectMethod;

import java.util.Objects;

/**
 * ClassName: Order <br/>
 * Description: <br/>
 * date: 2022/5/7 19:49<br/>
 *
 * @author li111<br />
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(11,"军华");
        Order o2 = new Order(11,"军华");
        System.out.println(o1.equals(o2));
    }
}
class Order{
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Order){
            //向下转型才能得到Order中的属性
            Order o1 = (Order)o;
            if(o1.orderId == this.orderId && o1.orderName.equals(this.orderName)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}