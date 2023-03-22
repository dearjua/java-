package FileDeo;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest <br/>
 * Description: <br/>
 * date: 2022/5/20 18:27<br/>
 *
 * @author li111<br />
 */
public class FileTest {
    @Test
    public void test(){
        //构造器一
        File file = new File("hello.txt");//相对路径，相对于当前model
        File file1 = new File("G:\\java基础\\FaceObjectMid\\src\\FileDeo\\he.txt");

        //构造器二
        File file2 = new File("G:\\java基础\\FaceObjectMid\\src","FileDeo");

        //构造器三
        File file3 = new File(file2,"he1.txt");
    }

    /*public String getAbsolutePath()：获取绝对路径
 public String getPath() ：获取路径
 public String getName() ：获取名称
 public String getParent()：获取上层文件目录路径。若无，返回null
 public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。  public long lastModified() ：获取最后一次的修改时间，毫秒值
 public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
 public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
*/
    @Test
    public void test1(){
         File file = new File("G:\\java基础\\FaceObjectMid");
        String[] list = file.list();
        for (String s:list){
            System.out.println(s);
        }
    }
/*
1. 利用File构造器，new 一个文件目录file
1)在其中创建多个文件和目录
2)编写方法，实现删除file中指定文件的操作
 */
    @Test
    public void test2() throws IOException {
        File file = new File("G:\\java基础\\FaceObjectMid\\li");
        if (!file.exists()){
            file.mkdir();
        }

        File file1 = new File("G:\\java基础\\FaceObjectMid\\li\\jun.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }

       /* boolean delete = file1.delete();
        System.out.println(delete);*/
    }
/*2. 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称*/
    @Test
    public void test3(){
        File file = new File("G:\\java基础\\FaceObjectMid\\li");
        File[] files = file.listFiles();
        for (File file1:files){
            if (file1.getName().endsWith(".jpg")){
                System.out.println(file1.getName());
            }
        }
    }



}
