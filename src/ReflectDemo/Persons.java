package ReflectDemo;

/**
 * ClassName: Persons <br/>
 * Description: <br/>
 * date: 2022/5/28 15:14<br/>
 *
 * @author li111<br />
 */
public class Persons {
    private String name;
    public int age;

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persons(String name, int age) {

        this.name = name;
        this.age = age;
    }

    private Persons(String name) {
        this.name = name;
    }

    public Persons() {
        System.out.println("Person()");
    }

    public void show(){
        System.out.println("你好，我是一个人");
    }

    private String showNation(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }
}
