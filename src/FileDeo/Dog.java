package FileDeo;

import java.io.Serializable;

/**
 * ClassName: Dog <br/>
 * Description: <br/>
 * date: 2022/5/25 22:11<br/>
 *
 * @author li111<br />
 */
public class Dog implements Serializable {
    private static final long seriaVersionUID = 1223423423L;
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
