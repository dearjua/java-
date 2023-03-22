package abstractTest;

/**
 * ClassName: AbstractTest <br/>
 * Description: <br/>
 * date: 2022/5/9 13:07<br/>
 *
 * @author li111<br />
 */
public class AbstractTest {
    public static void main(String[] args) {
        Employee employee = new Manager("li", 3, 10000, 2000.0);
        employee.work();

        Employee employee1 = new Employee() {
            @Override
            public void work() {
                System.out.println("走一步");
            }
        };
    }

    public static void method(Employee e){
        e.work();
    }
}

abstract class Employee{
    String name;
    int id;
    double salary;

    public Employee(){

    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee{
    double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("走了");
    }
}