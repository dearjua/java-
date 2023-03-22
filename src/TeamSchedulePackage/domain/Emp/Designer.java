package TeamSchedulePackage.domain.Emp;

import TeamSchedulePackage.domain.Eqp.Equipment;

/**
 * ClassName: Designer <br/>
 * Description: <br/>
 * date: 2022/5/12 19:19<br/>
 *
 * @author li111<br />
 */
public class Designer extends Programmer{
    private double bonus;//奖金

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
    }
}
