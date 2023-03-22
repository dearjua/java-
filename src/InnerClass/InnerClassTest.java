package InnerClass;

/**
 * 内部类分类：成员内部类（静态，非静态）vs局部内部类（方法内，代码块内，构造器内）
 *
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建静态成员内部对象
        Person.dog dog = new Person.dog();
        dog.show();
        //创建非静态成员内部类、
        Person person = new Person();
        Person.brid brid = person.new brid();
        brid.eat();
        brid.display("杜鹃");
    }
}

class Person{
    String name = "军华";
    int age;

    public void work(){
        System.out.println("上班养活自己");
    }
    //静态内部类
    static class dog{
        String name;
        int dogAge;

        public void show(){
            System.out.println("汪汪叫");
        }
    }
    //非静态内部类
    class brid{
        String name = "麻雀";

        public void eat(){
            System.out.println("鸟吃虫子");
            Person.this.work();
        }

        public void display(String name){
            System.out.println(name);//方法形参
            System.out.println(this.name);//内部内属性
            System.out.println(Person.this.name);//外部类属性
        }
    }   
}