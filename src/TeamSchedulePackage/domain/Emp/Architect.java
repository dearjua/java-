package TeamSchedulePackage.domain.Emp;

import TeamSchedulePackage.domain.Eqp.Equipment;

/**
 * ClassName: Architect <br/>
 * Description: <br/>
 * date: 2022/5/12 19:21<br/>
 *
 * @author li111<br />
 */
public class Architect extends Designer{
    private int stock;//奖励的股票数量

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }
}
