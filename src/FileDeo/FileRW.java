package FileDeo;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileRW <br/>
 * Description: <br/>
 * date: 2022/5/24 10:48<br/>
 *
 * @author li111<br />
 */
public class FileRW {

    //从硬盘读入到内存
    @Test
    public void testFileReader() {
        FileReader fileReader = null;
        try {
            //实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            //提供具体的流
            fileReader = new FileReader(file);
            //数据读入
            int data;
            while((data = fileReader.read())!= -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader!=null){
                    //关闭流
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void tset2(){
        FileReader fileReader = null;
        try {
            //实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            //提供具体的流
            fileReader = new FileReader(file);
            //数据读入
            char[] data = new char[5];
            int len;
            while((len = fileReader.read(data))!=-1){
                //正确写法
                for (int i=0; i<len; i++){
                    System.out.print(data[i]);
                }
                //错误写法,读入的数据如果小于数组的长度，上一次读进去的数据会输出
                /*for (int i=0; i<data.length; i++){
                    System.out.print(data[i]);
                }*/

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader!=null){
                    //关闭流
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test() throws IOException {
        File file = new File("hello1.txt");

        FileWriter fw = new FileWriter(file,false);

        fw.write("I have a dream,aaa");

        fw.close();
    }

    //文件读写操作结合,将一个文件中的数据传输到另外一个文件中
    @Test
    public void testWR(){
        FileWriter fw = null;
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            File file1 = new File("hello2.txt");

            fw = new FileWriter(file1);
            fr = new FileReader(file);

            char[] data = new char[5];
            int len;
            while ((len = fr.read(data)) != -1){
                fw.write(data,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
