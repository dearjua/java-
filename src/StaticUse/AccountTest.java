package StaticUse;

/**
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
 * 码”、“存款余额”、“利率”、“最小余额”，定义封装这些
 * 属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 */
/*
public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account("123",111.1);
        System.out.println(ac.toString());
        Account ac1 = new Account("1234",1112.1);
        System.out.println(ac1.toString());
    }
}
class Account{
    private int id;
    private String pwd;
    private double balance;

    private static double rate;
    private static double Minbalance = 1.0;
    private static int init = 1001;

    public Account(){
        id = init++;
    }

    public Account(String pwd,double balance){
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinbalance() {
        return Minbalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}*/

public class AccountTest{
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        Account.rate = 0.033;
        
    }
}

class Account{
    public int id;
    public String pwd;
    public double balance;
    public static double rate;
    public static double MinBalance = 1.0;
    public static int Init = 1001;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public Account(){
        this.id = Init ++;
    }


}