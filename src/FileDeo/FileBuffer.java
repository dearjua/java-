package FileDeo;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: FileBuffer <br/>
 * Description: <br/>
 * date: 2022/5/24 17:06<br/>
 *
 * @author li111<br />
 */
public class FileBuffer {

    public void CopyBuffer(String srcFile, String destFile){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File(srcFile)));
            bos = new BufferedOutputStream(new FileOutputStream(new File(destFile)));

            byte[] bytes = new byte[1024];
            int len;
            while((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
                //bos.flush()不用显示关闭缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis!=null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void BufferInOutStreamTest(){
        String srcFile = "li.jpg";
        String descFile = "jun.jpg";

        long a = System.currentTimeMillis();

        CopyBuffer(srcFile,descFile);

        long b = System.currentTimeMillis();

        System.out.println("复制时间为" + (b-a));
    }

    @Test
    public void BufferWRTest() throws Exception {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("hello4.txt")));

            String data;
            while((data = br.readLine()) != null){
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void picTest() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("li.jpg");
            fos = new FileOutputStream("hua.jpg");

            byte[] bytes = new byte[20];
            int len;
            while ((len = fis.read(bytes)) != -1){
                for (int i=0; i<bytes.length; i++){
                    bytes[i] = (byte)(bytes[i]^5);
                }
                fos.write(bytes,0,len);
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
            try {
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
