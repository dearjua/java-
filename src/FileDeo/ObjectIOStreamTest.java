package FileDeo;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectIOStreamTest <br/>
 * Description: <br/>
 * date: 2022/5/25 21:25<br/>
 *
 * @author li111<br />
 */
public class ObjectIOStreamTest {
    @Test
    public void ObjectOutputStreamTest(){
        ObjectOutputStream ois = null;
        try {
            ois = new ObjectOutputStream(new FileOutputStream("Object.dat"));
            ois.writeObject(new Dog("lijunqi",14));
            ois.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ois!= null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //反序列化，将磁盘中的对象还原为内存中的对象
    @Test
    public void ObjectInputStreamTest(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Object.dat"));
            /*Object o = ois.readObject();
            String str = (String)o;*/
            Dog dog = (Dog)ois.readObject();
            System.out.println(dog);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
