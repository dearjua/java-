package ThreadTest.SynchronizedTest;

/**
 * ClassName: AccountTest <br/>
 * Description: <br/>
 * date: 2023/3/2 22:47<br/>
 *
 * @author li111<br />
 */
public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        Custorer cus1 = new Custorer(ac,"账户一");
        Custorer cus2 = new Custorer(ac,"账户二");


        cus1.start();
        cus2.start();
    }
}

class Account{
    private double balance;

    public synchronized void deposit(Double amt) {
        if (amt > 0){
            balance += amt;
            System.out.println(Thread.currentThread().getName() + "存钱1000，余额为：" + balance);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Custorer extends Thread{
    Account account;

    public Custorer(Account account) {
        this.account = account;
    }

    public Custorer(Account account,String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=1; i<=3; i++){
            account.deposit(1000.0);
        }
    }
}
