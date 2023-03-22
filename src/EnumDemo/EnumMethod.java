package EnumDemo;

/**
 * ClassName: EnumMethod <br/>
 * Description: <br/>
 * date: 2022/5/17 12:29<br/>
 *
 * @author li111<br />
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season1[] values = Season1.values();
        for (Season1 season1:values) {
            System.out.println(season1);
        }

        System.out.println("*****************");
        Thread.State[] values1 = Thread.State.values();
        for (Thread.State state:values1) {
            System.out.println(state);
        }

        Season1 season1 = Season1.valueOf("WINTER");
        System.out.println(season1);
    }
}
