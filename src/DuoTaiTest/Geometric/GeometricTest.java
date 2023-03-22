package DuoTaiTest.Geometric;

/**
 * ClassName: GeometricObject <br/>
 * Description: <br/>
 * date: 2022/5/7 18:14<br/>
 *
 * @author li111<br/>
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest g1 = new GeometricTest();
        GeometricObject o1 = new Circle("red",11.0,10.0);
        GeometricObject o2 = new MyRectangle("red",11.0,100.0,3.14);
        System.out.println("面积为：" + g1.displayGeometricObject(o1));
        System.out.println("面积为：" + g1.displayGeometricObject(o2));
        boolean b1 = g1.equalsArea(o1,o2);
        if(b1){
            System.out.println("面积相等");
        }else{
            System.out.println("面积不等");
        }
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public double displayGeometricObject(GeometricObject o1){
        return o1.findArea();
    }
}
class GeometricObject{
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}

