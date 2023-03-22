package TeamSchedulePackage.service;

import TeamSchedulePackage.domain.Emp.Architect;
import TeamSchedulePackage.domain.Emp.Designer;
import TeamSchedulePackage.domain.Emp.Employee;
import static TeamSchedulePackage.service.Data.*;
import TeamSchedulePackage.domain.Emp.Programmer;
import TeamSchedulePackage.domain.Eqp.Equipment;
import TeamSchedulePackage.domain.Eqp.NoteBook;
import TeamSchedulePackage.domain.Eqp.PC;
import TeamSchedulePackage.domain.Eqp.Printer;
import org.junit.Test;

/**
 * ClassName: NameListService <br/>
 * Description: <br/>
 * date: 2022/5/12 19:22<br/>
 *
 * @author li111<br />
 */
public class NameListService {

    private Employee[] employees;

    /*根据项目提供的Data类构建相应大小的employees数组
    再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer
    和Architect对象，以及相关联的Equipment子类的对象,将对象存于数组中
    Data类位于com.atguigu.team.service包中*/
    public  NameListService(){
        int max = EMPLOYEES.length;
        employees = new Employee[max];

        for (int i=0; i<max; i++){
            //获取员工类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取员工基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
                case DESIGNER:
                    equipment = creatEquipment(i);
                    bonus= Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
            }
        }
    }

    private Equipment creatEquipment(int i) {
        int id = Integer.parseInt(EQUIPMENTS[i][0]);
        switch (id){
            case PC:
                String model = EQUIPMENTS[i][1];
                String display = EQUIPMENTS[i][2];
                return new PC(model,display);
            case NOTEBOOK:
                String model1 = EQUIPMENTS[i][1];
                double price = Integer.parseInt(EQUIPMENTS[i][2]);
                return new NoteBook(model1,price);
            case PRINTER:
                String name = EQUIPMENTS[i][1];
                String type = EQUIPMENTS[i][2];
                return new Printer(name,type);
        }
        return null;
    }

    //获取当前所有员工
    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for (int i=0; i<employees.length; i++){
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }

}
