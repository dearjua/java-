package ObjectProgram;

/**
 * ClassName: CheckAccount <br/>
 * Description: <br/>
 * date: 2022/5/6 14:23<br/>
 *
 * @author li111<br />
 */
public class CheckAccount extends Account{

    private double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance()>= amount){
            //方式一
            //setBalance(getBalance() - amount);
            //方式二
            super.withdraw(amount);
        }
        else if ((amount-getBalance()) > getOverdraft()){
            System.out.println("超出金额");
        }else{
            setOverdraft(getOverdraft()-(amount-getBalance()));
            System.out.println("还可透支：" + getOverdraft());
        }
    }
}
