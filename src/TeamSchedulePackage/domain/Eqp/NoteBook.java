package TeamSchedulePackage.domain.Eqp;

/**
 * ClassName: NoteBook <br/>
 * Description: <br/>
 * date: 2022/5/12 19:02<br/>
 *
 * @author li111<br />
 */
public class NoteBook implements Equipment{

    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
