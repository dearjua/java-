package EnumDemo;

/**
 * ClassName: annotationTest <br/>
 * Description: <br/>
 * date: 2022/5/17 13:36<br/>
 *
 * @author li111<br />
 */
public @interface Myannotation {
    String[] value() default "hello";
}
@Myannotation("nihao")
class perple{

}