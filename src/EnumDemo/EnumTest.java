package EnumDemo;

/**
 * jdk5.0自定义枚举类
 */
public class EnumTest {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);
    }

}
//自定义枚举类
class Season{
    //2.声明season对象的属性：private final修饰
    private final String seasonDesc;
    private final String seasonName;
    //1。私有化类的构造器，因为类的对象只有有限个，确定的
    private Season(String seasonDesc, String seasonName) {
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }

    //3.提供当前枚举类的多个对象：public static final
    public static final Season SPRING = new Season("温暖舒适","春天");
    public static final Season SUMMER = new Season("夏日炎炎","夏天");
    public static final Season AUTUMN = new Season("秋高气爽","秋天");
    public static final Season WINTER = new Season("冰天雪地","冬天");
    //4.其他诉求：

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonDesc='" + seasonDesc + '\'' +
                ", seasonName='" + seasonName + '\'' +
                '}';
    }
}
