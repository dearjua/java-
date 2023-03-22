package BlockTest;

/**
 * ClassName: Block <br/>
 * Description: <br/>
 * date: 2022/5/9 9:48<br/>
 *
 * @author li111<br />
 */
public class Block {
    public static void main(String[] args) {

        String desc = Person.desc;
        System.out.println(desc);

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);

        Person.info();
    }
}

class Person{
    //属性
    String name;
    int age;
    static String desc = "我是一个青年";

    //构造器
    public Person(){

    }

    //static 的代码块
    static{
        System.out.println("hello,static block-1");
        //调用静态结构
        desc = "我是一个爱小说的人";
        info();
        //不能调用非静态结构
//		eat();
//		name = "Tom";
    }

    static{
        System.out.println("hello,static block-2");
    }

    //非 static 的代码块
    {
        System.out.println("hello,block-2");
    }
    {
        System.out.println("hello,block-1");
        //调用非静态结构
        age = 1;
        eat();
        //调用静态结构
        desc = "我是一个爱小说的人 1";
        info();
    }

    //方法
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public static void info(){
        System.out.println("我是一个快乐的人。");
    }

}
