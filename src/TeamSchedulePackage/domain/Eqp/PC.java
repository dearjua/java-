package TeamSchedulePackage.domain.Eqp;

/**
 * ClassName: PC <br/>
 * Description: <br/>
 * date: 2022/5/12 19:00<br/>
 *
 * @author li111<br />
 */
public class PC implements Equipment{

    private String model;//机器型号
    private String display;//显示器名称

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }
    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
