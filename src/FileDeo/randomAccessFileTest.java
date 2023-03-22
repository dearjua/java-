package FileDeo;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * ClassName: randomAccessFileTest <br/>
 * Description: <br/>
 * date: 2022/5/25 22:42<br/>
 *
 * @author li111<br />
 */
public class randomAccessFileTest {
    @Test
    public void test1(){
        RandomAccessFile rac1 = null;
        RandomAccessFile rac2 = null;
        try {
            rac1 = new RandomAccessFile(new File("hello.txt"),"r");
            rac2 = new RandomAccessFile(new File("jj.txt"),"rw");
            byte[] c1 = new byte[10];
            int len;
            while((len = rac1.read(c1)) != -1){
                rac2.write(c1,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(rac1 != null){
                try {
                    rac1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (rac2 != null){
                try {
                    rac2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile(new File("hello.txt"),"rw");
        raf1.seek(3);

        StringBuilder sb1 = new StringBuilder((int)new File("hello.txt").length());

        byte[] bytes = new byte[20];
        int len;
        while((len = raf1.read(bytes)) != -1){
            sb1.append(new String(bytes,0,len));
        }
        raf1.seek(3);
        raf1.write("xyz".getBytes(StandardCharsets.UTF_8));
        raf1.write(sb1.toString().getBytes(StandardCharsets.UTF_8));
        raf1.close();
    }
}
