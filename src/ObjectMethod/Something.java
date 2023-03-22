package ObjectMethod;

/**
 * ClassName: Something <br/>
 * Description: <br/>
 * date: 2022/11/15 23:06<br/>
 *
 * @author li111<br />
 */
public class Something {

    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }

    public void addOne(final Other o) {
        // o = new Other();
        o.i++;
    }
}

class Other {
    public int i;
}