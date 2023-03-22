package Exception;

import java.util.Scanner;

/**
 * ClassName: EcmDef <br/>
 * Description: <br/>
 * date: 2022/5/12 17:03<br/>
 *
 * @author li111<br />
 */
public class EcmDef {
    public static int ecm(int a, int b) throws EcDef {
        if(a<0 || b<0){
            throw new EcDef("数字不能为零");
        }
        return a/b;
    }

    public static void main(String[] args) {

        try {
            int a  = Integer.parseInt(args[0]);
            int b  = Integer.parseInt(args[1]);
            int result = ecm(a,b);
            System.out.println(result);
        }catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e) {
            System.out.println("除零");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }
    }
}

class EcDef extends Exception{
    static final long serialVersionUID = -3387616993124229948L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}