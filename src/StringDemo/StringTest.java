package StringDemo;

/**
 * ClassName: StringTest <br/>
 * Description: <br/>
 * date: 2022/5/15 12:53<br/>
 *
 * @author li111<br />
 */
public class StringTest {
    String str = new String("abc");
    char[] c1 = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "efg";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest st = new StringTest();
        st.change(st.str,st.c1);
        System.out.println(st.str);//abc
        System.out.println(st.c1);//best
    }
}
