package StaticUse;

/**
 * ClassName: StaticTest <br/>
 * Description: <br/>
 * date: 2022/5/8 15:13<br/>
 *
 * @author li111<br />
 */
public class StaticTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.findArea();
        Circle circle2 = new Circle();
        circle2.setRadius(5);
        circle2.findArea();
    }
}
class Circle{
    private double radius;
    private static int id;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private static int init = 1001;
    public Circle(){
        id = init++;
    }

    public void findArea(){
        System.out.println("id 为"+ Circle.id+"的面积为：" + 3.14*radius*radius);
    }
}