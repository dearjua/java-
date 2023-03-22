package TeamSchedulePackage.domain.Eqp;

/**
 * ClassName: Printer <br/>
 * Description: <br/>
 * date: 2022/5/12 19:02<br/>
 *
 * @author li111<br />
 */
public class Printer implements Equipment{
    private String name;
    private String type;//机器类型

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
