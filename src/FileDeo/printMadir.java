package FileDeo;

import java.io.File;


/*3. 遍历指定目录所有文件名称，包括子文件目录中的文件。
拓展1：并计算指定目录占用空间的大小
拓展2：删除指定文件目录及其下的所有文件*/
public class printMadir {
    static int NumFile;
    public static void main(String[] args) {

        File file = new File("G:\\java基础\\FaceObjectMid");
        printFile(file);
        System.out.println(NumFile);
    }

    public static void printFile(File file){
        File[] files = file.listFiles();
        for (File file1:files){
            if (file1.isDirectory()){
                printFile(file1);
            }else{
                NumFile += file1.length();
                System.out.println(file1.getAbsolutePath());
            }
        }
    }

}
