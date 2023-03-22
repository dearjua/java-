package FileDeo;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: wordCount <br/>
 * Description: <br/>
 * date: 2022/5/24 19:06<br/>
 *
 * @author li111<br />
 */
public class wordCount {

    @Test
    public void test() {
        FileReader fr = null;
        BufferedWriter bw = null;
        try {
            //1.创建Map集合
            Map<Character,Integer> map = new HashMap<>();
            //2.遍历每一个字符,每一个字符出现的次数放到map中
            fr = new FileReader("hello.txt");

            int c = 0;
            while ((c = fr.read()) != -1){
                //int 还原 char
                char c1 = (char) c;
                // 判断char是否在map中第一次出现
                if (map.get(c1) == null){
                    map.put(c1,1);
                }else{
                    map.put(c1,map.get(c1)+1);
                }
            }

            //3.把map中数据存在文件count.txt
            //3.1 创建Writer
            bw = new BufferedWriter(new FileWriter("count.txt"));
            //3.2 遍历map,再写入数据
            Set<Map.Entry<Character,Integer>> entry = map.entrySet();
            for (Map.Entry<Character,Integer> entry1 : entry){
                switch(entry1.getKey()){
                    case ' ':
                        bw.write("空格=" + entry1.getValue());
                        break;
                    case '\t'://\t表示tab 键字符
                        bw.write("tab键=" + entry1.getValue());
                        break;
                    case '\r'://
                        bw.write("回车=" + entry1.getValue());
                        break;
                    case '\n'://
                        bw.write("换行=" + entry1.getValue());
                        break;
                    default:
                        bw.write(entry1.getKey() + "=" + entry1.getValue());
                        break;
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关流
            try {
                if (fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bw!=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
