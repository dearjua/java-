package AbstractExec;

import java.util.Scanner;

/**
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
 * 类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
 * 型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
 * 月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee(10000.0,"李军华",123,new MyDate(2022,6,16));
        employees[1] = new HourlyEmployee(20,22,"李伟",124,new MyDate(2022,2,5));
        Scanner sc = new Scanner(System.in);
        System.out.println("输入当前月份：");
        int month1 = sc.nextInt();
        for (int i=0; i<2; i++){

            System.out.println(employees[i].toString());
            if (month1 == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励100元");
            }
        }
    }
}
