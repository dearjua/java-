package ObjectMethod;

import java.util.Objects;

/**
 * ==和equals的区别
 */
public class equalsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        char b = 10;
        double bb = 10;
        //基本数据类型
        System.out.println(i == j);
        System.out.println(i == b);
        System.out.println(i == bb);
        //引用数据类型
        String s1 = new String("lll");
        String s2 = new String("lll");
        System.out.println(s1 == s2);//false

        Person p1 = new Person(12,"li");
        Person p2 = new Person(12,"li");
        System.out.println(p1.equals(p2));//true
    }
}
class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if (o instanceof Person){
            Person p1 = (Person) o;
            if (p1.age == this.age && p1.name.equals(this.name)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

}