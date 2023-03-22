package DuoTai;

import FileDeo.Dog;

/**
 * ClassName: testAnimal <br/>
 * Description: <br/>
 * date: 2022/5/6 16:35<br/>
 * -
 * @author li111<br />
 */
public class testAnimal {
    public static void main(String[] args) {
        testAnimal testAnimal1 = new testAnimal();
        Animal animal1 = new dog();
        dog dog1 = new dog();
        dog1.smile();
        testAnimal1.find(animal1);
    }

    public void find(Animal animal){
        animal.eat();
        animal.sleep();
    }
}
