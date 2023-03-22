package FileDeo;

import TeamSchedulePackage.service.Data;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流
 */
public class FileInputOutputStream {

    @Test
    public void testFileInputStream(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("hello.txt"));

            byte[] bytes = new byte[5];
            int len;
            while((len = fis.read(bytes)) != -1){
                String str = new String(bytes,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //实现对图片的复制
    @Test
    public void testInputOutputPicture(){

        FileInputStream fip = null;
        FileOutputStream fop = null;
        try {
            fip = new FileInputStream("li.jpg");
            fop = new FileOutputStream("li1.jpg");

            byte[] bytes = new byte[5];
            int len;

            while((len = fip.read(bytes)) != -1){
                fop.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fip != null){
                try {
                    fop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fop != null){
                try {
                    fip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void CopyFile(String srcFile,String destFile){
        FileInputStream fip = null;
        FileOutputStream fop = null;
        try {
            fip = new FileInputStream(srcFile);
            fop = new FileOutputStream(destFile);

            byte[] bytes = new byte[1024];
            int len;

            while((len = fip.read(bytes)) != -1){
                fop.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fip != null){
                try {
                    fop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fop != null){
                try {
                    fip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopy(){
        String srcFile = "li.jpg";
        String descFile = "lijunhua.jpg";

        long NowTime = System.currentTimeMillis();

        CopyFile(srcFile,descFile);

        long afterTime = System.currentTimeMillis();

        System.out.println("复制所花的时间为 ：" + (afterTime-NowTime));
    }
}
