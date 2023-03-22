package FileDeo;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputStreamReaderTes <br/>
 * Description: <br/>
 * date: 2022/5/24 19:54<br/>
 *
 * @author li111<br />
 */
public class InputStreamReaderTes {
    @Test
    public void test() throws Exception {
        FileInputStream fis = new FileInputStream("hello.txt");

        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

        char[] chars = new char[5];
        int len;
        while ((len = isr.read(chars)) != -1){
            String str = new String(chars,0,len);
            System.out.println(str);
        }

        isr.close();
    }
    @Test
    public void test1() throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("hello.txt"),"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("lll.txt"),"gbk");

        char[] chars = new char[20];
        int len;
        while((len = isr.read(chars)) != -1){
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();
    }
}
