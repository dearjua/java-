package InternetSocket;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: InetAddressFileTest <br/>
 * Description: <br/>
 * date: 2022/5/27 20:01<br/>
 *
 * @author li111<br />
 */
public class InetAddressFileTest {

    @Test
    public void client() throws IOException {
        //创建一个socket对象(域名，端口号)
        Socket s1 = new Socket("127.0.0.1",9223);
        //造一个输出流，将socket的信息输出
        OutputStream os = s1.getOutputStream();
        //将文件读进来，造一个FileInputStream对象
        FileInputStream fis1 = new FileInputStream(new File("hua1.jpg"));
        //将文件写入输出流
        byte[] b1 = new byte[1024];
        int len;
        while((len = fis1.read(b1)) != -1){
            os.write(b1,0,len);
        }

        s1.shutdownOutput();

        InputStream inputStream = s1.getInputStream();
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len1;
        while((len1 = inputStream.read(bytes)) != -1){
            baos1.write(bytes,0,len1);
        }
        System.out.println(baos1.toString());
        //关闭
        fis1.close();
        os.close();
        s1.close();
    }

    @Test
    public void Server() throws IOException {
        ServerSocket ss = new ServerSocket(9223);
        Socket s1 = ss.accept();
        InputStream inputStream = s1.getInputStream();
        FileOutputStream fos1 = new FileOutputStream("lijunjun.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while((len = inputStream.read(bytes)) != -1){
            fos1.write(bytes,0,len);
        }

        OutputStream outputStream = s1.getOutputStream();
        outputStream.write("你好，已经接受到了你的照片".getBytes());

        fos1.close();
        inputStream.close();
        s1.close();
        ss.close();
    }
}
