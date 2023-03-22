package DuoTai;


public class Animal {


    public void eat(){
        System.out.println("吃东西");
    }

    public void sleep(){
        System.out.println("叫");
    }


}

class dog extends Animal{

    @Override
    public void eat() {
        System.out.println("小狗吃屎");
    }

    @Override
    public void sleep() {
        System.out.println("汪汪汪");
    }

    public void smile(){
        System.out.println("huhu");
    }
}

class cat extends Animal{

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("喵喵喵");
    }
}