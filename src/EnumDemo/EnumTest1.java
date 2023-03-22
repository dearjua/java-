package EnumDemo;

import javax.crypto.spec.PSource;

/**
 * 使用Enum关键字定义，父类为Enum
 */
public class EnumTest1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        spring.show();//SPRING
    }
}

interface Info{
    void show();
}
//自定义枚举类
enum Season1 implements Info{
    //3.提供当前枚举类的多个对象
    SPRING("温暖舒适","春天"){
        @Override
        public void show() {
            System.out.println("春天");
        }
    },
    SUMMER("夏日炎炎","夏天"){
        @Override
        public void show() {
            System.out.println("夏天");
        }
    },
    AUTUMN("秋高气爽","秋天"){
        @Override
        public void show() {
            System.out.println("秋天");
        }
    },
    WINTER("冰天雪地","冬天"){
        @Override
        public void show() {
            System.out.println("夏天");
        }
    };

    //2.声明season对象的属性：private final修饰
    private final String seasonDesc;
    private final String seasonName;
    //1。私有化类的构造器，因为类的对象只有有限个，确定的
    private Season1(String seasonDesc, String seasonName) {
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }

    //4.其他诉求：

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    @Override
    public void show() {

    }

   /* @Override
    public String toString() {
        return "Season1{" +
                "seasonDesc='" + seasonDesc + '\'' +
                ", seasonName='" + seasonName + '\'' +
                '}';
    }*/
}
