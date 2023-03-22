package TeamSchedulePackage.service;

/**
 * ClassName: Status <br/>
 * Description: <br/>
 * date: 2022/5/12 19:11<br/>
 *
 * @author li111<br />
 */
public class Status {
    private final String NAME;

    public Status(String name) {
        NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");

    public String getNAME(){
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
