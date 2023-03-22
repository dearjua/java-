package InternetSocket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest <br/>
 * Description: <br/>
 * date: 2022/5/26 17:04<br/>
 *
 * @author li111<br />
 */
public class InetAddressTest {
    @Test
    public void test() throws Exception {
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println(byName.getAddress());
    }

    @Test
    public void test1(){
        Socket client = null;
        OutputStream outputStream = null;
        try {
            InetAddress inet1 = InetAddress.getByName("127.0.0.1");
            client = new Socket(inet1,8899);
            outputStream = client.getOutputStream();
            outputStream.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(outputStream != null){
                    client.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test3(){
        ServerSocket ss = null;
        Socket accept = null;
        InputStream is = null;
        ByteArrayOutputStream bais = null;
        try {
            ss = new ServerSocket(8899);
            accept = ss.accept();
            is = accept.getInputStream();
            bais = new ByteArrayOutputStream();
            byte[] b = new byte[20];
            int len;
            while((len = is.read(b)) != -1){
                bais.write(b,0,len);
            }

            System.out.println(bais.toString());
            System.out.println(accept.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bais != null){
                    bais.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (accept != null){
                    accept.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ss != null){
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
