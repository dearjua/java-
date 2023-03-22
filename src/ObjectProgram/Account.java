package ObjectProgram;

/**
 * ClassName: Account <br/>
 * Description: <br/>
 * date: 2022/5/6 14:09<br/>
 *
 * @author li111<br />
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        double rate = getAnnualInterestRate()/12;
        return rate;
    }

    //取款
    public void withdraw (double amount){
        if(getBalance()>amount){
            setBalance(getBalance()-amount);
        }
        System.out.println("余额不足");
    }
    //存款
    public void deposit (double amount){
        setBalance(getBalance()+amount);
    }
}
