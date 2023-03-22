package Wapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
 * 最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
 * 长度。而向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象：Vector v=new Vector();
 * 给向量添加元素：v.addElement(Object obj); //obj必须是对象
 * 取出向量中的元素：Object obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若与最高分相差10分内：A等；20分内：B等；
 * 30分内：C等；其它：D等
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector v1 = new Vector();

        int Maxscore = 0;
        for(;;){
            System.out.println("输入成绩（以负数代表输入结束）:");
            int score = sc.nextInt();
            if (score<0){
                break;
            }else if(score > 100){
                continue;
            }
            //jdk5.0之前
            //Integer in1 = new Integer(score);
            //v1.addElement(in1);
            //jdk5.0之后自动装箱
            v1.addElement(score);
            //获取学生成绩最大值
            if(Maxscore < score){
                Maxscore = score;
            }
        }

        char level;
        for (int i=0; i< v1.size(); i++){
            Object obj = v1.elementAt(i);
            int li = (int)obj;
            if(Maxscore - li <= 10){
                level = 'A';
            }else if(Maxscore - li <= 20){
                level = 'B';
            }else if (Maxscore - li <= 30){
                level = 'C';
            }else{
                level = 'D';
            }

            System.out.println("student "+ i + "score is " + level);
        }
    }
}
